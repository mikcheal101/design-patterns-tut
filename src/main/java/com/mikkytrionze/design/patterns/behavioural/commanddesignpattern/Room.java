package com.mikkytrionze.design.patterns.behavioural.commanddesignpattern;

public abstract class Room {

    private Command command;

    protected Room() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }
}
