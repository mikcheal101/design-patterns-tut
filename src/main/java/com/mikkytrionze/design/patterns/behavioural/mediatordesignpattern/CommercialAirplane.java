package com.mikkytrionze.design.patterns.behavioural.mediatordesignpattern;

public class CommercialAirplane implements Airplane {

    private final AirTrafficControlTower controlTower;

    public CommercialAirplane(AirTrafficControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void requestLanding() {
        this.controlTower.requestLanding(this);
    }

    @Override
    public void requestTakeOff() {
        this.controlTower.requestTakeOff(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.printf("[Commercial Airplane]: %s", message);
        System.out.println();
    }
}
