package com.mikkytrionze.design.patterns.behavioural.strategydesignpattern;

import java.util.Random;

public class PaymentService {

    private int cost;
    private boolean includeDelivery;
    private final PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public void processOrder() {

        this.paymentStrategy.collectPaymentDetails();
        if (this.paymentStrategy.validatePayment()) {
            this.paymentStrategy.pay(this.getTotal());
        }
        
    }

    public int getTotal() {
        var random = new Random();
        return this.includeDelivery ? this.cost + (random.nextInt() * 100) : this.cost;
    }

}
