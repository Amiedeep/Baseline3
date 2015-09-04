//this is an a book product
package com.thoughtworks.baseline3;

public class BookProduct implements Product{

    private double price;

    public BookProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
