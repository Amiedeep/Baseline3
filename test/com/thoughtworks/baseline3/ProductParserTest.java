package com.thoughtworks.baseline3;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductParserTest {

    private ProductParser productParser;

    @Before
    public void setUp() {
        productParser = new ProductParser("1 book at 12.49");
    }

    @Test
    public void shouldReturnFalseWhenICallIsImportedWithNull() {
        assertEquals(productParser.isImported(null), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsImportedWithNotImportedInput() {
        assertEquals(productParser.isImported("1 bottle of perfume at 18.99"), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsImportedWithImportedInput() {
        assertEquals(productParser.isImported("1 imported bottle of perfume at 27.99"), true);
    }
}