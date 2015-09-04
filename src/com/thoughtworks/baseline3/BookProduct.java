//this is an a book product
package com.thoughtworks.baseline3;

public class BookProduct implements Product{

    private double price;
    private boolean imported;

    public BookProduct(double price, boolean imported) {
        this.price = price;
        this.imported = imported;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
