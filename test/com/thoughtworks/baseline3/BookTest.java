package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    private Book book;

    @Test
    public void shouldreturnPriceAsTaxByDefault() {
        book = new Book(5.6);

        assertEquals(5.6, book.calculateTax());
    }
}