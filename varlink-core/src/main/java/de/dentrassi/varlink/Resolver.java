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

import java.util.concurrent.CompletableFuture;

import de.dentrassi.varlink.spi.Syncer;

public interface Resolver {

    public interface Sync {
        public <T> T resolve(Class<T> clazz);
    }

    public interface Async {
        public <T> CompletableFuture<T> resolve(Class<T> clazz);
    }

    public Async async();

    public default Sync sync() {
        return new Sync() {

            @Override
            public <T> T resolve(final Class<T> clazz) {
                return Syncer.await(async().resolve(clazz));
            }
        };
    }
}
