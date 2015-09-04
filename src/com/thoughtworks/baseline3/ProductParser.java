//This class will parse the input from user and return the concrete product object.
package com.thoughtworks.baseline3;

public class ProductParser {

    private String input;

    public ProductParser(String input) {
        this.input = input;
    }

    public Product parse() {
        String[] inputTokens = input.split(" ");
        try {
            double price = Double.parseDouble(inputTokens[inputTokens.length-1]);
            if(input.contains("headache pills"))
                return new MedicalProduct(price, isImported(input));
            if(input.contains("book"))
                return new BookProduct(price, isImported(input));
            if(input.contains("chocolate"))
                return new FoodProduct(price, isImported(input));
            return new NonExemptedProduct(price, isImported(input));
        } catch (Exception e) {
            return new InvalidProduct(0);
        }
    }

    public boolean isImported(String input) {
        if(input == null)
            return false;
        return input.contains("imported");
    }

    public boolean isFood(String input) {
        if(input == null)
            return false;
        return input.contains("chocolates");
    }

    public boolean isMedicalProduct(String input) {
        if(input == null)
            return false;
        return input.contains("headache pills");
    }

    public boolean isBook(String input) {
        if(input == null)
            return false;
        return input.contains("book");
    }
}
