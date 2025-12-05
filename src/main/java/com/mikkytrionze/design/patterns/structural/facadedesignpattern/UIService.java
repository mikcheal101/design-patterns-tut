package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

public class UIService {

    public static String getLoggedInUserId() {
        // Simulate fetching the logged-in user ID
        return "user123";
    }

    public boolean logIn(String username, String password) {
        // Simulate user login
        return "user".equals(username) && "pass".equals(password);
    }

}
