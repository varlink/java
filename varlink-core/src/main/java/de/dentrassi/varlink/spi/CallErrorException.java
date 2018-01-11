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

public class CallErrorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final CallResponse result;

    public CallErrorException(final CallResponse result) {
        super(result.getError());
        this.result = result;
    }

    public String getError() {
        return this.result.getError();
    }

    public CallResponse getCallResult() {
        return this.result;
    }

}
