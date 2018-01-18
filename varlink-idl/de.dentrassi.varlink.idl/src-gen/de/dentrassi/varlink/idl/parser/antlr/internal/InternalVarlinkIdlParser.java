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
public class InternalVarlinkIdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'type'", "'('", "','", "')'", "':'", "'[]'", "'bool'", "'int'", "'float'", "'string'", "'data'", "'object'", "'method'", "'->'", "'error'", "'.'", "'enum'"
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

            if ( (LA5_0==RULE_ID||(LA5_0>=8 && LA5_0<=9)||LA5_0==15||(LA5_0>=17 && LA5_0<=21)||LA5_0==23||LA5_0==25) ) {
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
    // InternalVarlinkIdl.g:491:1: ruleElementType returns [EObject current=null] : ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject ) ( (lv_multi_4_0= '[]' ) )? ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        Token lv_multi_4_0=null;
        EObject this_BasicType_0 = null;

        EObject this_TypeReference_1 = null;

        EObject this_Enum_2 = null;

        EObject this_Object_3 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:497:2: ( ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject ) ( (lv_multi_4_0= '[]' ) )? ) )
            // InternalVarlinkIdl.g:498:2: ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject ) ( (lv_multi_4_0= '[]' ) )? )
            {
            // InternalVarlinkIdl.g:498:2: ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject ) ( (lv_multi_4_0= '[]' ) )? )
            // InternalVarlinkIdl.g:499:3: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject ) ( (lv_multi_4_0= '[]' ) )?
            {
            // InternalVarlinkIdl.g:499:3: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalVarlinkIdl.g:500:4: this_BasicType_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_11);
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
                    // InternalVarlinkIdl.g:509:4: this_TypeReference_1= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
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
                    // InternalVarlinkIdl.g:518:4: this_Enum_2= ruleEnum
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_11);
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
                    // InternalVarlinkIdl.g:527:4: this_Object_3= ruleObject
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getElementTypeAccess().getObjectParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_Object_3=ruleObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Object_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalVarlinkIdl.g:536:3: ( (lv_multi_4_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVarlinkIdl.g:537:4: (lv_multi_4_0= '[]' )
                    {
                    // InternalVarlinkIdl.g:537:4: (lv_multi_4_0= '[]' )
                    // InternalVarlinkIdl.g:538:5: lv_multi_4_0= '[]'
                    {
                    lv_multi_4_0=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_multi_4_0, grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getElementTypeRule());
                      					}
                      					setWithLastConsumed(current, "multi", true, "[]");
                      				
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleTypeReference"
    // InternalVarlinkIdl.g:554:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalVarlinkIdl.g:554:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalVarlinkIdl.g:555:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalVarlinkIdl.g:561:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:567:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalVarlinkIdl.g:568:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalVarlinkIdl.g:568:2: ( (otherlv_0= RULE_ID ) )
            // InternalVarlinkIdl.g:569:3: (otherlv_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:569:3: (otherlv_0= RULE_ID )
            // InternalVarlinkIdl.g:570:4: otherlv_0= RULE_ID
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
    // InternalVarlinkIdl.g:584:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalVarlinkIdl.g:584:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalVarlinkIdl.g:585:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalVarlinkIdl.g:591:1: ruleBasicType returns [EObject current=null] : ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:597:2: ( ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) ) )
            // InternalVarlinkIdl.g:598:2: ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) )
            {
            // InternalVarlinkIdl.g:598:2: ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) )
            // InternalVarlinkIdl.g:599:3: ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) )
            {
            // InternalVarlinkIdl.g:599:3: ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) )
            // InternalVarlinkIdl.g:600:4: (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' )
            {
            // InternalVarlinkIdl.g:600:4: (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 20:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVarlinkIdl.g:601:5: lv_type_0_1= 'bool'
                    {
                    lv_type_0_1=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVarlinkIdl.g:612:5: lv_type_0_2= 'int'
                    {
                    lv_type_0_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVarlinkIdl.g:623:5: lv_type_0_3= 'float'
                    {
                    lv_type_0_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVarlinkIdl.g:634:5: lv_type_0_4= 'string'
                    {
                    lv_type_0_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
                case 5 :
                    // InternalVarlinkIdl.g:645:5: lv_type_0_5= 'data'
                    {
                    lv_type_0_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_5, grammarAccess.getBasicTypeAccess().getTypeDataKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalVarlinkIdl.g:656:5: lv_type_0_6= 'object'
                    {
                    lv_type_0_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_6, grammarAccess.getBasicTypeAccess().getTypeObjectKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_6, null);
                      				
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
    // InternalVarlinkIdl.g:672:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalVarlinkIdl.g:672:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalVarlinkIdl.g:673:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalVarlinkIdl.g:679:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_result_4_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:685:2: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) ) )
            // InternalVarlinkIdl.g:686:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) )
            {
            // InternalVarlinkIdl.g:686:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) )
            // InternalVarlinkIdl.g:687:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:691:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:692:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:692:4: (lv_name_1_0= RULE_ID )
            // InternalVarlinkIdl.g:693:5: lv_name_1_0= RULE_ID
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

            // InternalVarlinkIdl.g:709:3: ( (lv_arguments_2_0= ruleObject ) )
            // InternalVarlinkIdl.g:710:4: (lv_arguments_2_0= ruleObject )
            {
            // InternalVarlinkIdl.g:710:4: (lv_arguments_2_0= ruleObject )
            // InternalVarlinkIdl.g:711:5: lv_arguments_2_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getArgumentsObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_arguments_2_0=ruleObject();

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
              						"de.dentrassi.varlink.idl.VarlinkIdl.Object");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalVarlinkIdl.g:732:3: ( (lv_result_4_0= ruleObject ) )
            // InternalVarlinkIdl.g:733:4: (lv_result_4_0= ruleObject )
            {
            // InternalVarlinkIdl.g:733:4: (lv_result_4_0= ruleObject )
            // InternalVarlinkIdl.g:734:5: lv_result_4_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getResultObjectParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_result_4_0=ruleObject();

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleError"
    // InternalVarlinkIdl.g:755:1: entryRuleError returns [EObject current=null] : iv_ruleError= ruleError EOF ;
    public final EObject entryRuleError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleError = null;


        try {
            // InternalVarlinkIdl.g:755:46: (iv_ruleError= ruleError EOF )
            // InternalVarlinkIdl.g:756:2: iv_ruleError= ruleError EOF
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
    // InternalVarlinkIdl.g:762:1: ruleError returns [EObject current=null] : (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) ) ;
    public final EObject ruleError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:768:2: ( (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) ) )
            // InternalVarlinkIdl.g:769:2: (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) )
            {
            // InternalVarlinkIdl.g:769:2: (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) )
            // InternalVarlinkIdl.g:770:3: otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getErrorAccess().getErrorKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:774:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:775:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:775:4: (lv_name_1_0= RULE_ID )
            // InternalVarlinkIdl.g:776:5: lv_name_1_0= RULE_ID
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

            // InternalVarlinkIdl.g:792:3: ( (lv_properties_2_0= ruleObject ) )
            // InternalVarlinkIdl.g:793:4: (lv_properties_2_0= ruleObject )
            {
            // InternalVarlinkIdl.g:793:4: (lv_properties_2_0= ruleObject )
            // InternalVarlinkIdl.g:794:5: lv_properties_2_0= ruleObject
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
    // InternalVarlinkIdl.g:815:1: entryRuleInterfaceName returns [String current=null] : iv_ruleInterfaceName= ruleInterfaceName EOF ;
    public final String entryRuleInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceName = null;


        try {
            // InternalVarlinkIdl.g:815:53: (iv_ruleInterfaceName= ruleInterfaceName EOF )
            // InternalVarlinkIdl.g:816:2: iv_ruleInterfaceName= ruleInterfaceName EOF
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
    // InternalVarlinkIdl.g:822:1: ruleInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:828:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalVarlinkIdl.g:829:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalVarlinkIdl.g:829:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalVarlinkIdl.g:830:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalVarlinkIdl.g:837:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) && (synpred1_InternalVarlinkIdl())) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVarlinkIdl.g:838:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalVarlinkIdl.g:838:4: ( ( '.' )=>kw= '.' )
            	    // InternalVarlinkIdl.g:839:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalVarlinkIdl.g:858:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalVarlinkIdl.g:858:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalVarlinkIdl.g:859:2: iv_ruleValidID= ruleValidID EOF
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
    // InternalVarlinkIdl.g:865:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:871:2: ( (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalVarlinkIdl.g:872:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalVarlinkIdl.g:872:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=8 && LA11_0<=9)||LA11_0==15||(LA11_0>=17 && LA11_0<=21)||LA11_0==23||LA11_0==25) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalVarlinkIdl.g:873:3: this_ID_0= RULE_ID
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
                    // InternalVarlinkIdl.g:881:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalVarlinkIdl.g:895:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalVarlinkIdl.g:895:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalVarlinkIdl.g:896:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalVarlinkIdl.g:902:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'float' | kw= 'string' | kw= 'data' | kw= 'object' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:908:2: ( (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'float' | kw= 'string' | kw= 'data' | kw= 'object' ) )
            // InternalVarlinkIdl.g:909:2: (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'float' | kw= 'string' | kw= 'data' | kw= 'object' )
            {
            // InternalVarlinkIdl.g:909:2: (kw= 'type' | kw= 'enum' | kw= 'interface' | kw= 'method' | kw= 'error' | kw= 'bool' | kw= 'float' | kw= 'string' | kw= 'data' | kw= 'object' )
            int alt12=10;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 8:
                {
                alt12=3;
                }
                break;
            case 21:
                {
                alt12=4;
                }
                break;
            case 23:
                {
                alt12=5;
                }
                break;
            case 15:
                {
                alt12=6;
                }
                break;
            case 17:
                {
                alt12=7;
                }
                break;
            case 18:
                {
                alt12=8;
                }
                break;
            case 19:
                {
                alt12=9;
                }
                break;
            case 20:
                {
                alt12=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalVarlinkIdl.g:910:3: kw= 'type'
                    {
                    kw=(Token)match(input,9,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:916:3: kw= 'enum'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVarlinkIdl.g:922:3: kw= 'interface'
                    {
                    kw=(Token)match(input,8,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInterfaceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVarlinkIdl.g:928:3: kw= 'method'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMethodKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVarlinkIdl.g:934:3: kw= 'error'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getErrorKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVarlinkIdl.g:940:3: kw= 'bool'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBoolKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVarlinkIdl.g:946:3: kw= 'float'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVarlinkIdl.g:952:3: kw= 'string'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalVarlinkIdl.g:958:3: kw= 'data'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDataKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalVarlinkIdl.g:964:3: kw= 'object'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getObjectKeyword_9());
                      		
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
        // InternalVarlinkIdl.g:839:5: ( '.' )
        // InternalVarlinkIdl.g:839:6: '.'
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
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\12\1\4\13\13\2\uffff";
    static final String dfa_3s = "\1\12\1\31\13\15\2\uffff";
    static final String dfa_4s = "\15\uffff\1\2\1\1";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\3\uffff\1\5\1\3\1\uffff\2\15\2\uffff\1\10\1\uffff\1\11\1\12\1\13\1\14\1\6\1\uffff\1\7\1\uffff\1\4",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
            "\2\16\1\15",
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
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\4\2\uffff\1\4\13\13\2\uffff";
    static final String dfa_9s = "\1\24\2\uffff\1\31\13\15\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\14\uffff\1\4\1\3";
    static final String dfa_11s = "\21\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\5\uffff\1\3\4\uffff\6\1",
            "",
            "",
            "\1\4\3\uffff\1\7\1\5\1\uffff\2\17\2\uffff\1\12\1\uffff\1\13\1\14\1\15\1\16\1\10\1\uffff\1\11\1\uffff\1\6",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
            "\2\20\1\17",
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
            return "499:3: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum | this_Object_3= ruleObject )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000A00202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002BE8310L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002BE9B10L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F8410L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});

}