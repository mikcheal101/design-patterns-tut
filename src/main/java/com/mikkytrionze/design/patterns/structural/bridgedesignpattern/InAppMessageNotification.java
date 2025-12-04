package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public class InAppMessageNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending In-App Message Notification: " + message);
    }

}
