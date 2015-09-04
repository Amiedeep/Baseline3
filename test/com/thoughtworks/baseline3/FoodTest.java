package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FoodTest {
    private Food food;

    @Test
    public void shouldreturnPriceAsTaxByDefault() {
        food = new Food(5.6);

        assertEquals(5.6, food.calculateTax());
    }
}