package com.mikkytrionze.design.patterns.behavioural.mementodesignpattern;

public class DocumentMemento {
    private String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return this.content;
    }
}
