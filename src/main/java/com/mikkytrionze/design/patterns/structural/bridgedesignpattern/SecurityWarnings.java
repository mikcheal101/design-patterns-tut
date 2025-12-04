package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class SecurityWarnings extends Message {

    public SecurityWarnings(String message) {
        super(message);
    }

    @Override
    public void sendNotification() {
        String notification = "[Security Alert] " + this.message;
        this.channel.send(notification);
    }

}
