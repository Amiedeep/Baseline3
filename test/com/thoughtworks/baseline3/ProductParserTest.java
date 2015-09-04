package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductParserTest {

    private ProductParser productParser;

    @Test
    public void shouldReturnFalseWhenICallIsImportedWithNull() {
        productParser = new ProductParser("1 book at 12.49");
        assertEquals(productParser.isImported(null), false);
    }
}