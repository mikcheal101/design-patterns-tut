package com.mikkytrionze.design.patterns.behavioural.chainofresponsibilitypattern;

public class UserExistsHandler extends Handler {

    private final Database database;
    
    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUsername(username)) {
            System.out.println("User does not exist.");
            return false;
        }
        return handleNext(username, password);
    }

}
