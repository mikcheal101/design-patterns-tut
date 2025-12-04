package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class SystemAdminMessages extends Message {

    public SystemAdminMessages(String message) {
        super(message);
    }

    @Override
    public void sendNotification() {
        String notification = "[System Admin Alert] " + this.message;
        this.channel.send(notification);
    }
}
