package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class DatabaseService {
    public String getMailFromUsername(String username) {
        // Simulate database access
        return username + "@example.com";
    }
}
