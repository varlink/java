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
package de.dentrassi.varlink.idl.ui;

import com.google.inject.Injector;
import de.dentrassi.varlink.idl.ui.internal.IdlActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VarlinkIdlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(IdlActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		IdlActivator activator = IdlActivator.getInstance();
		return activator != null ? activator.getInjector(IdlActivator.DE_DENTRASSI_VARLINK_IDL_VARLINKIDL) : null;
	}

}
