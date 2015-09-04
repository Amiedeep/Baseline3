//this is an Food product
package com.thoughtworks.baseline3;

public class FoodProduct extends Product{

    private double price;
    private boolean imported;

    public FoodProduct(double price, boolean imported) {
        this.price = price;
        this.imported = imported;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
