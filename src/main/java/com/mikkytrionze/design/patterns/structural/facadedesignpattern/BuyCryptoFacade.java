package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

import java.util.UUID;

public class BuyCryptoFacade {

    public void buyCrypto(String username, String password, String cryptoType, double amount) {
        UIService uiService = new UIService();
        if (!uiService.logIn(username, password)) {
            System.out.println("Login failed for user: " + username);
            return;
        }

        UUID userId = UIService.getLoggedInUserId();
        DatabaseService databaseService = new DatabaseService();
        User user = databaseService.getUser(userId);

        CryptoFactory
            .getCryptoService(cryptoType)
            .buyCurrency(user, amount);
    }
}
