# Varlink for Java [![Build status](https://api.travis-ci.org/varlink/java.svg)](https://travis-ci.org/varlink/java) [![Maven Central](https://img.shields.io/maven-central/v/de.dentrassi.varlink/varlink-parent.svg "Maven Central Status")](https://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22de.dentrassi.varlink%22%20AND%20a%3A%22varlink-core%22)

"Varlink for Java" are Java bindings and tools for [Varlink](http://varlink.org "Varlink").

## Maven plugin

There is [Maven plugin](https://ctron.github.io/varlink-java/varlink-maven-plugin/plugin-info.html "Varlink Maven Plugin")
which creates a default Java client based on a varlink file.
You can add this to your Maven project using:

~~~xml
<plugin>
  <groupId>de.dentrassi.varlink</groupId>
  <artifactId>varlink-maven-plugin</artifactId>
  <version><!-- plugin version--></version>
</plugin>
~~~

## Eclipse Varlink File Editor

There is an Eclipse editor for Varlink based files. It can be installed using the Eclipse Marketplace:

[![Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client](https://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3863413 "Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client")

## P2 Repository

Varlink for Java also provides a P2 repository: https://varlink.github.io/java/p2/latest

## Building the project

This project consists of two main builds. The first is a plain maven build and the second is a Maven Tycho based build.
Unfortunately this is necessary due to the way the different components work. I am happy to receive a PR which
fixes this nightmare ;-)

In order to build this project you need to issue the following two commands:

~~~sh
mvn clean install
mvn clean install -f varlink-idl/pom.xml
~~~