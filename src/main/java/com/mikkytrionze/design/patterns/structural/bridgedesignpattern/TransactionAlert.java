package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class TransactionAlert extends Message {

    public TransactionAlert(String message) {
        super(message);
    }

    @Override
    public void sendNotification() {
        String notification = "[Transaction Alert] " + this.message;
        this.channel.send(notification);
    }
}
