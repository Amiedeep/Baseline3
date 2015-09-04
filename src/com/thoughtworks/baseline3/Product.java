//this is an interface which other product items inherit.
package com.thoughtworks.baseline3;

import static java.lang.Math.round;

abstract class Product {

    abstract double calculateTax();

    public double roundTax(double price, int taxPercentage) {
        double taxAmount = (price*taxPercentage)/100;
        taxAmount = (int)(taxAmount*100);
        if(taxAmount%10 == 5) {
            return (double)taxAmount/100;
        }
        else {
            taxAmount = (int)round((double)taxAmount / 10);
            return (double)taxAmount/10;
        }
    }
}
