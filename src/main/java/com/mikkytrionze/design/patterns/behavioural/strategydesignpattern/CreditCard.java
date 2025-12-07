package com.mikkytrionze.design.patterns.behavioural.strategydesignpattern;

import java.time.LocalDate;

public class CreditCard {

    private double amount = 1_000;
    private String number;
    private LocalDate expiryDate = LocalDate.now();
    private String cvv;

    public CreditCard(String number, LocalDate expiryDate, String cvv) {
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getNumber() {
        return this.number;
    }

    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public String getCvv() {
        return this.cvv;
    }

}
