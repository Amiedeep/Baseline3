package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    private Product product;

    @Test
    public void shouldReturnMeTheValueInFiveMultipleIfIPassDoubleWithSecondDecimalAsFive() {
        product = new Product() {
            @Override
            double calculateTax() {
                return 0;
            }
        };
        assertEquals(4.75, product.roundTax(47.50, 10));
    }
}