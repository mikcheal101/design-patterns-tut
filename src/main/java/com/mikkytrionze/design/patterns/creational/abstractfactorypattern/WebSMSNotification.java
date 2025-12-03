package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class WebSMSNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending WEB SMS to " + recipient + " with message: " + message);
    }
}
