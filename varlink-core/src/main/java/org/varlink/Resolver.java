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
package org.varlink;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;

import de.dentrassi.varlink.spi.Interface;
import de.dentrassi.varlink.spi.Syncer;

@Interface(factory = ResolverImpl.Factory.class)
public interface Resolver {

    public static final Path ADDRESS = Paths.get("/run/org.varlink.resolver");

    public interface Async {
        public CompletableFuture<String> resolve(String _interface);
    }

    public interface Sync {
        public String resolve(String _interface);
    }

    public Async async();

    public default Sync sync() {

        return new Sync() {

            @Override
            public String resolve(final String _interface) {
                return Syncer.await(async().resolve(_interface));
            }

        };
    }
}
