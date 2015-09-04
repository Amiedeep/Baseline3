package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NonExemptedProductTest {

    private NonExemptedProduct nonExemptedProduct;

    @Test
    public void shouldreturnPriceAsTaxByDefault() {
        nonExemptedProduct = new NonExemptedProduct(5.6);

        assertEquals(5.6, nonExemptedProduct.calculateTax());
    }
}