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
grammar InternalVarlinkIdl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.dentrassi.varlink.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleInterface
entryRuleInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInterfaceRule()); }
	iv_ruleInterface=ruleInterface
	{ $current=$iv_ruleInterface.current; }
	EOF;

// Rule Interface
ruleInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='interface'
		{
			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceAccess().getNameInterfaceNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleInterfaceName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.InterfaceName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_0());
				}
				lv_members_2_0=ruleMember
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceRule());
					}
					add(
						$current,
						"members",
						lv_members_2_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.Member");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	iv_ruleMember=ruleMember
	{ $current=$iv_ruleMember.current; }
	EOF;

// Rule Member
ruleMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMemberAccess().getTypeAliasParserRuleCall_0());
		}
		this_TypeAlias_0=ruleTypeAlias
		{
			$current = $this_TypeAlias_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
		}
		this_Method_1=ruleMethod
		{
			$current = $this_Method_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMemberAccess().getErrorParserRuleCall_2());
		}
		this_Error_2=ruleError
		{
			$current = $this_Error_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypeAlias
entryRuleTypeAlias returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeAliasRule()); }
	iv_ruleTypeAlias=ruleTypeAlias
	{ $current=$iv_ruleTypeAlias.current; }
	EOF;

// Rule TypeAlias
ruleTypeAlias returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getTypeAliasAccess().getTypeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAliasAccess().getNameValidIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleValidID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeAliasRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAliasAccess().getDefinitionTypeAliasDefinitionParserRuleCall_2_0());
				}
				lv_definition_2_0=ruleTypeAliasDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeAliasRule());
					}
					set(
						$current,
						"definition",
						lv_definition_2_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.TypeAliasDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTypeAliasDefinition
entryRuleTypeAliasDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeAliasDefinitionRule()); }
	iv_ruleTypeAliasDefinition=ruleTypeAliasDefinition
	{ $current=$iv_ruleTypeAliasDefinition.current; }
	EOF;

// Rule TypeAliasDefinition
ruleTypeAliasDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getEnumParserRuleCall_0());
		}
		this_Enum_0=ruleEnum
		{
			$current = $this_Enum_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getObjectParserRuleCall_1());
		}
		this_Object_1=ruleObject
		{
			$current = $this_Object_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEnum
entryRuleEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumRule()); }
	iv_ruleEnum=ruleEnum
	{ $current=$iv_ruleEnum.current; }
	EOF;

// Rule Enum
ruleEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_1_0());
				}
				lv_fields_1_0=ruleValidID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumRule());
					}
					add(
						$current,
						"fields",
						lv_fields_1_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_2_1_0());
					}
					lv_fields_3_0=ruleValidID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumRule());
						}
						add(
							$current,
							"fields",
							lv_fields_3_0,
							"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	iv_ruleObject=ruleObject
	{ $current=$iv_ruleObject.current; }
	EOF;

// Rule Object
ruleObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getObjectAccess().getObjectAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0());
				}
				lv_fields_2_0=ruleField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectRule());
					}
					add(
						$current,
						"fields",
						lv_fields_2_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.Field");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_3_1_0());
					}
					lv_fields_4_0=ruleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getObjectRule());
						}
						add(
							$current,
							"fields",
							lv_fields_4_0,
							"de.dentrassi.varlink.idl.VarlinkIdl.Field");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_0_0());
				}
				lv_name_0_0=ruleValidID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getTypeElementTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleElementType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.ElementType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_multi_3_0='[]'
				{
					newLeafNode(lv_multi_3_0, grammarAccess.getFieldAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldRule());
					}
					setWithLastConsumed($current, "multi", true, "[]");
				}
			)
		)?
	)
;

// Entry rule entryRuleElementType
entryRuleElementType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementTypeRule()); }
	iv_ruleElementType=ruleElementType
	{ $current=$iv_ruleElementType.current; }
	EOF;

