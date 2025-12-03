package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MobileSMSNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending MOBILE SMS to " + recipient + " with message: " + message);
    }
}
