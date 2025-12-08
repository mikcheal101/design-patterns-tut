package com.mikkytrionze.design.patterns.behavioural.mementodesignpattern;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public synchronized void write(String text) {
        this.content += text;
    }

    public synchronized String getContent() {
        return this.content;
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento(this.content);
    }

    public synchronized void restoreFromMemento(DocumentMemento documentMemento) {
        this.content = documentMemento.getSavedContent();
    }
}
