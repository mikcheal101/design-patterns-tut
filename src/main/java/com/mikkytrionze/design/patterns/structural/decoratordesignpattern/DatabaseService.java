package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class DatabaseService {
    public String getMailFromUsername(String username) {
        // Simulate database access
        return username + "@example.com";
    }

    public String getPhoneNumberFromUsername(String username) {
        // Simulate database access
        return "+12" + username.hashCode();
    }

    public String getFBNameFromUsername(String username) {
        // Simulate database access
        return username.hashCode() + "@Facebook.com";
    }
}
