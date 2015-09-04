//this is an interface which other product items inherit.
package com.thoughtworks.baseline3;

abstract class Product {

    abstract double calculateTax();

    public double roundTax(double price, int taxPercentage) {
        double taxAmount = (price*taxPercentage)/100;
        taxAmount = (int)(taxAmount*100);
            return (double)taxAmount/100;
    }
}
