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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'type'", "'('", "','", "')'", "':'", "'[]'", "'bool'", "'int'", "'float'", "'string'", "'data'", "'object'", "'method'", "'->'", "'error'", "'.'"
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
    // InternalVarlinkIdl.g:184:1: ruleTypeAlias returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) ) ;
    public final EObject ruleTypeAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:190:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) ) )
            // InternalVarlinkIdl.g:191:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) )
            {
            // InternalVarlinkIdl.g:191:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) ) )
            // InternalVarlinkIdl.g:192:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleTypeAliasDefinition ) )
            {
            otherlv_0=(Token)match(input,9,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeAliasAccess().getTypeKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:197:4: (lv_name_1_0= RULE_ID )
            // InternalVarlinkIdl.g:198:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeAliasRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ID");
              				
            }

            }


            }

            // InternalVarlinkIdl.g:214:3: ( (lv_definition_2_0= ruleTypeAliasDefinition ) )
            // InternalVarlinkIdl.g:215:4: (lv_definition_2_0= ruleTypeAliasDefinition )
            {
            // InternalVarlinkIdl.g:215:4: (lv_definition_2_0= ruleTypeAliasDefinition )
            // InternalVarlinkIdl.g:216:5: lv_definition_2_0= ruleTypeAliasDefinition
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
    // InternalVarlinkIdl.g:237:1: entryRuleTypeAliasDefinition returns [EObject current=null] : iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF ;
    public final EObject entryRuleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAliasDefinition = null;


        try {
            // InternalVarlinkIdl.g:237:60: (iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF )
            // InternalVarlinkIdl.g:238:2: iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF
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
    // InternalVarlinkIdl.g:244:1: ruleTypeAliasDefinition returns [EObject current=null] : (this_Enum_0= ruleEnum | this_Object_1= ruleObject ) ;
    public final EObject ruleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_Object_1 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:250:2: ( (this_Enum_0= ruleEnum | this_Object_1= ruleObject ) )
            // InternalVarlinkIdl.g:251:2: (this_Enum_0= ruleEnum | this_Object_1= ruleObject )
            {
            // InternalVarlinkIdl.g:251:2: (this_Enum_0= ruleEnum | this_Object_1= ruleObject )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( ((LA3_2>=11 && LA3_2<=12)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==13) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_1>=11 && LA3_1<=12)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVarlinkIdl.g:252:3: this_Enum_0= ruleEnum
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
                    // InternalVarlinkIdl.g:261:3: this_Object_1= ruleObject
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
    // InternalVarlinkIdl.g:273:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalVarlinkIdl.g:273:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalVarlinkIdl.g:274:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalVarlinkIdl.g:280:1: ruleEnum returns [EObject current=null] : (otherlv_0= '(' ( (lv_fields_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_ID ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fields_1_0=null;
        Token otherlv_2=null;
        Token lv_fields_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:286:2: ( (otherlv_0= '(' ( (lv_fields_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_ID ) ) )* otherlv_4= ')' ) )
            // InternalVarlinkIdl.g:287:2: (otherlv_0= '(' ( (lv_fields_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_ID ) ) )* otherlv_4= ')' )
            {
            // InternalVarlinkIdl.g:287:2: (otherlv_0= '(' ( (lv_fields_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_ID ) ) )* otherlv_4= ')' )
            // InternalVarlinkIdl.g:288:3: otherlv_0= '(' ( (lv_fields_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_fields_3_0= RULE_ID ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,10,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:292:3: ( (lv_fields_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:293:4: (lv_fields_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:293:4: (lv_fields_1_0= RULE_ID )
            // InternalVarlinkIdl.g:294:5: lv_fields_1_0= RULE_ID
            {
            lv_fields_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fields_1_0, grammarAccess.getEnumAccess().getFieldsIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumRule());
              					}
              					addWithLastConsumed(
              						current,
              						"fields",
              						lv_fields_1_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ID");
              				
            }

            }


            }

            // InternalVarlinkIdl.g:310:3: (otherlv_2= ',' ( (lv_fields_3_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVarlinkIdl.g:311:4: otherlv_2= ',' ( (lv_fields_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalVarlinkIdl.g:315:4: ( (lv_fields_3_0= RULE_ID ) )
            	    // InternalVarlinkIdl.g:316:5: (lv_fields_3_0= RULE_ID )
            	    {
            	    // InternalVarlinkIdl.g:316:5: (lv_fields_3_0= RULE_ID )
            	    // InternalVarlinkIdl.g:317:6: lv_fields_3_0= RULE_ID
            	    {
            	    lv_fields_3_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_fields_3_0, grammarAccess.getEnumAccess().getFieldsIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getEnumRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"fields",
            	      							lv_fields_3_0,
            	      							"de.dentrassi.varlink.idl.VarlinkIdl.ID");
            	      					
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
    // InternalVarlinkIdl.g:342:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalVarlinkIdl.g:342:47: (iv_ruleObject= ruleObject EOF )
            // InternalVarlinkIdl.g:343:2: iv_ruleObject= ruleObject EOF
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
    // InternalVarlinkIdl.g:349:1: ruleObject returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:355:2: ( ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' ) )
            // InternalVarlinkIdl.g:356:2: ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' )
            {
            // InternalVarlinkIdl.g:356:2: ( () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')' )
            // InternalVarlinkIdl.g:357:3: () otherlv_1= '(' ( (lv_fields_2_0= ruleField ) )? (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* otherlv_5= ')'
            {
            // InternalVarlinkIdl.g:357:3: ()
            // InternalVarlinkIdl.g:358:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectAccess().getObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,10,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalVarlinkIdl.g:368:3: ( (lv_fields_2_0= ruleField ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVarlinkIdl.g:369:4: (lv_fields_2_0= ruleField )
                    {
                    // InternalVarlinkIdl.g:369:4: (lv_fields_2_0= ruleField )
                    // InternalVarlinkIdl.g:370:5: lv_fields_2_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
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

            // InternalVarlinkIdl.g:387:3: (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVarlinkIdl.g:388:4: otherlv_3= ',' ( (lv_fields_4_0= ruleField ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalVarlinkIdl.g:392:4: ( (lv_fields_4_0= ruleField ) )
            	    // InternalVarlinkIdl.g:393:5: (lv_fields_4_0= ruleField )
            	    {
            	    // InternalVarlinkIdl.g:393:5: (lv_fields_4_0= ruleField )
            	    // InternalVarlinkIdl.g:394:6: lv_fields_4_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
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
    // InternalVarlinkIdl.g:420:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalVarlinkIdl.g:420:46: (iv_ruleField= ruleField EOF )
            // InternalVarlinkIdl.g:421:2: iv_ruleField= ruleField EOF
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
    // InternalVarlinkIdl.g:427:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:433:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) ) )
            // InternalVarlinkIdl.g:434:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) )
            {
            // InternalVarlinkIdl.g:434:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) ) )
            // InternalVarlinkIdl.g:435:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleElementType ) )
            {
            // InternalVarlinkIdl.g:435:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVarlinkIdl.g:436:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:436:4: (lv_name_0_0= RULE_ID )
            // InternalVarlinkIdl.g:437:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.dentrassi.varlink.idl.VarlinkIdl.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
              		
            }
            // InternalVarlinkIdl.g:457:3: ( (lv_type_2_0= ruleElementType ) )
            // InternalVarlinkIdl.g:458:4: (lv_type_2_0= ruleElementType )
            {
            // InternalVarlinkIdl.g:458:4: (lv_type_2_0= ruleElementType )
            // InternalVarlinkIdl.g:459:5: lv_type_2_0= ruleElementType
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
    // InternalVarlinkIdl.g:480:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalVarlinkIdl.g:480:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalVarlinkIdl.g:481:2: iv_ruleElementType= ruleElementType EOF
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
    // InternalVarlinkIdl.g:487:1: ruleElementType returns [EObject current=null] : ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum ) ( (lv_multi_3_0= '[]' ) )? ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        Token lv_multi_3_0=null;
        EObject this_BasicType_0 = null;

        EObject this_TypeReference_1 = null;

        EObject this_Enum_2 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:493:2: ( ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum ) ( (lv_multi_3_0= '[]' ) )? ) )
            // InternalVarlinkIdl.g:494:2: ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum ) ( (lv_multi_3_0= '[]' ) )? )
            {
            // InternalVarlinkIdl.g:494:2: ( (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum ) ( (lv_multi_3_0= '[]' ) )? )
            // InternalVarlinkIdl.g:495:3: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum ) ( (lv_multi_3_0= '[]' ) )?
            {
            // InternalVarlinkIdl.g:495:3: (this_BasicType_0= ruleBasicType | this_TypeReference_1= ruleTypeReference | this_Enum_2= ruleEnum )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 10:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVarlinkIdl.g:496:4: this_BasicType_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_10);
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
                    // InternalVarlinkIdl.g:505:4: this_TypeReference_1= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
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
                    // InternalVarlinkIdl.g:514:4: this_Enum_2= ruleEnum
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_Enum_2=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Enum_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalVarlinkIdl.g:523:3: ( (lv_multi_3_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVarlinkIdl.g:524:4: (lv_multi_3_0= '[]' )
                    {
                    // InternalVarlinkIdl.g:524:4: (lv_multi_3_0= '[]' )
                    // InternalVarlinkIdl.g:525:5: lv_multi_3_0= '[]'
                    {
                    lv_multi_3_0=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_multi_3_0, grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0());
                      				
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
    // InternalVarlinkIdl.g:541:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalVarlinkIdl.g:541:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalVarlinkIdl.g:542:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalVarlinkIdl.g:548:1: ruleTypeReference returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:554:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVarlinkIdl.g:555:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVarlinkIdl.g:555:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVarlinkIdl.g:556:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:556:3: (lv_name_0_0= RULE_ID )
            // InternalVarlinkIdl.g:557:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getTypeReferenceAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTypeReferenceRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"de.dentrassi.varlink.idl.VarlinkIdl.ID");
              			
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
    // InternalVarlinkIdl.g:576:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalVarlinkIdl.g:576:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalVarlinkIdl.g:577:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalVarlinkIdl.g:583:1: ruleBasicType returns [EObject current=null] : ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) ) ;
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
            // InternalVarlinkIdl.g:589:2: ( ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) ) )
            // InternalVarlinkIdl.g:590:2: ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) )
            {
            // InternalVarlinkIdl.g:590:2: ( ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) ) )
            // InternalVarlinkIdl.g:591:3: ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) )
            {
            // InternalVarlinkIdl.g:591:3: ( (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' ) )
            // InternalVarlinkIdl.g:592:4: (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' )
            {
            // InternalVarlinkIdl.g:592:4: (lv_type_0_1= 'bool' | lv_type_0_2= 'int' | lv_type_0_3= 'float' | lv_type_0_4= 'string' | lv_type_0_5= 'data' | lv_type_0_6= 'object' )
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
                    // InternalVarlinkIdl.g:593:5: lv_type_0_1= 'bool'
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
                    // InternalVarlinkIdl.g:604:5: lv_type_0_2= 'int'
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
                    // InternalVarlinkIdl.g:615:5: lv_type_0_3= 'float'
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
                    // InternalVarlinkIdl.g:626:5: lv_type_0_4= 'string'
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
                    // InternalVarlinkIdl.g:637:5: lv_type_0_5= 'data'
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
                    // InternalVarlinkIdl.g:648:5: lv_type_0_6= 'object'
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
    // InternalVarlinkIdl.g:664:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalVarlinkIdl.g:664:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalVarlinkIdl.g:665:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalVarlinkIdl.g:671:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_result_4_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:677:2: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) ) )
            // InternalVarlinkIdl.g:678:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) )
            {
            // InternalVarlinkIdl.g:678:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) ) )
            // InternalVarlinkIdl.g:679:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) ( (lv_arguments_2_0= ruleObject ) ) otherlv_3= '->' ( (lv_result_4_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:683:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:684:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:684:4: (lv_name_1_0= RULE_ID )
            // InternalVarlinkIdl.g:685:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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

            // InternalVarlinkIdl.g:701:3: ( (lv_arguments_2_0= ruleObject ) )
            // InternalVarlinkIdl.g:702:4: (lv_arguments_2_0= ruleObject )
            {
            // InternalVarlinkIdl.g:702:4: (lv_arguments_2_0= ruleObject )
            // InternalVarlinkIdl.g:703:5: lv_arguments_2_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getArgumentsObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalVarlinkIdl.g:724:3: ( (lv_result_4_0= ruleObject ) )
            // InternalVarlinkIdl.g:725:4: (lv_result_4_0= ruleObject )
            {
            // InternalVarlinkIdl.g:725:4: (lv_result_4_0= ruleObject )
            // InternalVarlinkIdl.g:726:5: lv_result_4_0= ruleObject
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
    // InternalVarlinkIdl.g:747:1: entryRuleError returns [EObject current=null] : iv_ruleError= ruleError EOF ;
    public final EObject entryRuleError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleError = null;


        try {
            // InternalVarlinkIdl.g:747:46: (iv_ruleError= ruleError EOF )
            // InternalVarlinkIdl.g:748:2: iv_ruleError= ruleError EOF
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
    // InternalVarlinkIdl.g:754:1: ruleError returns [EObject current=null] : (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) ) ;
    public final EObject ruleError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalVarlinkIdl.g:760:2: ( (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) ) )
            // InternalVarlinkIdl.g:761:2: (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) )
            {
            // InternalVarlinkIdl.g:761:2: (otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) ) )
            // InternalVarlinkIdl.g:762:3: otherlv_0= 'error' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleObject ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getErrorAccess().getErrorKeyword_0());
              		
            }
            // InternalVarlinkIdl.g:766:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarlinkIdl.g:767:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarlinkIdl.g:767:4: (lv_name_1_0= RULE_ID )
            // InternalVarlinkIdl.g:768:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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

            // InternalVarlinkIdl.g:784:3: ( (lv_properties_2_0= ruleObject ) )
            // InternalVarlinkIdl.g:785:4: (lv_properties_2_0= ruleObject )
            {
            // InternalVarlinkIdl.g:785:4: (lv_properties_2_0= ruleObject )
            // InternalVarlinkIdl.g:786:5: lv_properties_2_0= ruleObject
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
    // InternalVarlinkIdl.g:807:1: entryRuleInterfaceName returns [String current=null] : iv_ruleInterfaceName= ruleInterfaceName EOF ;
    public final String entryRuleInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceName = null;


        try {
            // InternalVarlinkIdl.g:807:53: (iv_ruleInterfaceName= ruleInterfaceName EOF )
            // InternalVarlinkIdl.g:808:2: iv_ruleInterfaceName= ruleInterfaceName EOF
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
    // InternalVarlinkIdl.g:814:1: ruleInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalVarlinkIdl.g:820:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalVarlinkIdl.g:821:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalVarlinkIdl.g:821:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalVarlinkIdl.g:822:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalVarlinkIdl.g:829:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) && (synpred1_InternalVarlinkIdl())) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVarlinkIdl.g:830:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalVarlinkIdl.g:830:4: ( ( '.' )=>kw= '.' )
            	    // InternalVarlinkIdl.g:831:5: ( '.' )=>kw= '.'
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

    // $ANTLR start synpred1_InternalVarlinkIdl
    public final void synpred1_InternalVarlinkIdl_fragment() throws RecognitionException {   
        // InternalVarlinkIdl.g:831:5: ( '.' )
        // InternalVarlinkIdl.g:831:6: '.'
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000A00202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001F8410L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});

}