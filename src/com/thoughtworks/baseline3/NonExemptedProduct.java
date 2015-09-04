//this is an Non-exempted product
package com.thoughtworks.baseline3;

public class NonExemptedProduct implements Product{

    private double price;

    public NonExemptedProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
