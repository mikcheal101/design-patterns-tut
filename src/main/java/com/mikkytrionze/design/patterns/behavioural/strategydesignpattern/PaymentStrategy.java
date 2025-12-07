package com.mikkytrionze.design.patterns.behavioural.strategydesignpattern;

public interface PaymentStrategy {
    void pay(double amount);
    boolean validatePayment();
    void collectPaymentDetails();
}
