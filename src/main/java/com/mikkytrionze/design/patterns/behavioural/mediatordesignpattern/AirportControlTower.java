package com.mikkytrionze.design.patterns.behavioural.mediatordesignpattern;

public class AirportControlTower implements AirTrafficControlTower {

    @Override
    public void requestLanding(Airplane airplane) {
        // Simulate logic for landing
        airplane.notifyAirTrafficControl("Requesting landing clearance.");
    }

    @Override
    public void requestTakeOff(Airplane airplane) {
        // Simulate take off protocols.
        airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
    }
}
