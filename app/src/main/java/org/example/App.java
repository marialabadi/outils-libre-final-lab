package org.example;

import java.util.List;

public class App {

    public static double calc(List<Double> prices,
                              List<Integer> quantities,
                              String customerType,
                              String discountCode) {
        double total = 0;
        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i) * quantities.get(i);
        }
        // discount
        if (discountCode.equals("SAVE10")) total = total - total * 0.10;
        if (discountCode.equals("SAVE20")) total = total - total * 0.20;
        // VIP
        if (customerType.equals("VIP")) total = total - total * 0.05;
        // tax
        total = total + total * 0.19;
        return total;
    }

    public static void main(String[] args) {
        double result = calc(List.of(100.0, 50.0), List.of(2, 3), "VIP", "SAVE10");
        System.out.println("Final price: " + result);
    }
}