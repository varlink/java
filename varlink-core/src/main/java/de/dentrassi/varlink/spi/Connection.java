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

import java.util.concurrent.CompletableFuture;

public interface Connection extends AutoCloseable {

    /*
     * FIXME: offer a way to close call while it is running
     */
    public CompletableFuture<CallResponse> call(CallRequest call);

}
