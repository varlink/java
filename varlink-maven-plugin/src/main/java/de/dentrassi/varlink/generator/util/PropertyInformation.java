package de.dentrassi.varlink.generator.util;

public class PropertyInformation {
    private final String type;
    private final String name;
    private final String summary;
    private final String description;

    public PropertyInformation(final String type, final String name, final String summary, final String description) {
        this.type = type;
        this.name = name;
        this.summary = summary;
        this.description = description;
    }

    public String getType() {
        return this.type;
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