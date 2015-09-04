//this is an medical product
package com.thoughtworks.baseline3;

public class MedicalProduct extends Product {

    private double price;
    private boolean imported;

    public MedicalProduct(double price, boolean imported) {
        this.price = price;
        this.imported = imported;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
