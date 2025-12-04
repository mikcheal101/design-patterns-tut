package com.mikkytrionze.design.patterns.structural.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Box {

    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        this.children.addAll(List.of(boxes));
    }

    @Override
    public double calculatePrice() {
        double sum = children.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();
        double tax = 100.3 + (0.032 * sum); // simulate some complex calculation
        sum += tax;
        return sum;
    }
}
