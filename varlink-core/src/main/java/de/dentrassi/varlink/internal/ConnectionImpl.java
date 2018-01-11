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

import static io.netty.handler.codec.Delimiters.nulDelimiter;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.net.SocketAddress;
import java.nio.file.Path;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dentrassi.varlink.spi.CallRequest;
import de.dentrassi.varlink.spi.CallResponse;
import de.dentrassi.varlink.spi.Connection;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollDomainSocketChannel;
import io.netty.channel.unix.DomainSocketAddress;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.json.JsonObjectDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LoggingHandler;

class ConnectionImpl implements Connection {

    private static final Logger logger = LoggerFactory.getLogger(ConnectionImpl.class);

    private static final String PROTOCOL_LOGGER_NAME = ConnectionImpl.class.getName() + ".protocol";
    private static final Logger PROTOCOL_LOGGER = LoggerFactory.getLogger(PROTOCOL_LOGGER_NAME);

    private static final int MAX_FRAME_LENGTH = 64 * 1024;

    @SuppressWarnings("unused")
    private static final String LINK = "\uD83D\uDD17";

    private final SocketAddress address;
    private final EventLoopGroup group;

    protected final ChannelHandler stringEncoder = new StringEncoder(UTF_8);

    ConnectionImpl(final EventLoopGroup group, final Path socket) {
        Objects.requireNonNull(group);
        Objects.requireNonNull(socket);

        this.group = group;
        this.address = new DomainSocketAddress(socket.toFile());
    }

    @Override
    public void close() throws Exception {
    }

    @Override
    public CompletableFuture<CallResponse> call(final CallRequest call) {

        final CompletableFuture<CallResponse> result = new CompletableFuture<>();

        final Bootstrap bootstrap = new Bootstrap()
                .group(this.group)
                .channel(EpollDomainSocketChannel.class)
                .handler(new ChannelInitializer<Channel>() {

                    @Override
                    protected void initChannel(final Channel channel) throws Exception {

                        if (PROTOCOL_LOGGER.isDebugEnabled()) {
                            channel
                                    .pipeline()
                                    .addLast(new LoggingHandler(PROTOCOL_LOGGER_NAME));
                        }

                        channel
                                .pipeline()
                                .addLast(new DelimiterBasedFrameDecoder(MAX_FRAME_LENGTH, nulDelimiter()))
                                .addLast(NullByteEncoder.INSTANCE)
                                .addLast(new JsonObjectDecoder())
                                .addLast(ConnectionImpl.this.stringEncoder)
                                .addLast(new StringDecoder(UTF_8))
                                .addLast(new VarlinkCodec())
                                .addLast(new CallHandler(call, result));

                    }
                });

        logger.debug("Connecting: {}", this.address);

        final ChannelFuture future = bootstrap.connect(this.address);

        final Channel channel = future.channel();

        future.addListener(v -> {

            logger.debug("connect complete");

            try {
                future.get();

                logger.debug("connect completed successfully");
            } catch (final Throwable e) {
                logger.debug("connect failed", e);
                channel.close();
                result.completeExceptionally(e);
            }
        });

        return result;
    }

}
