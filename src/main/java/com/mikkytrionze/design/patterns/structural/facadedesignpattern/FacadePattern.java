package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

/***
 * Facade Pattern
 * The Facade Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.
 * It acts as a front-facing interface that hides the complexities of the underlying code and provides a
 * more user-friendly way to interact with it.
 * In this example, we demonstrate the Facade Pattern by creating a facade class `BuyCryptoFacade` that simplifies
 * the process of buying cryptocurrency. The facade handles user authentication, retrieves user information,
 * and interacts with the appropriate cryptocurrency service to complete the purchase.
 * This pattern is particularly useful when dealing with complex systems, as it reduces the learning curve
 * for new users and promotes cleaner, more maintainable code.
 * @author "Hemen Micheal Hirekaan"<hirekaan.micheal@gmail.com>
 * 
 */
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
