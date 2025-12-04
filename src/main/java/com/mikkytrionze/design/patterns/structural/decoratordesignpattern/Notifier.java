package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class Notifier {

    private final String username;
    protected final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    public void send(String message) {
        String email = databaseService.getMailFromUsername(username);
        System.out.printf("Sending notification to %s: %s%n", email, message);
    }

    public String getUsername() {
        return username;
    }
}
