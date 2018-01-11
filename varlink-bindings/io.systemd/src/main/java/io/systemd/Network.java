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
package io.systemd;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import de.dentrassi.varlink.spi.Interface;
import de.dentrassi.varlink.spi.Syncer;

@Interface(factory = NetworkImpl.Factory.class)
public interface Network {

    public static class Netdev {

        private int ifindex;
        private String ifname;

        public int getIfindex() {
            return ifindex;
        }

        public void setIfindex(final int ifindex) {
            this.ifindex = ifindex;
        }

        public String getIfname() {
            return ifname;
        }

        public void setIfname(final String ifname) {
            this.ifname = ifname;
        }

    }

    public interface Async {
        public CompletableFuture<List<Netdev>> list();
    }

    public interface Sync {
        public List<Netdev> list();
    }

    public Async async();

    public default Sync sync() {
        return new Sync() {

            @Override
            public List<Netdev> list() {
                return Syncer.await(async().list());
            }
        };
    }

}
