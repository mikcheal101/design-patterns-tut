package com.mikkytrionze.design.patterns.behavioural.strategydesignpattern;

import java.time.LocalDate;
import java.util.Random;

public class PaymentService {

    private int cost;
    private boolean includeDelivery;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public void processOrder() {
        // pop up to collect card details
        CreditCard creditCard = new CreditCard("5537721094", LocalDate.now(), "664");

        // validate credit card
        System.out.println("Paying " + getTotal() + " using Credit card!");
        creditCard.setAmount(creditCard.getAmount() + this.getTotal());
    }

    public int getTotal() {
        var random = new Random();
        return this.includeDelivery ? this.cost + (random.nextInt() * 100) : this.cost;
    }

}
