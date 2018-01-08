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
package de.dentrassi.varlink.idl.ui.tests;

import com.google.inject.Injector;
import de.dentrassi.varlink.idl.ui.internal.IdlActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class VarlinkIdlUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return IdlActivator.getInstance().getInjector("de.dentrassi.varlink.idl.VarlinkIdl");
	}

}
