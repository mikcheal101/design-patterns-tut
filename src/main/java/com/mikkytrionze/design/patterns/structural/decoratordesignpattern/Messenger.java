package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class Messenger implements IMessenger {
    @Override
    public void send(String message) {
        System.out.println("Basic: " + message);
    }
}
