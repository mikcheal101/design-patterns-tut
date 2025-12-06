package com.mikkytrionze.design.patterns.behavioural.chainofresponsibilitypattern;

import java.util.Map;

public class Database {

    private final Map<String, String> users;

    public Database() {
        users = Map.of(
            "admin_user", "passcode123",
            "user_username", "passcode456");
    }

    public boolean isValidUsername(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
