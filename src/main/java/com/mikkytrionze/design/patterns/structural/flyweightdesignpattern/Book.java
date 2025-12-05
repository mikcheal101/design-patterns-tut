package com.mikkytrionze.design.patterns.structural.flyweightdesignpattern;

public class Book {
    private final String name;
    private final double price;
    private final String type;
    private final String distributor;
    private final String otherData;

    public Book() {
        this.name = "";
        this.price = 0.0;
        this.type = "";
        this.distributor = "";
        this.otherData = "";
    }
    
    public Book(String name, double price, String type, String distributor, String otherData) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getOtherData() {
        return otherData;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", distributor='" + distributor + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }

}
