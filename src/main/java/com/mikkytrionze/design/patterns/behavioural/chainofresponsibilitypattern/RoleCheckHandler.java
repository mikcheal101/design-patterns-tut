package com.mikkytrionze.design.patterns.behavioural.chainofresponsibilitypattern;

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if ("admin_user".equals(username)) {
            System.out.println("Admin access granted.");
            return true;
        }
        System.out.println("Standard user access granted.");
        return handleNext(username, password);
    }

}
