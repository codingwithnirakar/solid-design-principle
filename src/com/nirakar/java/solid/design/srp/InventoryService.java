package com.nirakar.java.solid.design.srp;

public class InventoryService {


    public boolean isAvailable(String product) {
        if (product == null || product.isEmpty()) {
            throw new IllegalArgumentException(
                    "Invalid product");
        }
        return true;
    }
}

