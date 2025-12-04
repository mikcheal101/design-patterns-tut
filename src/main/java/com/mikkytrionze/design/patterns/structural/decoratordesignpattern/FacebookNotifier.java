package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class FacebookNotifier extends Notifier {

    public FacebookNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.printf("Sending Facebook notification to %s: %s%n", fbName, message);
    }

}
