# Varlink Java Maven Plugin

This is a Maven plugin which generates all the Java client code for a given varlink file.

In order to use this create a standard `jar` or `bundle` packaging Maven module and add the
plugin to the `pom.xml`:

~~~xml
<build>
    <plugins>
        <plugin>
            <groupId>de.dentrassi.varlink</groupId>
            <artifactId>varlink-maven-plugin</artifactId>
            <version><!-- plugin version --></version>
            <executions>
                <execution>
                    <goals>
                        <goal>generate</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
~~~

You will either need to add the dependencies to `varlink-java` manually or
use `varlink-bindings` as module parent:

~~~xml
<parent>
    <groupId>de.dentrassi.varlink.bindings</groupId>
    <artifactId>varlink-bindings</artifactId>
    <version><!-- varlink version --></version>
</parent>
~~~ 