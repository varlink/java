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

import java.util.Map;

import com.google.gson.JsonElement;

public class CallResponse {

    private Map<String, JsonElement> parameters;

    private String error;

    public void setParameters(final Map<String, JsonElement> parameters) {
        this.parameters = parameters;
    }

    public Map<String, JsonElement> getParameters() {
        return this.parameters;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }

    public boolean isError() {
        return this.error != null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[CallResponse - ");

        if (isError()) {
            sb.append("ERROR: ").append(this.error);
        }

        for (final Map.Entry<String, ?> entry : this.parameters.entrySet()) {
            sb
                    .append("\n'")
                    .append(entry.getKey())
                    .append("' -> '")
                    .append(entry.getValue())
                    .append("'");
        }

        sb.append("]");
        return sb.toString();
    }
}
