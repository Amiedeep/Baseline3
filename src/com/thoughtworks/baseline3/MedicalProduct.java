//this is an medical product
package com.thoughtworks.baseline3;

public class MedicalProduct implements Product {

    private double price;

    public MedicalProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
