package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AppTest {

    @Test
    void testRegularCustomerNoDiscount() {
        double result = App.calc(List.of(100.0), List.of(2), "REGULAR", "");
        assertEquals(238.0, result, 0.01);
    }

    @Test
    void testSAVE10Discount() {
        double result = App.calc(List.of(100.0), List.of(1), "REGULAR", "SAVE10");
        assertEquals(107.1, result, 0.01);
    }

    @Test
    void testSAVE20Discount() {
        double result = App.calc(List.of(100.0), List.of(1), "REGULAR", "SAVE20");
        assertEquals(95.2, result, 0.01);
    }

    @Test
    void testVIPCustomer() {
        double result = App.calc(List.of(100.0), List.of(1), "VIP", "");
        assertEquals(113.05, result, 0.01);
    }

    @Test
    void testVIPWithSAVE10() {
        double result = App.calc(List.of(100.0), List.of(1), "VIP", "SAVE10");
        assertEquals(101.745, result, 0.01);
    }
}