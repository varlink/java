/*
 * generated by Xtext 2.12.0
 */
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
