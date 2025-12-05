package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public abstract class BaseMessenger implements IMessenger {

    private final IMessenger messenger;

    public BaseMessenger(IMessenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void send(String message) {
        if (this.messenger != null) {
            this.messenger.send(message);
        }
    }
}
