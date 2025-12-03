package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class DesktopSMSNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending DESKTOP SMS to " + recipient + " with message: " + message);
    }
}
