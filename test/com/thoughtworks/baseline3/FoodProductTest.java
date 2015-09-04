package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FoodProductTest {

    private FoodProduct foodProduct;

    @Test
    public void shouldreturnPriceAsTaxByDefault() {
        foodProduct = new FoodProduct(5.6, true);

        assertEquals(5.6, foodProduct.calculateTax());
    }
}