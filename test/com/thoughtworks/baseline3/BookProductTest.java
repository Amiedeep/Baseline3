package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookProductTest {

    private BookProduct bookProduct;

    @Test
    public void shouldreturnPriceAsTaxByDefault() {
        bookProduct = new BookProduct(5.6, true);

        assertEquals(5.6, bookProduct.calculateTax());
    }
}