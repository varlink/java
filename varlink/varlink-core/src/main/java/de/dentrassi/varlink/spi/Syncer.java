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

import static io.glutamate.lang.Exceptions.wrap;

import java.util.concurrent.CompletableFuture;

import io.glutamate.util.concurrent.CloseableCompletableFuture;

public final class Syncer {

    public Syncer() {
    }

    public static <T> T await(final CloseableCompletableFuture<T> future) {
        try {
            return wrap(() -> future.get());
        } finally {
            wrap(future::close);
        }
    }

    public static <T> T await(final CompletableFuture<T> future) {
        return wrap(() -> future.get());
    }
}
