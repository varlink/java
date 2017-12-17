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

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import io.netty.util.concurrent.Future;

public final class Futures {
    private Futures() {
    }

    public static <T> CompletableFuture<T> handle(final Future<T> future) {
        Objects.requireNonNull(future);

        final CompletableFuture<T> result = new CompletableFuture<>();

        future.addListener(r -> {
            try {
                result.complete(future.get());
            } catch (final Throwable e) {
                result.completeExceptionally(e);
            }
        });

        return result;
    }
}
