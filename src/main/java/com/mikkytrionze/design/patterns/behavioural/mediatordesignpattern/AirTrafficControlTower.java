package com.mikkytrionze.design.patterns.behavioural.mediatordesignpattern;

public interface AirTrafficControlTower {
    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
