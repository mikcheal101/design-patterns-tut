package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class Notifier implements INotifier {

    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        String email = databaseService.getMailFromUsername(username);
        System.out.printf("Sending notification to %s: %s%n", email, message);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
