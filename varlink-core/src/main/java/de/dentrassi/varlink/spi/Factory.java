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
package de.dentrassi.varlink.spi;

import de.dentrassi.varlink.internal.VarlinkImpl;

public interface Factory {
    public <T> T create(VarlinkImpl varlink, Class<T> clazz, Connection connection);
}
