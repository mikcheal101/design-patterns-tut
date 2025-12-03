package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MobileEmailNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending MOBILE Email to " + recipient + " with message: " + message);
    }
}
