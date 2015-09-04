//this is an invalid product
package com.thoughtworks.baseline3;

public class InvalidProduct implements Product {

    private double price;

    public InvalidProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
