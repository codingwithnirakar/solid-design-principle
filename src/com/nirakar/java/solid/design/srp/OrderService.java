package com.nirakar.java.solid.design.srp;

public class OrderService {

    // Called by Store Manager
    public void inventoryValidation(String product){
        System.out.println("Inventory Validation");
        productValidation("Availability");
    }

    // Called By Tax calculator
    public void taxCalculation(String product){
        System.out.println("Tax Calculation");
        productValidation("TaxOnAvailabilityProduct");
    }

    // Called by CustomerCare
    public void emailVerification(String product){
        System.out.println("Email Verification");
        productValidation("IsProductPacked");
    }


    // Common code which is used to validate the actual product or not ?
    private void productValidation(String product) {
        // Validation logic to check if the product is valid or not
        if(product == null || product.isEmpty()){
            throw new IllegalArgumentException("Product is not valid");
        }
        System.out.println("Product Validation : "+ product);
    }
}


