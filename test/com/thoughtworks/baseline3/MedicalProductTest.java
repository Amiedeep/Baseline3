package com.thoughtworks.baseline3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MedicalProductTest {

    private MedicalProduct medicalProduct;

    @Test
    public void shouldreturnPriceAsTaxByDefault() {
        medicalProduct = new MedicalProduct(5.6, true);

        assertEquals(5.6, medicalProduct.calculateTax());
    }
}