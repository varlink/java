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

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dentrassi.varlink.spi.CallRequest;
import de.dentrassi.varlink.spi.CallResponse;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;

public class CallHandler extends ChannelDuplexHandler {

    private static final Logger logger = LoggerFactory.getLogger(CallHandler.class);

    private final CallRequest call;
    private final CompletableFuture<CallResponse> result;

    public CallHandler(final CallRequest call, final CompletableFuture<CallResponse> result) {
        this.call = call;
        this.result = result;
    }

    @Override
    public void channelActive(final ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        ctx.writeAndFlush(this.call);
    }

    @Override
    public void channelRead(final ChannelHandlerContext ctx, final Object msg) throws Exception {
        ctx.close();
        this.result.complete((CallResponse) msg);
    }

    @Override
    public void channelInactive(final ChannelHandlerContext ctx) throws Exception {
        this.result.completeExceptionally(new IOException("Cannel closed"));
        super.channelInactive(ctx);
    }

    @Override
    public void exceptionCaught(final ChannelHandlerContext ctx, final Throwable cause) throws Exception {
        this.logger.warn("Channel failed", cause);

        ctx.close();
        this.result.completeExceptionally(cause);

        super.exceptionCaught(ctx, cause);
    }

}
