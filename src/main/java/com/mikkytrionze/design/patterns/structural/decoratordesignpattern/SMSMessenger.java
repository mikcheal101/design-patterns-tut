package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class SMSMessenger extends BaseMessenger {
    public SMSMessenger(IMessenger messenger) {
        super(messenger);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS: " + message);
    }

}
