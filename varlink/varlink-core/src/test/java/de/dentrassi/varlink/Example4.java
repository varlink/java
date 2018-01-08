package de.dentrassi.varlink;

public class Example4 {
    public static void main(final String[] args) throws Exception {

        try (final Varlink v = Varlink.varlink()) {
            v.resolveSync(Example4.class);
        }

    }
}
