package com.nirakar.java.solid.design.srp;

public class OrderServiceTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.inventoryValidation("Availability");
        orderService.taxCalculation("TaxOnAvailabilityProduct");
        orderService.emailVerification("IsProductPacked");
    }
}
