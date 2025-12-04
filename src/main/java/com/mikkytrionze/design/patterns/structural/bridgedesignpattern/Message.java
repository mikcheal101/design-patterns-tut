package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

public abstract class Message {

    protected Notification channel;
    protected String message;

    public Message(String message) {
        this.message = message;
    }

    public void setChannel(Notification channel) {
        this.channel = channel;
    }

    public abstract void sendNotification();
}
