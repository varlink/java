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
