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

import static java.nio.file.Paths.get;

import java.lang.reflect.Type;
import java.net.URI;
import java.nio.file.Path;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import de.dentrassi.varlink.Resolver;
import de.dentrassi.varlink.Varlink;
import de.dentrassi.varlink.spi.Connection;
import de.dentrassi.varlink.spi.Factory;
import de.dentrassi.varlink.spi.Interface;
import io.netty.channel.epoll.EpollEventLoopGroup;

public final class VarlinkImpl implements Varlink {

    private final EpollEventLoopGroup group;
    private final org.varlink.Resolver resolver;

    public VarlinkImpl() {
        this.group = new EpollEventLoopGroup(1);
        this.resolver = newService(org.varlink.Resolver.class, "unix:/run/org.varlink.resolver");
    }

    @Override
    public void close() throws Exception {
        this.group.shutdownGracefully().get();
    }

    public Connection newConnection(final Path socket) {
        return new ConnectionImpl(this.group, socket);
    }

    @Override
    public <T> T newService(final Class<T> clazz, final String address) {

        final URI uri = URI.create(address);

        if ("unix".equals(uri.getScheme())) {
            return newService(clazz, get(cleanup(uri.getPath())));
        }

        throw new IllegalArgumentException("Unkown address scheme: " + uri.getScheme());
    }

    @Override
    public <T> T newService(final Class<T> clazz, final Path path) {

        final Interface iface = clazz.getAnnotation(Interface.class);
        if (iface == null) {
            throw new IllegalStateException(
                    String.format("Service class %s is missing annotation @%s", clazz, Interface.class.getName()));
        }

        try {
            final Factory factory = iface.factory().newInstance();

            return factory.create(this, clazz, newConnection(path));
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Failed to instantiate service factory", e);
        }
    }

    private static String cleanup(final String path) {
        return path.split("\\;")[0];
    }

    @Override
    public Resolver resolver() {
        return new ResolverImpl(this, this.resolver);
    }

    public <T> T fromJson(final Class<T> clazz, final String json) {
        return new GsonBuilder().create().fromJson(json, clazz);
    }

    public <T> T fromJson(final Class<T> clazz, final JsonElement json) {
        return new GsonBuilder().create().fromJson(json, clazz);
    }

    public <T> T fromJson(final Type typeOf, final JsonElement json) {
        return new GsonBuilder().create().fromJson(json, typeOf);
    }
}
