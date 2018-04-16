/*******************************************************************************
 * Copyright (c) 2017, 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package de.dentrassi.varlink.idl.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import de.dentrassi.varlink.idl.ide.util.VarlinkIdlSemanticHighlightingCalculator

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class VarlinkIdlUiModule extends AbstractVarlinkIdlUiModule {

	def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		VarlinkIdlSemanticHighlightingCalculator
	}

}
