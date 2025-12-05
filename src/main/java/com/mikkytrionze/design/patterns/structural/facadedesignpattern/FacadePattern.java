package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

public class FacadePattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Facade Design Pattern:");

        // Implementation of Facade Pattern would go here
        DatabaseService databaseService = new DatabaseService();
        User user = databaseService.getUser(UIService.getLoggedInUserId());
        System.out.println("User retrieved: " + user.getName());
        
        CryptoService bitcoinService = CryptoFactory.getCryptoService("Bitcoin");
        bitcoinService.buyCurrency(user, 1000.0);

        CryptoService ethereumService = CryptoFactory.getCryptoService("Ethereum");
        ethereumService.buyCurrency(user, 500.0);
    }

}
