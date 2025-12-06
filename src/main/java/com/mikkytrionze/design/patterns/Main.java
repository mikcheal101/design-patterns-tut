package com.mikkytrionze.design.patterns;

import com.mikkytrionze.design.patterns.behavioural.chainofresponsibilitypattern.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        var chainofresponsibility = new ChainOfResponsibilityPattern();
        chainofresponsibility.execute();
    }
}