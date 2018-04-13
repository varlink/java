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
package de.dentrassi.varlink.idl.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import de.dentrassi.varlink.idl.varlinkIdl.Interface
import de.dentrassi.varlink.idl.varlinkIdl.Method
import de.dentrassi.varlink.idl.varlinkIdl.TypeAlias
import de.dentrassi.varlink.idl.varlinkIdl.Array
import de.dentrassi.varlink.idl.varlinkIdl.Optional
import de.dentrassi.varlink.idl.varlinkIdl.Arguments
import de.dentrassi.varlink.idl.varlinkIdl.Result

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class VarlinkIdlLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:

	def image(Interface ele) {
		'obj16/interface_obj.png'
	}

	def image(Method ele) {
		'obj16/methpub_obj.png'
	}

	def image(TypeAlias ele) {
		'obj16/type_obj.png'
	}

	def text(Array array) {
		return "Array"
	}

	def text(Optional optional) {
		return "Optional"
	}

	def text(Arguments arguments) {
		return "Arguments"
	}

	def text(Result result) {
		return "Result"
	}

//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
}
