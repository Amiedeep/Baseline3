//this is an Food product
package com.thoughtworks.baseline3;

public class Food implements Product{

    private double price;

    public Food(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
