package com.mikkytrionze.design.patterns.creational.builderdesignpatteern;

public interface Builder {
    Builder setId(int id);
    Builder setName(String name);
    Builder setPrice(double price);
    Builder setDescription(String description);
    Builder setCategory(String category);
    Product build();
}
