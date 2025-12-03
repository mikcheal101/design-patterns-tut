package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class DesktopPushNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending DESKTOP Push Notification to " + recipient + " with message: " + message);
    }
}
