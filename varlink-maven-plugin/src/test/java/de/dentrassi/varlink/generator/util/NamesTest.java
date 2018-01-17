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
package de.dentrassi.varlink.generator.util;

import static de.dentrassi.varlink.generator.util.Names.toCamelCase;
import static de.dentrassi.varlink.generator.util.Names.toLowerDash;
import static de.dentrassi.varlink.generator.util.Names.toUpperUnderscore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NamesTest {

    @Test
    public void testNull() {
        assertNull(toCamelCase(null, false));
        assertNull(toCamelCase(null, true));
    }

    @Test
    public void testSimple1() {
        assertEquals("", toCamelCase("", true));
    }

    @Test
    public void testSimple2() {
        assertEquals("Foo", toCamelCase("Foo", true));
    }

    @Test
    public void testSimple3() {
        assertEquals("Foo", toCamelCase("foo", true));
    }

    @Test
    public void testSimple4() {
        assertEquals("foo", toCamelCase("Foo", false));
    }

    @Test
    public void testSimple5() {
        assertEquals("foo", toCamelCase("foo", false));
    }

    @Test
    public void testMore1() {
        assertEquals("fooBarBaz", toCamelCase("FooBarBaz", false));
    }

    @Test
    public void testMore2() {
        assertEquals("FooBarBaz", toCamelCase("FOO_BAR_BAZ", true));
    }

    @Test
    public void testMore3() {
        assertEquals("FooBarBaz", toCamelCase("foo-bar-baz", true));
    }

    @Test
    public void testAll1() {
        assertAll("FOO_BAR_BAZ", "fooBarBaz", "FooBarBaz", "foo-bar-baz", "FOO_BAR_BAZ");
    }

    @Test
    public void testAll2() {
        assertAll("FooBarBaz", "fooBarBaz", "FooBarBaz", "foo-bar-baz", "FOO_BAR_BAZ");
    }

    @Test
    public void testAll3() {
        assertAll("foo-bar-baz", "fooBarBaz", "FooBarBaz", "foo-bar-baz", "FOO_BAR_BAZ");
    }

    @Test
    public void testAll4() {
        assertAll("field11Bar", "field11Bar", "Field11Bar", "field-11-bar", "FIELD_11_BAR");
    }

    @Test
    public void testAll5() {
        assertAll("fieldB11ar", "fieldB11Ar", "FieldB11Ar", "field-b11-ar", "FIELD_B11_AR");
    }

    @Test
    public void testAll6() {
        assertAll("fieldBBar", "fieldBbar", "FieldBbar", "field-bbar", "FIELD_BBAR");
    }

    public static void assertAll(final String text, final String camelLower, final String camelUpper,
            final String lowerDash, final String upperUnderscore) {
        assertEquals(camelLower, toCamelCase(text, false));
        assertEquals(camelUpper, toCamelCase(text, true));

        assertEquals(lowerDash, toLowerDash(text));
        assertEquals(upperUnderscore, toUpperUnderscore(text));
    }
}
