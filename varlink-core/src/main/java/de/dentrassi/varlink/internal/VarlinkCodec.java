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

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.dentrassi.varlink.spi.CallResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;

public class VarlinkCodec extends MessageToMessageCodec<String, Object> {

    private final Gson gson = new GsonBuilder().create();

    @Override
    protected void encode(final ChannelHandlerContext ctx, final Object msg, final List<Object> out) throws Exception {
        out.add(this.gson.toJson(msg));
    }

    @Override
    protected void decode(final ChannelHandlerContext ctx, final String msg, final List<Object> out) throws Exception {
        out.add(this.gson.fromJson(msg, CallResponse.class));
    }

}
