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
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDefinitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDefinitionTypeAliasDefinitionParserRuleCall_2_0 = (RuleCall)cDefinitionAssignment_2.eContents().get(0);
		
		//TypeAlias:
		//	'type' name=ID definition=TypeAliasDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID definition=TypeAliasDefinition
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
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
		private final RuleCall cFieldsIDTerminalRuleCall_1_0 = (RuleCall)cFieldsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cFieldsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cFieldsIDTerminalRuleCall_2_1_0 = (RuleCall)cFieldsAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Enum:
		//	"("
		//	fields+=ID ("," fields+=ID)*
		//	")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" fields+=ID ("," fields+=ID)* ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//fields+=ID
		public Assignment getFieldsAssignment_1() { return cFieldsAssignment_1; }
		
		//ID
		public RuleCall getFieldsIDTerminalRuleCall_1_0() { return cFieldsIDTerminalRuleCall_1_0; }
		
		//("," fields+=ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//fields+=ID
		public Assignment getFieldsAssignment_2_1() { return cFieldsAssignment_2_1; }
		
		//ID
		public RuleCall getFieldsIDTerminalRuleCall_2_1_0() { return cFieldsIDTerminalRuleCall_2_1_0; }
		
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
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeElementTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Field:
		//	name=ID ":" type=ElementType;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ":" type=ElementType
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=ElementType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//ElementType
		public RuleCall getTypeElementTypeParserRuleCall_2_0() { return cTypeElementTypeParserRuleCall_2_0; }
	}
	public class ElementTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.ElementType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cBasicTypeParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cTypeReferenceParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cEnumParserRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final Assignment cMultiAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cMultiLeftSquareBracketRightSquareBracketKeyword_1_0 = (Keyword)cMultiAssignment_1.eContents().get(0);
		
		//ElementType:
		//	(BasicType | TypeReference | Enum) multi?="[]"?;
		@Override public ParserRule getRule() { return rule; }
		
		//(BasicType | TypeReference | Enum) multi?="[]"?
		public Group getGroup() { return cGroup; }
		
		//BasicType | TypeReference | Enum
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//BasicType
		public RuleCall getBasicTypeParserRuleCall_0_0() { return cBasicTypeParserRuleCall_0_0; }
		
		//TypeReference
		public RuleCall getTypeReferenceParserRuleCall_0_1() { return cTypeReferenceParserRuleCall_0_1; }
		
		//Enum
		public RuleCall getEnumParserRuleCall_0_2() { return cEnumParserRuleCall_0_2; }
		
		//multi?="[]"?
		public Assignment getMultiAssignment_1() { return cMultiAssignment_1; }
		
		//"[]"
		public Keyword getMultiLeftSquareBracketRightSquareBracketKeyword_1_0() { return cMultiLeftSquareBracketRightSquareBracketKeyword_1_0; }
	}
	public class TypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.TypeReference");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//TypeReference:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class BasicTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.BasicType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeAlternatives_0 = (Alternatives)cTypeAssignment.eContents().get(0);
		private final Keyword cTypeBoolKeyword_0_0 = (Keyword)cTypeAlternatives_0.eContents().get(0);
		private final Keyword cTypeIntKeyword_0_1 = (Keyword)cTypeAlternatives_0.eContents().get(1);
		private final Keyword cTypeFloatKeyword_0_2 = (Keyword)cTypeAlternatives_0.eContents().get(2);
		private final Keyword cTypeStringKeyword_0_3 = (Keyword)cTypeAlternatives_0.eContents().get(3);
		private final Keyword cTypeDataKeyword_0_4 = (Keyword)cTypeAlternatives_0.eContents().get(4);
		private final Keyword cTypeObjectKeyword_0_5 = (Keyword)cTypeAlternatives_0.eContents().get(5);
		
		//BasicType:
		//	type=("bool" | "int" | "float" | "string" | "data" | "object");
		@Override public ParserRule getRule() { return rule; }
		
		//type=("bool" | "int" | "float" | "string" | "data" | "object")
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//("bool" | "int" | "float" | "string" | "data" | "object")
		public Alternatives getTypeAlternatives_0() { return cTypeAlternatives_0; }
		
		//"bool"
		public Keyword getTypeBoolKeyword_0_0() { return cTypeBoolKeyword_0_0; }
		
		//"int"
		public Keyword getTypeIntKeyword_0_1() { return cTypeIntKeyword_0_1; }
		
		//"float"
		public Keyword getTypeFloatKeyword_0_2() { return cTypeFloatKeyword_0_2; }
		
		//"string"
		public Keyword getTypeStringKeyword_0_3() { return cTypeStringKeyword_0_3; }
		
		//"data"
		public Keyword getTypeDataKeyword_0_4() { return cTypeDataKeyword_0_4; }
		
		//"object"
		public Keyword getTypeObjectKeyword_0_5() { return cTypeObjectKeyword_0_5; }
	}
	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dentrassi.varlink.idl.VarlinkIdl.Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMethodKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArgumentsObjectParserRuleCall_2_0 = (RuleCall)cArgumentsAssignment_2.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cResultAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cResultObjectParserRuleCall_4_0 = (RuleCall)cResultAssignment_4.eContents().get(0);
		
		//Method:
		//	'method' name=ID arguments=Object "->" result=Object;
		@Override public ParserRule getRule() { return rule; }
		
		//'method' name=ID arguments=Object "->" result=Object
		public Group getGroup() { return cGroup; }
		
		//'method'
		public Keyword getMethodKeyword_0() { return cMethodKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//arguments=Object
		public Assignment getArgumentsAssignment_2() { return cArgumentsAssignment_2; }
		
		//Object
		public RuleCall getArgumentsObjectParserRuleCall_2_0() { return cArgumentsObjectParserRuleCall_2_0; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//result=Object
		public Assignment getResultAssignment_4() { return cResultAssignment_4; }
		
		//Object
		public RuleCall getResultObjectParserRuleCall_4_0() { return cResultObjectParserRuleCall_4_0; }
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
	
	
	private final InterfaceElements pInterface;
	private final MemberElements pMember;
	private final TypeAliasElements pTypeAlias;
	private final TypeAliasDefinitionElements pTypeAliasDefinition;
	private final EnumElements pEnum;
	private final ObjectElements pObject;
	private final FieldElements pField;
	private final ElementTypeElements pElementType;
	private final TypeReferenceElements pTypeReference;
	private final BasicTypeElements pBasicType;
	private final MethodElements pMethod;
	private final ErrorElements pError;
	private final InterfaceNameElements pInterfaceName;
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
		this.pTypeReference = new TypeReferenceElements();
		this.pBasicType = new BasicTypeElements();
		this.pMethod = new MethodElements();
		this.pError = new ErrorElements();
		this.pInterfaceName = new InterfaceNameElements();
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
	//	'type' name=ID definition=TypeAliasDefinition;
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
	//	fields+=ID ("," fields+=ID)*
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
	//	name=ID ":" type=ElementType;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//ElementType:
	//	(BasicType | TypeReference | Enum) multi?="[]"?;
	public ElementTypeElements getElementTypeAccess() {
		return pElementType;
	}
	
	public ParserRule getElementTypeRule() {
		return getElementTypeAccess().getRule();
	}
	
	//TypeReference:
	//	name=ID;
	public TypeReferenceElements getTypeReferenceAccess() {
		return pTypeReference;
	}
	
	public ParserRule getTypeReferenceRule() {
		return getTypeReferenceAccess().getRule();
	}
	
	//BasicType:
	//	type=("bool" | "int" | "float" | "string" | "data" | "object");
	public BasicTypeElements getBasicTypeAccess() {
		return pBasicType;
	}
	
	public ParserRule getBasicTypeRule() {
		return getBasicTypeAccess().getRule();
	}
	
	//Method:
	//	'method' name=ID arguments=Object "->" result=Object;
	public MethodElements getMethodAccess() {
		return pMethod;
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
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