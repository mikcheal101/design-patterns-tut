package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class EmailNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}
