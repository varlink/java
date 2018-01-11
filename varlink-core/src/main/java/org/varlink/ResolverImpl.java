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

import static de.dentrassi.varlink.spi.CallRequest.of;
import static de.dentrassi.varlink.spi.Errors.check;
import static java.util.Collections.singletonMap;

import java.util.Iterator;
import java.util.concurrent.CompletableFuture;

import com.google.gson.JsonElement;

import de.dentrassi.varlink.internal.VarlinkImpl;
import de.dentrassi.varlink.spi.Connection;

public class ResolverImpl implements Resolver {

    public static class Factory implements de.dentrassi.varlink.spi.Factory {

        @Override
        public <T> T create(final VarlinkImpl varlink, final Class<T> clazz, final Connection connection) {
            return clazz.cast(new ResolverImpl(varlink, connection));
        }

    }

    private final VarlinkImpl varlink;

    private final Connection connection;

    private ResolverImpl(final VarlinkImpl varlink, final Connection connection) {
        this.varlink = varlink;
        this.connection = connection;
    }

    @Override
    public Async async() {
        return new Async() {

            @Override
            public CompletableFuture<String> resolve(final String _interface) {
                return executeResolve(_interface);
            }
        };
    }

    protected CompletableFuture<String> executeResolve(final String _interface) {
        return this.connection
                .call(
                        of(
                                "org.varlink.resolver.Resolve",
                                singletonMap("interface", _interface)))

                .thenApply(result -> {

                    check(result);

                    final Iterator<JsonElement> i = result.getParameters().values().iterator();

                    return this.varlink
                            .fromJson(
                                    String.class,
                                    i.next());
                });
    }

}
