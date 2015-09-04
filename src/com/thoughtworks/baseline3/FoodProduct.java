//this is an Food product
package com.thoughtworks.baseline3;

public class FoodProduct implements Product{

    private double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
