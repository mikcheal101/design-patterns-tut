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

        System.out.println("-----------------------");
        System.out.println("Facade Solution");

        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade();

        // Using the facade to buy cryptocurrency with wrong credentials.
        buyCryptoFacade.buyCrypto("username@sample.com", "passcode", "Bitcoin", 5000.0);

        // Using the facade to buy cryptocurrency with correct credentials.
        buyCryptoFacade.buyCrypto("user", "pass", "Bitcoin", 5000.0);
    }

}
