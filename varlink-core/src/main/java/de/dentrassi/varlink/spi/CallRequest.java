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

import static java.util.Collections.emptyMap;
import static java.util.Collections.unmodifiableMap;
import static java.util.Objects.requireNonNull;

import java.util.HashMap;
import java.util.Map;

public final class CallRequest {
    private final String method;
    private final Map<String, Object> parameters;

    private CallRequest(final String method, final Map<String, Object> parameters) {
        this.method = method;
        this.parameters = parameters;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    public static CallRequest of(final String method, final Map<String, ?> parameters) {

        requireNonNull(method);
        requireNonNull(parameters);

        return new CallRequest(method, unmodifiableMap(new HashMap<>(parameters)));
    }

    public static CallRequest of(final String method) {

        requireNonNull(method);

        return new CallRequest(method, emptyMap());
    }
}
