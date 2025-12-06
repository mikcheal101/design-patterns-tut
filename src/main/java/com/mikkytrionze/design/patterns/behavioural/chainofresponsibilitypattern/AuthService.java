package com.mikkytrionze.design.patterns.behavioural.chainofresponsibilitypattern;

public class AuthService {

    private final Handler handlerChain;

    public AuthService(Handler handlerChain) {
        this.handlerChain = handlerChain;
    }

    public boolean authenticate(String username, String password) {
        if(handlerChain.handle(username, password)) {
            System.out.println("Authentication successful.");
            return true;
        } else {
            System.out.println("Authentication failed.");
            return false;
        }
    }

}
