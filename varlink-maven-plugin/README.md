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

For the generated bindings to work, you will also need to add the `varlink-core` as dependency to the `pom.xml`:
~~~xml
<dependencies>
    <dependency>
      <groupId>de.dentrassi.varlink</groupId>
      <artifactId>varlink-core</artifactId>
      <version><!-- varlink-core version --></version>
    </dependency>
</dependencies>
~~~
