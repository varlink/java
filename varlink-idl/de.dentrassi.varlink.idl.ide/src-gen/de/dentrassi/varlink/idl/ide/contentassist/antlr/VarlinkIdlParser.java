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
package de.dentrassi.varlink.idl.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.dentrassi.varlink.idl.ide.contentassist.antlr.internal.InternalVarlinkIdlParser;
import de.dentrassi.varlink.idl.services.VarlinkIdlGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class VarlinkIdlParser extends AbstractContentAssistParser {

	@Inject
	private VarlinkIdlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalVarlinkIdlParser createParser() {
		InternalVarlinkIdlParser result = new InternalVarlinkIdlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
					put(grammarAccess.getTypeAliasDefinitionAccess().getAlternatives(), "rule__TypeAliasDefinition__Alternatives");
					put(grammarAccess.getElementTypeAccess().getAlternatives_0(), "rule__ElementType__Alternatives_0");
					put(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0(), "rule__BasicType__TypeAlternatives_0");
					put(grammarAccess.getValidIDAccess().getAlternatives(), "rule__ValidID__Alternatives");
					put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getTypeAliasAccess().getGroup(), "rule__TypeAlias__Group__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getEnumAccess().getGroup_2(), "rule__Enum__Group_2__0");
					put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
					put(grammarAccess.getObjectAccess().getGroup_3(), "rule__Object__Group_3__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getElementTypeAccess().getGroup(), "rule__ElementType__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getErrorAccess().getGroup(), "rule__Error__Group__0");
					put(grammarAccess.getInterfaceNameAccess().getGroup(), "rule__InterfaceName__Group__0");
					put(grammarAccess.getInterfaceNameAccess().getGroup_1(), "rule__InterfaceName__Group_1__0");
					put(grammarAccess.getInterfaceAccess().getNameAssignment_1(), "rule__Interface__NameAssignment_1");
					put(grammarAccess.getInterfaceAccess().getMembersAssignment_2(), "rule__Interface__MembersAssignment_2");
					put(grammarAccess.getTypeAliasAccess().getNameAssignment_1(), "rule__TypeAlias__NameAssignment_1");
					put(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2(), "rule__TypeAlias__DefinitionAssignment_2");
					put(grammarAccess.getEnumAccess().getFieldsAssignment_1(), "rule__Enum__FieldsAssignment_1");
					put(grammarAccess.getEnumAccess().getFieldsAssignment_2_1(), "rule__Enum__FieldsAssignment_2_1");
					put(grammarAccess.getObjectAccess().getFieldsAssignment_2(), "rule__Object__FieldsAssignment_2");
					put(grammarAccess.getObjectAccess().getFieldsAssignment_3_1(), "rule__Object__FieldsAssignment_3_1");
					put(grammarAccess.getFieldAccess().getNameAssignment_0(), "rule__Field__NameAssignment_0");
					put(grammarAccess.getFieldAccess().getTypeAssignment_2(), "rule__Field__TypeAssignment_2");
					put(grammarAccess.getElementTypeAccess().getMultiAssignment_1(), "rule__ElementType__MultiAssignment_1");
					put(grammarAccess.getTypeReferenceAccess().getNameAssignment(), "rule__TypeReference__NameAssignment");
					put(grammarAccess.getBasicTypeAccess().getTypeAssignment(), "rule__BasicType__TypeAssignment");
					put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getArgumentsAssignment_2(), "rule__Method__ArgumentsAssignment_2");
					put(grammarAccess.getMethodAccess().getResultAssignment_4(), "rule__Method__ResultAssignment_4");
					put(grammarAccess.getErrorAccess().getNameAssignment_1(), "rule__Error__NameAssignment_1");
					put(grammarAccess.getErrorAccess().getPropertiesAssignment_2(), "rule__Error__PropertiesAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public VarlinkIdlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VarlinkIdlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
