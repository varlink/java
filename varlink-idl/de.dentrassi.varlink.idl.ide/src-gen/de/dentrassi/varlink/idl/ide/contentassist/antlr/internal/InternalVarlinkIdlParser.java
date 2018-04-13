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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'int'", "'float'", "'string'", "'type'", "'enum'", "'interface'", "'method'", "'error'", "'('", "')'", "','", "':'", "'[]'", "'[string]'", "'?'", "'->'", "'.'"
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


    // $ANTLR start "entryRuleArray"
    // InternalVarlinkIdl.g:261:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:262:1: ( ruleArray EOF )
            // InternalVarlinkIdl.g:263:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalVarlinkIdl.g:270:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:274:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalVarlinkIdl.g:275:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalVarlinkIdl.g:275:2: ( ( rule__Array__Group__0 ) )
            // InternalVarlinkIdl.g:276:3: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:277:3: ( rule__Array__Group__0 )
            // InternalVarlinkIdl.g:277:4: rule__Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getGroup()); 
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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleDictionary"
    // InternalVarlinkIdl.g:286:1: entryRuleDictionary : ruleDictionary EOF ;
    public final void entryRuleDictionary() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:287:1: ( ruleDictionary EOF )
            // InternalVarlinkIdl.g:288:1: ruleDictionary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDictionaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDictionary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDictionaryRule()); 
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
    // $ANTLR end "entryRuleDictionary"


    // $ANTLR start "ruleDictionary"
    // InternalVarlinkIdl.g:295:1: ruleDictionary : ( ( rule__Dictionary__Group__0 ) ) ;
    public final void ruleDictionary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:299:2: ( ( ( rule__Dictionary__Group__0 ) ) )
            // InternalVarlinkIdl.g:300:2: ( ( rule__Dictionary__Group__0 ) )
            {
            // InternalVarlinkIdl.g:300:2: ( ( rule__Dictionary__Group__0 ) )
            // InternalVarlinkIdl.g:301:3: ( rule__Dictionary__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDictionaryAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:302:3: ( rule__Dictionary__Group__0 )
            // InternalVarlinkIdl.g:302:4: rule__Dictionary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDictionaryAccess().getGroup()); 
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
    // $ANTLR end "ruleDictionary"


    // $ANTLR start "entryRuleOptional"
    // InternalVarlinkIdl.g:311:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:312:1: ( ruleOptional EOF )
            // InternalVarlinkIdl.g:313:1: ruleOptional EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOptional();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalRule()); 
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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalVarlinkIdl.g:320:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:324:2: ( ( ( rule__Optional__Group__0 ) ) )
            // InternalVarlinkIdl.g:325:2: ( ( rule__Optional__Group__0 ) )
            {
            // InternalVarlinkIdl.g:325:2: ( ( rule__Optional__Group__0 ) )
            // InternalVarlinkIdl.g:326:3: ( rule__Optional__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:327:3: ( rule__Optional__Group__0 )
            // InternalVarlinkIdl.g:327:4: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Optional__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalAccess().getGroup()); 
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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleTypeReference"
    // InternalVarlinkIdl.g:336:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:337:1: ( ruleTypeReference EOF )
            // InternalVarlinkIdl.g:338:1: ruleTypeReference EOF
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
    // InternalVarlinkIdl.g:345:1: ruleTypeReference : ( ( rule__TypeReference__NameAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:349:2: ( ( ( rule__TypeReference__NameAssignment ) ) )
            // InternalVarlinkIdl.g:350:2: ( ( rule__TypeReference__NameAssignment ) )
            {
            // InternalVarlinkIdl.g:350:2: ( ( rule__TypeReference__NameAssignment ) )
            // InternalVarlinkIdl.g:351:3: ( rule__TypeReference__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getNameAssignment()); 
            }
            // InternalVarlinkIdl.g:352:3: ( rule__TypeReference__NameAssignment )
            // InternalVarlinkIdl.g:352:4: rule__TypeReference__NameAssignment
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
    // InternalVarlinkIdl.g:361:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:362:1: ( ruleBasicType EOF )
            // InternalVarlinkIdl.g:363:1: ruleBasicType EOF
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
    // InternalVarlinkIdl.g:370:1: ruleBasicType : ( ( rule__BasicType__TypeAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:374:2: ( ( ( rule__BasicType__TypeAssignment ) ) )
            // InternalVarlinkIdl.g:375:2: ( ( rule__BasicType__TypeAssignment ) )
            {
            // InternalVarlinkIdl.g:375:2: ( ( rule__BasicType__TypeAssignment ) )
            // InternalVarlinkIdl.g:376:3: ( rule__BasicType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getTypeAssignment()); 
            }
            // InternalVarlinkIdl.g:377:3: ( rule__BasicType__TypeAssignment )
            // InternalVarlinkIdl.g:377:4: rule__BasicType__TypeAssignment
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
    // InternalVarlinkIdl.g:386:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:387:1: ( ruleMethod EOF )
            // InternalVarlinkIdl.g:388:1: ruleMethod EOF
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
    // InternalVarlinkIdl.g:395:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:399:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalVarlinkIdl.g:400:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalVarlinkIdl.g:400:2: ( ( rule__Method__Group__0 ) )
            // InternalVarlinkIdl.g:401:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:402:3: ( rule__Method__Group__0 )
            // InternalVarlinkIdl.g:402:4: rule__Method__Group__0
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


    // $ANTLR start "entryRuleArguments"
    // InternalVarlinkIdl.g:411:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:412:1: ( ruleArguments EOF )
            // InternalVarlinkIdl.g:413:1: ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsRule()); 
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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalVarlinkIdl.g:420:1: ruleArguments : ( ( rule__Arguments__ArgumentsAssignment ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:424:2: ( ( ( rule__Arguments__ArgumentsAssignment ) ) )
            // InternalVarlinkIdl.g:425:2: ( ( rule__Arguments__ArgumentsAssignment ) )
            {
            // InternalVarlinkIdl.g:425:2: ( ( rule__Arguments__ArgumentsAssignment ) )
            // InternalVarlinkIdl.g:426:3: ( rule__Arguments__ArgumentsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getArgumentsAssignment()); 
            }
            // InternalVarlinkIdl.g:427:3: ( rule__Arguments__ArgumentsAssignment )
            // InternalVarlinkIdl.g:427:4: rule__Arguments__ArgumentsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__ArgumentsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getArgumentsAssignment()); 
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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleResult"
    // InternalVarlinkIdl.g:436:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:437:1: ( ruleResult EOF )
            // InternalVarlinkIdl.g:438:1: ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultRule()); 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalVarlinkIdl.g:445:1: ruleResult : ( ( rule__Result__ResultAssignment ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:449:2: ( ( ( rule__Result__ResultAssignment ) ) )
            // InternalVarlinkIdl.g:450:2: ( ( rule__Result__ResultAssignment ) )
            {
            // InternalVarlinkIdl.g:450:2: ( ( rule__Result__ResultAssignment ) )
            // InternalVarlinkIdl.g:451:3: ( rule__Result__ResultAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getResultAssignment()); 
            }
            // InternalVarlinkIdl.g:452:3: ( rule__Result__ResultAssignment )
            // InternalVarlinkIdl.g:452:4: rule__Result__ResultAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Result__ResultAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getResultAssignment()); 
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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleError"
    // InternalVarlinkIdl.g:461:1: entryRuleError : ruleError EOF ;
    public final void entryRuleError() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:462:1: ( ruleError EOF )
            // InternalVarlinkIdl.g:463:1: ruleError EOF
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
    // InternalVarlinkIdl.g:470:1: ruleError : ( ( rule__Error__Group__0 ) ) ;
    public final void ruleError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:474:2: ( ( ( rule__Error__Group__0 ) ) )
            // InternalVarlinkIdl.g:475:2: ( ( rule__Error__Group__0 ) )
            {
            // InternalVarlinkIdl.g:475:2: ( ( rule__Error__Group__0 ) )
            // InternalVarlinkIdl.g:476:3: ( rule__Error__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:477:3: ( rule__Error__Group__0 )
            // InternalVarlinkIdl.g:477:4: rule__Error__Group__0
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
    // InternalVarlinkIdl.g:486:1: entryRuleInterfaceName : ruleInterfaceName EOF ;
    public final void entryRuleInterfaceName() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:487:1: ( ruleInterfaceName EOF )
            // InternalVarlinkIdl.g:488:1: ruleInterfaceName EOF
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
    // InternalVarlinkIdl.g:495:1: ruleInterfaceName : ( ( rule__InterfaceName__Group__0 ) ) ;
    public final void ruleInterfaceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:499:2: ( ( ( rule__InterfaceName__Group__0 ) ) )
            // InternalVarlinkIdl.g:500:2: ( ( rule__InterfaceName__Group__0 ) )
            {
            // InternalVarlinkIdl.g:500:2: ( ( rule__InterfaceName__Group__0 ) )
            // InternalVarlinkIdl.g:501:3: ( rule__InterfaceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getGroup()); 
            }
            // InternalVarlinkIdl.g:502:3: ( rule__InterfaceName__Group__0 )
            // InternalVarlinkIdl.g:502:4: rule__InterfaceName__Group__0
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
    // InternalVarlinkIdl.g:511:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:512:1: ( ruleValidID EOF )
            // InternalVarlinkIdl.g:513:1: ruleValidID EOF
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
    // InternalVarlinkIdl.g:520:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:524:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalVarlinkIdl.g:525:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalVarlinkIdl.g:525:2: ( ( rule__ValidID__Alternatives ) )
            // InternalVarlinkIdl.g:526:3: ( rule__ValidID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getAlternatives()); 
            }
            // InternalVarlinkIdl.g:527:3: ( rule__ValidID__Alternatives )
            // InternalVarlinkIdl.g:527:4: rule__ValidID__Alternatives
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
    // InternalVarlinkIdl.g:536:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalVarlinkIdl.g:537:1: ( ruleKEYWORD EOF )
            // InternalVarlinkIdl.g:538:1: ruleKEYWORD EOF
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
    // InternalVarlinkIdl.g:545:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:549:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalVarlinkIdl.g:550:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalVarlinkIdl.g:550:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalVarlinkIdl.g:551:3: ( rule__KEYWORD__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            }
            // InternalVarlinkIdl.g:552:3: ( rule__KEYWORD__Alternatives )
            // InternalVarlinkIdl.g:552:4: rule__KEYWORD__Alternatives
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
    // InternalVarlinkIdl.g:560:1: rule__Member__Alternatives : ( ( ruleTypeAlias ) | ( ruleMethod ) | ( ruleError ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:564:1: ( ( ruleTypeAlias ) | ( ruleMethod ) | ( ruleError ) )
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
                    // InternalVarlinkIdl.g:565:2: ( ruleTypeAlias )
                    {
                    // InternalVarlinkIdl.g:565:2: ( ruleTypeAlias )
                    // InternalVarlinkIdl.g:566:3: ruleTypeAlias
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
                    // InternalVarlinkIdl.g:571:2: ( ruleMethod )
                    {
                    // InternalVarlinkIdl.g:571:2: ( ruleMethod )
                    // InternalVarlinkIdl.g:572:3: ruleMethod
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
                    // InternalVarlinkIdl.g:577:2: ( ruleError )
                    {
                    // InternalVarlinkIdl.g:577:2: ( ruleError )
                    // InternalVarlinkIdl.g:578:3: ruleError
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
    // InternalVarlinkIdl.g:587:1: rule__TypeAliasDefinition__Alternatives : ( ( ruleEnum ) | ( ruleObject ) );
    public final void rule__TypeAliasDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:591:1: ( ( ruleEnum ) | ( ruleObject ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalVarlinkIdl.g:592:2: ( ruleEnum )
                    {
                    // InternalVarlinkIdl.g:592:2: ( ruleEnum )
                    // InternalVarlinkIdl.g:593:3: ruleEnum
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
                    // InternalVarlinkIdl.g:598:2: ( ruleObject )
                    {
                    // InternalVarlinkIdl.g:598:2: ( ruleObject )
                    // InternalVarlinkIdl.g:599:3: ruleObject
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
    // InternalVarlinkIdl.g:608:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) | ( ruleObject ) | ( ruleArray ) | ( ruleDictionary ) | ( ruleOptional ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:612:1: ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) | ( ruleObject ) | ( ruleArray ) | ( ruleDictionary ) | ( ruleOptional ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalVarlinkIdl.g:613:2: ( ruleBasicType )
                    {
                    // InternalVarlinkIdl.g:613:2: ( ruleBasicType )
                    // InternalVarlinkIdl.g:614:3: ruleBasicType
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
                    // InternalVarlinkIdl.g:619:2: ( ruleTypeReference )
                    {
                    // InternalVarlinkIdl.g:619:2: ( ruleTypeReference )
                    // InternalVarlinkIdl.g:620:3: ruleTypeReference
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
                    // InternalVarlinkIdl.g:625:2: ( ruleEnum )
                    {
                    // InternalVarlinkIdl.g:625:2: ( ruleEnum )
                    // InternalVarlinkIdl.g:626:3: ruleEnum
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
                    // InternalVarlinkIdl.g:631:2: ( ruleObject )
                    {
                    // InternalVarlinkIdl.g:631:2: ( ruleObject )
                    // InternalVarlinkIdl.g:632:3: ruleObject
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
                case 5 :
                    // InternalVarlinkIdl.g:637:2: ( ruleArray )
                    {
                    // InternalVarlinkIdl.g:637:2: ( ruleArray )
                    // InternalVarlinkIdl.g:638:3: ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getArrayParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getArrayParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVarlinkIdl.g:643:2: ( ruleDictionary )
                    {
                    // InternalVarlinkIdl.g:643:2: ( ruleDictionary )
                    // InternalVarlinkIdl.g:644:3: ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getDictionaryParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDictionary();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getDictionaryParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalVarlinkIdl.g:649:2: ( ruleOptional )
                    {
                    // InternalVarlinkIdl.g:649:2: ( ruleOptional )
                    // InternalVarlinkIdl.g:650:3: ruleOptional
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementTypeAccess().getOptionalParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOptional();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementTypeAccess().getOptionalParserRuleCall_6()); 
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
    // InternalVarlinkIdl.g:659:1: rule__BasicType__TypeAlternatives_0 : ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) );
    public final void rule__BasicType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:663:1: ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) )
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
                    // InternalVarlinkIdl.g:664:2: ( 'bool' )
                    {
                    // InternalVarlinkIdl.g:664:2: ( 'bool' )
                    // InternalVarlinkIdl.g:665:3: 'bool'
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
                    // InternalVarlinkIdl.g:670:2: ( 'int' )
                    {
                    // InternalVarlinkIdl.g:670:2: ( 'int' )
                    // InternalVarlinkIdl.g:671:3: 'int'
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
                    // InternalVarlinkIdl.g:676:2: ( 'float' )
                    {
                    // InternalVarlinkIdl.g:676:2: ( 'float' )
                    // InternalVarlinkIdl.g:677:3: 'float'
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
                    // InternalVarlinkIdl.g:682:2: ( 'string' )
                    {
                    // InternalVarlinkIdl.g:682:2: ( 'string' )
                    // InternalVarlinkIdl.g:683:3: 'string'
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
    // InternalVarlinkIdl.g:692:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( ruleKEYWORD ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:696:1: ( ( RULE_ID ) | ( ruleKEYWORD ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=8 && LA5_0<=16)) ) {
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
                    // InternalVarlinkIdl.g:697:2: ( RULE_ID )
                    {
                    // InternalVarlinkIdl.g:697:2: ( RULE_ID )
                    // InternalVarlinkIdl.g:698:3: RULE_ID
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
                    // InternalVarlinkIdl.g:703:2: ( ruleKEYWORD )
                    {
                    // InternalVarlinkIdl.g:703:2: ( ruleKEYWORD )
                    // InternalVarlinkIdl.g:704:3: ruleKEYWORD
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
    // InternalVarlinkIdl.g:713:1: rule__KEYWORD__Alternatives : ( ( 'type' ) | ( 'enum' ) | ( 'interface' ) | ( 'method' ) | ( 'error' ) | ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:717:1: ( ( 'type' ) | ( 'enum' ) | ( 'interface' ) | ( 'method' ) | ( 'error' ) | ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'string' ) )
            int alt6=9;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVarlinkIdl.g:718:2: ( 'type' )
                    {
                    // InternalVarlinkIdl.g:718:2: ( 'type' )
                    // InternalVarlinkIdl.g:719:3: 'type'
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
                    // InternalVarlinkIdl.g:724:2: ( 'enum' )
                    {
                    // InternalVarlinkIdl.g:724:2: ( 'enum' )
                    // InternalVarlinkIdl.g:725:3: 'enum'
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
                    // InternalVarlinkIdl.g:730:2: ( 'interface' )
                    {
                    // InternalVarlinkIdl.g:730:2: ( 'interface' )
                    // InternalVarlinkIdl.g:731:3: 'interface'
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
                    // InternalVarlinkIdl.g:736:2: ( 'method' )
                    {
                    // InternalVarlinkIdl.g:736:2: ( 'method' )
                    // InternalVarlinkIdl.g:737:3: 'method'
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
                    // InternalVarlinkIdl.g:742:2: ( 'error' )
                    {
                    // InternalVarlinkIdl.g:742:2: ( 'error' )
                    // InternalVarlinkIdl.g:743:3: 'error'
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
                    // InternalVarlinkIdl.g:748:2: ( 'bool' )
                    {
                    // InternalVarlinkIdl.g:748:2: ( 'bool' )
                    // InternalVarlinkIdl.g:749:3: 'bool'
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
                    // InternalVarlinkIdl.g:754:2: ( 'int' )
                    {
                    // InternalVarlinkIdl.g:754:2: ( 'int' )
                    // InternalVarlinkIdl.g:755:3: 'int'
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
                    // InternalVarlinkIdl.g:760:2: ( 'float' )
                    {
                    // InternalVarlinkIdl.g:760:2: ( 'float' )
                    // InternalVarlinkIdl.g:761:3: 'float'
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
                    // InternalVarlinkIdl.g:766:2: ( 'string' )
                    {
                    // InternalVarlinkIdl.g:766:2: ( 'string' )
                    // InternalVarlinkIdl.g:767:3: 'string'
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
    // InternalVarlinkIdl.g:776:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:780:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalVarlinkIdl.g:781:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
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
    // InternalVarlinkIdl.g:788:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:792:1: ( ( 'interface' ) )
            // InternalVarlinkIdl.g:793:1: ( 'interface' )
            {
            // InternalVarlinkIdl.g:793:1: ( 'interface' )
            // InternalVarlinkIdl.g:794:2: 'interface'
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
    // InternalVarlinkIdl.g:803:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:807:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalVarlinkIdl.g:808:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
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
    // InternalVarlinkIdl.g:815:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:819:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:820:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:820:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:821:2: ( rule__Interface__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:822:2: ( rule__Interface__NameAssignment_1 )
            // InternalVarlinkIdl.g:822:3: rule__Interface__NameAssignment_1
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
    // InternalVarlinkIdl.g:830:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:834:1: ( rule__Interface__Group__2__Impl )
            // InternalVarlinkIdl.g:835:2: rule__Interface__Group__2__Impl
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
    // InternalVarlinkIdl.g:841:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__MembersAssignment_2 )* ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:845:1: ( ( ( rule__Interface__MembersAssignment_2 )* ) )
            // InternalVarlinkIdl.g:846:1: ( ( rule__Interface__MembersAssignment_2 )* )
            {
            // InternalVarlinkIdl.g:846:1: ( ( rule__Interface__MembersAssignment_2 )* )
            // InternalVarlinkIdl.g:847:2: ( rule__Interface__MembersAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersAssignment_2()); 
            }
            // InternalVarlinkIdl.g:848:2: ( rule__Interface__MembersAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||(LA7_0>=15 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVarlinkIdl.g:848:3: rule__Interface__MembersAssignment_2
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
    // InternalVarlinkIdl.g:857:1: rule__TypeAlias__Group__0 : rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 ;
    public final void rule__TypeAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:861:1: ( rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 )
            // InternalVarlinkIdl.g:862:2: rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1
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
    // InternalVarlinkIdl.g:869:1: rule__TypeAlias__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:873:1: ( ( 'type' ) )
            // InternalVarlinkIdl.g:874:1: ( 'type' )
            {
            // InternalVarlinkIdl.g:874:1: ( 'type' )
            // InternalVarlinkIdl.g:875:2: 'type'
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
    // InternalVarlinkIdl.g:884:1: rule__TypeAlias__Group__1 : rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 ;
    public final void rule__TypeAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:888:1: ( rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 )
            // InternalVarlinkIdl.g:889:2: rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2
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
    // InternalVarlinkIdl.g:896:1: rule__TypeAlias__Group__1__Impl : ( ( rule__TypeAlias__NameAssignment_1 ) ) ;
    public final void rule__TypeAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:900:1: ( ( ( rule__TypeAlias__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:901:1: ( ( rule__TypeAlias__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:901:1: ( ( rule__TypeAlias__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:902:2: ( rule__TypeAlias__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:903:2: ( rule__TypeAlias__NameAssignment_1 )
            // InternalVarlinkIdl.g:903:3: rule__TypeAlias__NameAssignment_1
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
    // InternalVarlinkIdl.g:911:1: rule__TypeAlias__Group__2 : rule__TypeAlias__Group__2__Impl ;
    public final void rule__TypeAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:915:1: ( rule__TypeAlias__Group__2__Impl )
            // InternalVarlinkIdl.g:916:2: rule__TypeAlias__Group__2__Impl
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
    // InternalVarlinkIdl.g:922:1: rule__TypeAlias__Group__2__Impl : ( ( rule__TypeAlias__DefinitionAssignment_2 ) ) ;
    public final void rule__TypeAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:926:1: ( ( ( rule__TypeAlias__DefinitionAssignment_2 ) ) )
            // InternalVarlinkIdl.g:927:1: ( ( rule__TypeAlias__DefinitionAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:927:1: ( ( rule__TypeAlias__DefinitionAssignment_2 ) )
            // InternalVarlinkIdl.g:928:2: ( rule__TypeAlias__DefinitionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2()); 
            }
            // InternalVarlinkIdl.g:929:2: ( rule__TypeAlias__DefinitionAssignment_2 )
            // InternalVarlinkIdl.g:929:3: rule__TypeAlias__DefinitionAssignment_2
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
    // InternalVarlinkIdl.g:938:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:942:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalVarlinkIdl.g:943:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalVarlinkIdl.g:950:1: rule__Enum__Group__0__Impl : ( '(' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:954:1: ( ( '(' ) )
            // InternalVarlinkIdl.g:955:1: ( '(' )
            {
            // InternalVarlinkIdl.g:955:1: ( '(' )
            // InternalVarlinkIdl.g:956:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:965:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:969:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalVarlinkIdl.g:970:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
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
    // InternalVarlinkIdl.g:977:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__FieldsAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:981:1: ( ( ( rule__Enum__FieldsAssignment_1 ) ) )
            // InternalVarlinkIdl.g:982:1: ( ( rule__Enum__FieldsAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:982:1: ( ( rule__Enum__FieldsAssignment_1 ) )
            // InternalVarlinkIdl.g:983:2: ( rule__Enum__FieldsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsAssignment_1()); 
            }
            // InternalVarlinkIdl.g:984:2: ( rule__Enum__FieldsAssignment_1 )
            // InternalVarlinkIdl.g:984:3: rule__Enum__FieldsAssignment_1
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
    // InternalVarlinkIdl.g:992:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:996:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalVarlinkIdl.g:997:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
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
    // InternalVarlinkIdl.g:1004:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__Group_2__0 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1008:1: ( ( ( rule__Enum__Group_2__0 )* ) )
            // InternalVarlinkIdl.g:1009:1: ( ( rule__Enum__Group_2__0 )* )
            {
            // InternalVarlinkIdl.g:1009:1: ( ( rule__Enum__Group_2__0 )* )
            // InternalVarlinkIdl.g:1010:2: ( rule__Enum__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup_2()); 
            }
            // InternalVarlinkIdl.g:1011:2: ( rule__Enum__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVarlinkIdl.g:1011:3: rule__Enum__Group_2__0
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
    // InternalVarlinkIdl.g:1019:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1023:1: ( rule__Enum__Group__3__Impl )
            // InternalVarlinkIdl.g:1024:2: rule__Enum__Group__3__Impl
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
    // InternalVarlinkIdl.g:1030:1: rule__Enum__Group__3__Impl : ( ')' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1034:1: ( ( ')' ) )
            // InternalVarlinkIdl.g:1035:1: ( ')' )
            {
            // InternalVarlinkIdl.g:1035:1: ( ')' )
            // InternalVarlinkIdl.g:1036:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1046:1: rule__Enum__Group_2__0 : rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 ;
    public final void rule__Enum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1050:1: ( rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 )
            // InternalVarlinkIdl.g:1051:2: rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1
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
    // InternalVarlinkIdl.g:1058:1: rule__Enum__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1062:1: ( ( ',' ) )
            // InternalVarlinkIdl.g:1063:1: ( ',' )
            {
            // InternalVarlinkIdl.g:1063:1: ( ',' )
            // InternalVarlinkIdl.g:1064:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1073:1: rule__Enum__Group_2__1 : rule__Enum__Group_2__1__Impl ;
    public final void rule__Enum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1077:1: ( rule__Enum__Group_2__1__Impl )
            // InternalVarlinkIdl.g:1078:2: rule__Enum__Group_2__1__Impl
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
    // InternalVarlinkIdl.g:1084:1: rule__Enum__Group_2__1__Impl : ( ( rule__Enum__FieldsAssignment_2_1 ) ) ;
    public final void rule__Enum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1088:1: ( ( ( rule__Enum__FieldsAssignment_2_1 ) ) )
            // InternalVarlinkIdl.g:1089:1: ( ( rule__Enum__FieldsAssignment_2_1 ) )
            {
            // InternalVarlinkIdl.g:1089:1: ( ( rule__Enum__FieldsAssignment_2_1 ) )
            // InternalVarlinkIdl.g:1090:2: ( rule__Enum__FieldsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsAssignment_2_1()); 
            }
            // InternalVarlinkIdl.g:1091:2: ( rule__Enum__FieldsAssignment_2_1 )
            // InternalVarlinkIdl.g:1091:3: rule__Enum__FieldsAssignment_2_1
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
    // InternalVarlinkIdl.g:1100:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1104:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalVarlinkIdl.g:1105:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalVarlinkIdl.g:1112:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1116:1: ( ( () ) )
            // InternalVarlinkIdl.g:1117:1: ( () )
            {
            // InternalVarlinkIdl.g:1117:1: ( () )
            // InternalVarlinkIdl.g:1118:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            }
            // InternalVarlinkIdl.g:1119:2: ()
            // InternalVarlinkIdl.g:1119:3: 
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
    // InternalVarlinkIdl.g:1127:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1131:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalVarlinkIdl.g:1132:2: rule__Object__Group__1__Impl rule__Object__Group__2
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
    // InternalVarlinkIdl.g:1139:1: rule__Object__Group__1__Impl : ( '(' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1143:1: ( ( '(' ) )
            // InternalVarlinkIdl.g:1144:1: ( '(' )
            {
            // InternalVarlinkIdl.g:1144:1: ( '(' )
            // InternalVarlinkIdl.g:1145:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1154:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1158:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalVarlinkIdl.g:1159:2: rule__Object__Group__2__Impl rule__Object__Group__3
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
    // InternalVarlinkIdl.g:1166:1: rule__Object__Group__2__Impl : ( ( rule__Object__FieldsAssignment_2 )? ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1170:1: ( ( ( rule__Object__FieldsAssignment_2 )? ) )
            // InternalVarlinkIdl.g:1171:1: ( ( rule__Object__FieldsAssignment_2 )? )
            {
            // InternalVarlinkIdl.g:1171:1: ( ( rule__Object__FieldsAssignment_2 )? )
            // InternalVarlinkIdl.g:1172:2: ( rule__Object__FieldsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1173:2: ( rule__Object__FieldsAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=8 && LA9_0<=16)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVarlinkIdl.g:1173:3: rule__Object__FieldsAssignment_2
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
    // InternalVarlinkIdl.g:1181:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1185:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalVarlinkIdl.g:1186:2: rule__Object__Group__3__Impl rule__Object__Group__4
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
    // InternalVarlinkIdl.g:1193:1: rule__Object__Group__3__Impl : ( ( rule__Object__Group_3__0 )* ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1197:1: ( ( ( rule__Object__Group_3__0 )* ) )
            // InternalVarlinkIdl.g:1198:1: ( ( rule__Object__Group_3__0 )* )
            {
            // InternalVarlinkIdl.g:1198:1: ( ( rule__Object__Group_3__0 )* )
            // InternalVarlinkIdl.g:1199:2: ( rule__Object__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup_3()); 
            }
            // InternalVarlinkIdl.g:1200:2: ( rule__Object__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVarlinkIdl.g:1200:3: rule__Object__Group_3__0
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
    // InternalVarlinkIdl.g:1208:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1212:1: ( rule__Object__Group__4__Impl )
            // InternalVarlinkIdl.g:1213:2: rule__Object__Group__4__Impl
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
    // InternalVarlinkIdl.g:1219:1: rule__Object__Group__4__Impl : ( ')' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1223:1: ( ( ')' ) )
            // InternalVarlinkIdl.g:1224:1: ( ')' )
            {
            // InternalVarlinkIdl.g:1224:1: ( ')' )
            // InternalVarlinkIdl.g:1225:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1235:1: rule__Object__Group_3__0 : rule__Object__Group_3__0__Impl rule__Object__Group_3__1 ;
    public final void rule__Object__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1239:1: ( rule__Object__Group_3__0__Impl rule__Object__Group_3__1 )
            // InternalVarlinkIdl.g:1240:2: rule__Object__Group_3__0__Impl rule__Object__Group_3__1
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
    // InternalVarlinkIdl.g:1247:1: rule__Object__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Object__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1251:1: ( ( ',' ) )
            // InternalVarlinkIdl.g:1252:1: ( ',' )
            {
            // InternalVarlinkIdl.g:1252:1: ( ',' )
            // InternalVarlinkIdl.g:1253:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getCommaKeyword_3_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1262:1: rule__Object__Group_3__1 : rule__Object__Group_3__1__Impl ;
    public final void rule__Object__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1266:1: ( rule__Object__Group_3__1__Impl )
            // InternalVarlinkIdl.g:1267:2: rule__Object__Group_3__1__Impl
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
    // InternalVarlinkIdl.g:1273:1: rule__Object__Group_3__1__Impl : ( ( rule__Object__FieldsAssignment_3_1 ) ) ;
    public final void rule__Object__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1277:1: ( ( ( rule__Object__FieldsAssignment_3_1 ) ) )
            // InternalVarlinkIdl.g:1278:1: ( ( rule__Object__FieldsAssignment_3_1 ) )
            {
            // InternalVarlinkIdl.g:1278:1: ( ( rule__Object__FieldsAssignment_3_1 ) )
            // InternalVarlinkIdl.g:1279:2: ( rule__Object__FieldsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getFieldsAssignment_3_1()); 
            }
            // InternalVarlinkIdl.g:1280:2: ( rule__Object__FieldsAssignment_3_1 )
            // InternalVarlinkIdl.g:1280:3: rule__Object__FieldsAssignment_3_1
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
    // InternalVarlinkIdl.g:1289:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1293:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalVarlinkIdl.g:1294:2: rule__Field__Group__0__Impl rule__Field__Group__1
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
    // InternalVarlinkIdl.g:1301:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1305:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalVarlinkIdl.g:1306:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalVarlinkIdl.g:1306:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalVarlinkIdl.g:1307:2: ( rule__Field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }
            // InternalVarlinkIdl.g:1308:2: ( rule__Field__NameAssignment_0 )
            // InternalVarlinkIdl.g:1308:3: rule__Field__NameAssignment_0
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
    // InternalVarlinkIdl.g:1316:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1320:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalVarlinkIdl.g:1321:2: rule__Field__Group__1__Impl rule__Field__Group__2
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
    // InternalVarlinkIdl.g:1328:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1332:1: ( ( ':' ) )
            // InternalVarlinkIdl.g:1333:1: ( ':' )
            {
            // InternalVarlinkIdl.g:1333:1: ( ':' )
            // InternalVarlinkIdl.g:1334:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1343:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1347:1: ( rule__Field__Group__2__Impl )
            // InternalVarlinkIdl.g:1348:2: rule__Field__Group__2__Impl
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
    // InternalVarlinkIdl.g:1354:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1358:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1359:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1359:1: ( ( rule__Field__TypeAssignment_2 ) )
            // InternalVarlinkIdl.g:1360:2: ( rule__Field__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1361:2: ( rule__Field__TypeAssignment_2 )
            // InternalVarlinkIdl.g:1361:3: rule__Field__TypeAssignment_2
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


    // $ANTLR start "rule__Array__Group__0"
    // InternalVarlinkIdl.g:1370:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1374:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalVarlinkIdl.g:1375:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Array__Group__1();

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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // InternalVarlinkIdl.g:1382:1: rule__Array__Group__0__Impl : ( '[]' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1386:1: ( ( '[]' ) )
            // InternalVarlinkIdl.g:1387:1: ( '[]' )
            {
            // InternalVarlinkIdl.g:1387:1: ( '[]' )
            // InternalVarlinkIdl.g:1388:2: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // InternalVarlinkIdl.g:1397:1: rule__Array__Group__1 : rule__Array__Group__1__Impl ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1401:1: ( rule__Array__Group__1__Impl )
            // InternalVarlinkIdl.g:1402:2: rule__Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__1__Impl();

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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // InternalVarlinkIdl.g:1408:1: rule__Array__Group__1__Impl : ( ( rule__Array__TypeAssignment_1 ) ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1412:1: ( ( ( rule__Array__TypeAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1413:1: ( ( rule__Array__TypeAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1413:1: ( ( rule__Array__TypeAssignment_1 ) )
            // InternalVarlinkIdl.g:1414:2: ( rule__Array__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getTypeAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1415:2: ( rule__Array__TypeAssignment_1 )
            // InternalVarlinkIdl.g:1415:3: rule__Array__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Array__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Dictionary__Group__0"
    // InternalVarlinkIdl.g:1424:1: rule__Dictionary__Group__0 : rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1 ;
    public final void rule__Dictionary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1428:1: ( rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1 )
            // InternalVarlinkIdl.g:1429:2: rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Dictionary__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__1();

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
    // $ANTLR end "rule__Dictionary__Group__0"


    // $ANTLR start "rule__Dictionary__Group__0__Impl"
    // InternalVarlinkIdl.g:1436:1: rule__Dictionary__Group__0__Impl : ( '[string]' ) ;
    public final void rule__Dictionary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1440:1: ( ( '[string]' ) )
            // InternalVarlinkIdl.g:1441:1: ( '[string]' )
            {
            // InternalVarlinkIdl.g:1441:1: ( '[string]' )
            // InternalVarlinkIdl.g:1442:2: '[string]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDictionaryAccess().getStringKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDictionaryAccess().getStringKeyword_0()); 
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
    // $ANTLR end "rule__Dictionary__Group__0__Impl"


    // $ANTLR start "rule__Dictionary__Group__1"
    // InternalVarlinkIdl.g:1451:1: rule__Dictionary__Group__1 : rule__Dictionary__Group__1__Impl ;
    public final void rule__Dictionary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1455:1: ( rule__Dictionary__Group__1__Impl )
            // InternalVarlinkIdl.g:1456:2: rule__Dictionary__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__1__Impl();

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
    // $ANTLR end "rule__Dictionary__Group__1"


    // $ANTLR start "rule__Dictionary__Group__1__Impl"
    // InternalVarlinkIdl.g:1462:1: rule__Dictionary__Group__1__Impl : ( ( rule__Dictionary__TypeAssignment_1 ) ) ;
    public final void rule__Dictionary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1466:1: ( ( ( rule__Dictionary__TypeAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1467:1: ( ( rule__Dictionary__TypeAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1467:1: ( ( rule__Dictionary__TypeAssignment_1 ) )
            // InternalVarlinkIdl.g:1468:2: ( rule__Dictionary__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDictionaryAccess().getTypeAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1469:2: ( rule__Dictionary__TypeAssignment_1 )
            // InternalVarlinkIdl.g:1469:3: rule__Dictionary__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dictionary__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDictionaryAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Dictionary__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // InternalVarlinkIdl.g:1478:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1482:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // InternalVarlinkIdl.g:1483:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Optional__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Optional__Group__1();

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
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // InternalVarlinkIdl.g:1490:1: rule__Optional__Group__0__Impl : ( '?' ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1494:1: ( ( '?' ) )
            // InternalVarlinkIdl.g:1495:1: ( '?' )
            {
            // InternalVarlinkIdl.g:1495:1: ( '?' )
            // InternalVarlinkIdl.g:1496:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0()); 
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
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // InternalVarlinkIdl.g:1505:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1509:1: ( rule__Optional__Group__1__Impl )
            // InternalVarlinkIdl.g:1510:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Optional__Group__1__Impl();

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
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // InternalVarlinkIdl.g:1516:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__TypeAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1520:1: ( ( ( rule__Optional__TypeAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1521:1: ( ( rule__Optional__TypeAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1521:1: ( ( rule__Optional__TypeAssignment_1 ) )
            // InternalVarlinkIdl.g:1522:2: ( rule__Optional__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalAccess().getTypeAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1523:2: ( rule__Optional__TypeAssignment_1 )
            // InternalVarlinkIdl.g:1523:3: rule__Optional__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Optional__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalVarlinkIdl.g:1532:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1536:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalVarlinkIdl.g:1537:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalVarlinkIdl.g:1544:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1548:1: ( ( 'method' ) )
            // InternalVarlinkIdl.g:1549:1: ( 'method' )
            {
            // InternalVarlinkIdl.g:1549:1: ( 'method' )
            // InternalVarlinkIdl.g:1550:2: 'method'
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
    // InternalVarlinkIdl.g:1559:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1563:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalVarlinkIdl.g:1564:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalVarlinkIdl.g:1571:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1575:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1576:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1576:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:1577:2: ( rule__Method__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1578:2: ( rule__Method__NameAssignment_1 )
            // InternalVarlinkIdl.g:1578:3: rule__Method__NameAssignment_1
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
    // InternalVarlinkIdl.g:1586:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1590:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalVarlinkIdl.g:1591:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalVarlinkIdl.g:1598:1: rule__Method__Group__2__Impl : ( ( rule__Method__ArgumentsAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1602:1: ( ( ( rule__Method__ArgumentsAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1603:1: ( ( rule__Method__ArgumentsAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1603:1: ( ( rule__Method__ArgumentsAssignment_2 ) )
            // InternalVarlinkIdl.g:1604:2: ( rule__Method__ArgumentsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getArgumentsAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1605:2: ( rule__Method__ArgumentsAssignment_2 )
            // InternalVarlinkIdl.g:1605:3: rule__Method__ArgumentsAssignment_2
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
    // InternalVarlinkIdl.g:1613:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1617:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalVarlinkIdl.g:1618:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalVarlinkIdl.g:1625:1: rule__Method__Group__3__Impl : ( '->' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1629:1: ( ( '->' ) )
            // InternalVarlinkIdl.g:1630:1: ( '->' )
            {
            // InternalVarlinkIdl.g:1630:1: ( '->' )
            // InternalVarlinkIdl.g:1631:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalVarlinkIdl.g:1640:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1644:1: ( rule__Method__Group__4__Impl )
            // InternalVarlinkIdl.g:1645:2: rule__Method__Group__4__Impl
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
    // InternalVarlinkIdl.g:1651:1: rule__Method__Group__4__Impl : ( ( rule__Method__ResultAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1655:1: ( ( ( rule__Method__ResultAssignment_4 ) ) )
            // InternalVarlinkIdl.g:1656:1: ( ( rule__Method__ResultAssignment_4 ) )
            {
            // InternalVarlinkIdl.g:1656:1: ( ( rule__Method__ResultAssignment_4 ) )
            // InternalVarlinkIdl.g:1657:2: ( rule__Method__ResultAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getResultAssignment_4()); 
            }
            // InternalVarlinkIdl.g:1658:2: ( rule__Method__ResultAssignment_4 )
            // InternalVarlinkIdl.g:1658:3: rule__Method__ResultAssignment_4
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
    // InternalVarlinkIdl.g:1667:1: rule__Error__Group__0 : rule__Error__Group__0__Impl rule__Error__Group__1 ;
    public final void rule__Error__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1671:1: ( rule__Error__Group__0__Impl rule__Error__Group__1 )
            // InternalVarlinkIdl.g:1672:2: rule__Error__Group__0__Impl rule__Error__Group__1
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
    // InternalVarlinkIdl.g:1679:1: rule__Error__Group__0__Impl : ( 'error' ) ;
    public final void rule__Error__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1683:1: ( ( 'error' ) )
            // InternalVarlinkIdl.g:1684:1: ( 'error' )
            {
            // InternalVarlinkIdl.g:1684:1: ( 'error' )
            // InternalVarlinkIdl.g:1685:2: 'error'
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
    // InternalVarlinkIdl.g:1694:1: rule__Error__Group__1 : rule__Error__Group__1__Impl rule__Error__Group__2 ;
    public final void rule__Error__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1698:1: ( rule__Error__Group__1__Impl rule__Error__Group__2 )
            // InternalVarlinkIdl.g:1699:2: rule__Error__Group__1__Impl rule__Error__Group__2
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
    // InternalVarlinkIdl.g:1706:1: rule__Error__Group__1__Impl : ( ( rule__Error__NameAssignment_1 ) ) ;
    public final void rule__Error__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1710:1: ( ( ( rule__Error__NameAssignment_1 ) ) )
            // InternalVarlinkIdl.g:1711:1: ( ( rule__Error__NameAssignment_1 ) )
            {
            // InternalVarlinkIdl.g:1711:1: ( ( rule__Error__NameAssignment_1 ) )
            // InternalVarlinkIdl.g:1712:2: ( rule__Error__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getNameAssignment_1()); 
            }
            // InternalVarlinkIdl.g:1713:2: ( rule__Error__NameAssignment_1 )
            // InternalVarlinkIdl.g:1713:3: rule__Error__NameAssignment_1
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
    // InternalVarlinkIdl.g:1721:1: rule__Error__Group__2 : rule__Error__Group__2__Impl ;
    public final void rule__Error__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1725:1: ( rule__Error__Group__2__Impl )
            // InternalVarlinkIdl.g:1726:2: rule__Error__Group__2__Impl
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
    // InternalVarlinkIdl.g:1732:1: rule__Error__Group__2__Impl : ( ( rule__Error__PropertiesAssignment_2 ) ) ;
    public final void rule__Error__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1736:1: ( ( ( rule__Error__PropertiesAssignment_2 ) ) )
            // InternalVarlinkIdl.g:1737:1: ( ( rule__Error__PropertiesAssignment_2 ) )
            {
            // InternalVarlinkIdl.g:1737:1: ( ( rule__Error__PropertiesAssignment_2 ) )
            // InternalVarlinkIdl.g:1738:2: ( rule__Error__PropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getPropertiesAssignment_2()); 
            }
            // InternalVarlinkIdl.g:1739:2: ( rule__Error__PropertiesAssignment_2 )
            // InternalVarlinkIdl.g:1739:3: rule__Error__PropertiesAssignment_2
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
    // InternalVarlinkIdl.g:1748:1: rule__InterfaceName__Group__0 : rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1 ;
    public final void rule__InterfaceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1752:1: ( rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1 )
            // InternalVarlinkIdl.g:1753:2: rule__InterfaceName__Group__0__Impl rule__InterfaceName__Group__1
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
    // InternalVarlinkIdl.g:1760:1: rule__InterfaceName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__InterfaceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1764:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1765:1: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1765:1: ( RULE_ID )
            // InternalVarlinkIdl.g:1766:2: RULE_ID
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
    // InternalVarlinkIdl.g:1775:1: rule__InterfaceName__Group__1 : rule__InterfaceName__Group__1__Impl ;
    public final void rule__InterfaceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1779:1: ( rule__InterfaceName__Group__1__Impl )
            // InternalVarlinkIdl.g:1780:2: rule__InterfaceName__Group__1__Impl
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
    // InternalVarlinkIdl.g:1786:1: rule__InterfaceName__Group__1__Impl : ( ( rule__InterfaceName__Group_1__0 )* ) ;
    public final void rule__InterfaceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1790:1: ( ( ( rule__InterfaceName__Group_1__0 )* ) )
            // InternalVarlinkIdl.g:1791:1: ( ( rule__InterfaceName__Group_1__0 )* )
            {
            // InternalVarlinkIdl.g:1791:1: ( ( rule__InterfaceName__Group_1__0 )* )
            // InternalVarlinkIdl.g:1792:2: ( rule__InterfaceName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getGroup_1()); 
            }
            // InternalVarlinkIdl.g:1793:2: ( rule__InterfaceName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVarlinkIdl.g:1793:3: rule__InterfaceName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__InterfaceName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalVarlinkIdl.g:1802:1: rule__InterfaceName__Group_1__0 : rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1 ;
    public final void rule__InterfaceName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1806:1: ( rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1 )
            // InternalVarlinkIdl.g:1807:2: rule__InterfaceName__Group_1__0__Impl rule__InterfaceName__Group_1__1
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
    // InternalVarlinkIdl.g:1814:1: rule__InterfaceName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__InterfaceName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1818:1: ( ( ( '.' ) ) )
            // InternalVarlinkIdl.g:1819:1: ( ( '.' ) )
            {
            // InternalVarlinkIdl.g:1819:1: ( ( '.' ) )
            // InternalVarlinkIdl.g:1820:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalVarlinkIdl.g:1821:2: ( '.' )
            // InternalVarlinkIdl.g:1821:3: '.'
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalVarlinkIdl.g:1829:1: rule__InterfaceName__Group_1__1 : rule__InterfaceName__Group_1__1__Impl ;
    public final void rule__InterfaceName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1833:1: ( rule__InterfaceName__Group_1__1__Impl )
            // InternalVarlinkIdl.g:1834:2: rule__InterfaceName__Group_1__1__Impl
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
    // InternalVarlinkIdl.g:1840:1: rule__InterfaceName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__InterfaceName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1844:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:1845:1: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:1845:1: ( RULE_ID )
            // InternalVarlinkIdl.g:1846:2: RULE_ID
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
    // InternalVarlinkIdl.g:1856:1: rule__Interface__NameAssignment_1 : ( ruleInterfaceName ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1860:1: ( ( ruleInterfaceName ) )
            // InternalVarlinkIdl.g:1861:2: ( ruleInterfaceName )
            {
            // InternalVarlinkIdl.g:1861:2: ( ruleInterfaceName )
            // InternalVarlinkIdl.g:1862:3: ruleInterfaceName
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
    // InternalVarlinkIdl.g:1871:1: rule__Interface__MembersAssignment_2 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1875:1: ( ( ruleMember ) )
            // InternalVarlinkIdl.g:1876:2: ( ruleMember )
            {
            // InternalVarlinkIdl.g:1876:2: ( ruleMember )
            // InternalVarlinkIdl.g:1877:3: ruleMember
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
    // InternalVarlinkIdl.g:1886:1: rule__TypeAlias__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__TypeAlias__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1890:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1891:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1891:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1892:3: ruleValidID
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
    // InternalVarlinkIdl.g:1901:1: rule__TypeAlias__DefinitionAssignment_2 : ( ruleTypeAliasDefinition ) ;
    public final void rule__TypeAlias__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1905:1: ( ( ruleTypeAliasDefinition ) )
            // InternalVarlinkIdl.g:1906:2: ( ruleTypeAliasDefinition )
            {
            // InternalVarlinkIdl.g:1906:2: ( ruleTypeAliasDefinition )
            // InternalVarlinkIdl.g:1907:3: ruleTypeAliasDefinition
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
    // InternalVarlinkIdl.g:1916:1: rule__Enum__FieldsAssignment_1 : ( ruleValidID ) ;
    public final void rule__Enum__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1920:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1921:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1921:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1922:3: ruleValidID
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
    // InternalVarlinkIdl.g:1931:1: rule__Enum__FieldsAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__Enum__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1935:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1936:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1936:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1937:3: ruleValidID
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
    // InternalVarlinkIdl.g:1946:1: rule__Object__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__Object__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1950:1: ( ( ruleField ) )
            // InternalVarlinkIdl.g:1951:2: ( ruleField )
            {
            // InternalVarlinkIdl.g:1951:2: ( ruleField )
            // InternalVarlinkIdl.g:1952:3: ruleField
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
    // InternalVarlinkIdl.g:1961:1: rule__Object__FieldsAssignment_3_1 : ( ruleField ) ;
    public final void rule__Object__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1965:1: ( ( ruleField ) )
            // InternalVarlinkIdl.g:1966:2: ( ruleField )
            {
            // InternalVarlinkIdl.g:1966:2: ( ruleField )
            // InternalVarlinkIdl.g:1967:3: ruleField
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
    // InternalVarlinkIdl.g:1976:1: rule__Field__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1980:1: ( ( ruleValidID ) )
            // InternalVarlinkIdl.g:1981:2: ( ruleValidID )
            {
            // InternalVarlinkIdl.g:1981:2: ( ruleValidID )
            // InternalVarlinkIdl.g:1982:3: ruleValidID
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
    // InternalVarlinkIdl.g:1991:1: rule__Field__TypeAssignment_2 : ( ruleElementType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:1995:1: ( ( ruleElementType ) )
            // InternalVarlinkIdl.g:1996:2: ( ruleElementType )
            {
            // InternalVarlinkIdl.g:1996:2: ( ruleElementType )
            // InternalVarlinkIdl.g:1997:3: ruleElementType
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


    // $ANTLR start "rule__Array__TypeAssignment_1"
    // InternalVarlinkIdl.g:2006:1: rule__Array__TypeAssignment_1 : ( ruleElementType ) ;
    public final void rule__Array__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2010:1: ( ( ruleElementType ) )
            // InternalVarlinkIdl.g:2011:2: ( ruleElementType )
            {
            // InternalVarlinkIdl.g:2011:2: ( ruleElementType )
            // InternalVarlinkIdl.g:2012:3: ruleElementType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getTypeElementTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getTypeElementTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Array__TypeAssignment_1"


    // $ANTLR start "rule__Dictionary__TypeAssignment_1"
    // InternalVarlinkIdl.g:2021:1: rule__Dictionary__TypeAssignment_1 : ( ruleElementType ) ;
    public final void rule__Dictionary__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2025:1: ( ( ruleElementType ) )
            // InternalVarlinkIdl.g:2026:2: ( ruleElementType )
            {
            // InternalVarlinkIdl.g:2026:2: ( ruleElementType )
            // InternalVarlinkIdl.g:2027:3: ruleElementType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDictionaryAccess().getTypeElementTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDictionaryAccess().getTypeElementTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Dictionary__TypeAssignment_1"


    // $ANTLR start "rule__Optional__TypeAssignment_1"
    // InternalVarlinkIdl.g:2036:1: rule__Optional__TypeAssignment_1 : ( ruleElementType ) ;
    public final void rule__Optional__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2040:1: ( ( ruleElementType ) )
            // InternalVarlinkIdl.g:2041:2: ( ruleElementType )
            {
            // InternalVarlinkIdl.g:2041:2: ( ruleElementType )
            // InternalVarlinkIdl.g:2042:3: ruleElementType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalAccess().getTypeElementTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalAccess().getTypeElementTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Optional__TypeAssignment_1"


    // $ANTLR start "rule__TypeReference__NameAssignment"
    // InternalVarlinkIdl.g:2051:1: rule__TypeReference__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2055:1: ( ( ( RULE_ID ) ) )
            // InternalVarlinkIdl.g:2056:2: ( ( RULE_ID ) )
            {
            // InternalVarlinkIdl.g:2056:2: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:2057:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getNameTypeAliasCrossReference_0()); 
            }
            // InternalVarlinkIdl.g:2058:3: ( RULE_ID )
            // InternalVarlinkIdl.g:2059:4: RULE_ID
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
    // InternalVarlinkIdl.g:2070:1: rule__BasicType__TypeAssignment : ( ( rule__BasicType__TypeAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2074:1: ( ( ( rule__BasicType__TypeAlternatives_0 ) ) )
            // InternalVarlinkIdl.g:2075:2: ( ( rule__BasicType__TypeAlternatives_0 ) )
            {
            // InternalVarlinkIdl.g:2075:2: ( ( rule__BasicType__TypeAlternatives_0 ) )
            // InternalVarlinkIdl.g:2076:3: ( rule__BasicType__TypeAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0()); 
            }
            // InternalVarlinkIdl.g:2077:3: ( rule__BasicType__TypeAlternatives_0 )
            // InternalVarlinkIdl.g:2077:4: rule__BasicType__TypeAlternatives_0
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
    // InternalVarlinkIdl.g:2085:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2089:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:2090:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:2090:2: ( RULE_ID )
            // InternalVarlinkIdl.g:2091:3: RULE_ID
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
    // InternalVarlinkIdl.g:2100:1: rule__Method__ArgumentsAssignment_2 : ( ruleArguments ) ;
    public final void rule__Method__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2104:1: ( ( ruleArguments ) )
            // InternalVarlinkIdl.g:2105:2: ( ruleArguments )
            {
            // InternalVarlinkIdl.g:2105:2: ( ruleArguments )
            // InternalVarlinkIdl.g:2106:3: ruleArguments
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
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
    // InternalVarlinkIdl.g:2115:1: rule__Method__ResultAssignment_4 : ( ruleResult ) ;
    public final void rule__Method__ResultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2119:1: ( ( ruleResult ) )
            // InternalVarlinkIdl.g:2120:2: ( ruleResult )
            {
            // InternalVarlinkIdl.g:2120:2: ( ruleResult )
            // InternalVarlinkIdl.g:2121:3: ruleResult
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getResultResultParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getResultResultParserRuleCall_4_0()); 
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


    // $ANTLR start "rule__Arguments__ArgumentsAssignment"
    // InternalVarlinkIdl.g:2130:1: rule__Arguments__ArgumentsAssignment : ( ruleObject ) ;
    public final void rule__Arguments__ArgumentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2134:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:2135:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:2135:2: ( ruleObject )
            // InternalVarlinkIdl.g:2136:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentsAccess().getArgumentsObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentsAccess().getArgumentsObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__Arguments__ArgumentsAssignment"


    // $ANTLR start "rule__Result__ResultAssignment"
    // InternalVarlinkIdl.g:2145:1: rule__Result__ResultAssignment : ( ruleObject ) ;
    public final void rule__Result__ResultAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2149:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:2150:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:2150:2: ( ruleObject )
            // InternalVarlinkIdl.g:2151:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getResultObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getResultObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__Result__ResultAssignment"


    // $ANTLR start "rule__Error__NameAssignment_1"
    // InternalVarlinkIdl.g:2160:1: rule__Error__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Error__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2164:1: ( ( RULE_ID ) )
            // InternalVarlinkIdl.g:2165:2: ( RULE_ID )
            {
            // InternalVarlinkIdl.g:2165:2: ( RULE_ID )
            // InternalVarlinkIdl.g:2166:3: RULE_ID
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
    // InternalVarlinkIdl.g:2175:1: rule__Error__PropertiesAssignment_2 : ( ruleObject ) ;
    public final void rule__Error__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarlinkIdl.g:2179:1: ( ( ruleObject ) )
            // InternalVarlinkIdl.g:2180:2: ( ruleObject )
            {
            // InternalVarlinkIdl.g:2180:2: ( ruleObject )
            // InternalVarlinkIdl.g:2181:3: ruleObject
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
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\21\1\4\12\22\2\uffff";
    static final String dfa_3s = "\1\21\1\23\12\24\2\uffff";
    static final String dfa_4s = "\14\uffff\1\2\1\1";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\3\uffff\1\10\1\11\1\12\1\13\1\3\1\4\1\5\1\6\1\7\1\uffff\2\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
            "\2\15\1\14",
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
            return "587:1: rule__TypeAliasDefinition__Alternatives : ( ( ruleEnum ) | ( ruleObject ) );";
        }
    }
    static final String dfa_7s = "\23\uffff";
    static final String dfa_8s = "\1\4\2\uffff\1\4\3\uffff\12\22\2\uffff";
    static final String dfa_9s = "\1\27\2\uffff\1\23\3\uffff\12\24\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\12\uffff\1\4\1\3";
    static final String dfa_11s = "\23\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\3\uffff\4\1\5\uffff\1\3\3\uffff\1\4\1\5\1\6",
            "",
            "",
            "\1\7\3\uffff\1\15\1\16\1\17\1\20\1\10\1\11\1\12\1\13\1\14\1\uffff\2\21",
            "",
            "",
            "",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
            "\2\22\1\21",
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
            return "608:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleTypeReference ) | ( ruleEnum ) | ( ruleObject ) | ( ruleArray ) | ( ruleDictionary ) | ( ruleOptional ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001FF10L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000DFF10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E20F10L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});

}