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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'int'", "'float'", "'string'", "'type'", "'enum'", "'interface'", "'method'", "'error'", "'data'", "'object'", "'('", "')'", "','", "':'", "'->'", "'.'", "'[]'"
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
    public static final int T__25=25;
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
    // InternalVarlinkIdl.g:245:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:249:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalVarlinkIdl.g:250:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalVarlinkIdl.g:250:2: ( ( rule__ElementType__Alternatives ) )
            // InternalVarlinkIdl.g:251:3: ( rule__ElementType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            }
            // InternalVarlinkIdl.g:252:3: ( rule__ElementType__Alternatives )
            // InternalVarlinkIdl.g:252:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementTypeAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleValidID"
    // InternalVarlinkIdl.g:386:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:387:1: ( ruleValidID EOF )
            // InternalVarlinkIdl.g:388:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalVarlinkIdl.g:395:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:399:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalVarlinkIdl.g:400:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalVarlinkIdl.g:400:2: ( ( rule__ValidID__Alternatives ) )
            // InternalVarlinkIdl.g:401:3: ( rule__ValidID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getAlternatives()); 
            }
            // InternalVarlinkIdl.g:402:3: ( rule__ValidID__Alternatives )
            // InternalVarlinkIdl.g:402:4: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalVarlinkIdl.g:411:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:412:1: ( ruleKEYWORD EOF )
            // InternalVarlinkIdl.g:413:1: ruleKEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKEYWORDRule()); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalVarlinkIdl.g:420:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:424:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalVarlinkIdl.g:425:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalVarlinkIdl.g:425:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalVarlinkIdl.g:426:3: ( rule__KEYWORD__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            }
            // InternalVarlinkIdl.g:427:3: ( rule__KEYWORD__Alternatives )
            // InternalVarlinkIdl.g:427:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKEYWORDAccess().getAlternatives()); 
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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalVarlinkIdl.g:435:1: rule__Member__Alternatives : ( ( ruleTypeAlias ) | ( ruleMethod ) | ( ruleError ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:439:1: ( ( ruleTypeAlias ) | ( ruleMethod ) | ( ruleError ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
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
                    // InternalVarlinkIdl.g:440:2: ( ruleTypeAlias )
                    {
                    // InternalVarlinkIdl.g:440:2: ( ruleTypeAlias )
                    // InternalVarlinkIdl.g:441:3: ruleTypeAlias
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
                    // InternalVarlinkIdl.g:446:2: ( ruleMethod )
                    {
                    // InternalVarlinkIdl.g:446:2: ( ruleMethod )
                    // InternalVarlinkIdl.g:447:3: ruleMethod
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
                    // InternalVarlinkIdl.g:452:2: ( ruleError )
                    {
                    // InternalVarlinkIdl.g:452:2: ( ruleError )
                    // InternalVarlinkIdl.g:453:3: ruleError
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
    // InternalVarlinkIdl.g:462:1: rule__TypeAliasDefinition__Alternatives : ( ( ruleEnum ) | ( ruleObject ) );
    public final void rule__TypeAliasDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:466:1: ( ( ruleEnum ) | ( ruleObject ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalVarlinkIdl.g:467:2: ( ruleEnum )
                    {
                    // InternalVarlinkIdl.g:467:2: ( ruleEnum )
                    // InternalVarlinkIdl.g:468:3: ruleEnum
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
                    // InternalVarlinkIdl.g:473:2: ( ruleObject )
                    {
                    // InternalVarlinkIdl.g:473:2: ( ruleObject )
                    // InternalVarlinkIdl.g:474:3: ruleObject
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


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalVarlinkIdl.g:483:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) | ( ruleObject ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:487:1: ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) | ( ruleObject ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalVarlinkIdl.g:488:2: ( ruleBasicType )
                    {
                    // InternalVarlinkIdl.g:488:2: ( ruleBasicType )
                    // InternalVarlinkIdl.g:489:3: ruleBasicType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:494:2: ( ruleTypeReference )
                    {
                    // InternalVarlinkIdl.g:494:2: ( ruleTypeReference )
                    // InternalVarlinkIdl.g:495:3: ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:500:2: ( ruleEnum )
                    {
                    // InternalVarlinkIdl.g:500:2: ( ruleEnum )
                    // InternalVarlinkIdl.g:501:3: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVarlinkIdl.g:506:2: ( ruleObject )
                    {
                    // InternalVarlinkIdl.g:506:2: ( ruleObject )
                    // InternalVarlinkIdl.g:507:3: ruleObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getObjectParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getObjectParserRuleCall_3()); 
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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeAlternatives_0"
    // InternalVarlinkIdl.g:516:1: rule__BasicType__TypeAlternatives_0 : ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) );
    public final void rule__BasicType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:520:1: ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) )
            int alt4=4;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVarlinkIdl.g:521:2: ( 'bool' )
                    {
                    // InternalVarlinkIdl.g:521:2: ( 'bool' )
                    // InternalVarlinkIdl.g:522:3: 'bool'
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
                    // InternalVarlinkIdl.g:527:2: ( 'int' )
                    {
                    // InternalVarlinkIdl.g:527:2: ( 'int' )
                    // InternalVarlinkIdl.g:528:3: 'int'
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
                    // InternalVarlinkIdl.g:533:2: ( 'float' )
                    {
                    // InternalVarlinkIdl.g:533:2: ( 'float' )
                    // InternalVarlinkIdl.g:534:3: 'float'
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
                    // InternalVarlinkIdl.g:539:2: ( 'string' )
                    {
                    // InternalVarlinkIdl.g:539:2: ( 'string' )
                    // InternalVarlinkIdl.g:540:3: 'string'
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


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalVarlinkIdl.g:549:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( ruleKEYWORD ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:553:1: ( ( RULE_ID ) | ( ruleKEYWORD ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=8 && LA5_0<=18)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVarlinkIdl.g:554:2: ( RULE_ID )
                    {
                    // InternalVarlinkIdl.g:554:2: ( RULE_ID )
                    // InternalVarlinkIdl.g:555:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:560:2: ( ruleKEYWORD )
                    {
                    // InternalVarlinkIdl.g:560:2: ( ruleKEYWORD )
                    // InternalVarlinkIdl.g:561:3: ruleKEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1()); 
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
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalVarlinkIdl.g:570:1: rule__KEYWORD__Alternatives : ( ( 'type' ) | ( 'enum' ) | ( 'interface' ) | ( 'method' ) | ( 'error' ) | ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) | ( 'data' ) | ( 'object' ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:574:1: ( ( 'type' ) | ( 'enum' ) | ( 'interface' ) | ( 'method' ) | ( 'error' ) | ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) | ( 'data' ) | ( 'object' ) )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 8:
                {
                alt6=6;
                }
                break;
            case 9:
                {
                alt6=7;
                }
                break;
            case 10:
                {
                alt6=8;
                }
                break;
            case 11:
                {
                alt6=9;
                }
                break;
            case 17:
                {
                alt6=10;
                }
                break;
            case 18:
                {
                alt6=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVarlinkIdl.g:575:2: ( 'type' )
                    {
                    // InternalVarlinkIdl.g:575:2: ( 'type' )
                    // InternalVarlinkIdl.g:576:3: 'type'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getTypeKeyword_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getTypeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:581:2: ( 'enum' )
                    {
                    // InternalVarlinkIdl.g:581:2: ( 'enum' )
                    // InternalVarlinkIdl.g:582:3: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getEnumKeyword_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getEnumKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:587:2: ( 'interface' )
                    {
                    // InternalVarlinkIdl.g:587:2: ( 'interface' )
                    // InternalVarlinkIdl.g:588:3: 'interface'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getInterfaceKeyword_2()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getInterfaceKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVarlinkIdl.g:593:2: ( 'method' )
                    {
                    // InternalVarlinkIdl.g:593:2: ( 'method' )
                    // InternalVarlinkIdl.g:594:3: 'method'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getMethodKeyword_3()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getMethodKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVarlinkIdl.g:599:2: ( 'error' )
                    {
                    // InternalVarlinkIdl.g:599:2: ( 'error' )
                    // InternalVarlinkIdl.g:600:3: 'error'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getErrorKeyword_4()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getErrorKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVarlinkIdl.g:605:2: ( 'bool' )
                    {
                    // InternalVarlinkIdl.g:605:2: ( 'bool' )
                    // InternalVarlinkIdl.g:606:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getBoolKeyword_5()); 
                    }
                    match(input,8,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getBoolKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalVarlinkIdl.g:611:2: ( 'int' )
                    {
                    // InternalVarlinkIdl.g:611:2: ( 'int' )
                    // InternalVarlinkIdl.g:612:3: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getIntKeyword_6()); 
                    }
                    match(input,9,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getIntKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalVarlinkIdl.g:617:2: ( 'float' )
                    {
                    // InternalVarlinkIdl.g:617:2: ( 'float' )
                    // InternalVarlinkIdl.g:618:3: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getFloatKeyword_7()); 
                    }
                    match(input,10,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getFloatKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalVarlinkIdl.g:623:2: ( 'string' )
                    {
                    // InternalVarlinkIdl.g:623:2: ( 'string' )
                    // InternalVarlinkIdl.g:624:3: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getStringKeyword_8()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getStringKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalVarlinkIdl.g:629:2: ( 'data' )
                    {
                    // InternalVarlinkIdl.g:629:2: ( 'data' )
                    // InternalVarlinkIdl.g:630:3: 'data'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getDataKeyword_9()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getDataKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalVarlinkIdl.g:635:2: ( 'object' )
                    {
                    // InternalVarlinkIdl.g:635:2: ( 'object' )
                    // InternalVarlinkIdl.g:636:3: 'object'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKEYWORDAccess().getObjectKeyword_10()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKEYWORDAccess().getObjectKeyword_10()); 
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
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalVarlinkIdl.g:645:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:649:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalVarlinkIdl.g:650:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
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
    // InternalVarlinkIdl.g:657:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:661:1: ( ( 'interface' ) )
            // InternalVarlinkIdl.g:662:1: ( 'interface' )
            {
            // InternalVarlinkIdl.g:662:1: ( 'interface' )
            // InternalVarlinkIdl.g:663:2: 'interface'
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
    // InternalVarlinkIdl.g:672:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:676:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalVarlinkIdl.g:677:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
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
    // InternalVarlinkIdl.g:684:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:688:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:689:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:689:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:690:2: ( rule__Interface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:691:2: ( rule__Interface__NameAssignment_1 )
            // InternalVarlinkIdl.g:691:3: rule__Interface__NameAssignment_1
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
    // InternalVarlinkIdl.g:699:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:703:1: ( rule__Interface__Group__2__Impl )
            // InternalVarlinkIdl.g:704:2: rule__Interface__Group__2__Impl
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
    // InternalVarlinkIdl.g:710:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__MembersAssignment_2 )* ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:714:1: ( ( ( rule__Interface__MembersAssignment_2 )* ) )
            // InternalVarlinkIdl.g:715:1: ( ( rule__Interface__MembersAssignment_2 )* )
            {
            // InternalVarlinkIdl.g:715:1: ( ( rule__Interface__MembersAssignment_2 )* )
            // InternalVarlinkIdl.g:716:2: ( rule__Interface__MembersAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersAssignment_2()); 
            }
            // InternalVarlinkIdl.g:717:2: ( rule__Interface__MembersAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||(LA7_0>=15 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVarlinkIdl.g:717:3: rule__Interface__MembersAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Interface__MembersAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalVarlinkIdl.g:726:1: rule__TypeAlias__Group__0 : rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 ;
    public final void rule__TypeAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:730:1: ( rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 )
            // InternalVarlinkIdl.g:731:2: rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalVarlinkIdl.g:738:1: rule__TypeAlias__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:742:1: ( ( 'type' ) )
            // InternalVarlinkIdl.g:743:1: ( 'type' )
            {
            // InternalVarlinkIdl.g:743:1: ( 'type' )
            // InternalVarlinkIdl.g:744:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getTypeKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:753:1: rule__TypeAlias__Group__1 : rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 ;
    public final void rule__TypeAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:757:1: ( rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 )
            // InternalVarlinkIdl.g:758:2: rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalVarlinkIdl.g:765:1: rule__TypeAlias__Group__1__Impl : ( ( rule__TypeAlias__NameAssignment_1 ) ) ;
    public final void rule__TypeAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:769:1: ( ( ( rule__TypeAlias__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:770:1: ( ( rule__TypeAlias__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:770:1: ( ( rule__TypeAlias__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:771:2: ( rule__TypeAlias__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:772:2: ( rule__TypeAlias__NameAssignment_1 )
            // InternalVarlinkIdl.g:772:3: rule__TypeAlias__NameAssignment_1
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
    // InternalVarlinkIdl.g:780:1: rule__TypeAlias__Group__2 : rule__TypeAlias__Group__2__Impl ;
    public final void rule__TypeAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:784:1: ( rule__TypeAlias__Group__2__Impl )
            // InternalVarlinkIdl.g:785:2: rule__TypeAlias__Group__2__Impl
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
    // InternalVarlinkIdl.g:791:1: rule__TypeAlias__Group__2__Impl : ( ( rule__TypeAlias__DefinitionAssignment_2 ) ) ;
    public final void rule__TypeAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:795:1: ( ( ( rule__TypeAlias__DefinitionAssignment_2 ) ) )
            // InternalVarlinkIdl.g:796:1: ( ( rule__TypeAlias__DefinitionAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:796:1: ( ( rule__TypeAlias__DefinitionAssignment_2 ) )
            // InternalVarlinkIdl.g:797:2: ( rule__TypeAlias__DefinitionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2()); 
            }
            // InternalVarlinkIdl.g:798:2: ( rule__TypeAlias__DefinitionAssignment_2 )
            // InternalVarlinkIdl.g:798:3: rule__TypeAlias__DefinitionAssignment_2
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
    // InternalVarlinkIdl.g:807:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:811:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalVarlinkIdl.g:812:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalVarlinkIdl.g:819:1: rule__Enum__Group__0__Impl : ( '(' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:823:1: ( ( '(' ) )
            // InternalVarlinkIdl.g:824:1: ( '(' )
            {
            // InternalVarlinkIdl.g:824:1: ( '(' )
            // InternalVarlinkIdl.g:825:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:834:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:838:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalVarlinkIdl.g:839:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalVarlinkIdl.g:846:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__FieldsAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:850:1: ( ( ( rule__Enum__FieldsAssignment_1 ) ) )
            // InternalVarlinkIdl.g:851:1: ( ( rule__Enum__FieldsAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:851:1: ( ( rule__Enum__FieldsAssignment_1 ) )
            // InternalVarlinkIdl.g:852:2: ( rule__Enum__FieldsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsAssignment_1()); 
            }
            // InternalVarlinkIdl.g:853:2: ( rule__Enum__FieldsAssignment_1 )
            // InternalVarlinkIdl.g:853:3: rule__Enum__FieldsAssignment_1
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
    // InternalVarlinkIdl.g:861:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:865:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalVarlinkIdl.g:866:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalVarlinkIdl.g:873:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__Group_2__0 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:877:1: ( ( ( rule__Enum__Group_2__0 )* ) )
            // InternalVarlinkIdl.g:878:1: ( ( rule__Enum__Group_2__0 )* )
            {
            // InternalVarlinkIdl.g:878:1: ( ( rule__Enum__Group_2__0 )* )
            // InternalVarlinkIdl.g:879:2: ( rule__Enum__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup_2()); 
            }
            // InternalVarlinkIdl.g:880:2: ( rule__Enum__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVarlinkIdl.g:880:3: rule__Enum__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Enum__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalVarlinkIdl.g:888:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:892:1: ( rule__Enum__Group__3__Impl )
            // InternalVarlinkIdl.g:893:2: rule__Enum__Group__3__Impl
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
    // InternalVarlinkIdl.g:899:1: rule__Enum__Group__3__Impl : ( ')' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:903:1: ( ( ')' ) )
            // InternalVarlinkIdl.g:904:1: ( ')' )
            {
            // InternalVarlinkIdl.g:904:1: ( ')' )
            // InternalVarlinkIdl.g:905:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:915:1: rule__Enum__Group_2__0 : rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 ;
    public final void rule__Enum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:919:1: ( rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 )
            // InternalVarlinkIdl.g:920:2: rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalVarlinkIdl.g:927:1: rule__Enum__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:931:1: ( ( ',' ) )
            // InternalVarlinkIdl.g:932:1: ( ',' )
            {
            // InternalVarlinkIdl.g:932:1: ( ',' )
            // InternalVarlinkIdl.g:933:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:942:1: rule__Enum__Group_2__1 : rule__Enum__Group_2__1__Impl ;
    public final void rule__Enum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:946:1: ( rule__Enum__Group_2__1__Impl )
            // InternalVarlinkIdl.g:947:2: rule__Enum__Group_2__1__Impl
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
    // InternalVarlinkIdl.g:953:1: rule__Enum__Group_2__1__Impl : ( ( rule__Enum__FieldsAssignment_2_1 ) ) ;
    public final void rule__Enum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:957:1: ( ( ( rule__Enum__FieldsAssignment_2_1 ) ) )
            // InternalVarlinkIdl.g:958:1: ( ( rule__Enum__FieldsAssignment_2_1 ) )
            {
            // InternalVarlinkIdl.g:958:1: ( ( rule__Enum__FieldsAssignment_2_1 ) )
            // InternalVarlinkIdl.g:959:2: ( rule__Enum__FieldsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsAssignment_2_1()); 
            }
            // InternalVarlinkIdl.g:960:2: ( rule__Enum__FieldsAssignment_2_1 )
            // InternalVarlinkIdl.g:960:3: rule__Enum__FieldsAssignment_2_1
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
    // InternalVarlinkIdl.g:969:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:973:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalVarlinkIdl.g:974:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalVarlinkIdl.g:981:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:985:1: ( ( () ) )
            // InternalVarlinkIdl.g:986:1: ( () )
            {
            // InternalVarlinkIdl.g:986:1: ( () )
            // InternalVarlinkIdl.g:987:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            }
            // InternalVarlinkIdl.g:988:2: ()
            // InternalVarlinkIdl.g:988:3: 
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
    // InternalVarlinkIdl.g:996:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1000:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalVarlinkIdl.g:1001:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalVarlinkIdl.g:1008:1: rule__Object__Group__1__Impl : ( '(' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1012:1: ( ( '(' ) )
            // InternalVarlinkIdl.g:1013:1: ( '(' )
            {
            // InternalVarlinkIdl.g:1013:1: ( '(' )
            // InternalVarlinkIdl.g:1014:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1023:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1027:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalVarlinkIdl.g:1028:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalVarlinkIdl.g:1035:1: rule__Object__Group__2__Impl : ( ( rule__Object__FieldsAssignment_2 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1039:1: ( ( ( rule__Object__FieldsAssignment_2 )? ) )
            // InternalVarlinkIdl.g:1040:1: ( ( rule__Object__FieldsAssignment_2 )? )
            {
            // InternalVarlinkIdl.g:1040:1: ( ( rule__Object__FieldsAssignment_2 )? )
            // InternalVarlinkIdl.g:1041:2: ( rule__Object__FieldsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1042:2: ( rule__Object__FieldsAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=8 && LA9_0<=18)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVarlinkIdl.g:1042:3: rule__Object__FieldsAssignment_2
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
    // InternalVarlinkIdl.g:1050:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1054:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalVarlinkIdl.g:1055:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalVarlinkIdl.g:1062:1: rule__Object__Group__3__Impl : ( ( rule__Object__Group_3__0 )* ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1066:1: ( ( ( rule__Object__Group_3__0 )* ) )
            // InternalVarlinkIdl.g:1067:1: ( ( rule__Object__Group_3__0 )* )
            {
            // InternalVarlinkIdl.g:1067:1: ( ( rule__Object__Group_3__0 )* )
            // InternalVarlinkIdl.g:1068:2: ( rule__Object__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_3()); 
            }
            // InternalVarlinkIdl.g:1069:2: ( rule__Object__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVarlinkIdl.g:1069:3: rule__Object__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Object__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalVarlinkIdl.g:1077:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1081:1: ( rule__Object__Group__4__Impl )
            // InternalVarlinkIdl.g:1082:2: rule__Object__Group__4__Impl
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
    // InternalVarlinkIdl.g:1088:1: rule__Object__Group__4__Impl : ( ')' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1092:1: ( ( ')' ) )
            // InternalVarlinkIdl.g:1093:1: ( ')' )
            {
            // InternalVarlinkIdl.g:1093:1: ( ')' )
            // InternalVarlinkIdl.g:1094:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1104:1: rule__Object__Group_3__0 : rule__Object__Group_3__0__Impl rule__Object__Group_3__1 ;
    public final void rule__Object__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1108:1: ( rule__Object__Group_3__0__Impl rule__Object__Group_3__1 )
            // InternalVarlinkIdl.g:1109:2: rule__Object__Group_3__0__Impl rule__Object__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalVarlinkIdl.g:1116:1: rule__Object__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Object__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1120:1: ( ( ',' ) )
            // InternalVarlinkIdl.g:1121:1: ( ',' )
            {
            // InternalVarlinkIdl.g:1121:1: ( ',' )
            // InternalVarlinkIdl.g:1122:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getCommaKeyword_3_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1131:1: rule__Object__Group_3__1 : rule__Object__Group_3__1__Impl ;
    public final void rule__Object__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1135:1: ( rule__Object__Group_3__1__Impl )
            // InternalVarlinkIdl.g:1136:2: rule__Object__Group_3__1__Impl
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
    // InternalVarlinkIdl.g:1142:1: rule__Object__Group_3__1__Impl : ( ( rule__Object__FieldsAssignment_3_1 ) ) ;
    public final void rule__Object__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1146:1: ( ( ( rule__Object__FieldsAssignment_3_1 ) ) )
            // InternalVarlinkIdl.g:1147:1: ( ( rule__Object__FieldsAssignment_3_1 ) )
            {
            // InternalVarlinkIdl.g:1147:1: ( ( rule__Object__FieldsAssignment_3_1 ) )
            // InternalVarlinkIdl.g:1148:2: ( rule__Object__FieldsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsAssignment_3_1()); 
            }
            // InternalVarlinkIdl.g:1149:2: ( rule__Object__FieldsAssignment_3_1 )
            // InternalVarlinkIdl.g:1149:3: rule__Object__FieldsAssignment_3_1
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
    // InternalVarlinkIdl.g:1158:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1162:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalVarlinkIdl.g:1163:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVarlinkIdl.g:1170:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1174:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalVarlinkIdl.g:1175:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalVarlinkIdl.g:1175:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalVarlinkIdl.g:1176:2: ( rule__Field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }
            // InternalVarlinkIdl.g:1177:2: ( rule__Field__NameAssignment_0 )
            // InternalVarlinkIdl.g:1177:3: rule__Field__NameAssignment_0
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
    // InternalVarlinkIdl.g:1185:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1189:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalVarlinkIdl.g:1190:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalVarlinkIdl.g:1197:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1201:1: ( ( ':' ) )
            // InternalVarlinkIdl.g:1202:1: ( ':' )
            {
            // InternalVarlinkIdl.g:1202:1: ( ':' )
            // InternalVarlinkIdl.g:1203:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1212:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1216:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalVarlinkIdl.g:1217:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // InternalVarlinkIdl.g:1224:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1228:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1229:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1229:1: ( ( rule__Field__TypeAssignment_2 ) )
            // InternalVarlinkIdl.g:1230:2: ( rule__Field__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1231:2: ( rule__Field__TypeAssignment_2 )
            // InternalVarlinkIdl.g:1231:3: rule__Field__TypeAssignment_2
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


    // $ANTLR start "rule__Field__Group__3"
    // InternalVarlinkIdl.g:1239:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1243:1: ( rule__Field__Group__3__Impl )
            // InternalVarlinkIdl.g:1244:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__3__Impl();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalVarlinkIdl.g:1250:1: rule__Field__Group__3__Impl : ( ( rule__Field__MultiAssignment_3 )? ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1254:1: ( ( ( rule__Field__MultiAssignment_3 )? ) )
            // InternalVarlinkIdl.g:1255:1: ( ( rule__Field__MultiAssignment_3 )? )
            {
            // InternalVarlinkIdl.g:1255:1: ( ( rule__Field__MultiAssignment_3 )? )
            // InternalVarlinkIdl.g:1256:2: ( rule__Field__MultiAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiAssignment_3()); 
            }
            // InternalVarlinkIdl.g:1257:2: ( rule__Field__MultiAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVarlinkIdl.g:1257:3: rule__Field__MultiAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__MultiAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMultiAssignment_3()); 
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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalVarlinkIdl.g:1266:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1270:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalVarlinkIdl.g:1271:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalVarlinkIdl.g:1278:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1282:1: ( ( 'method' ) )
            // InternalVarlinkIdl.g:1283:1: ( 'method' )
            {
            // InternalVarlinkIdl.g:1283:1: ( 'method' )
            // InternalVarlinkIdl.g:1284:2: 'method'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1293:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1297:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalVarlinkIdl.g:1298:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalVarlinkIdl.g:1305:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1309:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1310:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1310:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:1311:2: ( rule__Method__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1312:2: ( rule__Method__NameAssignment_1 )
            // InternalVarlinkIdl.g:1312:3: rule__Method__NameAssignment_1
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
    // InternalVarlinkIdl.g:1320:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1324:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalVarlinkIdl.g:1325:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalVarlinkIdl.g:1332:1: rule__Method__Group__2__Impl : ( ( rule__Method__ArgumentsAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1336:1: ( ( ( rule__Method__ArgumentsAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1337:1: ( ( rule__Method__ArgumentsAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1337:1: ( ( rule__Method__ArgumentsAssignment_2 ) )
            // InternalVarlinkIdl.g:1338:2: ( rule__Method__ArgumentsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getArgumentsAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1339:2: ( rule__Method__ArgumentsAssignment_2 )
            // InternalVarlinkIdl.g:1339:3: rule__Method__ArgumentsAssignment_2
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
    // InternalVarlinkIdl.g:1347:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1351:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalVarlinkIdl.g:1352:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalVarlinkIdl.g:1359:1: rule__Method__Group__3__Impl : ( '->' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1363:1: ( ( '->' ) )
            // InternalVarlinkIdl.g:1364:1: ( '->' )
            {
            // InternalVarlinkIdl.g:1364:1: ( '->' )
            // InternalVarlinkIdl.g:1365:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1374:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1378:1: ( rule__Method__Group__4__Impl )
            // InternalVarlinkIdl.g:1379:2: rule__Method__Group__4__Impl
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
    // InternalVarlinkIdl.g:1385:1: rule__Method__Group__4__Impl : ( ( rule__Method__ResultAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1389:1: ( ( ( rule__Method__ResultAssignment_4 ) ) )
            // InternalVarlinkIdl.g:1390:1: ( ( rule__Method__ResultAssignment_4 ) )
            {
            // InternalVarlinkIdl.g:1390:1: ( ( rule__Method__ResultAssignment_4 ) )
            // InternalVarlinkIdl.g:1391:2: ( rule__Method__ResultAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getResultAssignment_4()); 
            }
            // InternalVarlinkIdl.g:1392:2: ( rule__Method__ResultAssignment_4 )
            // InternalVarlinkIdl.g:1392:3: rule__Method__ResultAssignment_4
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
    // InternalVarlinkIdl.g:1401:1: rule__Error__Group__0 : rule__Error__Group__0__Impl rule__Error__Group__1 ;
    public final void rule__Error__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1405:1: ( rule__Error__Group__0__Impl rule__Error__Group__1 )
            // InternalVarlinkIdl.g:1406:2: rule__Error__Group__0__Impl rule__Error__Group__1
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
    // InternalVarlinkIdl.g:1413:1: rule__Error__Group__0__Impl : ( 'error' ) ;
    public final void rule__Error__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1417:1: ( ( 'error' ) )
            // InternalVarlinkIdl.g:1418:1: ( 'error' )
            {
            // InternalVarlinkIdl.g:1418:1: ( 'error' )
            // InternalVarlinkIdl.g:1419:2: 'error'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getErrorKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1428:1: rule__Error__Group__1 : rule__Error__Group__1__Impl rule__Error__Group__2 ;
    public final void rule__Error__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1432:1: ( rule__Error__Group__1__Impl rule__Error__Group__2 )
            // InternalVarlinkIdl.g:1433:2: rule__Error__Group__1__Impl rule__Error__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalVarlinkIdl.g:1440:1: rule__Error__Group__1__Impl : ( ( rule__Error__NameAssignment_1 ) ) ;
    public final void rule__Error__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1444:1: ( ( ( rule__Error__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1445:1: ( ( rule__Error__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1445:1: ( ( rule__Error__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:1446:2: ( rule__Error__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1447:2: ( rule__Error__NameAssignment_1 )
            // InternalVarlinkIdl.g:1447:3: rule__Error__NameAssignment_1
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
    // InternalVarlinkIdl.g:1455:1: rule__Error__Group__2 : rule__Error__Group__2__Impl ;
    public final void rule__Error__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1459:1: ( rule__Error__Group__2__Impl )
            // InternalVarlinkIdl.g:1460:2: rule__Error__Group__2__Impl
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
    // InternalVarlinkIdl.g:1466:1: rule__Error__Group__2__Impl : ( ( rule__Error__PropertiesAssignment_2 ) ) ;
    public final void rule__Error__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1470:1: ( ( ( rule__Error__PropertiesAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1471:1: ( ( rule__Error__PropertiesAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1471:1: ( ( rule__Error__PropertiesAssignment_2 ) )
            // InternalVarlinkIdl.g:1472:2: ( rule__Error__PropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getPropertiesAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1473:2: ( rule__Error__PropertiesAssignment_2 )
            // InternalVarlinkIdl.g:1473:3: rule__Error__PropertiesAssignment_2
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
    // InternalVarlinkIdl.g:1482:1: rule__InterfaceName__Group__0 : rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1 ;
    public final void rule__InterfaceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1486:1: ( rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1 )
            // InternalVarlinkIdl.g:1487:2: rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalVarlinkIdl.g:1494:1: rule__InterfaceName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__InterfaceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1498:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1499:1: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1499:1: ( RULE_ID )
            // InternalVarlinkIdl.g:1500:2: RULE_ID
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
    // InternalVarlinkIdl.g:1509:1: rule__InterfaceName__Group__1 : rule__InterfaceName__Group__1__Impl ;
    public final void rule__InterfaceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1513:1: ( rule__InterfaceName__Group__1__Impl )
            // InternalVarlinkIdl.g:1514:2: rule__InterfaceName__Group__1__Impl
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
    // InternalVarlinkIdl.g:1520:1: rule__InterfaceName__Group__1__Impl : ( ( rule__InterfaceName__Group_1__0 )* ) ;
    public final void rule__InterfaceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1524:1: ( ( ( rule__InterfaceName__Group_1__0 )* ) )
            // InternalVarlinkIdl.g:1525:1: ( ( rule__InterfaceName__Group_1__0 )* )
            {
            // InternalVarlinkIdl.g:1525:1: ( ( rule__InterfaceName__Group_1__0 )* )
            // InternalVarlinkIdl.g:1526:2: ( rule__InterfaceName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getGroup_1()); 
            }
            // InternalVarlinkIdl.g:1527:2: ( rule__InterfaceName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVarlinkIdl.g:1527:3: rule__InterfaceName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InterfaceName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalVarlinkIdl.g:1536:1: rule__InterfaceName__Group_1__0 : rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1 ;
    public final void rule__InterfaceName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1540:1: ( rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1 )
            // InternalVarlinkIdl.g:1541:2: rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1
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
    // InternalVarlinkIdl.g:1548:1: rule__InterfaceName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__InterfaceName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1552:1: ( ( ( '.' ) ) )
            // InternalVarlinkIdl.g:1553:1: ( ( '.' ) )
            {
            // InternalVarlinkIdl.g:1553:1: ( ( '.' ) )
            // InternalVarlinkIdl.g:1554:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalVarlinkIdl.g:1555:2: ( '.' )
            // InternalVarlinkIdl.g:1555:3: '.'
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

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
    // InternalVarlinkIdl.g:1563:1: rule__InterfaceName__Group_1__1 : rule__InterfaceName__Group_1__1__Impl ;
    public final void rule__InterfaceName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1567:1: ( rule__InterfaceName__Group_1__1__Impl )
            // InternalVarlinkIdl.g:1568:2: rule__InterfaceName__Group_1__1__Impl
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
    // InternalVarlinkIdl.g:1574:1: rule__InterfaceName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__InterfaceName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1578:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1579:1: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1579:1: ( RULE_ID )
            // InternalVarlinkIdl.g:1580:2: RULE_ID
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
    // InternalVarlinkIdl.g:1590:1: rule__Interface__NameAssignment_1 : ( ruleInterfaceName ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1594:1: ( ( ruleInterfaceName ) )
            // InternalVarlinkIdl.g:1595:2: ( ruleInterfaceName )
            {
            // InternalVarlinkIdl.g:1595:2: ( ruleInterfaceName )
            // InternalVarlinkIdl.g:1596:3: ruleInterfaceName
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
    // InternalVarlinkIdl.g:1605:1: rule__Interface__MembersAssignment_2 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1609:1: ( ( ruleMember ) )
            // InternalVarlinkIdl.g:1610:2: ( ruleMember )
            {
            // InternalVarlinkIdl.g:1610:2: ( ruleMember )
            // InternalVarlinkIdl.g:1611:3: ruleMember
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
    // InternalVarlinkIdl.g:1620:1: rule__TypeAlias__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__TypeAlias__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1624:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1625:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1625:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1626:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAliasAccess().getNameValidIDParserRuleCall_1_0()); 
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
    // InternalVarlinkIdl.g:1635:1: rule__TypeAlias__DefinitionAssignment_2 : ( ruleTypeAliasDefinition ) ;
    public final void rule__TypeAlias__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1639:1: ( ( ruleTypeAliasDefinition ) )
            // InternalVarlinkIdl.g:1640:2: ( ruleTypeAliasDefinition )
            {
            // InternalVarlinkIdl.g:1640:2: ( ruleTypeAliasDefinition )
            // InternalVarlinkIdl.g:1641:3: ruleTypeAliasDefinition
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
    // InternalVarlinkIdl.g:1650:1: rule__Enum__FieldsAssignment_1 : ( ruleValidID ) ;
    public final void rule__Enum__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1654:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1655:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1655:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1656:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_1_0()); 
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
    // InternalVarlinkIdl.g:1665:1: rule__Enum__FieldsAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__Enum__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1669:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1670:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1670:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1671:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_2_1_0()); 
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
    // InternalVarlinkIdl.g:1680:1: rule__Object__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__Object__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1684:1: ( ( ruleField ) )
            // InternalVarlinkIdl.g:1685:2: ( ruleField )
            {
            // InternalVarlinkIdl.g:1685:2: ( ruleField )
            // InternalVarlinkIdl.g:1686:3: ruleField
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
    // InternalVarlinkIdl.g:1695:1: rule__Object__FieldsAssignment_3_1 : ( ruleField ) ;
    public final void rule__Object__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1699:1: ( ( ruleField ) )
            // InternalVarlinkIdl.g:1700:2: ( ruleField )
            {
            // InternalVarlinkIdl.g:1700:2: ( ruleField )
            // InternalVarlinkIdl.g:1701:3: ruleField
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
    // InternalVarlinkIdl.g:1710:1: rule__Field__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1714:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1715:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1715:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1716:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_0_0()); 
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
    // InternalVarlinkIdl.g:1725:1: rule__Field__TypeAssignment_2 : ( ruleElementType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1729:1: ( ( ruleElementType ) )
            // InternalVarlinkIdl.g:1730:2: ( ruleElementType )
            {
            // InternalVarlinkIdl.g:1730:2: ( ruleElementType )
            // InternalVarlinkIdl.g:1731:3: ruleElementType
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


    // $ANTLR start "rule__Field__MultiAssignment_3"
    // InternalVarlinkIdl.g:1740:1: rule__Field__MultiAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__Field__MultiAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1744:1: ( ( ( '[]' ) ) )
            // InternalVarlinkIdl.g:1745:2: ( ( '[]' ) )
            {
            // InternalVarlinkIdl.g:1745:2: ( ( '[]' ) )
            // InternalVarlinkIdl.g:1746:3: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }
            // InternalVarlinkIdl.g:1747:3: ( '[]' )
            // InternalVarlinkIdl.g:1748:4: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_3_0()); 
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
    // $ANTLR end "rule__Field__MultiAssignment_3"


    // $ANTLR start "rule__TypeReference__NameAssignment"
    // InternalVarlinkIdl.g:1759:1: rule__TypeReference__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1763:1: ( ( ( RULE_ID ) ) )
            // InternalVarlinkIdl.g:1764:2: ( ( RULE_ID ) )
            {
            // InternalVarlinkIdl.g:1764:2: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1765:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getNameTypeAliasCrossReference_0()); 
            }
            // InternalVarlinkIdl.g:1766:3: ( RULE_ID )
            // InternalVarlinkIdl.g:1767:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getNameTypeAliasIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getNameTypeAliasIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getNameTypeAliasCrossReference_0()); 
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
    // InternalVarlinkIdl.g:1778:1: rule__BasicType__TypeAssignment : ( ( rule__BasicType__TypeAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1782:1: ( ( ( rule__BasicType__TypeAlternatives_0 ) ) )
            // InternalVarlinkIdl.g:1783:2: ( ( rule__BasicType__TypeAlternatives_0 ) )
            {
            // InternalVarlinkIdl.g:1783:2: ( ( rule__BasicType__TypeAlternatives_0 ) )
            // InternalVarlinkIdl.g:1784:3: ( rule__BasicType__TypeAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0()); 
            }
            // InternalVarlinkIdl.g:1785:3: ( rule__BasicType__TypeAlternatives_0 )
            // InternalVarlinkIdl.g:1785:4: rule__BasicType__TypeAlternatives_0
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
    // InternalVarlinkIdl.g:1793:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1797:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1798:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1798:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1799:3: RULE_ID
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
    // InternalVarlinkIdl.g:1808:1: rule__Method__ArgumentsAssignment_2 : ( ruleObject ) ;
    public final void rule__Method__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1812:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:1813:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:1813:2: ( ruleObject )
            // InternalVarlinkIdl.g:1814:3: ruleObject
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
    // InternalVarlinkIdl.g:1823:1: rule__Method__ResultAssignment_4 : ( ruleObject ) ;
    public final void rule__Method__ResultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1827:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:1828:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:1828:2: ( ruleObject )
            // InternalVarlinkIdl.g:1829:3: ruleObject
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
    // InternalVarlinkIdl.g:1838:1: rule__Error__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Error__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1842:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1843:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1843:2: ( RULE_ID )
            // InternalVarlinkIdl.g:1844:3: RULE_ID
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
    // InternalVarlinkIdl.g:1853:1: rule__Error__PropertiesAssignment_2 : ( ruleObject ) ;
    public final void rule__Error__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1857:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:1858:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:1858:2: ( ruleObject )
            // InternalVarlinkIdl.g:1859:3: ruleObject
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\23\1\4\14\24\2\uffff";
    static final String dfa_3s = "\1\23\1\25\14\26\2\uffff";
    static final String dfa_4s = "\16\uffff\1\2\1\1";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\3\uffff\1\10\1\11\1\12\1\13\1\3\1\4\1\5\1\6\1\7\1\14\1\15\1\uffff\2\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "\2\17\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "462:1: rule__TypeAliasDefinition__Alternatives : ( ( ruleEnum ) | ( ruleObject ) );";
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\1\4\2\uffff\1\4\14\24\2\uffff";
    static final String dfa_9s = "\1\23\2\uffff\1\25\14\26\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\15\uffff\1\4\1\3";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\3\uffff\4\1\7\uffff\1\3",
            "",
            "",
            "\1\4\3\uffff\1\12\1\13\1\14\1\15\1\5\1\6\1\7\1\10\1\11\1\16\1\17\1\uffff\2\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "\2\21\1\20",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "483:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) | ( ruleObject ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007FF10L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000037FF10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080F10L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});

}