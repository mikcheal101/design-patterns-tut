package com.mikkytrionze.design.patterns.behavioural.strategydesignpattern;

import java.time.LocalDate;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard creditCard;

    @Override
    public void pay(double amount)  {
        System.out.println("Paying " + amount + " using credit card!");
        this.creditCard.setAmount(amount);
    }

    @Override
    public void collectPaymentDetails() {
        // collect card details
        this.creditCard = new CreditCard("8978564321", LocalDate.now(), "123");
    }

    @Override
    public boolean validatePayment() {
        // simulate card details validation
        return true;
    }
}
