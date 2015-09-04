//this is an Non-exempted product
package com.thoughtworks.baseline3;

public class NonExemptedProduct extends Product{

    private double price;
    private boolean imported;

    public NonExemptedProduct(double price, boolean imported) {
        this.price = price;
        this.imported = imported;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
