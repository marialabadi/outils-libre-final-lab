package org.example;

import java.util.List;

public class App {

    public static double calc(List<Double> prices,
                              List<Integer> quantities,
                              String customerType,
                              String discountCode) {
        PricingEngine engine = new PricingEngine();
        return engine.calculate(prices, quantities, customerType, discountCode);
    }

    public static void main(String[] args) {
        double result = calc(List.of(100.0, 50.0), List.of(2, 3), "VIP", "SAVE10");
        System.out.println("Final price: " + result);
    }
}