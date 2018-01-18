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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package de.dentrassi.varlink.idl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleInterface
entryRuleInterface
:
{ before(grammarAccess.getInterfaceRule()); }
	 ruleInterface
{ after(grammarAccess.getInterfaceRule()); } 
	 EOF 
;

// Rule Interface
ruleInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInterfaceAccess().getGroup()); }
		(rule__Interface__Group__0)
		{ after(grammarAccess.getInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMember
entryRuleMember
:
{ before(grammarAccess.getMemberRule()); }
	 ruleMember
{ after(grammarAccess.getMemberRule()); } 
	 EOF 
;

// Rule Member
ruleMember 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberAccess().getAlternatives()); }
		(rule__Member__Alternatives)
		{ after(grammarAccess.getMemberAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeAlias
entryRuleTypeAlias
:
{ before(grammarAccess.getTypeAliasRule()); }
	 ruleTypeAlias
{ after(grammarAccess.getTypeAliasRule()); } 
	 EOF 
;

// Rule TypeAlias
ruleTypeAlias 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAliasAccess().getGroup()); }
		(rule__TypeAlias__Group__0)
		{ after(grammarAccess.getTypeAliasAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeAliasDefinition
entryRuleTypeAliasDefinition
:
{ before(grammarAccess.getTypeAliasDefinitionRule()); }
	 ruleTypeAliasDefinition
{ after(grammarAccess.getTypeAliasDefinitionRule()); } 
	 EOF 
;

// Rule TypeAliasDefinition
ruleTypeAliasDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAliasDefinitionAccess().getAlternatives()); }
		(rule__TypeAliasDefinition__Alternatives)
		{ after(grammarAccess.getTypeAliasDefinitionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnum
entryRuleEnum
:
{ before(grammarAccess.getEnumRule()); }
	 ruleEnum
{ after(grammarAccess.getEnumRule()); } 
	 EOF 
;

// Rule Enum
ruleEnum 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumAccess().getGroup()); }
		(rule__Enum__Group__0)
		{ after(grammarAccess.getEnumAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObject
entryRuleObject
:
{ before(grammarAccess.getObjectRule()); }
	 ruleObject
{ after(grammarAccess.getObjectRule()); } 
	 EOF 
;

// Rule Object
ruleObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObjectAccess().getGroup()); }
		(rule__Object__Group__0)
		{ after(grammarAccess.getObjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleField
entryRuleField
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldAccess().getGroup()); }
		(rule__Field__Group__0)
		{ after(grammarAccess.getFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElementType
entryRuleElementType
:
{ before(grammarAccess.getElementTypeRule()); }
	 ruleElementType
{ after(grammarAccess.getElementTypeRule()); } 
	 EOF 
;

// Rule ElementType
ruleElementType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementTypeAccess().getGroup()); }
		(rule__ElementType__Group__0)
		{ after(grammarAccess.getElementTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeReference
entryRuleTypeReference
:
{ before(grammarAccess.getTypeReferenceRule()); }
	 ruleTypeReference
{ after(grammarAccess.getTypeReferenceRule()); } 
	 EOF 
;

// Rule TypeReference
ruleTypeReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getNameAssignment()); }
		(rule__TypeReference__NameAssignment)
		{ after(grammarAccess.getTypeReferenceAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBasicType
entryRuleBasicType
:
{ before(grammarAccess.getBasicTypeRule()); }
	 ruleBasicType
{ after(grammarAccess.getBasicTypeRule()); } 
	 EOF 
;

// Rule BasicType
ruleBasicType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeAssignment()); }
		(rule__BasicType__TypeAssignment)
		{ after(grammarAccess.getBasicTypeAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMethod
entryRuleMethod
:
{ before(grammarAccess.getMethodRule()); }
	 ruleMethod
{ after(grammarAccess.getMethodRule()); } 
	 EOF 
;

// Rule Method
ruleMethod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMethodAccess().getGroup()); }
		(rule__Method__Group__0)
		{ after(grammarAccess.getMethodAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleError
entryRuleError
:
{ before(grammarAccess.getErrorRule()); }
	 ruleError
{ after(grammarAccess.getErrorRule()); } 
	 EOF 
;

// Rule Error
ruleError 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getErrorAccess().getGroup()); }
		(rule__Error__Group__0)
		{ after(grammarAccess.getErrorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInterfaceName
entryRuleInterfaceName
:
{ before(grammarAccess.getInterfaceNameRule()); }
	 ruleInterfaceName
{ after(grammarAccess.getInterfaceNameRule()); } 
	 EOF 
;

// Rule InterfaceName
ruleInterfaceName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInterfaceNameAccess().getGroup()); }
		(rule__InterfaceName__Group__0)
		{ after(grammarAccess.getInterfaceNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValidID
entryRuleValidID
:
{ before(grammarAccess.getValidIDRule()); }
	 ruleValidID
{ after(grammarAccess.getValidIDRule()); } 
	 EOF 
;

// Rule ValidID
ruleValidID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValidIDAccess().getAlternatives()); }
		(rule__ValidID__Alternatives)
		{ after(grammarAccess.getValidIDAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKEYWORD
entryRuleKEYWORD
:
{ before(grammarAccess.getKEYWORDRule()); }
	 ruleKEYWORD
{ after(grammarAccess.getKEYWORDRule()); } 
	 EOF 
;

// Rule KEYWORD
ruleKEYWORD 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKEYWORDAccess().getAlternatives()); }
		(rule__KEYWORD__Alternatives)
		{ after(grammarAccess.getKEYWORDAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getTypeAliasParserRuleCall_0()); }
		ruleTypeAlias
		{ after(grammarAccess.getMemberAccess().getTypeAliasParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); }
		ruleMethod
		{ after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getMemberAccess().getErrorParserRuleCall_2()); }
		ruleError
		{ after(grammarAccess.getMemberAccess().getErrorParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAliasDefinition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAliasDefinitionAccess().getEnumParserRuleCall_0()); }
		ruleEnum
		{ after(grammarAccess.getTypeAliasDefinitionAccess().getEnumParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAliasDefinitionAccess().getObjectParserRuleCall_1()); }
		ruleObject
		{ after(grammarAccess.getTypeAliasDefinitionAccess().getObjectParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementType__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0_0()); }
		ruleBasicType
		{ after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_0_1()); }
		ruleTypeReference
		{ after(grammarAccess.getElementTypeAccess().getTypeReferenceParserRuleCall_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_0_2()); }
		ruleEnum
		{ after(grammarAccess.getElementTypeAccess().getEnumParserRuleCall_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getElementTypeAccess().getObjectParserRuleCall_0_3()); }
		ruleObject
		{ after(grammarAccess.getElementTypeAccess().getObjectParserRuleCall_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicType__TypeAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeBoolKeyword_0_0()); }
		'bool'
		{ after(grammarAccess.getBasicTypeAccess().getTypeBoolKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeIntKeyword_0_1()); }
		'int'
		{ after(grammarAccess.getBasicTypeAccess().getTypeIntKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeFloatKeyword_0_2()); }
		'float'
		{ after(grammarAccess.getBasicTypeAccess().getTypeFloatKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeStringKeyword_0_3()); }
		'string'
		{ after(grammarAccess.getBasicTypeAccess().getTypeStringKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeDataKeyword_0_4()); }
		'data'
		{ after(grammarAccess.getBasicTypeAccess().getTypeDataKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeObjectKeyword_0_5()); }
		'object'
		{ after(grammarAccess.getBasicTypeAccess().getTypeObjectKeyword_0_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValidID__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1()); }
		ruleKEYWORD
		{ after(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KEYWORD__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKEYWORDAccess().getTypeKeyword_0()); }
		'type'
		{ after(grammarAccess.getKEYWORDAccess().getTypeKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getEnumKeyword_1()); }
		'enum'
		{ after(grammarAccess.getKEYWORDAccess().getEnumKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getInterfaceKeyword_2()); }
		'interface'
		{ after(grammarAccess.getKEYWORDAccess().getInterfaceKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getMethodKeyword_3()); }
		'method'
		{ after(grammarAccess.getKEYWORDAccess().getMethodKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getErrorKeyword_4()); }
		'error'
		{ after(grammarAccess.getKEYWORDAccess().getErrorKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getBoolKeyword_5()); }
		'bool'
		{ after(grammarAccess.getKEYWORDAccess().getBoolKeyword_5()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getFloatKeyword_6()); }
		'float'
		{ after(grammarAccess.getKEYWORDAccess().getFloatKeyword_6()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getStringKeyword_7()); }
		'string'
		{ after(grammarAccess.getKEYWORDAccess().getStringKeyword_7()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getDataKeyword_8()); }
		'data'
		{ after(grammarAccess.getKEYWORDAccess().getDataKeyword_8()); }
	)
	|
	(
		{ before(grammarAccess.getKEYWORDAccess().getObjectKeyword_9()); }
		'object'
		{ after(grammarAccess.getKEYWORDAccess().getObjectKeyword_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface__Group__0__Impl
	rule__Interface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); }
	'interface'
	{ after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface__Group__1__Impl
	rule__Interface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); }
	(rule__Interface__NameAssignment_1)
	{ after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Interface__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceAccess().getMembersAssignment_2()); }
	(rule__Interface__MembersAssignment_2)*
	{ after(grammarAccess.getInterfaceAccess().getMembersAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeAlias__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeAlias__Group__0__Impl
	rule__TypeAlias__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlias__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAliasAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getTypeAliasAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlias__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeAlias__Group__1__Impl
	rule__TypeAlias__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlias__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAliasAccess().getNameAssignment_1()); }
	(rule__TypeAlias__NameAssignment_1)
	{ after(grammarAccess.getTypeAliasAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlias__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeAlias__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlias__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2()); }
	(rule__TypeAlias__DefinitionAssignment_2)
	{ after(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enum__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__0__Impl
	rule__Enum__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getEnumAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__1__Impl
	rule__Enum__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getFieldsAssignment_1()); }
	(rule__Enum__FieldsAssignment_1)
	{ after(grammarAccess.getEnumAccess().getFieldsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__2__Impl
	rule__Enum__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getGroup_2()); }
	(rule__Enum__Group_2__0)*
	{ after(grammarAccess.getEnumAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getEnumAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enum__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group_2__0__Impl
	rule__Enum__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enum__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumAccess().getFieldsAssignment_2_1()); }
	(rule__Enum__FieldsAssignment_2_1)
	{ after(grammarAccess.getEnumAccess().getFieldsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Object__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__0__Impl
	rule__Object__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getObjectAction_0()); }
	()
	{ after(grammarAccess.getObjectAccess().getObjectAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__1__Impl
	rule__Object__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__2__Impl
	rule__Object__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getFieldsAssignment_2()); }
	(rule__Object__FieldsAssignment_2)?
	{ after(grammarAccess.getObjectAccess().getFieldsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__3__Impl
	rule__Object__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getGroup_3()); }
	(rule__Object__Group_3__0)*
	{ after(grammarAccess.getObjectAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getObjectAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Object__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group_3__0__Impl
	rule__Object__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getObjectAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Object__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectAccess().getFieldsAssignment_3_1()); }
	(rule__Object__FieldsAssignment_3_1)
	{ after(grammarAccess.getObjectAccess().getFieldsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__0__Impl
	rule__Field__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getNameAssignment_0()); }
	(rule__Field__NameAssignment_0)
	{ after(grammarAccess.getFieldAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__1__Impl
	rule__Field__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFieldAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getTypeAssignment_2()); }
	(rule__Field__TypeAssignment_2)
	{ after(grammarAccess.getFieldAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ElementType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementType__Group__0__Impl
	rule__ElementType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementTypeAccess().getAlternatives_0()); }
	(rule__ElementType__Alternatives_0)
	{ after(grammarAccess.getElementTypeAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ElementType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementTypeAccess().getMultiAssignment_1()); }
	(rule__ElementType__MultiAssignment_1)?
	{ after(grammarAccess.getElementTypeAccess().getMultiAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Method__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__0__Impl
	rule__Method__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getMethodKeyword_0()); }
	'method'
	{ after(grammarAccess.getMethodAccess().getMethodKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__1__Impl
	rule__Method__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getNameAssignment_1()); }
	(rule__Method__NameAssignment_1)
	{ after(grammarAccess.getMethodAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__2__Impl
	rule__Method__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getArgumentsAssignment_2()); }
	(rule__Method__ArgumentsAssignment_2)
	{ after(grammarAccess.getMethodAccess().getArgumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__3__Impl
	rule__Method__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
	'->'
	{ after(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Method__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodAccess().getResultAssignment_4()); }
	(rule__Method__ResultAssignment_4)
	{ after(grammarAccess.getMethodAccess().getResultAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Error__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Error__Group__0__Impl
	rule__Error__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Error__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorAccess().getErrorKeyword_0()); }
	'error'
	{ after(grammarAccess.getErrorAccess().getErrorKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Error__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Error__Group__1__Impl
	rule__Error__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Error__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorAccess().getNameAssignment_1()); }
	(rule__Error__NameAssignment_1)
	{ after(grammarAccess.getErrorAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Error__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Error__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Error__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorAccess().getPropertiesAssignment_2()); }
	(rule__Error__PropertiesAssignment_2)
	{ after(grammarAccess.getErrorAccess().getPropertiesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceName__Group__0__Impl
	rule__InterfaceName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceNameAccess().getGroup_1()); }
	(rule__InterfaceName__Group_1__0)*
	{ after(grammarAccess.getInterfaceNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InterfaceName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceName__Group_1__0__Impl
	rule__InterfaceName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0()); }
	('.')
	{ after(grammarAccess.getInterfaceNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InterfaceName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InterfaceName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getInterfaceNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceAccess().getNameInterfaceNameParserRuleCall_1_0()); }
		ruleInterfaceName
		{ after(grammarAccess.getInterfaceAccess().getNameInterfaceNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__MembersAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_0()); }
		ruleMember
		{ after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlias__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAliasAccess().getNameValidIDParserRuleCall_1_0()); }
		ruleValidID
		{ after(grammarAccess.getTypeAliasAccess().getNameValidIDParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeAlias__DefinitionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAliasAccess().getDefinitionTypeAliasDefinitionParserRuleCall_2_0()); }
		ruleTypeAliasDefinition
		{ after(grammarAccess.getTypeAliasAccess().getDefinitionTypeAliasDefinitionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__FieldsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_1_0()); }
		ruleValidID
		{ after(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enum__FieldsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_2_1_0()); }
		ruleValidID
		{ after(grammarAccess.getEnumAccess().getFieldsValidIDParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__FieldsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0()); }
		ruleField
		{ after(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Object__FieldsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_3_1_0()); }
		ruleField
		{ after(grammarAccess.getObjectAccess().getFieldsFieldParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_0_0()); }
		ruleValidID
		{ after(grammarAccess.getFieldAccess().getNameValidIDParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getTypeElementTypeParserRuleCall_2_0()); }
		ruleElementType
		{ after(grammarAccess.getFieldAccess().getTypeElementTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementType__MultiAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }
		(
			{ before(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }
			'[]'
			{ after(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }
		)
		{ after(grammarAccess.getElementTypeAccess().getMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeReference__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeReferenceAccess().getNameValidIDParserRuleCall_0()); }
		ruleValidID
		{ after(grammarAccess.getTypeReferenceAccess().getNameValidIDParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicType__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0()); }
		(rule__BasicType__TypeAlternatives_0)
		{ after(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__ArgumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodAccess().getArgumentsObjectParserRuleCall_2_0()); }
		ruleObject
		{ after(grammarAccess.getMethodAccess().getArgumentsObjectParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Method__ResultAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodAccess().getResultObjectParserRuleCall_4_0()); }
		ruleObject
		{ after(grammarAccess.getMethodAccess().getResultObjectParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Error__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getErrorAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getErrorAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Error__PropertiesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getErrorAccess().getPropertiesObjectParserRuleCall_2_0()); }
		ruleObject
		{ after(grammarAccess.getErrorAccess().getPropertiesObjectParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
