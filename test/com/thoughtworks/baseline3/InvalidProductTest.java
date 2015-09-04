package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InvalidProductTest {

    private InvalidProduct invalidProduct;

    @Test
    public void shouldreturnPriceAsTaxByDefault() {
        invalidProduct = new InvalidProduct(5.6);

        assertEquals(5.6, invalidProduct.calculateTax());
    }
}