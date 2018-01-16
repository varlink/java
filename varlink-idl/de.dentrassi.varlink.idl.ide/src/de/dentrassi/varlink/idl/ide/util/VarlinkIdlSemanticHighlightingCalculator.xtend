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

package de.dentrassi.varlink.idl.ide.util

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator
import de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage
import de.dentrassi.varlink.idl.varlinkIdl.Field

class VarlinkIdlSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	override protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {

		switch (object) {
			Field: {
				// Disable keyword highlighting for field names
				highlightFeature(acceptor, object, VarlinkIdlPackage.eINSTANCE.field_Name,
					HighlightingStyles.DEFAULT_ID)
				return true
			}
			default:
				false
		}
	}
}
