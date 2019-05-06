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
package de.dentrassi.varlink.idl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.dentrassi.varlink.idl.ide.contentassist.antlr.internal.InternalVarlinkIdlParser;
import de.dentrassi.varlink.idl.services.VarlinkIdlGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class VarlinkIdlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VarlinkIdlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VarlinkIdlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
			builder.put(grammarAccess.getTypeAliasDefinitionAccess().getAlternatives(), "rule__TypeAliasDefinition__Alternatives");
			builder.put(grammarAccess.getElementTypeAccess().getAlternatives(), "rule__ElementType__Alternatives");
			builder.put(grammarAccess.getBasicTypeAccess().getTypeAlternatives_0(), "rule__BasicType__TypeAlternatives_0");
			builder.put(grammarAccess.getValidIDAccess().getAlternatives(), "rule__ValidID__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getTypeAliasAccess().getGroup(), "rule__TypeAlias__Group__0");
			builder.put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
			builder.put(grammarAccess.getEnumAccess().getGroup_2(), "rule__Enum__Group_2__0");
			builder.put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup_3(), "rule__Object__Group_3__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
			builder.put(grammarAccess.getDictionaryAccess().getGroup(), "rule__Dictionary__Group__0");
			builder.put(grammarAccess.getOptionalAccess().getGroup(), "rule__Optional__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
			builder.put(grammarAccess.getErrorAccess().getGroup(), "rule__Error__Group__0");
			builder.put(grammarAccess.getInterfaceNameAccess().getGroup(), "rule__InterfaceName__Group__0");
			builder.put(grammarAccess.getInterfaceNameAccess().getGroup_1(), "rule__InterfaceName__Group_1__0");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_1(), "rule__Interface__NameAssignment_1");
			builder.put(grammarAccess.getInterfaceAccess().getMembersAssignment_2(), "rule__Interface__MembersAssignment_2");
			builder.put(grammarAccess.getTypeAliasAccess().getNameAssignment_1(), "rule__TypeAlias__NameAssignment_1");
			builder.put(grammarAccess.getTypeAliasAccess().getDefinitionAssignment_2(), "rule__TypeAlias__DefinitionAssignment_2");
			builder.put(grammarAccess.getEnumAccess().getFieldsAssignment_1(), "rule__Enum__FieldsAssignment_1");
			builder.put(grammarAccess.getEnumAccess().getFieldsAssignment_2_1(), "rule__Enum__FieldsAssignment_2_1");
			builder.put(grammarAccess.getObjectAccess().getFieldsAssignment_2(), "rule__Object__FieldsAssignment_2");
			builder.put(grammarAccess.getObjectAccess().getFieldsAssignment_3_1(), "rule__Object__FieldsAssignment_3_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_0(), "rule__Field__NameAssignment_0");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_2(), "rule__Field__TypeAssignment_2");
			builder.put(grammarAccess.getArrayAccess().getTypeAssignment_1(), "rule__Array__TypeAssignment_1");
			builder.put(grammarAccess.getDictionaryAccess().getTypeAssignment_1(), "rule__Dictionary__TypeAssignment_1");
			builder.put(grammarAccess.getOptionalAccess().getTypeAssignment_1(), "rule__Optional__TypeAssignment_1");
			builder.put(grammarAccess.getTypeReferenceAccess().getNameAssignment(), "rule__TypeReference__NameAssignment");
			builder.put(grammarAccess.getBasicTypeAccess().getTypeAssignment(), "rule__BasicType__TypeAssignment");
			builder.put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
			builder.put(grammarAccess.getMethodAccess().getArgumentsAssignment_2(), "rule__Method__ArgumentsAssignment_2");
			builder.put(grammarAccess.getMethodAccess().getResultAssignment_4(), "rule__Method__ResultAssignment_4");
			builder.put(grammarAccess.getArgumentsAccess().getArgumentsAssignment(), "rule__Arguments__ArgumentsAssignment");
			builder.put(grammarAccess.getResultAccess().getResultAssignment(), "rule__Result__ResultAssignment");
			builder.put(grammarAccess.getErrorAccess().getNameAssignment_1(), "rule__Error__NameAssignment_1");
			builder.put(grammarAccess.getErrorAccess().getPropertiesAssignment_2(), "rule__Error__PropertiesAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VarlinkIdlGrammarAccess grammarAccess;

	@Override
	protected InternalVarlinkIdlParser createParser() {
		InternalVarlinkIdlParser result = new InternalVarlinkIdlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
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
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
