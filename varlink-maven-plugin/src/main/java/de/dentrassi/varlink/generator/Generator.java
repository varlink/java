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
package de.dentrassi.varlink.generator;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import de.dentrassi.varlink.idl.varlinkIdl.Interface;
import de.dentrassi.varlink.maven.Loader;

public interface Generator {
    public void generate(Interface varlinkInterface);

    public default void generateAll(final Collection<Interface> interfaces) {
        interfaces.stream().forEach(this::generate);
    }

    public default void generateAll(final Loader loader) {
        generateAll(loader.getInterfaces());
    }

    public static final class Options {
        private Path targetPath;
        private Charset characterSet = StandardCharsets.UTF_8;

        public Options() {
        }

        public Options(final Options other) {
            this.targetPath = other.targetPath;
            this.characterSet = other.characterSet;
        }

        public void setCharacterSet(final Charset characterSet) {
            this.characterSet = characterSet != null ? characterSet : StandardCharsets.UTF_8;
        }

        public Charset getCharacterSet() {
            return this.characterSet;
        }

        public void setTargetPath(final Path targetPath) {
            this.targetPath = targetPath;
        }

        public Path getTargetPath() {
            return this.targetPath;
        }

        public void validate(final List<Exception> errors) {
            if (this.targetPath == null) {
                errors.add(new IllegalStateException("'targetPath' is not set"));
            }
        }

        public void validate() {
            final LinkedList<Exception> errors = new LinkedList<>();
            validate(errors);

            if (!errors.isEmpty()) {
                final RuntimeException e = new RuntimeException("Invalid generator settings", errors.pollFirst());
                errors.stream().forEach(e::addSuppressed);
                throw e;
            }
        }
    }
}
