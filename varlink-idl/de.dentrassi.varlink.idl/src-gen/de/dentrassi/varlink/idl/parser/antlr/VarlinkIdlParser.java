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
package de.dentrassi.varlink.idl.parser.antlr;

import com.google.inject.Inject;
import de.dentrassi.varlink.idl.parser.antlr.internal.InternalVarlinkIdlParser;
import de.dentrassi.varlink.idl.services.VarlinkIdlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class VarlinkIdlParser extends AbstractAntlrParser {

	@Inject
	private VarlinkIdlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalVarlinkIdlParser createParser(XtextTokenStream stream) {
		return new InternalVarlinkIdlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Interface";
	}

	public VarlinkIdlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VarlinkIdlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
