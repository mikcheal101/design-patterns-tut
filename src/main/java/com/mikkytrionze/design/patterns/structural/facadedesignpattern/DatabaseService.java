package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

import java.util.UUID;

public class DatabaseService {

    public User getUser(UUID userId) {
        // Simulate fetching user from database
        return new User(userId, "John Doe", 1000.0, "USD", "123456789");
    }
}
