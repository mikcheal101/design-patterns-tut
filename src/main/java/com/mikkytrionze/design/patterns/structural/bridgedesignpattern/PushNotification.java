package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class PushNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }

}
