package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public abstract class BaseNotifierDecorator implements INotifier {

    private final INotifier notifier;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier notifier) {
        this.notifier = notifier;
        this.databaseService = new DatabaseService();
    }

    @Override
    public String getUsername() {
        return notifier.getUsername();
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }

}
