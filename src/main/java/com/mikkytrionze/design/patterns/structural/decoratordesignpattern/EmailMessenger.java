package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class EmailMessenger extends BaseMessenger {
    public EmailMessenger(IMessenger messenger) {
        super(messenger);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Email: " + message);
    }

}
