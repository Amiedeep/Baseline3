//This class will parse the input from user and return the concrete product object.
package com.thoughtworks.baseline3;

public class ProductParser {

    private String input;

    public ProductParser(String input) {
        this.input = input;
    }


    public boolean isImported(String input) {
        if(input == null)
            return false;
        return input.contains("imported");
    }
}
