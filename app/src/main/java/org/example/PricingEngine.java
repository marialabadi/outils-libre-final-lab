package org.example;

import java.util.List;

public class PricingEngine {

    private DiscountCalculator discountCalc = new DiscountCalculator();
    private TaxCalculator taxCalc = new TaxCalculator();

    public double calculate(List<Double> prices, List<Integer> quantities,
                            String customerType, String discountCode) {
        double subtotal = 0;
        for (int i = 0; i < prices.size(); i++) {
            subtotal += prices.get(i) * quantities.get(i);
        }
        double discounted = discountCalc.apply(subtotal, discountCode, customerType);
        return taxCalc.apply(discounted);
    }
}
