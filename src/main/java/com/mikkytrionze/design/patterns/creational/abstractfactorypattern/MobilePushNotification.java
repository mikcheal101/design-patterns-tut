package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MobilePushNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending MOBILE Push Notification to " + recipient + " with message: " + message);
    }
}
