package org.example;

public class DiscountCalculator {

    public double apply(double subtotal, String discountCode, String customerType) {
        if (discountCode.equals("SAVE10")) subtotal *= 0.90;
        if (discountCode.equals("SAVE20")) subtotal *= 0.80;
        if (customerType.equals("VIP")) subtotal *= 0.95;
        return subtotal;
    }
}