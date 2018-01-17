package de.dentrassi.varlink.generator.util;

public class TypeInformation {
    private final String name;
    private final String summary;
    private final String description;

    public TypeInformation(final String name, final String summary, final String description) {
        this.name = name;
        this.summary = summary;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getDescription() {
        return this.description;
    }
}