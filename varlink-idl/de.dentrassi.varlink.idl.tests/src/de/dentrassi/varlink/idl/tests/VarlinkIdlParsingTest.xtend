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
package de.dentrassi.varlink.idl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import de.dentrassi.varlink.idl.varlinkIdl.Interface
import org.eclipse.xtext.resource.XtextResourceSet
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI

@RunWith(XtextRunner)
@InjectWith(VarlinkIdlInjectorProvider)
class VarlinkIdlParsingTest {
	
	@Inject
	Provider<XtextResourceSet> resourceSetProvider;
	
	@Inject
	ParseHelper<Interface> parseHelper

	@Test
	def void loadModel1() {
		
		val options = null
		var resourceSet = resourceSetProvider.get();
		
		val result = parseHelper.parse(
			getClass().getResourceAsStream("test.varlink"),
			URI.createURI("test.varlink"),
			options,
			resourceSet
		);
		
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	/**
	 * A more complex model, with some corner cases around keywords
	 */
	@Test
	def void loadModel2() {
		
		val options = null
		var resourceSet = resourceSetProvider.get();
		
		val result = parseHelper.parse(
			getClass().getResourceAsStream("test2.varlink"),
			URI.createURI("test2.varlink"),
			options,
			resourceSet
		);
		
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
