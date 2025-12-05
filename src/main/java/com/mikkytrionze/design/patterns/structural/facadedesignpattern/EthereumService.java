package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

public class EthereumService extends CryptoService {

    @Override
    void buyCurrency(User user, double amount) {
        // Simulate buying Ethereum
        System.out.println("Bought " + amount + " worth of Ethereum for user " + user.getName());
    }

}
