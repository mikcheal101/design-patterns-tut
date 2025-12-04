package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class PromotionalMessages extends Message {

    public PromotionalMessages(String message) {
        super(message);
    }

    @Override
    public void sendNotification() {
        String notification = "[Promotional Message] " + this.message;
        this.channel.send(notification);
    }
}
