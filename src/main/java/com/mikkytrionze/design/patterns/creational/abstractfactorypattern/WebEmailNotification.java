package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class WebEmailNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending WEB Email to " + recipient + " with message: " + message);
    }
}
