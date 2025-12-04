package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class SmsNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }

}
