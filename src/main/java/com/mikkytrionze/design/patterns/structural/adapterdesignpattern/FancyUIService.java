package com.mikkytrionze.design.patterns.structural.adapterdesignpattern;

public class FancyUIService {

    public void renderMenu(JsonData jsonData) {
        System.out.println("Rendering menu from JSON data");
    }

    public void renderRecommendations(JsonData jsonData) {
        System.out.println("Rendering recommendations from JSON data");
    }
}
