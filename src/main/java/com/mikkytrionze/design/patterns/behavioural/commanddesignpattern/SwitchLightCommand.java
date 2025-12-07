package com.mikkytrionze.design.patterns.behavioural.commanddesignpattern;

public class SwitchLightCommand implements Command {

    private final Light light;

    public SwitchLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchLights();
    }
}
