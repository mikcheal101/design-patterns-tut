package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class DesktopEmailNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending DESKTOP Email to " + recipient + " with message: " + message);
    }
}
