package com.mikkytrionze.design.patterns.behavioural.strategydesignpattern;

public class PaymentByPayPal implements PaymentStrategy {
    private String email;
    private String password;
    
    @Override
    public void pay(double amount) {
        // validate account
        System.out.printf("Paying %.2f using Paypal!", amount); 
    }

    @Override
    public boolean validatePayment() {
        // simulate validation
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        this.email = "sample@mail.com";
        this.password = "passcode@129";
    }
}
 