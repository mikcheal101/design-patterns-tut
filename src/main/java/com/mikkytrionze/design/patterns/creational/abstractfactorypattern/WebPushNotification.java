package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class WebPushNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending WEB Push Notification to " + recipient + " with message: " + message);
    }
}
