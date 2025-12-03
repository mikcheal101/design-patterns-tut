package com.mikkytrionze.design.patterns.creational.builderdesignpatteern;

public class ProductBuilder implements Builder {

    private Product product = new Product();

    @Override
    public Builder setId(int id) {
        product.setId(id);
        return this;
    }

    @Override
    public Builder setName(String name) {
        product.setName(name);
        return this;
    }

    @Override
    public Builder setPrice(double price) {
        product.setPrice(price);
        return this;
    }

    @Override
    public Builder setDescription(String description) {
        product.setDescription(description);
        return this;
    }

    @Override
    public Builder setCategory(String category) {
        product.setCategory(category);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

    
}
