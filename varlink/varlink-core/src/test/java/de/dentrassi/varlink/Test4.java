package de.dentrassi.varlink;

public class Test4 {
    public static void main(final String[] args) throws Exception {

        try (final Varlink v = Varlink.varlink()) {
            v.resolveSync(Test4.class);
        }

    }
}
