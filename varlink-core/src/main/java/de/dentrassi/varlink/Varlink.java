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
package de.dentrassi.varlink;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

import de.dentrassi.varlink.internal.VarlinkImpl;

public interface Varlink extends AutoCloseable {

    public static Varlink varlink() {
        return new VarlinkImpl();
    }

    public <T> T newService(Class<T> clazz, String address);

    public <T> T newService(Class<T> clazz, Path address);

    public Resolver resolver();

    public default <T> T resolveSync(final Class<T> clazz) {
        return resolver().sync().resolve(clazz);
    }

    public default <T> CompletableFuture<T> resolveAsync(final Class<T> clazz) {
        return resolver().async().resolve(clazz);
    }

}
