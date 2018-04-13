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
package de.dentrassi.varlink.idl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class VarlinkIdlGrammarAccess extends AbstractGrammarElementFinder {
	
	public class InterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Interface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameInterfaceNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cMembersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMembersMemberParserRuleCall_2_0 = (RuleCall)cMembersAssignment_2.eContents().get(0);
		
		//Interface:
		//	'interface' name=InterfaceName
		//	members+=Member*;
		@Override public ParserRule getRule() { return rule; }
		
		//'interface' name=InterfaceName members+=Member*
		public Group getGroup() { return cGroup; }
		
		//'interface'
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }
		
		//name=InterfaceName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//InterfaceName
		public RuleCall getNameInterfaceNameParserRuleCall_1_0() { return cNameInterfaceNameParserRuleCall_1_0; }
		
		//members+=Member*
		public Assignment getMembersAssignment_2() { return cMembersAssignment_2; }
		
		//Member
		public RuleCall getMembersMemberParserRuleCall_2_0() { return cMembersMemberParserRuleCall_2_0; }
	}
	public class MemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Member");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypeAliasParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMethodParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cErrorParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Member:
		//	TypeAlias | Method | Error;
		@Override public ParserRule getRule() { return rule; }
		
		//TypeAlias | Method | Error
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TypeAlias
		public RuleCall getTypeAliasParserRuleCall_0() { return cTypeAliasParserRuleCall_0; }
		
		//Method
		public RuleCall getMethodParserRuleCall_1() { return cMethodParserRuleCall_1; }
		
		//Error
		public RuleCall getErrorParserRuleCall_2() { return cErrorParserRuleCall_2; }
	}
	public class TypeAliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.TypeAlias");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDefinitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDefinitionTypeAliasDefinitionParserRuleCall_2_0 = (RuleCall)cDefinitionAssignment_2.eContents().get(0);
		
		//TypeAlias:
		//	'type' name=ValidID definition=TypeAliasDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ValidID definition=TypeAliasDefinition
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }
		
		//definition=TypeAliasDefinition
		public Assignment getDefinitionAssignment_2() { return cDefinitionAssignment_2; }
		
		//TypeAliasDefinition
		public RuleCall getDefinitionTypeAliasDefinitionParserRuleCall_2_0() { return cDefinitionTypeAliasDefinitionParserRuleCall_2_0; }
	}
	public class TypeAliasDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.TypeAliasDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEnumParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cObjectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TypeAliasDefinition:
		//	Enum | Object;
		@Override public ParserRule getRule() { return rule; }
		
		//Enum | Object
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Enum
		public RuleCall getEnumParserRuleCall_0() { return cEnumParserRuleCall_0; }
		
		//Object
		public RuleCall getObjectParserRuleCall_1() { return cObjectParserRuleCall_1; }
	}
	public class EnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Enum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFieldsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFieldsValidIDParserRuleCall_1_0 = (RuleCall)cFieldsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cFieldsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cFieldsValidIDParserRuleCall_2_1_0 = (RuleCall)cFieldsAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Enum:
		//	"("
		//	fields+=ValidID ("," fields+=ValidID)*
		//	")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" fields+=ValidID ("," fields+=ValidID)* ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//fields+=ValidID
		public Assignment getFieldsAssignment_1() { return cFieldsAssignment_1; }
		
		//ValidID
		public RuleCall getFieldsValidIDParserRuleCall_1_0() { return cFieldsValidIDParserRuleCall_1_0; }
		
		//("," fields+=ValidID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//fields+=ValidID
		public Assignment getFieldsAssignment_2_1() { return cFieldsAssignment_2_1; }
		
		//ValidID
		public RuleCall getFieldsValidIDParserRuleCall_2_1_0() { return cFieldsValidIDParserRuleCall_2_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Object");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldsFieldParserRuleCall_2_0 = (RuleCall)cFieldsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cFieldsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cFieldsFieldParserRuleCall_3_1_0 = (RuleCall)cFieldsAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Object:
		//	{Object}
		//	"("
		//	fields+=Field? ("," fields+=Field)*
		//	")";
		@Override public ParserRule getRule() { return rule; }
		
		//{Object} "(" fields+=Field? ("," fields+=Field)* ")"
		public Group getGroup() { return cGroup; }
		
		//{Object}
		public Action getObjectAction_0() { return cObjectAction_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//fields+=Field?
		public Assignment getFieldsAssignment_2() { return cFieldsAssignment_2; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_2_0() { return cFieldsFieldParserRuleCall_2_0; }
		
		//("," fields+=Field)*
		public Group getGroup_3() { return cGroup_3; }
		
		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//fields+=Field
		public Assignment getFieldsAssignment_3_1() { return cFieldsAssignment_3_1; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_3_1_0() { return cFieldsFieldParserRuleCall_3_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameValidIDParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeElementTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Field:
		//	name=ValidID ":" type=ElementType;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ValidID ":" type=ElementType
		public Group getGroup() { return cGroup; }
		
		//name=ValidID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_0_0() { return cNameValidIDParserRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=ElementType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//ElementType
		public RuleCall getTypeElementTypeParserRuleCall_2_0() { return cTypeElementTypeParserRuleCall_2_0; }
	}
	public class ElementTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.ElementType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBasicTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cObjectParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cArrayParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDictionaryParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cOptionalParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//ElementType:
		//	BasicType | TypeReference | Enum | Object | Array | Dictionary | Optional;
		@Override public ParserRule getRule() { return rule; }
		
		//BasicType | TypeReference | Enum | Object | Array | Dictionary | Optional
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BasicType
		public RuleCall getBasicTypeParserRuleCall_0() { return cBasicTypeParserRuleCall_0; }
		
		//TypeReference
		public RuleCall getTypeReferenceParserRuleCall_1() { return cTypeReferenceParserRuleCall_1; }
		
		//Enum
		public RuleCall getEnumParserRuleCall_2() { return cEnumParserRuleCall_2; }
		
		//Object
		public RuleCall getObjectParserRuleCall_3() { return cObjectParserRuleCall_3; }
		
		//Array
		public RuleCall getArrayParserRuleCall_4() { return cArrayParserRuleCall_4; }
		
		//Dictionary
		public RuleCall getDictionaryParserRuleCall_5() { return cDictionaryParserRuleCall_5; }
		
		//Optional
		public RuleCall getOptionalParserRuleCall_6() { return cOptionalParserRuleCall_6; }
	}
	public class ArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Array");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketRightSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeElementTypeParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Array:
		//	"[]" type=ElementType;
		@Override public ParserRule getRule() { return rule; }
		
		//"[]" type=ElementType
		public Group getGroup() { return cGroup; }
		
		//"[]"
		public Keyword getLeftSquareBracketRightSquareBracketKeyword_0() { return cLeftSquareBracketRightSquareBracketKeyword_0; }
		
		//type=ElementType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//ElementType
		public RuleCall getTypeElementTypeParserRuleCall_1_0() { return cTypeElementTypeParserRuleCall_1_0; }
	}
	public class DictionaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Dictionary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeElementTypeParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Dictionary:
		//	"[string]" type=ElementType;
		@Override public ParserRule getRule() { return rule; }
		
		//"[string]" type=ElementType
		public Group getGroup() { return cGroup; }
		
		//"[string]"
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//type=ElementType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//ElementType
		public RuleCall getTypeElementTypeParserRuleCall_1_0() { return cTypeElementTypeParserRuleCall_1_0; }
	}
	public class OptionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Optional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeElementTypeParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Optional:
		//	"?" type=ElementType;
		@Override public ParserRule getRule() { return rule; }
		
		//"?" type=ElementType
		public Group getGroup() { return cGroup; }
		
		//"?"
		public Keyword getQuestionMarkKeyword_0() { return cQuestionMarkKeyword_0; }
		
		//type=ElementType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//ElementType
		public RuleCall getTypeElementTypeParserRuleCall_1_0() { return cTypeElementTypeParserRuleCall_1_0; }
	}
	public class TypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.TypeReference");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cNameTypeAliasCrossReference_0 = (CrossReference)cNameAssignment.eContents().get(0);
		private final RuleCall cNameTypeAliasIDTerminalRuleCall_0_1 = (RuleCall)cNameTypeAliasCrossReference_0.eContents().get(1);
		
		//TypeReference:
		//	name=[TypeAlias];
		@Override public ParserRule getRule() { return rule; }
		
		//name=[TypeAlias]
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//[TypeAlias]
		public CrossReference getNameTypeAliasCrossReference_0() { return cNameTypeAliasCrossReference_0; }
		
		//ID
		public RuleCall getNameTypeAliasIDTerminalRuleCall_0_1() { return cNameTypeAliasIDTerminalRuleCall_0_1; }
	}
	public class BasicTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.BasicType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeAlternatives_0 = (Alternatives)cTypeAssignment.eContents().get(0);
		private final Keyword cTypeBoolKeyword_0_0 = (Keyword)cTypeAlternatives_0.eContents().get(0);
		private final Keyword cTypeIntKeyword_0_1 = (Keyword)cTypeAlternatives_0.eContents().get(1);
		private final Keyword cTypeFloatKeyword_0_2 = (Keyword)cTypeAlternatives_0.eContents().get(2);
		private final Keyword cTypeStringKeyword_0_3 = (Keyword)cTypeAlternatives_0.eContents().get(3);
		
		//BasicType:
		//	type=("bool" | "int" | "float" | "string");
		@Override public ParserRule getRule() { return rule; }
		
		//type=("bool" | "int" | "float" | "string")
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//("bool" | "int" | "float" | "string")
		public Alternatives getTypeAlternatives_0() { return cTypeAlternatives_0; }
		
		//"bool"
		public Keyword getTypeBoolKeyword_0_0() { return cTypeBoolKeyword_0_0; }
		
		//"int"
		public Keyword getTypeIntKeyword_0_1() { return cTypeIntKeyword_0_1; }
		
		//"float"
		public Keyword getTypeFloatKeyword_0_2() { return cTypeFloatKeyword_0_2; }
		
		//"string"
		public Keyword getTypeStringKeyword_0_3() { return cTypeStringKeyword_0_3; }
	}
	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMethodKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArgumentsArgumentsParserRuleCall_2_0 = (RuleCall)cArgumentsAssignment_2.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cResultAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cResultResultParserRuleCall_4_0 = (RuleCall)cResultAssignment_4.eContents().get(0);
		
		//Method:
		//	'method' name=ID arguments=Arguments "->" result=Result;
		@Override public ParserRule getRule() { return rule; }
		
		//'method' name=ID arguments=Arguments "->" result=Result
		public Group getGroup() { return cGroup; }
		
		//'method'
		public Keyword getMethodKeyword_0() { return cMethodKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//arguments=Arguments
		public Assignment getArgumentsAssignment_2() { return cArgumentsAssignment_2; }
		
		//Arguments
		public RuleCall getArgumentsArgumentsParserRuleCall_2_0() { return cArgumentsArgumentsParserRuleCall_2_0; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//result=Result
		public Assignment getResultAssignment_4() { return cResultAssignment_4; }
		
		//Result
		public RuleCall getResultResultParserRuleCall_4_0() { return cResultResultParserRuleCall_4_0; }
	}
	public class ArgumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Arguments");
		private final Assignment cArgumentsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cArgumentsObjectParserRuleCall_0 = (RuleCall)cArgumentsAssignment.eContents().get(0);
		
		//Arguments:
		//	arguments=Object;
		@Override public ParserRule getRule() { return rule; }
		
		//arguments=Object
		public Assignment getArgumentsAssignment() { return cArgumentsAssignment; }
		
		//Object
		public RuleCall getArgumentsObjectParserRuleCall_0() { return cArgumentsObjectParserRuleCall_0; }
	}
	public class ResultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Result");
		private final Assignment cResultAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cResultObjectParserRuleCall_0 = (RuleCall)cResultAssignment.eContents().get(0);
		
		//Result:
		//	result=Object;
		@Override public ParserRule getRule() { return rule; }
		
		//result=Object
		public Assignment getResultAssignment() { return cResultAssignment; }
		
		//Object
		public RuleCall getResultObjectParserRuleCall_0() { return cResultObjectParserRuleCall_0; }
	}
	public class ErrorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Error");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cErrorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPropertiesObjectParserRuleCall_2_0 = (RuleCall)cPropertiesAssignment_2.eContents().get(0);
		
		//Error:
		//	'error' name=ID properties=Object;
		@Override public ParserRule getRule() { return rule; }
		
		//'error' name=ID properties=Object
		public Group getGroup() { return cGroup; }
		
		//'error'
		public Keyword getErrorKeyword_0() { return cErrorKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//properties=Object
		public Assignment getPropertiesAssignment_2() { return cPropertiesAssignment_2; }
		
		//Object
		public RuleCall getPropertiesObjectParserRuleCall_2_0() { return cPropertiesObjectParserRuleCall_2_0; }
	}
	public class InterfaceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.InterfaceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//InterfaceName:
		//	ID (=> "." ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID (=> "." ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//(=> "." ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//=> "."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class ValidIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.ValidID");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKEYWORDParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// terminals
		//ValidID:
		//	ID | KEYWORD;
		@Override public ParserRule getRule() { return rule; }
		
		//ID | KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//KEYWORD
		public RuleCall getKEYWORDParserRuleCall_1() { return cKEYWORDParserRuleCall_1; }
	}
	public class KEYWORDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.KEYWORD");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cInterfaceKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cMethodKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cErrorKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cBoolKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cIntKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cFloatKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cStringKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		
		//KEYWORD:
		//	'type' | 'enum' | 'interface' | 'method' | 'error' | 'bool' | 'int' | 'float' | 'string';
		@Override public ParserRule getRule() { return rule; }
		
		//'type' | 'enum' | 'interface' | 'method' | 'error' | 'bool' | 'int' | 'float' | 'string'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//'enum'
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }
		
		//'interface'
		public Keyword getInterfaceKeyword_2() { return cInterfaceKeyword_2; }
		
		//'method'
		public Keyword getMethodKeyword_3() { return cMethodKeyword_3; }
		
		//'error'
		public Keyword getErrorKeyword_4() { return cErrorKeyword_4; }
		
		//'bool'
		public Keyword getBoolKeyword_5() { return cBoolKeyword_5; }
		
		//'int'
		public Keyword getIntKeyword_6() { return cIntKeyword_6; }
		
		//'float'
		public Keyword getFloatKeyword_7() { return cFloatKeyword_7; }
		
		//'string'
		public Keyword getStringKeyword_8() { return cStringKeyword_8; }
	}
	
	
	private final InterfaceElements pInterface;
	private final MemberElements pMember;
	private final TypeAliasElements pTypeAlias;
	private final TypeAliasDefinitionElements pTypeAliasDefinition;
	private final EnumElements pEnum;
	private final ObjectElements pObject;
	private final FieldElements pField;
	private final ElementTypeElements pElementType;
	private final ArrayElements pArray;
	private final DictionaryElements pDictionary;
	private final OptionalElements pOptional;
	private final TypeReferenceElements pTypeReference;
	private final BasicTypeElements pBasicType;
	private final MethodElements pMethod;
	private final ArgumentsElements pArguments;
	private final ResultElements pResult;
	private final ErrorElements pError;
	private final InterfaceNameElements pInterfaceName;
	private final ValidIDElements pValidID;
	private final KEYWORDElements pKEYWORD;
	private final TerminalRule tID;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public VarlinkIdlGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pInterface = new InterfaceElements();
		this.pMember = new MemberElements();
		this.pTypeAlias = new TypeAliasElements();
		this.pTypeAliasDefinition = new TypeAliasDefinitionElements();
		this.pEnum = new EnumElements();
		this.pObject = new ObjectElements();
		this.pField = new FieldElements();
		this.pElementType = new ElementTypeElements();
		this.pArray = new ArrayElements();
		this.pDictionary = new DictionaryElements();
		this.pOptional = new OptionalElements();
		this.pTypeReference = new TypeReferenceElements();
		this.pBasicType = new BasicTypeElements();
		this.pMethod = new MethodElements();
		this.pArguments = new ArgumentsElements();
		this.pResult = new ResultElements();
		this.pError = new ErrorElements();
		this.pInterfaceName = new InterfaceNameElements();
		this.pValidID = new ValidIDElements();
		this.pKEYWORD = new KEYWORDElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.ID");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.dentrassi.varlink.idl.VarlinkIdl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Interface:
	//	'interface' name=InterfaceName
	//	members+=Member*;
	public InterfaceElements getInterfaceAccess() {
		return pInterface;
	}
	
	public ParserRule getInterfaceRule() {
		return getInterfaceAccess().getRule();
	}
	
	//Member:
	//	TypeAlias | Method | Error;
	public MemberElements getMemberAccess() {
		return pMember;
	}
	
	public ParserRule getMemberRule() {
		return getMemberAccess().getRule();
	}
	
	//TypeAlias:
	//	'type' name=ValidID definition=TypeAliasDefinition;
	public TypeAliasElements getTypeAliasAccess() {
		return pTypeAlias;
	}
	
	public ParserRule getTypeAliasRule() {
		return getTypeAliasAccess().getRule();
	}
	
	//TypeAliasDefinition:
	//	Enum | Object;
	public TypeAliasDefinitionElements getTypeAliasDefinitionAccess() {
		return pTypeAliasDefinition;
	}
	
	public ParserRule getTypeAliasDefinitionRule() {
		return getTypeAliasDefinitionAccess().getRule();
	}
	
	//Enum:
	//	"("
	//	fields+=ValidID ("," fields+=ValidID)*
	//	")";
	public EnumElements getEnumAccess() {
		return pEnum;
	}
	
	public ParserRule getEnumRule() {
		return getEnumAccess().getRule();
	}
	
	//Object:
	//	{Object}
	//	"("
	//	fields+=Field? ("," fields+=Field)*
	//	")";
	public ObjectElements getObjectAccess() {
		return pObject;
	}
	
	public ParserRule getObjectRule() {
		return getObjectAccess().getRule();
	}
	
	//Field:
	//	name=ValidID ":" type=ElementType;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//ElementType:
	//	BasicType | TypeReference | Enum | Object | Array | Dictionary | Optional;
	public ElementTypeElements getElementTypeAccess() {
		return pElementType;
	}
	
	public ParserRule getElementTypeRule() {
		return getElementTypeAccess().getRule();
	}
	
	//Array:
	//	"[]" type=ElementType;
	public ArrayElements getArrayAccess() {
		return pArray;
	}
	
	public ParserRule getArrayRule() {
		return getArrayAccess().getRule();
	}
	
	//Dictionary:
	//	"[string]" type=ElementType;
	public DictionaryElements getDictionaryAccess() {
		return pDictionary;
	}
	
	public ParserRule getDictionaryRule() {
		return getDictionaryAccess().getRule();
	}
	
	//Optional:
	//	"?" type=ElementType;
	public OptionalElements getOptionalAccess() {
		return pOptional;
	}
	
	public ParserRule getOptionalRule() {
		return getOptionalAccess().getRule();
	}
	
	//TypeReference:
	//	name=[TypeAlias];
	public TypeReferenceElements getTypeReferenceAccess() {
		return pTypeReference;
	}
	
	public ParserRule getTypeReferenceRule() {
		return getTypeReferenceAccess().getRule();
	}
	
	//BasicType:
	//	type=("bool" | "int" | "float" | "string");
	public BasicTypeElements getBasicTypeAccess() {
		return pBasicType;
	}
	
	public ParserRule getBasicTypeRule() {
		return getBasicTypeAccess().getRule();
	}
	
	//Method:
	//	'method' name=ID arguments=Arguments "->" result=Result;
	public MethodElements getMethodAccess() {
		return pMethod;
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}
	
	//Arguments:
	//	arguments=Object;
	public ArgumentsElements getArgumentsAccess() {
		return pArguments;
	}
	
	public ParserRule getArgumentsRule() {
		return getArgumentsAccess().getRule();
	}
	
	//Result:
	//	result=Object;
	public ResultElements getResultAccess() {
		return pResult;
	}
	
	public ParserRule getResultRule() {
		return getResultAccess().getRule();
	}
	
	//Error:
	//	'error' name=ID properties=Object;
	public ErrorElements getErrorAccess() {
		return pError;
	}
	
	public ParserRule getErrorRule() {
		return getErrorAccess().getRule();
	}
	
	//InterfaceName:
	//	ID (=> "." ID)*;
	public InterfaceNameElements getInterfaceNameAccess() {
		return pInterfaceName;
	}
	
	public ParserRule getInterfaceNameRule() {
		return getInterfaceNameAccess().getRule();
	}
	
	//// terminals
	//ValidID:
	//	ID | KEYWORD;
	public ValidIDElements getValidIDAccess() {
		return pValidID;
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//KEYWORD:
	//	'type' | 'enum' | 'interface' | 'method' | 'error' | 'bool' | 'int' | 'float' | 'string';
	public KEYWORDElements getKEYWORDAccess() {
		return pKEYWORD;
	}
	
	public ParserRule getKEYWORDRule() {
		return getKEYWORDAccess().getRule();
	}
	
	//terminal ID:
	//	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal SL_COMMENT:
	//	'#' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
