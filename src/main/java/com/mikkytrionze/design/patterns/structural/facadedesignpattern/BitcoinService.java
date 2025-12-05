package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

public class BitcoinService extends CryptoService {

    @Override
    void buyCurrency(User user, double amount) {
        // Simulate buying Bitcoin
        System.out.println("Bought " + amount + " worth of Bitcoin for user " + user.getName());
    }

}
