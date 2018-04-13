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
package de.dentrassi.varlink.generator;

import java.io.IOException;
import java.nio.file.Paths;

import de.dentrassi.varlink.generator.Generator.Options;
import de.dentrassi.varlink.maven.Loader;

public class TestGenerator {
    public static void main(final String[] args) throws IOException {

        final Options options = new Options();
        options.setTargetPath(Paths.get("src/test/java"));

        final Loader loader = new Loader();

        final Generator generator = new JdtGenerator(options);

        loader.loadFrom(Paths.get("../test.varlink"));
        generator.generateAll(loader);
    }
}
