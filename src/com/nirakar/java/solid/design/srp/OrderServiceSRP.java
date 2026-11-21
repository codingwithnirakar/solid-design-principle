package com.nirakar.java.solid.design.srp;

public class OrderServiceSRP {

    private InventoryService inventoryService;
    private TaxService taxService;
    private EmailService emailService;

    public OrderServiceSRP(InventoryService inventoryService, TaxService taxService, EmailService emailService) {
        this.inventoryService = inventoryService;
        this.taxService = taxService;
        this.emailService = emailService;
    }

    public void processOrder(String product) {
        if (inventoryService.isAvailable(product)) {
            taxService.taxCalculation(product);
            emailService.sendOrderConfirmation(product);
            System.out.println("Order processed for product: " + product);
        } else {
            System.out.println("Product is out of stock: " + product);
        }
    }
}
