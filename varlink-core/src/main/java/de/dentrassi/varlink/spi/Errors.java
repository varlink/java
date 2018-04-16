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
package de.dentrassi.varlink.spi;

import java.util.function.BiFunction;

public final class Errors {

    private Errors() {
    }

    public static void check(final CallResponse response) {
        if (!response.isError()) {
            return;
        }

        throw new CallErrorException(response);
    }

    public static void checkErrors(final CallResponse response,
            final BiFunction<String, CallResponse, RuntimeException> errorMapper) {

        if (!response.isError()) {
            return;
        }

        final String errorName = response.getError();
        if (errorName != null && errorMapper != null) {
            final RuntimeException error = errorMapper.apply(errorName, response);
            if (error != null) {
                throw error;
            }
        }

        throw new CallErrorException(response);
    }

}
