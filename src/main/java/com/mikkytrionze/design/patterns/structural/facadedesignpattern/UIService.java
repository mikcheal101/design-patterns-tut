package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

import java.util.UUID;

public class UIService {

    public static UUID getLoggedInUserId() {
        // Simulate fetching the logged-in user ID
        return UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    }

    public boolean logIn(String username, String password) {
        // Simulate user login
        return "user".equals(username) && "pass".equals(password);
    }

}
