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
package io.systemd.network;

import static de.dentrassi.varlink.spi.Errors.check;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import de.dentrassi.varlink.internal.VarlinkImpl;
import de.dentrassi.varlink.spi.CallRequest;
import de.dentrassi.varlink.spi.Connection;

public class NetworkImpl implements Network {

    public static class Factory implements de.dentrassi.varlink.spi.Factory {

        @Override
        public <T> T create(final VarlinkImpl varlink, final Class<T> clazz, final Connection connection) {
            return clazz.cast(new NetworkImpl(varlink, connection));
        }

    }

    private final Connection connection;
    private final VarlinkImpl varlink;

    private NetworkImpl(final VarlinkImpl varlink, final Connection connection) {
        this.varlink = varlink;
        this.connection = connection;
    }

    @Override
    public Async async() {
        return new Async() {

            @Override
            public CompletableFuture<List<Netdev>> list() {
                return executeList();
            }
        };
    }

    protected CompletableFuture<List<Netdev>> executeList() {
        return this.connection.call(CallRequest.of("io.systemd.network.List"))
                .thenApply(cr -> {
                    check(cr);

                    return asList(
                            this.varlink
                                    .fromJson(
                                            Netdev[].class,
                                            cr.getFirstParameter()));
                });
    }

}
