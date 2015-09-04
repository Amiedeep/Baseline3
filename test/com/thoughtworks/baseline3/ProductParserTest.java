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

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithNonFoodInputItem() {
        assertEquals(productParser.isFood("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsFoodWithNullInputItem() {
        assertEquals(productParser.isFood(null), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsFoodWithChocolateFoodInputItem() {
        assertEquals(productParser.isFood("1 box of imported chocolates at 11.25"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsMedicalProductWithNonMedicalInputItem() {
        assertEquals(productParser.isMedicalProduct("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsMedicalProductWithNullAsInputItem() {
        assertEquals(productParser.isMedicalProduct(null), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsMedicalProductSomeMedicalProductAsInputItem() {
        assertEquals(productParser.isMedicalProduct("1 packet of headache pills at 9.75"), true);
    }

    @Test
    public void shouldReturnFalseWhenICallIsBookWithNonBookInputItem() {
        assertEquals(productParser.isBook("1 imported box of something at 10.00"), false);
    }

    @Test
    public void shouldReturnFalseWhenICallIsBookWithNullAsInputItem() {
        assertEquals(productParser.isBook(null), false);
    }

    @Test
    public void shouldReturnTrueWhenICallIsBookWithSomeBookAsInputItem() {
        assertEquals(productParser.isBook("1 book at 12.49"), true);
    }

    @Test
    public void shouldReturnMeFoodProductObjectWhenIPassSomeFoodItemToParse() {
        productParser = new ProductParser("1 chocolate bar at 0.85");
        assertEquals(FoodProduct.class, productParser.parse().getClass());
    }

    @Test
    public void shouldReturnMeInvalidProductObjectWhenIPassSomethingRandomToParse() {
        productParser = new ProductParser("some non-sense");
        assertEquals(InvalidProduct.class, productParser.parse().getClass());
    }

    @Test
    public void shouldReturnMeMedicalProductObjectWhenIPassSomeMedicalItemToParse() {
        productParser = new ProductParser("1 packet of headache pills at 9.75");
        assertEquals(MedicalProduct.class, productParser.parse().getClass());
    }

    @Test
    public void shouldReturnMeBookProductObjectWhenIPassSomeBookItemToParse() {
        productParser = new ProductParser("1 book at 12.49");
        assertEquals(BookProduct.class, productParser.parse().getClass());
    }

    @Test
    public void shouldReturnMeNonExemptedProductObjectWhenIPassSomeNonExemptedItemToParse() {
        productParser = new ProductParser("1 imported bottle of perfume at 47.50");
        assertEquals(NonExemptedProduct.class, productParser.parse().getClass());
    }
}