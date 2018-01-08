package de.dentrassi.varlink.idl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.dentrassi.varlink.idl.services.VarlinkIdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
@SuppressWarnings("all")
public class InternalVarlinkIdlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'int'", "'float'", "'string'", "'data'", "'object'", "'interface'", "'type'", "'('", "')'", "','", "':'", "'method'", "'->'", "'error'", "'.'", "'[]'"
    };
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVarlinkIdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVarlinkIdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVarlinkIdlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVarlinkIdl.g"; }


    	private VarlinkIdlGrammarAccess grammarAccess;

    	public void setGrammarAccess(VarlinkIdlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInterface"
    // InternalVarlinkIdl.g:61:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:62:1: ( ruleInterface EOF )
            // InternalVarlinkIdl.g:63:1: ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalVarlinkIdl.g:70:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:74:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalVarlinkIdl.g:75:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalVarlinkIdl.g:75:2: ( ( rule__Interface__Group__0 ) )
            // InternalVarlinkIdl.g:76:3: ( rule__Interface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:77:3: ( rule__Interface__Group__0 )
            // InternalVarlinkIdl.g:77:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMember"
    // InternalVarlinkIdl.g:86:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:87:1: ( ruleMember EOF )
            // InternalVarlinkIdl.g:88:1: ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalVarlinkIdl.g:95:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:99:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalVarlinkIdl.g:100:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalVarlinkIdl.g:100:2: ( ( rule__Member__Alternatives ) )
            // InternalVarlinkIdl.g:101:3: ( rule__Member__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getAlternatives()); 
            }
            // InternalVarlinkIdl.g:102:3: ( rule__Member__Alternatives )
            // InternalVarlinkIdl.g:102:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleTypeAlias"
    // InternalVarlinkIdl.g:111:1: entryRuleTypeAlias : ruleTypeAlias EOF ;
    public final void entryRuleTypeAlias() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:112:1: ( ruleTypeAlias EOF )
            // InternalVarlinkIdl.g:113:1: ruleTypeAlias EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeAlias();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeAlias"


    // $ANTLR start "ruleTypeAlias"
    // InternalVarlinkIdl.g:120:1: ruleTypeAlias : ( ( rule__TypeAlias__Group__0 ) ) ;
    public final void ruleTypeAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:124:2: ( ( ( rule__TypeAlias__Group__0 ) ) )
            // InternalVarlinkIdl.g:125:2: ( ( rule__TypeAlias__Group__0 ) )
            {
            // InternalVarlinkIdl.g:125:2: ( ( rule__TypeAlias__Group__0 ) )
            // InternalVarlinkIdl.g:126:3: ( rule__TypeAlias__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:127:3: ( rule__TypeAlias__Group__0 )
            // InternalVarlinkIdl.g:127:4: rule__TypeAlias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeAlias"


    // $ANTLR start "entryRuleTypeAliasDefinition"
    // InternalVarlinkIdl.g:136:1: entryRuleTypeAliasDefinition : ruleTypeAliasDefinition EOF ;
    public final void entryRuleTypeAliasDefinition() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:137:1: ( ruleTypeAliasDefinition EOF )
            // InternalVarlinkIdl.g:138:1: ruleTypeAliasDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeAliasDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeAliasDefinition"


    // $ANTLR start "ruleTypeAliasDefinition"
    // InternalVarlinkIdl.g:145:1: ruleTypeAliasDefinition : ( ( rule__TypeAliasDefinition__Alternatives ) ) ;
    public final void ruleTypeAliasDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:149:2: ( ( ( rule__TypeAliasDefinition__Alternatives ) ) )
            // InternalVarlinkIdl.g:150:2: ( ( rule__TypeAliasDefinition__Alternatives ) )
            {
            // InternalVarlinkIdl.g:150:2: ( ( rule__TypeAliasDefinition__Alternatives ) )
            // InternalVarlinkIdl.g:151:3: ( rule__TypeAliasDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasDefinitionAccess().getAlternatives()); 
            }
            // InternalVarlinkIdl.g:152:3: ( rule__TypeAliasDefinition__Alternatives )
            // InternalVarlinkIdl.g:152:4: rule__TypeAliasDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeAliasDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasDefinitionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeAliasDefinition"


    // $ANTLR start "entryRuleEnum"
    // InternalVarlinkIdl.g:161:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:162:1: ( ruleEnum EOF )
            // InternalVarlinkIdl.g:163:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalVarlinkIdl.g:170:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:174:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalVarlinkIdl.g:175:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalVarlinkIdl.g:175:2: ( ( rule__Enum__Group__0 ) )
            // InternalVarlinkIdl.g:176:3: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:177:3: ( rule__Enum__Group__0 )
            // InternalVarlinkIdl.g:177:4: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleObject"
    // InternalVarlinkIdl.g:186:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:187:1: ( ruleObject EOF )
            // InternalVarlinkIdl.g:188:1: ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalVarlinkIdl.g:195:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:199:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalVarlinkIdl.g:200:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalVarlinkIdl.g:200:2: ( ( rule__Object__Group__0 ) )
            // InternalVarlinkIdl.g:201:3: ( rule__Object__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:202:3: ( rule__Object__Group__0 )
            // InternalVarlinkIdl.g:202:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleField"
    // InternalVarlinkIdl.g:211:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:212:1: ( ruleField EOF )
            // InternalVarlinkIdl.g:213:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalVarlinkIdl.g:220:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:224:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalVarlinkIdl.g:225:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalVarlinkIdl.g:225:2: ( ( rule__Field__Group__0 ) )
            // InternalVarlinkIdl.g:226:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:227:3: ( rule__Field__Group__0 )
            // InternalVarlinkIdl.g:227:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleElementType"
    // InternalVarlinkIdl.g:236:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:237:1: ( ruleElementType EOF )
            // InternalVarlinkIdl.g:238:1: ruleElementType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalVarlinkIdl.g:245:1: ruleElementType : ( ( rule__ElementType__Group__0 ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:249:2: ( ( ( rule__ElementType__Group__0 ) ) )
            // InternalVarlinkIdl.g:250:2: ( ( rule__ElementType__Group__0 ) )
            {
            // InternalVarlinkIdl.g:250:2: ( ( rule__ElementType__Group__0 ) )
            // InternalVarlinkIdl.g:251:3: ( rule__ElementType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:252:3: ( rule__ElementType__Group__0 )
            // InternalVarlinkIdl.g:252:4: rule__ElementType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleTypeReference"
    // InternalVarlinkIdl.g:261:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:262:1: ( ruleTypeReference EOF )
            // InternalVarlinkIdl.g:263:1: ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalVarlinkIdl.g:270:1: ruleTypeReference : ( ( rule__TypeReference__NameAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:274:2: ( ( ( rule__TypeReference__NameAssignment ) ) )
            // InternalVarlinkIdl.g:275:2: ( ( rule__TypeReference__NameAssignment ) )
            {
            // InternalVarlinkIdl.g:275:2: ( ( rule__TypeReference__NameAssignment ) )
            // InternalVarlinkIdl.g:276:3: ( rule__TypeReference__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getNameAssignment()); 
            }
            // InternalVarlinkIdl.g:277:3: ( rule__TypeReference__NameAssignment )
            // InternalVarlinkIdl.g:277:4: rule__TypeReference__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleBasicType"
    // InternalVarlinkIdl.g:286:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:287:1: ( ruleBasicType EOF )
            // InternalVarlinkIdl.g:288:1: ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalVarlinkIdl.g:295:1: ruleBasicType : ( ( rule__BasicType__TypeAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:299:2: ( ( ( rule__BasicType__TypeAssignment ) ) )
            // InternalVarlinkIdl.g:300:2: ( ( rule__BasicType__TypeAssignment ) )
            {
            // InternalVarlinkIdl.g:300:2: ( ( rule__BasicType__TypeAssignment ) )
            // InternalVarlinkIdl.g:301:3: ( rule__BasicType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getTypeAssignment()); 
            }
            // InternalVarlinkIdl.g:302:3: ( rule__BasicType__TypeAssignment )
            // InternalVarlinkIdl.g:302:4: rule__BasicType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getTypeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleMethod"
    // InternalVarlinkIdl.g:311:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:312:1: ( ruleMethod EOF )
            // InternalVarlinkIdl.g:313:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalVarlinkIdl.g:320:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:324:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalVarlinkIdl.g:325:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalVarlinkIdl.g:325:2: ( ( rule__Method__Group__0 ) )
            // InternalVarlinkIdl.g:326:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:327:3: ( rule__Method__Group__0 )
            // InternalVarlinkIdl.g:327:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleError"
    // InternalVarlinkIdl.g:336:1: entryRuleError : ruleError EOF ;
    public final void entryRuleError() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:337:1: ( ruleError EOF )
            // InternalVarlinkIdl.g:338:1: ruleError EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleError();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleError"


    // $ANTLR start "ruleError"
    // InternalVarlinkIdl.g:345:1: ruleError : ( ( rule__Error__Group__0 ) ) ;
    public final void ruleError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:349:2: ( ( ( rule__Error__Group__0 ) ) )
            // InternalVarlinkIdl.g:350:2: ( ( rule__Error__Group__0 ) )
            {
            // InternalVarlinkIdl.g:350:2: ( ( rule__Error__Group__0 ) )
            // InternalVarlinkIdl.g:351:3: ( rule__Error__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:352:3: ( rule__Error__Group__0 )
            // InternalVarlinkIdl.g:352:4: rule__Error__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Error__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleError"


    // $ANTLR start "entryRuleInterfaceName"
    // InternalVarlinkIdl.g:361:1: entryRuleInterfaceName : ruleInterfaceName EOF ;
    public final void entryRuleInterfaceName() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:362:1: ( ruleInterfaceName EOF )
            // InternalVarlinkIdl.g:363:1: ruleInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterfaceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfaceName"


    // $ANTLR start "ruleInterfaceName"
    // InternalVarlinkIdl.g:370:1: ruleInterfaceName : ( ( rule__InterfaceName__Group__0 ) ) ;
    public final void ruleInterfaceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:374:2: ( ( ( rule__InterfaceName__Group__0 ) ) )
            // InternalVarlinkIdl.g:375:2: ( ( rule__InterfaceName__Group__0 ) )
            {
            // InternalVarlinkIdl.g:375:2: ( ( rule__InterfaceName__Group__0 ) )
            // InternalVarlinkIdl.g:376:3: ( rule__InterfaceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:377:3: ( rule__InterfaceName__Group__0 )
            // InternalVarlinkIdl.g:377:4: rule__InterfaceName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceName"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalVarlinkIdl.g:385:1: rule__Member__Alternatives : ( ( ruleTypeAlias ) | ( ruleMethod ) | ( ruleError ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:389:1: ( ( ruleTypeAlias ) | ( ruleMethod ) | ( ruleError ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalVarlinkIdl.g:390:2: ( ruleTypeAlias )
                    {
                    // InternalVarlinkIdl.g:390:2: ( ruleTypeAlias )
                    // InternalVarlinkIdl.g:391:3: ruleTypeAlias
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getTypeAliasParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeAlias();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getTypeAliasParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:396:2: ( ruleMethod )
                    {
                    // InternalVarlinkIdl.g:396:2: ( ruleMethod )
                    // InternalVarlinkIdl.g:397:3: ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:402:2: ( ruleError )
                    {
                    // InternalVarlinkIdl.g:402:2: ( ruleError )
                    // InternalVarlinkIdl.g:403:3: ruleError
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getErrorParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleError();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getErrorParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__TypeAliasDefinition__Alternatives"
    // InternalVarlinkIdl.g:412:1: rule__TypeAliasDefinition__Alternatives : ( ( ruleEnum ) | ( ruleObject ) );
    public final void rule__TypeAliasDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:416:1: ( ( ruleEnum ) | ( ruleObject ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==19) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_2>=17 && LA2_2<=18)) ) {
                        alt2=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_1>=17 && LA2_1<=18)) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVarlinkIdl.g:417:2: ( ruleEnum )
                    {
                    // InternalVarlinkIdl.g:417:2: ( ruleEnum )
                    // InternalVarlinkIdl.g:418:3: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAliasDefinitionAccess().getEnumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAliasDefinitionAccess().getEnumParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:423:2: ( ruleObject )
                    {
                    // InternalVarlinkIdl.g:423:2: ( ruleObject )
                    // InternalVarlinkIdl.g:424:3: ruleObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAliasDefinitionAccess().getObjectParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAliasDefinitionAccess().getObjectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAliasDefinition__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives_0"
    // InternalVarlinkIdl.g:433:1: rule__ElementType__Alternatives_0 : ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) );
    public final void rule__ElementType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:437:1: ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVarlinkIdl.g:438:2: ( ruleBasicType )
                    {
                    // InternalVarlinkIdl.g:438:2: ( ruleBasicType )
                    // InternalVarlinkIdl.g:439:3: ruleBasicType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:444:2: ( ruleTypeReference )
                    {
                    // InternalVarlinkIdl.g:444:2: ( ruleTypeReference )
                    // InternalVarlinkIdl.g:445:3: ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:450:2: ( ruleEnum )
                    {
                    // InternalVarlinkIdl.g:450:2: ( ruleEnum )
                    // InternalVarlinkIdl.g:451:3: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Alternatives_0"


    // $ANTLR start "rule__BasicType__TypeAlternatives_0"
    // InternalVarlinkIdl.g:460:1: rule__BasicType__TypeAlternatives_0 : ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) | ( 'data' ) | ( 'object' ) );
    public final void rule__BasicType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:464:1: ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) | ( 'data' ) | ( 'object' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt4=1;
                }
                break;
            case 9:
                {
                alt4=2;
                }
                break;
            case 10:
                {
                alt4=3;
                }
                break;
            case 11:
                {
                alt4=4;
                }
                break;
            case 12:
                {
                alt4=5;
                }
                break;
            case 13:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVarlinkIdl.g:465:2: ( 'bool' )
                    {
                    // InternalVarlinkIdl.g:465:2: ( 'bool' )
                    // InternalVarlinkIdl.g:466:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getTypeBoolKeyword_0_0()); 
                    }
                    match(input,8,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getTypeBoolKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:471:2: ( 'int' )
                    {
                    // InternalVarlinkIdl.g:471:2: ( 'int' )
                    // InternalVarlinkIdl.g:472:3: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getTypeIntKeyword_0_1()); 
                    }
                    match(input,9,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getTypeIntKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:477:2: ( 'float' )
                    {
                    // InternalVarlinkIdl.g:477:2: ( 'float' )
                    // InternalVarlinkIdl.g:478:3: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getTypeFloatKeyword_0_2()); 
                    }
                    match(input,10,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getTypeFloatKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVarlinkIdl.g:483:2: ( 'string' )
                    {
                    // InternalVarlinkIdl.g:483:2: ( 'string' )
                    // InternalVarlinkIdl.g:484:3: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getTypeStringKeyword_0_3()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getTypeStringKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVarlinkIdl.g:489:2: ( 'data' )
                    {
                    // InternalVarlinkIdl.g:489:2: ( 'data' )
                    // InternalVarlinkIdl.g:490:3: 'data'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getTypeDataKeyword_0_4()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getTypeDataKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVarlinkIdl.g:495:2: ( 'object' )
                    {
                    // InternalVarlinkIdl.g:495:2: ( 'object' )
                    // InternalVarlinkIdl.g:496:3: 'object'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getTypeObjectKeyword_0_5()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getTypeObjectKeyword_0_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeAlternatives_0"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalVarlinkIdl.g:505:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:509:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalVarlinkIdl.g:510:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalVarlinkIdl.g:517:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:521:1: ( ( 'interface' ) )
            // InternalVarlinkIdl.g:522:1: ( 'interface' )
            {
            // InternalVarlinkIdl.g:522:1: ( 'interface' )
            // InternalVarlinkIdl.g:523:2: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalVarlinkIdl.g:532:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:536:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalVarlinkIdl.g:537:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalVarlinkIdl.g:544:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:548:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:549:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:549:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:550:2: ( rule__Interface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:551:2: ( rule__Interface__NameAssignment_1 )
            // InternalVarlinkIdl.g:551:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalVarlinkIdl.g:559:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:563:1: ( rule__Interface__Group__2__Impl )
            // InternalVarlinkIdl.g:564:2: rule__Interface__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalVarlinkIdl.g:570:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__MembersAssignment_2 )* ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:574:1: ( ( ( rule__Interface__MembersAssignment_2 )* ) )
            // InternalVarlinkIdl.g:575:1: ( ( rule__Interface__MembersAssignment_2 )* )
            {
            // InternalVarlinkIdl.g:575:1: ( ( rule__Interface__MembersAssignment_2 )* )
            // InternalVarlinkIdl.g:576:2: ( rule__Interface__MembersAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersAssignment_2()); 
            }
            // InternalVarlinkIdl.g:577:2: ( rule__Interface__MembersAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||LA5_0==20||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVarlinkIdl.g:577:3: rule__Interface__MembersAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Interface__MembersAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getMembersAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__TypeAlias__Group__0"
    // InternalVarlinkIdl.g:586:1: rule__TypeAlias__Group__0 : rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 ;
    public final void rule__TypeAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:590:1: ( rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 )
            // InternalVarlinkIdl.g:591:2: rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeAlias__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__0"


    // $ANTLR start "rule__TypeAlias__Group__0__Impl"
    // InternalVarlinkIdl.g:598:1: rule__TypeAlias__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:602:1: ( ( 'type' ) )
            // InternalVarlinkIdl.g:603:1: ( 'type' )
            {
            // InternalVarlinkIdl.g:603:1: ( 'type' )
            // InternalVarlinkIdl.g:604:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getTypeKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__0__Impl"


    // $ANTLR start "rule__TypeAlias__Group__1"
    // InternalVarlinkIdl.g:613:1: rule__TypeAlias__Group__1 : rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 ;
    public final void rule__TypeAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:617:1: ( rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 )
            // InternalVarlinkIdl.g:618:2: rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TypeAlias__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__1"


    // $ANTLR start "rule__TypeAlias__Group__1__Impl"
    // InternalVarlinkIdl.g:625:1: rule__TypeAlias__Group__1__Impl : ( ( rule__TypeAlias__NameAssignment_1 ) ) ;
    public final void rule__TypeAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:629:1: ( ( ( rule__TypeAlias__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:630:1: ( ( rule__TypeAlias__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:630:1: ( ( rule__TypeAlias__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:631:2: ( rule__TypeAlias__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:632:2: ( rule__TypeAlias__NameAssignment_1 )
            // InternalVarlinkIdl.g:632:3: rule__TypeAlias__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlias__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__1__Impl"


    // $ANTLR start "rule__TypeAlias__Group__2"
    // InternalVarlinkIdl.g:640:1: rule__TypeAlias__Group__2 : rule__TypeAlias__Group__2__Impl ;
    public final void rule__TypeAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:644:1: ( rule__TypeAlias__Group__2__Impl )
            // InternalVarlinkIdl.g:645:2: rule__TypeAlias__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__2"


    // $ANTLR start "rule__TypeAlias__Group__2__Impl"
    // InternalVarlinkIdl.g:651:1: rule__TypeAlias__Group__2__Impl : ( ( rule__TypeAlias__DefinitionAssignment_2 ) ) ;
    public final void rule__TypeAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:655:1: ( ( ( rule__TypeAlias__DefinitionAssignment_2 ) ) )
            // InternalVarlinkIdl.g:656:1: ( ( rule__TypeAlias__DefinitionAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:656:1: ( ( rule__TypeAlias__DefinitionAssignment_2 ) )
            // InternalVarlinkIdl.g:657:2: ( rule__TypeAlias__DefinitionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2()); 
            }
            // InternalVarlinkIdl.g:658:2: ( rule__TypeAlias__DefinitionAssignment_2 )
            // InternalVarlinkIdl.g:658:3: rule__TypeAlias__DefinitionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlias__DefinitionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // InternalVarlinkIdl.g:667:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:671:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalVarlinkIdl.g:672:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // InternalVarlinkIdl.g:679:1: rule__Enum__Group__0__Impl : ( '(' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:683:1: ( ( '(' ) )
            // InternalVarlinkIdl.g:684:1: ( '(' )
            {
            // InternalVarlinkIdl.g:684:1: ( '(' )
            // InternalVarlinkIdl.g:685:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // InternalVarlinkIdl.g:694:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:698:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalVarlinkIdl.g:699:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // InternalVarlinkIdl.g:706:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__FieldsAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:710:1: ( ( ( rule__Enum__FieldsAssignment_1 ) ) )
            // InternalVarlinkIdl.g:711:1: ( ( rule__Enum__FieldsAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:711:1: ( ( rule__Enum__FieldsAssignment_1 ) )
            // InternalVarlinkIdl.g:712:2: ( rule__Enum__FieldsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsAssignment_1()); 
            }
            // InternalVarlinkIdl.g:713:2: ( rule__Enum__FieldsAssignment_1 )
            // InternalVarlinkIdl.g:713:3: rule__Enum__FieldsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__FieldsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFieldsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // InternalVarlinkIdl.g:721:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:725:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalVarlinkIdl.g:726:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // InternalVarlinkIdl.g:733:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__Group_2__0 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:737:1: ( ( ( rule__Enum__Group_2__0 )* ) )
            // InternalVarlinkIdl.g:738:1: ( ( rule__Enum__Group_2__0 )* )
            {
            // InternalVarlinkIdl.g:738:1: ( ( rule__Enum__Group_2__0 )* )
            // InternalVarlinkIdl.g:739:2: ( rule__Enum__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup_2()); 
            }
            // InternalVarlinkIdl.g:740:2: ( rule__Enum__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVarlinkIdl.g:740:3: rule__Enum__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Enum__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // InternalVarlinkIdl.g:748:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:752:1: ( rule__Enum__Group__3__Impl )
            // InternalVarlinkIdl.g:753:2: rule__Enum__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // InternalVarlinkIdl.g:759:1: rule__Enum__Group__3__Impl : ( ')' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:763:1: ( ( ')' ) )
            // InternalVarlinkIdl.g:764:1: ( ')' )
            {
            // InternalVarlinkIdl.g:764:1: ( ')' )
            // InternalVarlinkIdl.g:765:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group_2__0"
    // InternalVarlinkIdl.g:775:1: rule__Enum__Group_2__0 : rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 ;
    public final void rule__Enum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:779:1: ( rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 )
            // InternalVarlinkIdl.g:780:2: rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Enum__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enum__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__0"


    // $ANTLR start "rule__Enum__Group_2__0__Impl"
    // InternalVarlinkIdl.g:787:1: rule__Enum__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:791:1: ( ( ',' ) )
            // InternalVarlinkIdl.g:792:1: ( ',' )
            {
            // InternalVarlinkIdl.g:792:1: ( ',' )
            // InternalVarlinkIdl.g:793:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__0__Impl"


    // $ANTLR start "rule__Enum__Group_2__1"
    // InternalVarlinkIdl.g:802:1: rule__Enum__Group_2__1 : rule__Enum__Group_2__1__Impl ;
    public final void rule__Enum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:806:1: ( rule__Enum__Group_2__1__Impl )
            // InternalVarlinkIdl.g:807:2: rule__Enum__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__1"


    // $ANTLR start "rule__Enum__Group_2__1__Impl"
    // InternalVarlinkIdl.g:813:1: rule__Enum__Group_2__1__Impl : ( ( rule__Enum__FieldsAssignment_2_1 ) ) ;
    public final void rule__Enum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:817:1: ( ( ( rule__Enum__FieldsAssignment_2_1 ) ) )
            // InternalVarlinkIdl.g:818:1: ( ( rule__Enum__FieldsAssignment_2_1 ) )
            {
            // InternalVarlinkIdl.g:818:1: ( ( rule__Enum__FieldsAssignment_2_1 ) )
            // InternalVarlinkIdl.g:819:2: ( rule__Enum__FieldsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsAssignment_2_1()); 
            }
            // InternalVarlinkIdl.g:820:2: ( rule__Enum__FieldsAssignment_2_1 )
            // InternalVarlinkIdl.g:820:3: rule__Enum__FieldsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__FieldsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFieldsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalVarlinkIdl.g:829:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:833:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalVarlinkIdl.g:834:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Object__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalVarlinkIdl.g:841:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:845:1: ( ( () ) )
            // InternalVarlinkIdl.g:846:1: ( () )
            {
            // InternalVarlinkIdl.g:846:1: ( () )
            // InternalVarlinkIdl.g:847:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            }
            // InternalVarlinkIdl.g:848:2: ()
            // InternalVarlinkIdl.g:848:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalVarlinkIdl.g:856:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:860:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalVarlinkIdl.g:861:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalVarlinkIdl.g:868:1: rule__Object__Group__1__Impl : ( '(' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:872:1: ( ( '(' ) )
            // InternalVarlinkIdl.g:873:1: ( '(' )
            {
            // InternalVarlinkIdl.g:873:1: ( '(' )
            // InternalVarlinkIdl.g:874:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalVarlinkIdl.g:883:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:887:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalVarlinkIdl.g:888:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalVarlinkIdl.g:895:1: rule__Object__Group__2__Impl : ( ( rule__Object__FieldsAssignment_2 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:899:1: ( ( ( rule__Object__FieldsAssignment_2 )? ) )
            // InternalVarlinkIdl.g:900:1: ( ( rule__Object__FieldsAssignment_2 )? )
            {
            // InternalVarlinkIdl.g:900:1: ( ( rule__Object__FieldsAssignment_2 )? )
            // InternalVarlinkIdl.g:901:2: ( rule__Object__FieldsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsAssignment_2()); 
            }
            // InternalVarlinkIdl.g:902:2: ( rule__Object__FieldsAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVarlinkIdl.g:902:3: rule__Object__FieldsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__FieldsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFieldsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalVarlinkIdl.g:910:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:914:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalVarlinkIdl.g:915:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalVarlinkIdl.g:922:1: rule__Object__Group__3__Impl : ( ( rule__Object__Group_3__0 )* ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:926:1: ( ( ( rule__Object__Group_3__0 )* ) )
            // InternalVarlinkIdl.g:927:1: ( ( rule__Object__Group_3__0 )* )
            {
            // InternalVarlinkIdl.g:927:1: ( ( rule__Object__Group_3__0 )* )
            // InternalVarlinkIdl.g:928:2: ( rule__Object__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_3()); 
            }
            // InternalVarlinkIdl.g:929:2: ( rule__Object__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVarlinkIdl.g:929:3: rule__Object__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Object__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalVarlinkIdl.g:937:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:941:1: ( rule__Object__Group__4__Impl )
            // InternalVarlinkIdl.g:942:2: rule__Object__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalVarlinkIdl.g:948:1: rule__Object__Group__4__Impl : ( ')' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:952:1: ( ( ')' ) )
            // InternalVarlinkIdl.g:953:1: ( ')' )
            {
            // InternalVarlinkIdl.g:953:1: ( ')' )
            // InternalVarlinkIdl.g:954:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group_3__0"
    // InternalVarlinkIdl.g:964:1: rule__Object__Group_3__0 : rule__Object__Group_3__0__Impl rule__Object__Group_3__1 ;
    public final void rule__Object__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:968:1: ( rule__Object__Group_3__0__Impl rule__Object__Group_3__1 )
            // InternalVarlinkIdl.g:969:2: rule__Object__Group_3__0__Impl rule__Object__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Object__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__0"


    // $ANTLR start "rule__Object__Group_3__0__Impl"
    // InternalVarlinkIdl.g:976:1: rule__Object__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Object__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:980:1: ( ( ',' ) )
            // InternalVarlinkIdl.g:981:1: ( ',' )
            {
            // InternalVarlinkIdl.g:981:1: ( ',' )
            // InternalVarlinkIdl.g:982:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getCommaKeyword_3_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__0__Impl"


    // $ANTLR start "rule__Object__Group_3__1"
    // InternalVarlinkIdl.g:991:1: rule__Object__Group_3__1 : rule__Object__Group_3__1__Impl ;
    public final void rule__Object__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:995:1: ( rule__Object__Group_3__1__Impl )
            // InternalVarlinkIdl.g:996:2: rule__Object__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__1"


    // $ANTLR start "rule__Object__Group_3__1__Impl"
    // InternalVarlinkIdl.g:1002:1: rule__Object__Group_3__1__Impl : ( ( rule__Object__FieldsAssignment_3_1 ) ) ;
    public final void rule__Object__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1006:1: ( ( ( rule__Object__FieldsAssignment_3_1 ) ) )
            // InternalVarlinkIdl.g:1007:1: ( ( rule__Object__FieldsAssignment_3_1 ) )
            {
            // InternalVarlinkIdl.g:1007:1: ( ( rule__Object__FieldsAssignment_3_1 ) )
            // InternalVarlinkIdl.g:1008:2: ( rule__Object__FieldsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsAssignment_3_1()); 
            }
            // InternalVarlinkIdl.g:1009:2: ( rule__Object__FieldsAssignment_3_1 )
            // InternalVarlinkIdl.g:1009:3: rule__Object__FieldsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__FieldsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFieldsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalVarlinkIdl.g:1018:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1022:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalVarlinkIdl.g:1023:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalVarlinkIdl.g:1030:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1034:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalVarlinkIdl.g:1035:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalVarlinkIdl.g:1035:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalVarlinkIdl.g:1036:2: ( rule__Field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }
            // InternalVarlinkIdl.g:1037:2: ( rule__Field__NameAssignment_0 )
            // InternalVarlinkIdl.g:1037:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalVarlinkIdl.g:1045:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1049:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalVarlinkIdl.g:1050:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalVarlinkIdl.g:1057:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1061:1: ( ( ':' ) )
            // InternalVarlinkIdl.g:1062:1: ( ':' )
            {
            // InternalVarlinkIdl.g:1062:1: ( ':' )
            // InternalVarlinkIdl.g:1063:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalVarlinkIdl.g:1072:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1076:1: ( rule__Field__Group__2__Impl )
            // InternalVarlinkIdl.g:1077:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalVarlinkIdl.g:1083:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1087:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1088:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1088:1: ( ( rule__Field__TypeAssignment_2 ) )
            // InternalVarlinkIdl.g:1089:2: ( rule__Field__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1090:2: ( rule__Field__TypeAssignment_2 )
            // InternalVarlinkIdl.g:1090:3: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__ElementType__Group__0"
    // InternalVarlinkIdl.g:1099:1: rule__ElementType__Group__0 : rule__ElementType__Group__0__Impl rule__ElementType__Group__1 ;
    public final void rule__ElementType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1103:1: ( rule__ElementType__Group__0__Impl rule__ElementType__Group__1 )
            // InternalVarlinkIdl.g:1104:2: rule__ElementType__Group__0__Impl rule__ElementType__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ElementType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group__0"


    // $ANTLR start "rule__ElementType__Group__0__Impl"
    // InternalVarlinkIdl.g:1111:1: rule__ElementType__Group__0__Impl : ( ( rule__ElementType__Alternatives_0 ) ) ;
    public final void rule__ElementType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1115:1: ( ( ( rule__ElementType__Alternatives_0 ) ) )
            // InternalVarlinkIdl.g:1116:1: ( ( rule__ElementType__Alternatives_0 ) )
            {
            // InternalVarlinkIdl.g:1116:1: ( ( rule__ElementType__Alternatives_0 ) )
            // InternalVarlinkIdl.g:1117:2: ( rule__ElementType__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeAccess().getAlternatives_0()); 
            }
            // InternalVarlinkIdl.g:1118:2: ( rule__ElementType__Alternatives_0 )
            // InternalVarlinkIdl.g:1118:3: rule__ElementType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group__0__Impl"


    // $ANTLR start "rule__ElementType__Group__1"
    // InternalVarlinkIdl.g:1126:1: rule__ElementType__Group__1 : rule__ElementType__Group__1__Impl ;
    public final void rule__ElementType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1130:1: ( rule__ElementType__Group__1__Impl )
            // InternalVarlinkIdl.g:1131:2: rule__ElementType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group__1"


    // $ANTLR start "rule__ElementType__Group__1__Impl"
    // InternalVarlinkIdl.g:1137:1: rule__ElementType__Group__1__Impl : ( ( rule__ElementType__MultiAssignment_1 )? ) ;
    public final void rule__ElementType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1141:1: ( ( ( rule__ElementType__MultiAssignment_1 )? ) )
            // InternalVarlinkIdl.g:1142:1: ( ( rule__ElementType__MultiAssignment_1 )? )
            {
            // InternalVarlinkIdl.g:1142:1: ( ( rule__ElementType__MultiAssignment_1 )? )
            // InternalVarlinkIdl.g:1143:2: ( rule__ElementType__MultiAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeAccess().getMultiAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1144:2: ( rule__ElementType__MultiAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVarlinkIdl.g:1144:3: rule__ElementType__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementType__MultiAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeAccess().getMultiAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalVarlinkIdl.g:1153:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1157:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalVarlinkIdl.g:1158:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalVarlinkIdl.g:1165:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1169:1: ( ( 'method' ) )
            // InternalVarlinkIdl.g:1170:1: ( 'method' )
            {
            // InternalVarlinkIdl.g:1170:1: ( 'method' )
            // InternalVarlinkIdl.g:1171:2: 'method'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalVarlinkIdl.g:1180:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1184:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalVarlinkIdl.g:1185:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalVarlinkIdl.g:1192:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1196:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1197:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1197:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:1198:2: ( rule__Method__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1199:2: ( rule__Method__NameAssignment_1 )
            // InternalVarlinkIdl.g:1199:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalVarlinkIdl.g:1207:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1211:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalVarlinkIdl.g:1212:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalVarlinkIdl.g:1219:1: rule__Method__Group__2__Impl : ( ( rule__Method__ArgumentsAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1223:1: ( ( ( rule__Method__ArgumentsAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1224:1: ( ( rule__Method__ArgumentsAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1224:1: ( ( rule__Method__ArgumentsAssignment_2 ) )
            // InternalVarlinkIdl.g:1225:2: ( rule__Method__ArgumentsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getArgumentsAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1226:2: ( rule__Method__ArgumentsAssignment_2 )
            // InternalVarlinkIdl.g:1226:3: rule__Method__ArgumentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__ArgumentsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getArgumentsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalVarlinkIdl.g:1234:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1238:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalVarlinkIdl.g:1239:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalVarlinkIdl.g:1246:1: rule__Method__Group__3__Impl : ( '->' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1250:1: ( ( '->' ) )
            // InternalVarlinkIdl.g:1251:1: ( '->' )
            {
            // InternalVarlinkIdl.g:1251:1: ( '->' )
            // InternalVarlinkIdl.g:1252:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalVarlinkIdl.g:1261:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1265:1: ( rule__Method__Group__4__Impl )
            // InternalVarlinkIdl.g:1266:2: rule__Method__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalVarlinkIdl.g:1272:1: rule__Method__Group__4__Impl : ( ( rule__Method__ResultAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1276:1: ( ( ( rule__Method__ResultAssignment_4 ) ) )
            // InternalVarlinkIdl.g:1277:1: ( ( rule__Method__ResultAssignment_4 ) )
            {
            // InternalVarlinkIdl.g:1277:1: ( ( rule__Method__ResultAssignment_4 ) )
            // InternalVarlinkIdl.g:1278:2: ( rule__Method__ResultAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getResultAssignment_4()); 
            }
            // InternalVarlinkIdl.g:1279:2: ( rule__Method__ResultAssignment_4 )
            // InternalVarlinkIdl.g:1279:3: rule__Method__ResultAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Method__ResultAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getResultAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Error__Group__0"
    // InternalVarlinkIdl.g:1288:1: rule__Error__Group__0 : rule__Error__Group__0__Impl rule__Error__Group__1 ;
    public final void rule__Error__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1292:1: ( rule__Error__Group__0__Impl rule__Error__Group__1 )
            // InternalVarlinkIdl.g:1293:2: rule__Error__Group__0__Impl rule__Error__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Error__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Error__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__0"


    // $ANTLR start "rule__Error__Group__0__Impl"
    // InternalVarlinkIdl.g:1300:1: rule__Error__Group__0__Impl : ( 'error' ) ;
    public final void rule__Error__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1304:1: ( ( 'error' ) )
            // InternalVarlinkIdl.g:1305:1: ( 'error' )
            {
            // InternalVarlinkIdl.g:1305:1: ( 'error' )
            // InternalVarlinkIdl.g:1306:2: 'error'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getErrorKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getErrorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__0__Impl"


    // $ANTLR start "rule__Error__Group__1"
    // InternalVarlinkIdl.g:1315:1: rule__Error__Group__1 : rule__Error__Group__1__Impl rule__Error__Group__2 ;
    public final void rule__Error__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1319:1: ( rule__Error__Group__1__Impl rule__Error__Group__2 )
            // InternalVarlinkIdl.g:1320:2: rule__Error__Group__1__Impl rule__Error__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Error__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Error__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__1"


    // $ANTLR start "rule__Error__Group__1__Impl"
    // InternalVarlinkIdl.g:1327:1: rule__Error__Group__1__Impl : ( ( rule__Error__NameAssignment_1 ) ) ;
    public final void rule__Error__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1331:1: ( ( ( rule__Error__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1332:1: ( ( rule__Error__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1332:1: ( ( rule__Error__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:1333:2: ( rule__Error__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1334:2: ( rule__Error__NameAssignment_1 )
            // InternalVarlinkIdl.g:1334:3: rule__Error__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Error__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__1__Impl"


    // $ANTLR start "rule__Error__Group__2"
    // InternalVarlinkIdl.g:1342:1: rule__Error__Group__2 : rule__Error__Group__2__Impl ;
    public final void rule__Error__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1346:1: ( rule__Error__Group__2__Impl )
            // InternalVarlinkIdl.g:1347:2: rule__Error__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Error__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__2"


    // $ANTLR start "rule__Error__Group__2__Impl"
    // InternalVarlinkIdl.g:1353:1: rule__Error__Group__2__Impl : ( ( rule__Error__PropertiesAssignment_2 ) ) ;
    public final void rule__Error__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1357:1: ( ( ( rule__Error__PropertiesAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1358:1: ( ( rule__Error__PropertiesAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1358:1: ( ( rule__Error__PropertiesAssignment_2 ) )
            // InternalVarlinkIdl.g:1359:2: ( rule__Error__PropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getPropertiesAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1360:2: ( rule__Error__PropertiesAssignment_2 )
            // InternalVarlinkIdl.g:1360:3: rule__Error__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Error__PropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getPropertiesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__2__Impl"


    // $ANTLR start "rule__InterfaceName__Group__0"
    // InternalVarlinkIdl.g:1369:1: rule__InterfaceName__Group__0 : rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1 ;
    public final void rule__InterfaceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1373:1: ( rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1 )
            // InternalVarlinkIdl.g:1374:2: rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__InterfaceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InterfaceName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group__0"


    // $ANTLR start "rule__InterfaceName__Group__0__Impl"
    // InternalVarlinkIdl.g:1381:1: rule__InterfaceName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__InterfaceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1385:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1386:1: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1386:1: ( RULE_ID )
            // InternalVarlinkIdl.g:1387:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group__0__Impl"


    // $ANTLR start "rule__InterfaceName__Group__1"
    // InternalVarlinkIdl.g:1396:1: rule__InterfaceName__Group__1 : rule__InterfaceName__Group__1__Impl ;
    public final void rule__InterfaceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1400:1: ( rule__InterfaceName__Group__1__Impl )
            // InternalVarlinkIdl.g:1401:2: rule__InterfaceName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group__1"


    // $ANTLR start "rule__InterfaceName__Group__1__Impl"
    // InternalVarlinkIdl.g:1407:1: rule__InterfaceName__Group__1__Impl : ( ( rule__InterfaceName__Group_1__0 )* ) ;
    public final void rule__InterfaceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1411:1: ( ( ( rule__InterfaceName__Group_1__0 )* ) )
            // InternalVarlinkIdl.g:1412:1: ( ( rule__InterfaceName__Group_1__0 )* )
            {
            // InternalVarlinkIdl.g:1412:1: ( ( rule__InterfaceName__Group_1__0 )* )
            // InternalVarlinkIdl.g:1413:2: ( rule__InterfaceName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getGroup_1()); 
            }
            // InternalVarlinkIdl.g:1414:2: ( rule__InterfaceName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVarlinkIdl.g:1414:3: rule__InterfaceName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__InterfaceName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group__1__Impl"


    // $ANTLR start "rule__InterfaceName__Group_1__0"
    // InternalVarlinkIdl.g:1423:1: rule__InterfaceName__Group_1__0 : rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1 ;
    public final void rule__InterfaceName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1427:1: ( rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1 )
            // InternalVarlinkIdl.g:1428:2: rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__InterfaceName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InterfaceName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group_1__0"


    // $ANTLR start "rule__InterfaceName__Group_1__0__Impl"
    // InternalVarlinkIdl.g:1435:1: rule__InterfaceName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__InterfaceName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1439:1: ( ( ( '.' ) ) )
            // InternalVarlinkIdl.g:1440:1: ( ( '.' ) )
            {
            // InternalVarlinkIdl.g:1440:1: ( ( '.' ) )
            // InternalVarlinkIdl.g:1441:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalVarlinkIdl.g:1442:2: ( '.' )
            // InternalVarlinkIdl.g:1442:3: '.'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group_1__0__Impl"


    // $ANTLR start "rule__InterfaceName__Group_1__1"
    // InternalVarlinkIdl.g:1450:1: rule__InterfaceName__Group_1__1 : rule__InterfaceName__Group_1__1__Impl ;
    public final void rule__InterfaceName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1454:1: ( rule__InterfaceName__Group_1__1__Impl )
            // InternalVarlinkIdl.g:1455:2: rule__InterfaceName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group_1__1"


    // $ANTLR start "rule__InterfaceName__Group_1__1__Impl"
    // InternalVarlinkIdl.g:1461:1: rule__InterfaceName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__InterfaceName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1465:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1466:1: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1466:1: ( RULE_ID )
            // InternalVarlinkIdl.g:1467:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceName__Group_1__1__Impl"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalVarlinkIdl.g:1477:1: rule__Interface__NameAssignment_1 : ( ruleInterfaceName ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1481:1: ( ( ruleInterfaceName ) )
            // InternalVarlinkIdl.g:1482:2: ( ruleInterfaceName )
            {
            // InternalVarlinkIdl.g:1482:2: ( ruleInterfaceName )
            // InternalVarlinkIdl.g:1483:3: ruleInterfaceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameInterfaceNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInterfaceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameInterfaceNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__MembersAssignment_2"
    // InternalVarlinkIdl.g:1492:1: rule__Interface__MembersAssignment_2 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1496:1: ( ( ruleMember ) )
            // InternalVarlinkIdl.g:1497:2: ( ruleMember )
            {
            // InternalVarlinkIdl.g:1497:2: ( ruleMember )
            // InternalVarlinkIdl.g:1498:3: ruleMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MembersAssignment_2"


    // $ANTLR start "rule__TypeAlias__NameAssignment_1"
    // InternalVarlinkIdl.g:1507:1: rule__TypeAlias__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeAlias__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1511:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1512:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1512:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1513:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__NameAssignment_1"


    // $ANTLR start "rule__TypeAlias__DefinitionAssignment_2"
    // InternalVarlinkIdl.g:1522:1: rule__TypeAlias__DefinitionAssignment_2 : ( ruleTypeAliasDefinition ) ;
    public final void rule__TypeAlias__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1526:1: ( ( ruleTypeAliasDefinition ) )
            // InternalVarlinkIdl.g:1527:2: ( ruleTypeAliasDefinition )
            {
            // InternalVarlinkIdl.g:1527:2: ( ruleTypeAliasDefinition )
            // InternalVarlinkIdl.g:1528:3: ruleTypeAliasDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getDefinitionTypeAliasDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeAliasDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasAccess().getDefinitionTypeAliasDefinitionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__DefinitionAssignment_2"


    // $ANTLR start "rule__Enum__FieldsAssignment_1"
    // InternalVarlinkIdl.g:1537:1: rule__Enum__FieldsAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1541:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1542:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1542:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1543:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFieldsIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__FieldsAssignment_1"


    // $ANTLR start "rule__Enum__FieldsAssignment_2_1"
    // InternalVarlinkIdl.g:1552:1: rule__Enum__FieldsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Enum__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1556:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1557:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1557:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1558:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFieldsIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__FieldsAssignment_2_1"


    // $ANTLR start "rule__Object__FieldsAssignment_2"
    // InternalVarlinkIdl.g:1567:1: rule__Object__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__Object__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1571:1: ( ( ruleField ) )
            // InternalVarlinkIdl.g:1572:2: ( ruleField )
            {
            // InternalVarlinkIdl.g:1572:2: ( ruleField )
            // InternalVarlinkIdl.g:1573:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__FieldsAssignment_2"


    // $ANTLR start "rule__Object__FieldsAssignment_3_1"
    // InternalVarlinkIdl.g:1582:1: rule__Object__FieldsAssignment_3_1 : ( ruleField ) ;
    public final void rule__Object__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1586:1: ( ( ruleField ) )
            // InternalVarlinkIdl.g:1587:2: ( ruleField )
            {
            // InternalVarlinkIdl.g:1587:2: ( ruleField )
            // InternalVarlinkIdl.g:1588:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__FieldsAssignment_3_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalVarlinkIdl.g:1597:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1601:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1602:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1602:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1603:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // InternalVarlinkIdl.g:1612:1: rule__Field__TypeAssignment_2 : ( ruleElementType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1616:1: ( ( ruleElementType ) )
            // InternalVarlinkIdl.g:1617:2: ( ruleElementType )
            {
            // InternalVarlinkIdl.g:1617:2: ( ruleElementType )
            // InternalVarlinkIdl.g:1618:3: ruleElementType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeElementTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeElementTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_2"


    // $ANTLR start "rule__ElementType__MultiAssignment_1"
    // InternalVarlinkIdl.g:1627:1: rule__ElementType__MultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__ElementType__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1631:1: ( ( ( '[]' ) ) )
            // InternalVarlinkIdl.g:1632:2: ( ( '[]' ) )
            {
            // InternalVarlinkIdl.g:1632:2: ( ( '[]' ) )
            // InternalVarlinkIdl.g:1633:3: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }
            // InternalVarlinkIdl.g:1634:3: ( '[]' )
            // InternalVarlinkIdl.g:1635:4: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__MultiAssignment_1"


    // $ANTLR start "rule__TypeReference__NameAssignment"
    // InternalVarlinkIdl.g:1646:1: rule__TypeReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1650:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1651:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1651:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1652:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__NameAssignment"


    // $ANTLR start "rule__BasicType__TypeAssignment"
    // InternalVarlinkIdl.g:1661:1: rule__BasicType__TypeAssignment : ( ( rule__BasicType__TypeAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1665:1: ( ( ( rule__BasicType__TypeAlternatives_0 ) ) )
            // InternalVarlinkIdl.g:1666:2: ( ( rule__BasicType__TypeAlternatives_0 ) )
            {
            // InternalVarlinkIdl.g:1666:2: ( ( rule__BasicType__TypeAlternatives_0 ) )
            // InternalVarlinkIdl.g:1667:3: ( rule__BasicType__TypeAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0()); 
            }
            // InternalVarlinkIdl.g:1668:3: ( rule__BasicType__TypeAlternatives_0 )
            // InternalVarlinkIdl.g:1668:4: rule__BasicType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeAssignment"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalVarlinkIdl.g:1676:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1680:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1681:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1681:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1682:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ArgumentsAssignment_2"
    // InternalVarlinkIdl.g:1691:1: rule__Method__ArgumentsAssignment_2 : ( ruleObject ) ;
    public final void rule__Method__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1695:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:1696:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:1696:2: ( ruleObject )
            // InternalVarlinkIdl.g:1697:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getArgumentsObjectParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getArgumentsObjectParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ArgumentsAssignment_2"


    // $ANTLR start "rule__Method__ResultAssignment_4"
    // InternalVarlinkIdl.g:1706:1: rule__Method__ResultAssignment_4 : ( ruleObject ) ;
    public final void rule__Method__ResultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1710:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:1711:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:1711:2: ( ruleObject )
            // InternalVarlinkIdl.g:1712:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getResultObjectParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getResultObjectParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ResultAssignment_4"


    // $ANTLR start "rule__Error__NameAssignment_1"
    // InternalVarlinkIdl.g:1721:1: rule__Error__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Error__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1725:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1726:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1726:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1727:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__NameAssignment_1"


    // $ANTLR start "rule__Error__PropertiesAssignment_2"
    // InternalVarlinkIdl.g:1736:1: rule__Error__PropertiesAssignment_2 : ( ruleObject ) ;
    public final void rule__Error__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1740:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:1741:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:1741:2: ( ruleObject )
            // InternalVarlinkIdl.g:1742:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getPropertiesObjectParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getPropertiesObjectParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__PropertiesAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000508000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000508002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000013F10L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});

}