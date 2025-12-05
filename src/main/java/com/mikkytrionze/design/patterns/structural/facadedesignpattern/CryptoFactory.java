package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

public class CryptoFactory {
    public static CryptoService getCryptoService(String cryptoType) {
        if ("Bitcoin".equalsIgnoreCase(cryptoType)) {
            return new BitcoinService();
        } else if ("Ethereum".equalsIgnoreCase(cryptoType)) {
            return new EthereumService();
        }
        throw new IllegalArgumentException("Unsupported crypto type: " + cryptoType);
    }
}
