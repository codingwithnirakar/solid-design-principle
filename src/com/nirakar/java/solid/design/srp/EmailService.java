package com.nirakar.java.solid.design.srp;

public class EmailService {

    public void sendOrderConfirmation(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException(
                "Invalid email");
        }
        System.out.println("Email Verification");
    }
}