// Rule ElementType
ruleElementType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0());
		}
		this_BasicType_0=ruleBasicType
		{
			$current = $this_BasicType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_1());
		}
		this_TypeReference_1=ruleTypeReference
		{
			$current = $this_TypeReference_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_2());
		}
		this_Enum_2=ruleEnum
		{
			$current = $this_Enum_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementTypeAccess().getObjectParserRuleCall_3());
		}
		this_Object_3=ruleObject
		{
			$current = $this_Object_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypeReference
entryRuleTypeReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeReferenceRule()); }
	iv_ruleTypeReference=ruleTypeReference
	{ $current=$iv_ruleTypeReference.current; }
	EOF;

// Rule TypeReference
ruleTypeReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getNameTypeAliasCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleBasicType
entryRuleBasicType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); }
	iv_ruleBasicType=ruleBasicType
	{ $current=$iv_ruleBasicType.current; }
	EOF;

// Rule BasicType
ruleBasicType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_1='bool'
				{
					newLeafNode(lv_type_0_1, grammarAccess.getBasicTypeAccess().getTypeBoolKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_1, null);
				}
				    |
				lv_type_0_2='int'
				{
					newLeafNode(lv_type_0_2, grammarAccess.getBasicTypeAccess().getTypeIntKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_2, null);
				}
				    |
				lv_type_0_3='float'
				{
					newLeafNode(lv_type_0_3, grammarAccess.getBasicTypeAccess().getTypeFloatKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_3, null);
				}
				    |
				lv_type_0_4='string'
				{
					newLeafNode(lv_type_0_4, grammarAccess.getBasicTypeAccess().getTypeStringKeyword_0_3());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasicTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_4, null);
				}
			)
		)
	)
;

// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	iv_ruleMethod=ruleMethod
	{ $current=$iv_ruleMethod.current; }
	EOF;

// Rule Method
ruleMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='method'
		{
			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getArgumentsObjectParserRuleCall_2_0());
				}
				lv_arguments_2_0=ruleObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"arguments",
						lv_arguments_2_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.Object");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getResultObjectParserRuleCall_4_0());
				}
				lv_result_4_0=ruleObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"result",
						lv_result_4_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.Object");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleError
entryRuleError returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getErrorRule()); }
	iv_ruleError=ruleError
	{ $current=$iv_ruleError.current; }
	EOF;

// Rule Error
ruleError returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='error'
		{
			newLeafNode(otherlv_0, grammarAccess.getErrorAccess().getErrorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getErrorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getErrorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getErrorAccess().getPropertiesObjectParserRuleCall_2_0());
				}
				lv_properties_2_0=ruleObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getErrorRule());
					}
					set(
						$current,
						"properties",
						lv_properties_2_0,
						"de.dentrassi.varlink.idl.VarlinkIdl.Object");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInterfaceName
entryRuleInterfaceName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInterfaceNameRule()); }
	iv_ruleInterfaceName=ruleInterfaceName
	{ $current=$iv_ruleInterfaceName.current.getText(); }
	EOF;

// Rule InterfaceName
ruleInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0());
		}
		(
			(
				('.')=>
				kw='.'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0());
				}
			)
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleValidID
entryRuleValidID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValidIDRule()); }
	iv_ruleValidID=ruleValidID
	{ $current=$iv_ruleValidID.current.getText(); }
	EOF;

// Rule ValidID
ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1());
		}
		this_KEYWORD_1=ruleKEYWORD
		{
			$current.merge(this_KEYWORD_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleKEYWORD
entryRuleKEYWORD returns [String current=null]:
	{ newCompositeNode(grammarAccess.getKEYWORDRule()); }
	iv_ruleKEYWORD=ruleKEYWORD
	{ $current=$iv_ruleKEYWORD.current.getText(); }
	EOF;

// Rule KEYWORD
ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='type'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_0());
		}
		    |
		kw='enum'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumKeyword_1());
		}
		    |
		kw='interface'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInterfaceKeyword_2());
		}
		    |
		kw='method'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMethodKeyword_3());
		}
		    |
		kw='error'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getErrorKeyword_4());
		}
		    |
		kw='bool'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBoolKeyword_5());
		}
		    |
		kw='int'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntKeyword_6());
		}
		    |
		kw='float'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_7());
		}
		    |
		kw='string'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringKeyword_8());
		}
		    |
		kw='data'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDataKeyword_9());
		}
		    |
		kw='object'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getObjectKeyword_10());
		}
	)
;

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
