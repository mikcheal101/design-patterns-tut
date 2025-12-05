package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.printf("Sending Facebook notification to %s: %s%n", fbName, message);
    }

}
