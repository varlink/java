/*******************************************************************************
 * Copyright (c) 2017, 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package de.dentrassi.varlink.generator.util;

import static org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.PUBLIC_KEYWORD;

import java.io.File;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

@SuppressWarnings("unchecked")
public class JdtHelper {

    public static StringLiteral newStringLiteral(final AST ast, final String value) {
        final StringLiteral result = ast.newStringLiteral();
        result.setLiteralValue(value);
        return result;
    }

    public static void make(final AST ast, final List<? super Object> decl, final ModifierKeyword... keywords) {
        for (final ModifierKeyword keyword : keywords) {
            decl.add(ast.newModifier(keyword));
        }
    }

    public static void make(final BodyDeclaration decl, final ModifierKeyword... keywords) {
        make(decl.getAST(), decl.modifiers(), keywords);
    }

    public static void make(final SingleVariableDeclaration decl, final ModifierKeyword... keywords) {
        make(decl.getAST(), decl.modifiers(), keywords);
    }

    public static void addSimpleAnnotation(final BodyDeclaration decl, final String name) {
        final AST ast = decl.getAST();
        final MarkerAnnotation ann = ast.newMarkerAnnotation();
        ann.setTypeName(ast.newName(name));
        decl.modifiers().add(ann);
    }

    public static NormalAnnotation addAnnotation(final BodyDeclaration decl, final String name) {
        final AST ast = decl.getAST();
        final NormalAnnotation ann = ast.newNormalAnnotation();
        ann.setTypeName(ast.newName(name));
        decl.modifiers().add(ann);
        return ann;
    }

    public static void createCompilationUnit(final Path root, final String packageName, final String name,
            final Charset charset, final BiConsumer<AST, CompilationUnit> consumer) {

        final AST ast = AST.newAST(AST.JLS8);

        final CompilationUnit cu = ast.newCompilationUnit();

        final PackageDeclaration pkg = ast.newPackageDeclaration();
        pkg.setName(ast.newName(packageName));
        cu.setPackage(pkg);

        final Path path = root.resolve(packageName.replace(".", File.separator)).resolve(name + ".java");

        consumer.accept(ast, cu);

        try {
            Files.createDirectories(path.getParent());

            // format code

            final CodeFormatter formatter = ToolFactory.createCodeFormatter(null);
            final String s = cu.toString();
            final TextEdit result = formatter.format(CodeFormatter.K_COMPILATION_UNIT, s, 0, s.length(), 0, null);

            final Document doc = new Document(s);
            result.apply(doc);

            // write out

            try (final Writer writer = Files.newBufferedWriter(path, charset)) {
                writer.append(doc.get());
            }
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void createField(final TypeDeclaration decl, final String typeName, final String fieldName,
            final ModifierKeyword... keywords) {

        final AST ast = decl.getAST();

        final VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
        fragment.setName(ast.newSimpleName(fieldName));

        final FieldDeclaration fd = ast.newFieldDeclaration(fragment);

        fd.setType(ast.newSimpleType(ast.newName(typeName)));
        make(fd, keywords);

        decl.bodyDeclarations().add(fd);

    }

    public static void createParameter(final MethodDeclaration decl, final Type type, final String name,
            final ModifierKeyword... keywords) {

        final AST ast = decl.getAST();

        final SingleVariableDeclaration svd = ast.newSingleVariableDeclaration();

        svd.setType(type);
        svd.setName(ast.newSimpleName(name));
        make(svd, keywords);

        decl.parameters().add(svd);
    }

    public static void createParameter(final MethodDeclaration decl, final String typeName, final String name,
            final ModifierKeyword... keywords) {
        final AST ast = decl.getAST();
        createParameter(decl, ast.newSimpleType(ast.newName(typeName)), name, keywords);
    }

    public static void createThisAssignment(final Block body, final String name) {
        final AST ast = body.getAST();
        final Assignment as = ast.newAssignment();
        final FieldAccess fa = ast.newFieldAccess();
        fa.setExpression(ast.newThisExpression());
        fa.setName(ast.newSimpleName(name));
        as.setLeftHandSide(fa);
        as.setRightHandSide(ast.newSimpleName(name));
        body.statements().add(ast.newExpressionStatement(as));
    }

    public static <T extends ASTNode> T copyNode(final AST ast, final T node) {
        return (T) ASTNode.copySubtree(ast, node);
    }

    public static MethodDeclaration createGetter(final AST ast, final Type type, final String name) {
        final MethodDeclaration md = ast.newMethodDeclaration();
        md.setName(ast.newSimpleName("get" + Names.toUpperFirst(name)));
        make(md, PUBLIC_KEYWORD);

        md.setReturnType2(type);

        final Block body = ast.newBlock();
        md.setBody(body);

        final ReturnStatement ret = ast.newReturnStatement();
        body.statements().add(ret);

        final FieldAccess fa = ast.newFieldAccess();
        fa.setExpression(ast.newThisExpression());
        fa.setName(ast.newSimpleName(name));
        ret.setExpression(fa);

        return md;
    }

}
