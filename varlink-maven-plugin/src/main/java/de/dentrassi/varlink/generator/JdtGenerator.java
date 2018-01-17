/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package de.dentrassi.varlink.generator;

import static de.dentrassi.varlink.generator.util.JdtHelper.addSimpleAnnotation;
import static de.dentrassi.varlink.generator.util.JdtHelper.copyNode;
import static de.dentrassi.varlink.generator.util.JdtHelper.createCompilationUnit;
import static de.dentrassi.varlink.generator.util.JdtHelper.createField;
import static de.dentrassi.varlink.generator.util.JdtHelper.createParameter;
import static de.dentrassi.varlink.generator.util.JdtHelper.createThisAssignment;
import static de.dentrassi.varlink.generator.util.JdtHelper.make;
import static de.dentrassi.varlink.generator.util.JdtHelper.newStringLiteral;
import static org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.DEFAULT_KEYWORD;
import static org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.FINAL_KEYWORD;
import static org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.PRIVATE_KEYWORD;
import static org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.PROTECTED_KEYWORD;
import static org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.PUBLIC_KEYWORD;
import static org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.STATIC_KEYWORD;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.LambdaExpression;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import de.dentrassi.varlink.generator.util.JdtHelper;
import de.dentrassi.varlink.idl.varlinkIdl.BasicType;
import de.dentrassi.varlink.idl.varlinkIdl.ElementType;
import de.dentrassi.varlink.idl.varlinkIdl.Field;
import de.dentrassi.varlink.idl.varlinkIdl.Interface;
import de.dentrassi.varlink.idl.varlinkIdl.Method;
import de.dentrassi.varlink.idl.varlinkIdl.Object;
import de.dentrassi.varlink.idl.varlinkIdl.TypeAlias;
import de.dentrassi.varlink.idl.varlinkIdl.TypeReference;

public class JdtGenerator implements Generator {

    private final Options options;

    public JdtGenerator(final Generator.Options options) {
        Objects.requireNonNull(options);

        this.options = new Options(options);
        this.options.validate();
    }

