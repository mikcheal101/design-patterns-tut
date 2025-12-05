package com.mikkytrionze.design.patterns.structural.proxydesignpattern;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connecting to " + serverhost);
    }
}
