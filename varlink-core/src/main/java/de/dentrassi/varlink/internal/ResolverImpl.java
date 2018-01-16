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
package de.dentrassi.varlink.internal;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dentrassi.varlink.Resolver;
import de.dentrassi.varlink.spi.Interface;

public class ResolverImpl implements Resolver {

    private static final Logger logger = LoggerFactory.getLogger(ResolverImpl.class);

    private final org.varlink.Resolver resolver;

    private final VarlinkImpl varlink;

    public ResolverImpl(final VarlinkImpl varlink, final org.varlink.Resolver resolver) {
        this.varlink = varlink;
        this.resolver = resolver;
    }

    @Override
    public Async async() {
        return new Async() {

            @Override
            public <T> CompletableFuture<T> resolve(final Class<T> clazz) {
                return executeResolve(clazz);
            }

        };
    }

    protected <T> CompletableFuture<T> executeResolve(final Class<T> clazz) {

        final String _interface = interfaceFromClass(clazz);

        return this.resolver
                .async()
                .resolve(_interface)
                .thenApply(address -> {
                    return newService(address, clazz);
                });
    }

    private <T> T newService(final String address, final Class<T> clazz) {

        logger.debug("Create new service instance - {} -> {}", clazz, address);

        return this.varlink.newService(clazz, address);
    }

    private String interfaceFromClass(final Class<?> clazz) {

        final Interface iface = clazz.getAnnotation(Interface.class);

        if (iface != null) {
            if (iface.name() != null && !iface.name().isEmpty()) {
                return iface.name();
            }
        }

        String s = clazz.getSimpleName();
        s = Character.toLowerCase(s.charAt(0)) + s.substring(1);

        return clazz.getPackage().getName() + "." + s;

    }

}