    private static String toUpperFirst(final String string) {
        if (string.length() < 2) {
            return string.toUpperCase();
        }

        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    private static String toLowerFirst(final String string) {
        if (string.length() < 2) {
            return string.toLowerCase();
        }

        return Character.toLowerCase(string.charAt(0)) + string.substring(1);
    }

    private static String internalMethodName(final String name) {
        return "internal" + toUpperFirst(name);
    }

    @Override
    public void generate(final Interface iface) {

        final LinkedList<String> toks = new LinkedList<>(Arrays.asList(iface.getName().split("\\.")));

        final String name = toUpperFirst(toks.getLast());
        final String packageName = iface.getName();

        createCompilationUnit(this.options.getTargetPath(), packageName, name, this.options.getCharacterSet(),
                (ast, cu) -> {

                    createInterface(ast, cu, iface, name);

                });

        createCompilationUnit(this.options.getTargetPath(), packageName, name + "Impl", this.options.getCharacterSet(),
                (ast, cu) -> {

                    createImpl(ast, cu, iface, name);

                });

    }

    @SuppressWarnings("unchecked")
    private void createImpl(final AST ast, final CompilationUnit cu, final Interface iface, final String name) {

        // create type

        final String implName = name + "Impl";

        final TypeDeclaration td = ast.newTypeDeclaration();
        cu.types().add(td);
        td.setName(ast.newSimpleName(implName));

        make(td, PUBLIC_KEYWORD);

        final Type parentType = ast.newSimpleType(ast.newName(name));
        td.superInterfaceTypes().add(parentType);

        // create factory

        createImplFactory(ast, td);

        // create fields

        createField(td, "de.dentrassi.varlink.spi.Connection", "connection", PRIVATE_KEYWORD, FINAL_KEYWORD);
        createField(td, "de.dentrassi.varlink.internal.VarlinkImpl", "varlink", PRIVATE_KEYWORD, FINAL_KEYWORD);

        // create constructor

        final MethodDeclaration ctor = ast.newMethodDeclaration();
        td.bodyDeclarations().add(ctor);

        ctor.setConstructor(true);
        ctor.setName(ast.newSimpleName(implName));
        make(ctor, PRIVATE_KEYWORD);

        createParameter(ctor, "de.dentrassi.varlink.spi.Connection", "connection", FINAL_KEYWORD);
        createParameter(ctor, "de.dentrassi.varlink.internal.VarlinkImpl", "varlink", FINAL_KEYWORD);

        // constructor body
        {
            final Block body = ast.newBlock();
            ctor.setBody(body);

            createThisAssignment(body, "connection");
            createThisAssignment(body, "varlink");
        }

        // async creator

        /*
         * @Override public Async async() { return new Async() {
         *
         * @Override public CompletableFuture<List<Netdev>> list() { return
         * executeList(); } }; }
         */

        {
            final MethodDeclaration md = ast.newMethodDeclaration();
            td.bodyDeclarations().add(md);

            md.setName(ast.newSimpleName("async"));
            addSimpleAnnotation(md, "Override");
            make(md, PUBLIC_KEYWORD);

            md.setReturnType2(ast.newSimpleType(ast.newName("Async")));

            final Block body = ast.newBlock();
            md.setBody(body);

            // inner class

            final ReturnStatement ret = ast.newReturnStatement();
            body.statements().add(ret);

            final ClassInstanceCreation cic = ast.newClassInstanceCreation();
            cic.setType(ast.newSimpleType(ast.newName("Async")));
            ret.setExpression(cic);

            final AnonymousClassDeclaration acc = ast.newAnonymousClassDeclaration();
            cic.setAnonymousClassDeclaration(acc);

            forMethods(ast, iface, (m, amd) -> {

                acc.bodyDeclarations().add(amd);

                amd.setName(ast.newSimpleName(m.getName()));
                make(amd, PUBLIC_KEYWORD);
                makeAsync(amd);

                final Block asyncBody = ast.newBlock();
                amd.setBody(asyncBody);

                final ReturnStatement asyncRet = ast.newReturnStatement();
                asyncBody.statements().add(asyncRet);

                final MethodInvocation mi = ast.newMethodInvocation();
                mi.setName(ast.newSimpleName(internalMethodName(m.getName())));

                for (final String argName : m.getParameters().keySet()) {
                    mi.arguments().add(ast.newSimpleName(argName));
                }

                asyncRet.setExpression(mi);
            });

        }

        // internal methods

        forMethods(ast, iface, (m, md) -> {
            make(md, PROTECTED_KEYWORD);
            td.bodyDeclarations().add(md);
            md.setName(ast.newSimpleName(internalMethodName(m.getName())));
            makeAsync(md);
            createInternalMethod(m, md);
        });

    }

    @SuppressWarnings("unchecked")
    private void createInternalMethod(final MethodInformation m, final MethodDeclaration md) {
        final AST ast = md.getAST();

        final Block body = ast.newBlock();
        md.setBody(body);

        /*
         * return this.connection.call(CallRequest.of("io.systemd.network.List"))
         * .thenApply(cr -> { check(cr);
         *
         * final Iterator<JsonElement> i = cr.getParameters().values().iterator();
         *
         * return asList( this.varlink .fromJson( Netdev[].class, i.next())); }); }
         */

        // add arguments

        if (!m.getParameters().isEmpty()) {

            // code: Map<String,Object> parameters = new HashMap<> ();

            final VariableDeclarationFragment parameters = ast.newVariableDeclarationFragment();
            parameters.setName(ast.newSimpleName("parameters"));

            final VariableDeclarationStatement decl = ast.newVariableDeclarationStatement(parameters);
            body.statements().add(decl);
            final ParameterizedType map = ast.newParameterizedType(ast.newSimpleType(ast.newName("java.util.Map")));
            map.typeArguments().add(ast.newSimpleType(ast.newName("java.lang.String")));
            map.typeArguments().add(ast.newSimpleType(ast.newName("java.lang.Object")));

            decl.setType(map);

            final ClassInstanceCreation init = ast.newClassInstanceCreation();
            init.setType(ast.newParameterizedType(ast.newSimpleType(ast.newName("java.util.HashMap"))));
            init.arguments().add(ast.newNumberLiteral(Integer.toString(m.getParameters().size())));
            parameters.setInitializer(init);

            for (final String argName : m.getParameters().keySet()) {
                final MethodInvocation mi = ast.newMethodInvocation();
                mi.setExpression(ast.newSimpleName("parameters"));
                mi.setName(ast.newSimpleName("put"));

                mi.arguments().add(JdtHelper.newStringLiteral(ast, argName));
                mi.arguments().add(ast.newSimpleName(argName));
            }

        }

        // return

        final ReturnStatement ret = ast.newReturnStatement();
        body.statements().add(ret);

        final MethodInvocation mi = ast.newMethodInvocation();
        mi.setName(ast.newSimpleName("call"));
        final FieldAccess fa = ast.newFieldAccess();
        fa.setExpression(ast.newThisExpression());
        fa.setName(ast.newSimpleName("connection"));
        mi.setExpression(fa);

        final MethodInvocation cr = ast.newMethodInvocation();
        cr.setExpression(ast.newName("de.dentrassi.varlink.spi.CallRequest"));
        cr.setName(ast.newSimpleName("of"));
        cr.arguments().add(newStringLiteral(ast, m.getInterface().getName() + "." + toUpperFirst(m.getName())));

        if (!m.getParameters().isEmpty()) {
            cr.arguments().add(ast.newSimpleName("parameters"));
        }

        mi.arguments().add(cr);

        final MethodInvocation thenApply = ast.newMethodInvocation();
        thenApply.setName(ast.newSimpleName("thenApply"));
        thenApply.setExpression(mi);

        // add transformation

        final LambdaExpression le = ast.newLambdaExpression();
        le.setParentheses(false);
        thenApply.arguments().add(le);
        final VariableDeclarationFragment p = ast.newVariableDeclarationFragment();
        p.setName(ast.newSimpleName("result"));
        le.parameters().add(p);
        final Block transform = ast.newBlock();
        le.setBody(transform);

        {
            // check result

            final MethodInvocation check = ast.newMethodInvocation();
            check.setExpression(ast.newName("de.dentrassi.varlink.spi.Errors"));
            check.setName(ast.newSimpleName("check"));
            transform.statements().add(ast.newExpressionStatement(check));
            check.arguments().add(ast.newSimpleName("result"));
        }

        if (m.getReturnTypes().isEmpty()) {
            final ReturnStatement transformRet = ast.newReturnStatement();
            transformRet.setExpression(ast.newNullLiteral());
            transform.statements().add(transformRet);
        } else {
            // code: final Iterator<JsonElement> i = cr.getParameters().values().iterator();

            final VariableDeclarationFragment i = ast.newVariableDeclarationFragment();
            i.setName(ast.newSimpleName("i"));
            final VariableDeclarationExpression vd = ast.newVariableDeclarationExpression(i);
            final ParameterizedType iter = ast
                    .newParameterizedType(ast.newSimpleType(ast.newName("java.util.Iterator")));
            iter.typeArguments().add(ast.newSimpleType(ast.newName("com.google.gson.JsonElement")));
            vd.setType(iter);

            transform.statements().add(ast.newExpressionStatement(vd));

            {

                final MethodInvocation getParameters = ast.newMethodInvocation();
                getParameters.setName(ast.newSimpleName("getParameters"));
                getParameters.setExpression(ast.newSimpleName("result"));

                final MethodInvocation values = ast.newMethodInvocation();
                values.setName(ast.newSimpleName("values"));
                values.setExpression(getParameters);

                final MethodInvocation iterator = ast.newMethodInvocation();
                iterator.setExpression(values);
                iterator.setName(ast.newSimpleName("iterator"));

                i.setInitializer(iterator);

            }

            if (m.getReturnTypes().size() == 1) {

                // return this.varlink.fromJson(DriveCondition.class, i.next());

                final FieldAccess varlink = ast.newFieldAccess();
                varlink.setExpression(ast.newThisExpression());
                varlink.setName(ast.newSimpleName("varlink"));

                final MethodInvocation fromJson = ast.newMethodInvocation();
                fromJson.setExpression(varlink);
                fromJson.setName(ast.newSimpleName("fromJson"));

                final TypeLiteral returnType = ast.newTypeLiteral();
                returnType.setType(m.createMainReturnType(ast));
                fromJson.arguments().add(returnType);

                final MethodInvocation next = ast.newMethodInvocation();
                next.setExpression(ast.newSimpleName("i"));
                next.setName(ast.newSimpleName("next"));
                fromJson.arguments().add(next);

                final ReturnStatement transformRet = ast.newReturnStatement();
                transformRet.setExpression(fromJson);
                transform.statements().add(transformRet);
            }

            // FIXME: handle return type

            // FIXME: handle n

        }

        // set return

        ret.setExpression(thenApply);
    }

    @SuppressWarnings("unchecked")
    private void createImplFactory(final AST ast, final TypeDeclaration td) {

        final TypeDeclaration ftd = ast.newTypeDeclaration();
        td.bodyDeclarations().add(ftd);
        ftd.setName(ast.newSimpleName("Factory"));
        make(ftd, PUBLIC_KEYWORD, STATIC_KEYWORD);

        ftd.superInterfaceTypes().add(ast.newSimpleType(ast.newName("de.dentrassi.varlink.spi.Factory")));

        /*
         *
         * @Override public <T> T create(final VarlinkImpl varlink, final Class<T>
         * clazz, final Connection connection)
         */

        final MethodDeclaration md = ast.newMethodDeclaration();
        ftd.bodyDeclarations().add(md);
        md.setName(ast.newSimpleName("create"));
        md.setReturnType2(ast.newSimpleType(ast.newName("T")));
        make(md, PUBLIC_KEYWORD);
        addSimpleAnnotation(md, "Override");

        final TypeParameter tp = ast.newTypeParameter();
        tp.setName(ast.newSimpleName("T"));
        md.typeParameters().add(tp);

        final ParameterizedType clazz = ast.newParameterizedType(ast.newSimpleType(ast.newName("Class")));

        clazz.typeArguments().add(ast.newSimpleType(ast.newName("T")));

        createParameter(md, "de.dentrassi.varlink.internal.VarlinkImpl", "varlink", FINAL_KEYWORD);
        createParameter(md, clazz, "clazz", FINAL_KEYWORD);
        createParameter(md, "de.dentrassi.varlink.spi.Connection", "connection", FINAL_KEYWORD);

        final Block body = ast.newBlock();
        md.setBody(body);

        // return clazz.cast(new Impl(varlink,connection));

        final ReturnStatement ret = ast.newReturnStatement();
        body.statements().add(ret);

        final MethodInvocation cast = ast.newMethodInvocation();
        cast.setName(ast.newSimpleName("cast"));
        cast.setExpression(ast.newSimpleName("clazz"));

        ret.setExpression(cast);

        final ClassInstanceCreation newImpl = ast.newClassInstanceCreation();
        newImpl.setType(ast.newSimpleType(ast.newName(td.getName().getIdentifier())));
        cast.arguments().add(newImpl);

        newImpl.arguments().add(ast.newSimpleName("connection"));
        newImpl.arguments().add(ast.newSimpleName("varlink"));
    }

    private static final Stream<Method> methods(final Interface iface) {
        return iface.getMembers().stream().filter(m -> m instanceof Method).map(m -> (Method) m);
    }

    private static final Stream<TypeAlias> types(final Interface iface) {
        return iface.getMembers().stream().filter(m -> m instanceof TypeAlias).map(m -> (TypeAlias) m);
    }

    private static final Stream<MethodInformation> map(final Interface iface, final AST ast,
            final Stream<Method> stream) {
        return stream.map(m -> map(ast, iface, m));
    }

    @SuppressWarnings("unchecked")
    private static final void forMethods(final AST ast, final Interface iface,
            final BiConsumer<MethodInformation, MethodDeclaration> consumer) {

        map(iface, ast, methods(iface)).forEach(m -> {

            final MethodDeclaration md = ast.newMethodDeclaration();
            md.setName(ast.newSimpleName(m.getName()));

            md.setReturnType2(m.createMainReturnType(ast));

            for (final Map.Entry<String, Type> parameter : m.getParameters().entrySet()) {
                final SingleVariableDeclaration par = ast.newSingleVariableDeclaration();
                par.setName(ast.newSimpleName(parameter.getKey()));
                par.setType(copyNode(ast, parameter.getValue()));
                make(par, FINAL_KEYWORD);
                md.parameters().add(par);
            }

            consumer.accept(m, md);

        });

    }

    private static MethodInformation map(final AST ast, final Interface iface, final Method method) {

        final String name = toLowerFirst(method.getName());

        final Map<String, Type> parameters = new LinkedHashMap<>();
        final Map<String, Type> returns = new LinkedHashMap<>();

        final Object arguments = method.getArguments();
        if (arguments != null) {
            for (final Field field : arguments.getFields()) {
                final Type type = asType(ast, field.getName(), field.getType());
                parameters.put(field.getName(), type);
            }
        }

        final Object result = method.getResult();
        if (result != null) {
            for (final Field field : result.getFields()) {
                final Type type = asType(ast, field.getName(), field.getType());
                returns.put(field.getName(), type);
            }
        }

        return new MethodInformation(iface, name, returns, parameters);
    }

    private static class MethodInformation {
        private final String name;
        private final Map<String, Type> returnTypes;
        private final Map<String, Type> parameters;
        private final Interface iface;

        public MethodInformation(final Interface iface, final String name, final Map<String, Type> returnTypes,
                final Map<String, Type> parameters) {
            this.iface = iface;
            this.name = name;
            this.returnTypes = returnTypes;
            this.parameters = parameters;
        }

        public Interface getInterface() {
            return this.iface;
        }

        public String getName() {
            return this.name;
        }

        public Map<String, Type> getParameters() {
            return this.parameters;
        }

        public Map<String, Type> getReturnTypes() {
            return this.returnTypes;
        }

        public Type createMainReturnType(final AST ast) {
            if (this.returnTypes.isEmpty()) {
                return ast.newPrimitiveType(PrimitiveType.VOID);
            }

            if (this.returnTypes.size() == 1) {
                return JdtHelper.copyNode(ast, this.returnTypes.values().iterator().next());
            }

            // FIXME: create composite return type

            throw new IllegalStateException("Multi returns currently unsupported");
        }

    }

    @SuppressWarnings("unchecked")
    private void createInterface(final AST ast, final CompilationUnit cu, final Interface iface, final String name) {

        final TypeDeclaration td = ast.newTypeDeclaration();
        cu.types().add(td);
        td.setInterface(true);
        td.setName(ast.newSimpleName(name));

        make(td, PUBLIC_KEYWORD);

        final NormalAnnotation ann = JdtHelper.addAnnotation(td, "de.dentrassi.varlink.spi.Interface");

        {
            final MemberValuePair mvpName = ast.newMemberValuePair();
            ann.values().add(mvpName);
            mvpName.setName(ast.newSimpleName("name"));
            mvpName.setValue(JdtHelper.newStringLiteral(ast, iface.getName()));
        }

        {
            final MemberValuePair mvpFactory = ast.newMemberValuePair();
            ann.values().add(mvpFactory);
            mvpFactory.setName(ast.newSimpleName("factory"));

            final TypeLiteral fn = ast.newTypeLiteral();
            fn.setType(ast.newSimpleType(ast.newName(name + "Impl.Factory")));

            mvpFactory.setValue(fn);
        }

        // create types

        createTypes(td, iface);

        /*
         *
         * public interface Async { public CompletableFuture<List<Netdev>> list(); }
         *
         * public interface Sync { public List<Netdev> list(); }
         *
         * public Async async();
         *
         * public default Sync sync() { return new Sync() {
         *
         * @Override public List<Netdev> list() { return Syncer.await(async().list()); }
         * }; }
         */

        // create async

        {
            // public interface Async { ... }

            final TypeDeclaration async = ast.newTypeDeclaration();
            td.bodyDeclarations().add(async);
            async.setInterface(true);

            make(async, PUBLIC_KEYWORD);
            async.setName(ast.newSimpleName("Async"));

            forMethods(ast, iface, (m, md) -> {
                make(md, PUBLIC_KEYWORD);
                async.bodyDeclarations().add(md);
                makeAsync(md);
            });

            // public Async async();

            final MethodDeclaration md = ast.newMethodDeclaration();
            td.bodyDeclarations().add(md);

            md.setName(ast.newSimpleName("async"));
            make(md, PUBLIC_KEYWORD);

            final Type rt = ast.newSimpleType(ast.newSimpleName("Async"));
            md.setReturnType2(rt);
        }

        // create sync

        {
            // public interface Sync { ... }

            final TypeDeclaration sync = ast.newTypeDeclaration();
            td.bodyDeclarations().add(sync);
            sync.setInterface(true);

            make(sync, PUBLIC_KEYWORD);
            sync.setName(ast.newSimpleName("Sync"));

            // methods

            forMethods(ast, iface, (m, md) -> {
                make(md, PUBLIC_KEYWORD);
                sync.bodyDeclarations().add(md);
            });

            {
                final MethodDeclaration smd = ast.newMethodDeclaration();
                smd.setName(ast.newSimpleName("sync"));
                make(smd, PUBLIC_KEYWORD, DEFAULT_KEYWORD);
                td.bodyDeclarations().add(smd);

                final Block body = ast.newBlock();
                smd.setBody(body);

                final ReturnStatement ret = ast.newReturnStatement();
                body.statements().add(ret);

                final ClassInstanceCreation cic = ast.newClassInstanceCreation();
                cic.setType(ast.newSimpleType(ast.newName("Sync")));
                ret.setExpression(cic);
                smd.setReturnType2(ast.newSimpleType(ast.newName("Sync")));

                final AnonymousClassDeclaration acc = ast.newAnonymousClassDeclaration();
                cic.setAnonymousClassDeclaration(acc);

                forMethods(ast, iface, (m, md) -> {

                    make(md, PUBLIC_KEYWORD);
                    acc.bodyDeclarations().add(md);

                    final Block mbody = ast.newBlock();
                    md.setBody(mbody);

                    // return Syncer.await(async().list());

                    final MethodInvocation await = ast.newMethodInvocation();

                    await.setExpression(ast.newName("de.dentrassi.varlink.spi.Syncer"));
                    await.setName(ast.newSimpleName("await"));

                    final MethodInvocation asyncCall = ast.newMethodInvocation();
                    asyncCall.setName(ast.newSimpleName("async"));

                    final MethodInvocation mcall = ast.newMethodInvocation();
                    mcall.setName(ast.newSimpleName(m.getName()));
                    mcall.setExpression(asyncCall);

                    await.arguments().add(mcall);

                    // add arguments

                    for (final String argName : m.getParameters().keySet()) {
                        mcall.arguments().add(ast.newSimpleName(argName));
                    }

                    if (m.getReturnTypes().isEmpty()) {
                        mbody.statements().add(ast.newExpressionStatement(await));
                    } else {
                        final ReturnStatement rs = ast.newReturnStatement();
                        rs.setExpression(await);
                        mbody.statements().add(rs);
                    }

                });
            }

        }

    }

    private void createTypes(final TypeDeclaration td, final Interface iface) {
        types(iface).forEach(type -> {

            createType(td, type);

        });
    }

    @SuppressWarnings("unchecked")
    private void createType(final TypeDeclaration parent, final TypeAlias type) {
        final AST ast = parent.getAST();

        if (type.getDefinition() instanceof de.dentrassi.varlink.idl.varlinkIdl.Object) {

            final TypeDeclaration td = ast.newTypeDeclaration();
            parent.bodyDeclarations().add(td);

            td.setName(ast.newSimpleName(toUpperFirst(type.getName())));
            make(td, PUBLIC_KEYWORD, STATIC_KEYWORD);

            final de.dentrassi.varlink.idl.varlinkIdl.Object o = (de.dentrassi.varlink.idl.varlinkIdl.Object) type
                    .getDefinition();

            for (final Field field : o.getFields()) {

                final String name = toLowerFirst(field.getName());

                // create enum type

                if (field.getType() instanceof de.dentrassi.varlink.idl.varlinkIdl.Enum) {
                    final de.dentrassi.varlink.idl.varlinkIdl.Enum en = (de.dentrassi.varlink.idl.varlinkIdl.Enum) field
                            .getType();
                    createEnum(td, toUpperFirst(name), en.getFields());
                }

                // create field

                {
                    final VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
                    vdf.setName(ast.newSimpleName(name));
                    final FieldDeclaration fd = ast.newFieldDeclaration(vdf);
                    fd.setType(asType(ast, name, field.getType()));
                    make(fd, PRIVATE_KEYWORD);

                    td.bodyDeclarations().add(fd);
                }

                // create getter

                {
                    final MethodDeclaration md = ast.newMethodDeclaration();
                    md.setName(ast.newSimpleName("get" + toUpperFirst(name)));
                    td.bodyDeclarations().add(md);
                    make(md, PUBLIC_KEYWORD);

                    md.setReturnType2(asType(ast, name, field.getType()));

                    final Block body = ast.newBlock();
                    md.setBody(body);

                    final ReturnStatement ret = ast.newReturnStatement();
                    body.statements().add(ret);

                    final FieldAccess fa = ast.newFieldAccess();
                    fa.setExpression(ast.newThisExpression());
                    fa.setName(ast.newSimpleName(name));
                    ret.setExpression(fa);

                }

                // create setter

                {
                    final MethodDeclaration md = ast.newMethodDeclaration();
                    md.setName(ast.newSimpleName("set" + toUpperFirst(name)));
                    td.bodyDeclarations().add(md);
                    make(md, PUBLIC_KEYWORD);

                    final SingleVariableDeclaration svd = ast.newSingleVariableDeclaration();
                    svd.setName(ast.newSimpleName(name));
                    svd.setType(asType(ast, name, field.getType()));

                    md.parameters().add(svd);

                    final Block body = ast.newBlock();
                    md.setBody(body);

                    final FieldAccess fa = ast.newFieldAccess();
                    fa.setExpression(ast.newThisExpression());
                    fa.setName(ast.newSimpleName(name));

                    final Assignment ass = ast.newAssignment();
                    ass.setLeftHandSide(fa);
                    ass.setRightHandSide(ast.newSimpleName(name));

                    body.statements().add(ast.newExpressionStatement(ass));

                }

            }

        } else if (type.getDefinition() instanceof de.dentrassi.varlink.idl.varlinkIdl.Enum) {

            // FIXME: create enums
        }
    }

    @SuppressWarnings("unchecked")
    private void createEnum(final TypeDeclaration td, final String name, final EList<String> literals) {
        final AST ast = td.getAST();

        final EnumDeclaration ed = ast.newEnumDeclaration();
        td.bodyDeclarations().add(ed);
        ed.setName(ast.newSimpleName(name));
        make(ed, PUBLIC_KEYWORD, STATIC_KEYWORD);

        for (final String literal : literals) {
            final EnumConstantDeclaration ecd = ast.newEnumConstantDeclaration();
            ecd.setName(ast.newSimpleName(literal));
            ed.enumConstants().add(ecd);
        }
    }

    private static Type asType(final AST ast, final String propertyName, final ElementType type) {
        final Type main = asMainType(ast, propertyName, type);
        if (type.isMulti()) {
            return ast.newArrayType(main);
        } else {
            return main;
        }
    }

    private static Type asMainType(final AST ast, final String propertyName, final ElementType type) {

        if (type instanceof BasicType) {
            switch (((BasicType) type).getType().toLowerCase()) {
            case "float":
                return ast.newSimpleType(ast.newName("java.lang.Double"));
            case "int":
                return ast.newSimpleType(ast.newName("java.lang.Long"));
            case "bool":
                return ast.newSimpleType(ast.newName("java.lang.Boolean"));
            case "string":
                return ast.newSimpleType(ast.newName("java.lang.String"));
            default:
                throw new IllegalArgumentException("Unknown basic type: " + ((BasicType) type).getType().toLowerCase());
            }
        } else if (type instanceof de.dentrassi.varlink.idl.varlinkIdl.Enum) {
            return ast.newSimpleType(
                    ast.newSimpleName(toUpperFirst(propertyName)));
        } else if (type instanceof TypeReference) {
            return ast.newSimpleType(ast.newSimpleName(toUpperFirst(((TypeReference) type).getName())));
        }

        throw new IllegalArgumentException("Unknown type: " + type.eClass().getName());
    }

    @SuppressWarnings("unchecked")
    private void makeAsync(final MethodDeclaration md) {

        final AST ast = md.getAST();

        final Type ret = md.getReturnType2();

        final ParameterizedType future = ast
                .newParameterizedType(ast.newSimpleType(ast.newName("java.util.concurrent.CompletableFuture")));

        if (ret instanceof PrimitiveType) {
            if (((PrimitiveType) ret).getPrimitiveTypeCode() == PrimitiveType.VOID) {
                future.typeArguments().add(ast.newSimpleType(ast.newName("java.lang.Void")));
            }
        } else {
            md.setReturnType2(null);
            future.typeArguments().add(ret);
        }

        md.setReturnType2(future);
    }

}
