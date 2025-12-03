package com.mikkytrionze.design.patterns.creational.builderdesignpatteern;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private String category;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
