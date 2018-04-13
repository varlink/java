package de.dentrassi.varlink.idl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dentrassi.varlink.idl.services.VarlinkIdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalVarlinkIdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'type'", "'('", "','", "')'", "':'", "'[]'", "'[string]'", "'?'", "'bool'", "'int'", "'float'", "'string'", "'method'", "'->'", "'error'", "'.'", "'enum'"
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

        public InternalVarlinkIdlParser(TokenStream input, VarlinkIdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Interface";
       	}

       	@Override
       	protected VarlinkIdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInterface"
    // InternalVarlinkIdl.g:71:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalVarlinkIdl.g:71:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalVarlinkIdl.g:72:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalVarlinkIdl.g:78:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= ruleInterfaceName ) ) ( (lv_members_2_0= ruleMember ) )* ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:84:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= ruleInterfaceName ) ) ( (lv_members_2_0= ruleMember ) )* ) )
            // InternalVarlinkIdl.g:85:2: (otherlv_0= 'interface' ( (lv_name_1_0= ruleInterfaceName ) ) ( (lv_members_2_0= ruleMember ) )* )
            {
            // InternalVarlinkIdl.g:85:2: (otherlv_0= 'interface' ( (lv_name_1_0= ruleInterfaceName ) ) ( (lv_members_2_0= ruleMember ) )* )
            // InternalVarlinkIdl.g:86:3: otherlv_0= 'interface' ( (lv_name_1_0= ruleInterfaceName ) ) ( (lv_members_2_0= ruleMember ) )*
            {
            otherlv_0=(Token)match(input,8,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:90:3: ( (lv_name_1_0= ruleInterfaceName ) )
            // InternalVarlinkIdl.g:91:4: (lv_name_1_0= ruleInterfaceName )
            {
            // InternalVarlinkIdl.g:91:4: (lv_name_1_0= ruleInterfaceName )
            // InternalVarlinkIdl.g:92:5: lv_name_1_0= ruleInterfaceName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfaceAccess().getNameInterfaceNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInterfaceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.InterfaceName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVarlinkIdl.g:109:3: ( (lv_members_2_0= ruleMember ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9||LA1_0==21||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVarlinkIdl.g:110:4: (lv_members_2_0= ruleMember )
            	    {
            	    // InternalVarlinkIdl.g:110:4: (lv_members_2_0= ruleMember )
            	    // InternalVarlinkIdl.g:111:5: lv_members_2_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_members_2_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_2_0,
            	      						"de.dentrassi.varlink.idl.VarlinkIdl.Member");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMember"
    // InternalVarlinkIdl.g:132:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalVarlinkIdl.g:132:47: (iv_ruleMember= ruleMember EOF )
            // InternalVarlinkIdl.g:133:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalVarlinkIdl.g:139:1: ruleMember returns [EObject current=null] : (this_TypeAlias_0= ruleTypeAlias | this_Method_1= ruleMethod | this_Error_2= ruleError ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_TypeAlias_0 = null;

        EObject this_Method_1 = null;

        EObject this_Error_2 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:145:2: ( (this_TypeAlias_0= ruleTypeAlias | this_Method_1= ruleMethod | this_Error_2= ruleError ) )
            // InternalVarlinkIdl.g:146:2: (this_TypeAlias_0= ruleTypeAlias | this_Method_1= ruleMethod | this_Error_2= ruleError )
            {
            // InternalVarlinkIdl.g:146:2: (this_TypeAlias_0= ruleTypeAlias | this_Method_1= ruleMethod | this_Error_2= ruleError )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVarlinkIdl.g:147:3: this_TypeAlias_0= ruleTypeAlias
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getTypeAliasParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeAlias_0=ruleTypeAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeAlias_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:156:3: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:165:3: this_Error_2= ruleError
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getErrorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Error_2=ruleError();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Error_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleTypeAlias"
    // InternalVarlinkIdl.g:177:1: entryRuleTypeAlias returns [EObject current=null] : iv_ruleTypeAlias= ruleTypeAlias EOF ;
    public final EObject entryRuleTypeAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAlias = null;


        try {
            // InternalVarlinkIdl.g:177:50: (iv_ruleTypeAlias= ruleTypeAlias EOF )
            // InternalVarlinkIdl.g:178:2: iv_ruleTypeAlias= ruleTypeAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeAlias=ruleTypeAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAlias"


    // $ANTLR start "ruleTypeAlias"
    // InternalVarlinkIdl.g:184:1: ruleTypeAlias returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) ) ;
    public final EObject ruleTypeAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:190:2: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) ) )
            // InternalVarlinkIdl.g:191:2: (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) )
            {
            // InternalVarlinkIdl.g:191:2: (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) )
            // InternalVarlinkIdl.g:192:3: otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) )
            {
            otherlv_0=(Token)match(input,9,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeAliasAccess().getTypeKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:196:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalVarlinkIdl.g:197:4: (lv_name_1_0= ruleValidID )
            {
            // InternalVarlinkIdl.g:197:4: (lv_name_1_0= ruleValidID )
            // InternalVarlinkIdl.g:198:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeAliasAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeAliasRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVarlinkIdl.g:215:3: ( (lv_definition_2_0= ruleTypeAliasDefinition ) )
            // InternalVarlinkIdl.g:216:4: (lv_definition_2_0= ruleTypeAliasDefinition )
            {
            // InternalVarlinkIdl.g:216:4: (lv_definition_2_0= ruleTypeAliasDefinition )
            // InternalVarlinkIdl.g:217:5: lv_definition_2_0= ruleTypeAliasDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeAliasAccess().getDefinitionTypeAliasDefinitionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_definition_2_0=ruleTypeAliasDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeAliasRule());
              					}
              					set(
              						current,
              						"definition",
              						lv_definition_2_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.TypeAliasDefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeAlias"


    // $ANTLR start "entryRuleTypeAliasDefinition"
    // InternalVarlinkIdl.g:238:1: entryRuleTypeAliasDefinition returns [EObject current=null] : iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF ;
    public final EObject entryRuleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAliasDefinition = null;


        try {
            // InternalVarlinkIdl.g:238:60: (iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF )
            // InternalVarlinkIdl.g:239:2: iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeAliasDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeAliasDefinition=ruleTypeAliasDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeAliasDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAliasDefinition"


    // $ANTLR start "ruleTypeAliasDefinition"
    // InternalVarlinkIdl.g:245:1: ruleTypeAliasDefinition returns [EObject current=null] : (this_Enum_0= ruleEnum | this_Object_1= ruleObject ) ;
    public final EObject ruleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_Object_1 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:251:2: ( (this_Enum_0= ruleEnum | this_Object_1= ruleObject ) )
            // InternalVarlinkIdl.g:252:2: (this_Enum_0= ruleEnum | this_Object_1= ruleObject )
            {
            // InternalVarlinkIdl.g:252:2: (this_Enum_0= ruleEnum | this_Object_1= ruleObject )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalVarlinkIdl.g:253:3: this_Enum_0= ruleEnum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getEnumParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enum_0=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enum_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:262:3: this_Object_1= ruleObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getObjectParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Object_1=ruleObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Object_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeAliasDefinition"


    // $ANTLR start "entryRuleEnum"
    // InternalVarlinkIdl.g:274:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalVarlinkIdl.g:274:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalVarlinkIdl.g:275:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalVarlinkIdl.g:281:1: ruleEnum returns [EObject current=null] : (otherlv_0= '(' ( (lv_fields_1_0= ruleValidID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleValidID ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_fields_1_0 = null;

        AntlrDatatypeRuleToken lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:287:2: ( (otherlv_0= '(' ( (lv_fields_1_0= ruleValidID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleValidID ) ) )* otherlv_4= ')' ) )
            // InternalVarlinkIdl.g:288:2: (otherlv_0= '(' ( (lv_fields_1_0= ruleValidID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleValidID ) ) )* otherlv_4= ')' )
            {
            // InternalVarlinkIdl.g:288:2: (otherlv_0= '(' ( (lv_fields_1_0= ruleValidID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleValidID ) ) )* otherlv_4= ')' )
            // InternalVarlinkIdl.g:289:3: otherlv_0= '(' ( (lv_fields_1_0= ruleValidID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleValidID ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,10,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:293:3: ( (lv_fields_1_0= ruleValidID ) )
            // InternalVarlinkIdl.g:294:4: (lv_fields_1_0= ruleValidID )
            {
            // InternalVarlinkIdl.g:294:4: (lv_fields_1_0= ruleValidID )
            // InternalVarlinkIdl.g:295:5: lv_fields_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_fields_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumRule());
              					}
              					add(
              						current,
              						"fields",
              						lv_fields_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVarlinkIdl.g:312:3: (otherlv_2= ',' ( (lv_fields_3_0= ruleValidID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVarlinkIdl.g:313:4: otherlv_2= ',' ( (lv_fields_3_0= ruleValidID ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalVarlinkIdl.g:317:4: ( (lv_fields_3_0= ruleValidID ) )
            	    // InternalVarlinkIdl.g:318:5: (lv_fields_3_0= ruleValidID )
            	    {
            	    // InternalVarlinkIdl.g:318:5: (lv_fields_3_0= ruleValidID )
            	    // InternalVarlinkIdl.g:319:6: lv_fields_3_0= ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_fields_3_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumRule());
            	      						}
            	      						add(
            	      							current,
            	      							"fields",
            	      							lv_fields_3_0,
            	      							"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleObject"
    // InternalVarlinkIdl.g:345:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalVarlinkIdl.g:345:47: (iv_ruleObject= ruleObject EOF )
            // InternalVarlinkIdl.g:346:2: iv_ruleObject= ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalVarlinkIdl.g:352:1: ruleObject returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:358:2: ( ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' ) )
            // InternalVarlinkIdl.g:359:2: ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' )
            {
            // InternalVarlinkIdl.g:359:2: ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' )
            // InternalVarlinkIdl.g:360:3: () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')'
            {
            // InternalVarlinkIdl.g:360:3: ()
            // InternalVarlinkIdl.g:361:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectAccess().getObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,10,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalVarlinkIdl.g:371:3: ( (lv_fields_2_0= ruleField ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=8 && LA5_0<=9)||(LA5_0>=17 && LA5_0<=21)||LA5_0==23||LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVarlinkIdl.g:372:4: (lv_fields_2_0= ruleField )
                    {
                    // InternalVarlinkIdl.g:372:4: (lv_fields_2_0= ruleField )
                    // InternalVarlinkIdl.g:373:5: lv_fields_2_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_fields_2_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectRule());
                      					}
                      					add(
                      						current,
                      						"fields",
                      						lv_fields_2_0,
                      						"de.dentrassi.varlink.idl.VarlinkIdl.Field");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalVarlinkIdl.g:390:3: (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVarlinkIdl.g:391:4: otherlv_3= ',' ( (lv_fields_4_0= ruleField ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalVarlinkIdl.g:395:4: ( (lv_fields_4_0= ruleField ) )
            	    // InternalVarlinkIdl.g:396:5: (lv_fields_4_0= ruleField )
            	    {
            	    // InternalVarlinkIdl.g:396:5: (lv_fields_4_0= ruleField )
            	    // InternalVarlinkIdl.g:397:6: lv_fields_4_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_fields_4_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"fields",
            	      							lv_fields_4_0,
            	      							"de.dentrassi.varlink.idl.VarlinkIdl.Field");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleField"
    // InternalVarlinkIdl.g:423:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalVarlinkIdl.g:423:46: (iv_ruleField= ruleField EOF )
            // InternalVarlinkIdl.g:424:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalVarlinkIdl.g:430:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:436:2: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) ) )
            // InternalVarlinkIdl.g:437:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) )
            {
            // InternalVarlinkIdl.g:437:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) )
            // InternalVarlinkIdl.g:438:3: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) )
            {
            // InternalVarlinkIdl.g:438:3: ( (lv_name_0_0= ruleValidID ) )
            // InternalVarlinkIdl.g:439:4: (lv_name_0_0= ruleValidID )
            {
            // InternalVarlinkIdl.g:439:4: (lv_name_0_0= ruleValidID )
            // InternalVarlinkIdl.g:440:5: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalVarlinkIdl.g:461:3: ( (lv_type_2_0= ruleElementType ) )
            // InternalVarlinkIdl.g:462:4: (lv_type_2_0= ruleElementType )
            {
            // InternalVarlinkIdl.g:462:4: (lv_type_2_0= ruleElementType )
            // InternalVarlinkIdl.g:463:5: lv_type_2_0= ruleElementType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getTypeElementTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ElementType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleElementType"
    // InternalVarlinkIdl.g:484:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalVarlinkIdl.g:484:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalVarlinkIdl.g:485:2: iv_ruleElementType= ruleElementType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalVarlinkIdl.g:491:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject | this_Array_4= ruleArray | this_Dictionary_5= ruleDictionary | this_Optional_6= ruleOptional ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_TypeReference_1 = null;

        EObject this_Enum_2 = null;

        EObject this_Object_3 = null;

        EObject this_Array_4 = null;

        EObject this_Dictionary_5 = null;

        EObject this_Optional_6 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:497:2: ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject | this_Array_4= ruleArray | this_Dictionary_5= ruleDictionary | this_Optional_6= ruleOptional ) )
            // InternalVarlinkIdl.g:498:2: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject | this_Array_4= ruleArray | this_Dictionary_5= ruleDictionary | this_Optional_6= ruleOptional )
            {
            // InternalVarlinkIdl.g:498:2: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject | this_Array_4= ruleArray | this_Dictionary_5= ruleDictionary | this_Optional_6= ruleOptional )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalVarlinkIdl.g:499:3: this_BasicType_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:508:3: this_TypeReference_1= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeReference_1=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:517:3: this_Enum_2= ruleEnum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enum_2=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enum_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVarlinkIdl.g:526:3: this_Object_3= ruleObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeAccess().getObjectParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Object_3=ruleObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Object_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVarlinkIdl.g:535:3: this_Array_4= ruleArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeAccess().getArrayParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Array_4=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Array_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVarlinkIdl.g:544:3: this_Dictionary_5= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeAccess().getDictionaryParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Dictionary_5=ruleDictionary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Dictionary_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVarlinkIdl.g:553:3: this_Optional_6= ruleOptional
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementTypeAccess().getOptionalParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Optional_6=ruleOptional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Optional_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleArray"
    // InternalVarlinkIdl.g:565:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalVarlinkIdl.g:565:46: (iv_ruleArray= ruleArray EOF )
            // InternalVarlinkIdl.g:566:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalVarlinkIdl.g:572:1: ruleArray returns [EObject current=null] : (otherlv_0= '[]' ( (lv_type_1_0= ruleElementType ) ) ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:578:2: ( (otherlv_0= '[]' ( (lv_type_1_0= ruleElementType ) ) ) )
            // InternalVarlinkIdl.g:579:2: (otherlv_0= '[]' ( (lv_type_1_0= ruleElementType ) ) )
            {
            // InternalVarlinkIdl.g:579:2: (otherlv_0= '[]' ( (lv_type_1_0= ruleElementType ) ) )
            // InternalVarlinkIdl.g:580:3: otherlv_0= '[]' ( (lv_type_1_0= ruleElementType ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:584:3: ( (lv_type_1_0= ruleElementType ) )
            // InternalVarlinkIdl.g:585:4: (lv_type_1_0= ruleElementType )
            {
            // InternalVarlinkIdl.g:585:4: (lv_type_1_0= ruleElementType )
            // InternalVarlinkIdl.g:586:5: lv_type_1_0= ruleElementType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayAccess().getTypeElementTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ElementType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleDictionary"
    // InternalVarlinkIdl.g:607:1: entryRuleDictionary returns [EObject current=null] : iv_ruleDictionary= ruleDictionary EOF ;
    public final EObject entryRuleDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionary = null;


        try {
            // InternalVarlinkIdl.g:607:51: (iv_ruleDictionary= ruleDictionary EOF )
            // InternalVarlinkIdl.g:608:2: iv_ruleDictionary= ruleDictionary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDictionary=ruleDictionary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictionary"


    // $ANTLR start "ruleDictionary"
    // InternalVarlinkIdl.g:614:1: ruleDictionary returns [EObject current=null] : (otherlv_0= '[string]' ( (lv_type_1_0= ruleElementType ) ) ) ;
    public final EObject ruleDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:620:2: ( (otherlv_0= '[string]' ( (lv_type_1_0= ruleElementType ) ) ) )
            // InternalVarlinkIdl.g:621:2: (otherlv_0= '[string]' ( (lv_type_1_0= ruleElementType ) ) )
            {
            // InternalVarlinkIdl.g:621:2: (otherlv_0= '[string]' ( (lv_type_1_0= ruleElementType ) ) )
            // InternalVarlinkIdl.g:622:3: otherlv_0= '[string]' ( (lv_type_1_0= ruleElementType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDictionaryAccess().getStringKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:626:3: ( (lv_type_1_0= ruleElementType ) )
            // InternalVarlinkIdl.g:627:4: (lv_type_1_0= ruleElementType )
            {
            // InternalVarlinkIdl.g:627:4: (lv_type_1_0= ruleElementType )
            // InternalVarlinkIdl.g:628:5: lv_type_1_0= ruleElementType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDictionaryAccess().getTypeElementTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDictionaryRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ElementType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictionary"


    // $ANTLR start "entryRuleOptional"
    // InternalVarlinkIdl.g:649:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // InternalVarlinkIdl.g:649:49: (iv_ruleOptional= ruleOptional EOF )
            // InternalVarlinkIdl.g:650:2: iv_ruleOptional= ruleOptional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOptional=ruleOptional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptional; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalVarlinkIdl.g:656:1: ruleOptional returns [EObject current=null] : (otherlv_0= '?' ( (lv_type_1_0= ruleElementType ) ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:662:2: ( (otherlv_0= '?' ( (lv_type_1_0= ruleElementType ) ) ) )
            // InternalVarlinkIdl.g:663:2: (otherlv_0= '?' ( (lv_type_1_0= ruleElementType ) ) )
            {
            // InternalVarlinkIdl.g:663:2: (otherlv_0= '?' ( (lv_type_1_0= ruleElementType ) ) )
            // InternalVarlinkIdl.g:664:3: otherlv_0= '?' ( (lv_type_1_0= ruleElementType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:668:3: ( (lv_type_1_0= ruleElementType ) )
            // InternalVarlinkIdl.g:669:4: (lv_type_1_0= ruleElementType )
            {
            // InternalVarlinkIdl.g:669:4: (lv_type_1_0= ruleElementType )
            // InternalVarlinkIdl.g:670:5: lv_type_1_0= ruleElementType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalAccess().getTypeElementTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOptionalRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ElementType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleTypeReference"
    // InternalVarlinkIdl.g:691:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalVarlinkIdl.g:691:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalVarlinkIdl.g:692:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalVarlinkIdl.g:698:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:704:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalVarlinkIdl.g:705:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalVarlinkIdl.g:705:2: ( (otherlv_0= RULE_ID ) )
            // InternalVarlinkIdl.g:706:3: (otherlv_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:706:3: (otherlv_0= RULE_ID )
            // InternalVarlinkIdl.g:707:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTypeReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getNameTypeAliasCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleBasicType"
    // InternalVarlinkIdl.g:721:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalVarlinkIdl.g:721:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalVarlinkIdl.g:722:2: iv_ruleBasicType= ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalVarlinkIdl.g:728:1: ruleBasicType returns [EObject current=null] : ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:734:2: ( ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' ) ) ) )
            // InternalVarlinkIdl.g:735:2: ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' ) ) )
            {
            // InternalVarlinkIdl.g:735:2: ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' ) ) )
            // InternalVarlinkIdl.g:736:3: ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' ) )
            {
            // InternalVarlinkIdl.g:736:3: ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' ) )
            // InternalVarlinkIdl.g:737:4: (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' )
            {
            // InternalVarlinkIdl.g:737:4: (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalVarlinkIdl.g:738:5: lv_type_0_1= 'bool'
                    {
                    lv_type_0_1=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getBasicTypeAccess().getTypeBoolKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:749:5: lv_type_0_2= 'int'
                    {
                    lv_type_0_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getBasicTypeAccess().getTypeIntKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:760:5: lv_type_0_3= 'float'
                    {
                    lv_type_0_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getBasicTypeAccess().getTypeFloatKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalVarlinkIdl.g:771:5: lv_type_0_4= 'string'
                    {
                    lv_type_0_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_4, grammarAccess.getBasicTypeAccess().getTypeStringKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_4, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleMethod"
    // InternalVarlinkIdl.g:787:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalVarlinkIdl.g:787:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalVarlinkIdl.g:788:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalVarlinkIdl.g:794:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleArguments ) ) otherlv_3= '->' ( (lv_result_4_0= ruleResult ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_result_4_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:800:2: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleArguments ) ) otherlv_3= '->' ( (lv_result_4_0= ruleResult ) ) ) )
            // InternalVarlinkIdl.g:801:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleArguments ) ) otherlv_3= '->' ( (lv_result_4_0= ruleResult ) ) )
            {
            // InternalVarlinkIdl.g:801:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleArguments ) ) otherlv_3= '->' ( (lv_result_4_0= ruleResult ) ) )
            // InternalVarlinkIdl.g:802:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleArguments ) ) otherlv_3= '->' ( (lv_result_4_0= ruleResult ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:806:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:807:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:807:4: (lv_name_1_0= RULE_ID )
            // InternalVarlinkIdl.g:808:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ID");
              				
            }

            }


            }

            // InternalVarlinkIdl.g:824:3: ( (lv_arguments_2_0= ruleArguments ) )
            // InternalVarlinkIdl.g:825:4: (lv_arguments_2_0= ruleArguments )
            {
            // InternalVarlinkIdl.g:825:4: (lv_arguments_2_0= ruleArguments )
            // InternalVarlinkIdl.g:826:5: lv_arguments_2_0= ruleArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getArgumentsArgumentsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_arguments_2_0=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"arguments",
              						lv_arguments_2_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.Arguments");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalVarlinkIdl.g:847:3: ( (lv_result_4_0= ruleResult ) )
            // InternalVarlinkIdl.g:848:4: (lv_result_4_0= ruleResult )
            {
            // InternalVarlinkIdl.g:848:4: (lv_result_4_0= ruleResult )
            // InternalVarlinkIdl.g:849:5: lv_result_4_0= ruleResult
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getResultResultParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_result_4_0=ruleResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"result",
              						lv_result_4_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.Result");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleArguments"
    // InternalVarlinkIdl.g:870:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalVarlinkIdl.g:870:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalVarlinkIdl.g:871:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalVarlinkIdl.g:877:1: ruleArguments returns [EObject current=null] : ( (lv_arguments_0_0= ruleObject ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:883:2: ( ( (lv_arguments_0_0= ruleObject ) ) )
            // InternalVarlinkIdl.g:884:2: ( (lv_arguments_0_0= ruleObject ) )
            {
            // InternalVarlinkIdl.g:884:2: ( (lv_arguments_0_0= ruleObject ) )
            // InternalVarlinkIdl.g:885:3: (lv_arguments_0_0= ruleObject )
            {
            // InternalVarlinkIdl.g:885:3: (lv_arguments_0_0= ruleObject )
            // InternalVarlinkIdl.g:886:4: lv_arguments_0_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_arguments_0_0=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getArgumentsRule());
              				}
              				set(
              					current,
              					"arguments",
              					lv_arguments_0_0,
              					"de.dentrassi.varlink.idl.VarlinkIdl.Object");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleResult"
    // InternalVarlinkIdl.g:906:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalVarlinkIdl.g:906:47: (iv_ruleResult= ruleResult EOF )
            // InternalVarlinkIdl.g:907:2: iv_ruleResult= ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResult; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalVarlinkIdl.g:913:1: ruleResult returns [EObject current=null] : ( (lv_result_0_0= ruleObject ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        EObject lv_result_0_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:919:2: ( ( (lv_result_0_0= ruleObject ) ) )
            // InternalVarlinkIdl.g:920:2: ( (lv_result_0_0= ruleObject ) )
            {
            // InternalVarlinkIdl.g:920:2: ( (lv_result_0_0= ruleObject ) )
            // InternalVarlinkIdl.g:921:3: (lv_result_0_0= ruleObject )
            {
            // InternalVarlinkIdl.g:921:3: (lv_result_0_0= ruleObject )
            // InternalVarlinkIdl.g:922:4: lv_result_0_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getResultAccess().getResultObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_result_0_0=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getResultRule());
              				}
              				set(
              					current,
              					"result",
              					lv_result_0_0,
              					"de.dentrassi.varlink.idl.VarlinkIdl.Object");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleError"
    // InternalVarlinkIdl.g:942:1: entryRuleError returns [EObject current=null] : iv_ruleError= ruleError EOF ;
    public final EObject entryRuleError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleError = null;


        try {
            // InternalVarlinkIdl.g:942:46: (iv_ruleError= ruleError EOF )
            // InternalVarlinkIdl.g:943:2: iv_ruleError= ruleError EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getErrorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleError=ruleError();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleError; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleError"


    // $ANTLR start "ruleError"
    // InternalVarlinkIdl.g:949:1: ruleError returns [EObject current=null] : (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) ) ;
    public final EObject ruleError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:955:2: ( (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) ) )
            // InternalVarlinkIdl.g:956:2: (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) )
            {
            // InternalVarlinkIdl.g:956:2: (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) )
            // InternalVarlinkIdl.g:957:3: otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getErrorAccess().getErrorKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:961:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:962:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:962:4: (lv_name_1_0= RULE_ID )
            // InternalVarlinkIdl.g:963:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getErrorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getErrorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ID");
              				
            }

            }


            }

            // InternalVarlinkIdl.g:979:3: ( (lv_properties_2_0= ruleObject ) )
            // InternalVarlinkIdl.g:980:4: (lv_properties_2_0= ruleObject )
            {
            // InternalVarlinkIdl.g:980:4: (lv_properties_2_0= ruleObject )
            // InternalVarlinkIdl.g:981:5: lv_properties_2_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getErrorAccess().getPropertiesObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_properties_2_0=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getErrorRule());
              					}
              					set(
              						current,
              						"properties",
              						lv_properties_2_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.Object");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleError"


    // $ANTLR start "entryRuleInterfaceName"
    // InternalVarlinkIdl.g:1002:1: entryRuleInterfaceName returns [String current=null] : iv_ruleInterfaceName= ruleInterfaceName EOF ;
    public final String entryRuleInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceName = null;


        try {
            // InternalVarlinkIdl.g:1002:53: (iv_ruleInterfaceName= ruleInterfaceName EOF )
            // InternalVarlinkIdl.g:1003:2: iv_ruleInterfaceName= ruleInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceName=ruleInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceName"


    // $ANTLR start "ruleInterfaceName"
    // InternalVarlinkIdl.g:1009:1: ruleInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:1015:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalVarlinkIdl.g:1016:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalVarlinkIdl.g:1016:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalVarlinkIdl.g:1017:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalVarlinkIdl.g:1024:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) && (synpred1_InternalVarlinkIdl())) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVarlinkIdl.g:1025:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalVarlinkIdl.g:1025:4: ( ( '.' )=>kw= '.' )
            	    // InternalVarlinkIdl.g:1026:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceName"


    // $ANTLR start "entryRuleValidID"
    // InternalVarlinkIdl.g:1045:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalVarlinkIdl.g:1045:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalVarlinkIdl.g:1046:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalVarlinkIdl.g:1052:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:1058:2: ( (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalVarlinkIdl.g:1059:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalVarlinkIdl.g:1059:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=8 && LA10_0<=9)||(LA10_0>=17 && LA10_0<=21)||LA10_0==23||LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVarlinkIdl.g:1060:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:1068:3: this_KEYWORD_1= ruleKEYWORD
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalVarlinkIdl.g:1082:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalVarlinkIdl.g:1082:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalVarlinkIdl.g:1083:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKEYWORD.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalVarlinkIdl.g:1089:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:1095:2: ( (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'string' ) )
            // InternalVarlinkIdl.g:1096:2: (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'string' )
            {
            // InternalVarlinkIdl.g:1096:2: (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'string' )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 8:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 17:
                {
                alt11=6;
                }
                break;
            case 18:
                {
                alt11=7;
                }
                break;
            case 19:
                {
                alt11=8;
                }
                break;
            case 20:
                {
                alt11=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalVarlinkIdl.g:1097:3: kw= 'type'
                    {
                    kw=(Token)match(input,9,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:1103:3: kw= 'enum'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:1109:3: kw= 'interface'
                    {
                    kw=(Token)match(input,8,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInterfaceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVarlinkIdl.g:1115:3: kw= 'method'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMethodKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVarlinkIdl.g:1121:3: kw= 'error'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getErrorKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVarlinkIdl.g:1127:3: kw= 'bool'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBoolKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVarlinkIdl.g:1133:3: kw= 'int'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVarlinkIdl.g:1139:3: kw= 'float'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalVarlinkIdl.g:1145:3: kw= 'string'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringKeyword_8());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"

    // $ANTLR start synpred1_InternalVarlinkIdl
    public final void synpred1_InternalVarlinkIdl_fragment() throws RecognitionException {   
        // InternalVarlinkIdl.g:1026:5: ( '.' )
        // InternalVarlinkIdl.g:1026:6: '.'
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalVarlinkIdl

    // Delegated rules

    public final boolean synpred1_InternalVarlinkIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalVarlinkIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\12\1\4\12\13\2\uffff";
    static final String dfa_3s = "\1\12\1\31\12\15\2\uffff";
    static final String dfa_4s = "\14\uffff\1\2\1\1";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\3\uffff\1\5\1\3\1\uffff\2\14\4\uffff\1\10\1\11\1\12\1\13\1\6\1\uffff\1\7\1\uffff\1\4",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "252:2: (this_Enum_0= ruleEnum | this_Object_1= ruleObject )";
        }
    }
    static final String dfa_7s = "\23\uffff";
    static final String dfa_8s = "\1\4\2\uffff\1\4\3\uffff\12\13\2\uffff";
    static final String dfa_9s = "\1\24\2\uffff\1\31\3\uffff\12\15\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\12\uffff\1\4\1\3";
    static final String dfa_11s = "\23\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\5\uffff\1\3\3\uffff\1\4\1\5\1\6\4\1",
            "",
            "",
            "\1\7\3\uffff\1\12\1\10\1\uffff\2\21\4\uffff\1\15\1\16\1\17\1\20\1\13\1\uffff\1\14\1\uffff\1\11",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "498:2: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject | this_Array_4= ruleArray | this_Dictionary_5= ruleDictionary | this_Optional_6= ruleOptional )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000A00202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002BE0310L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002BE1B10L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001FC410L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});

}