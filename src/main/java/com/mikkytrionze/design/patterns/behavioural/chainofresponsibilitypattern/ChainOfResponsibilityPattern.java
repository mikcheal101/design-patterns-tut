package com.mikkytrionze.design.patterns.behavioural.chainofresponsibilitypattern;
/***
 * Chain of Responsibility pattern
 */

public class ChainOfResponsibilityPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Chain of Responsibility Pattern");

        // Implementation of Chain of Responsibility Pattern would go here.
        Database database = new Database();
        Handler validPasswordHandler = new ValidPasswordHandler(database);

        Handler roleCheckerHandler = new RoleCheckHandler();
        validPasswordHandler.setNextHandler(roleCheckerHandler);

        Handler userExistsHandler = new UserExistsHandler(database);
        userExistsHandler.setNextHandler(validPasswordHandler);

        System.out.println("**********************");
        AuthService authService = new AuthService(userExistsHandler);
        authService.authenticate("john_doe", "password123"); // using wrong credentials
        System.out.println("**********************");
        authService.authenticate("admin_user", "passcode123"); // using correct admin credentials
        System.out.println("**********************");
        authService.authenticate("user_username", "passcode456"); // using correct user credentials
    }
}
