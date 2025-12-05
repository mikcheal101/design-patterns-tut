package com.mikkytrionze.design.patterns.structural.facadedesignpattern;

import java.util.UUID;

public class User {

    private UUID id;
    private String name;
    private double balance;
    private String currency;
    private String accountNbr;

    public User(UUID id, String name, double balance, String currency, String accountNbr) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.accountNbr = accountNbr;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAccountNbr() {
        return accountNbr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", accountNbr='" + accountNbr + '\'' +
                '}';
    }
}
