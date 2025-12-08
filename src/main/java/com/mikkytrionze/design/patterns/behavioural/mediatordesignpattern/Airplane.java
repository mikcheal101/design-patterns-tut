package com.mikkytrionze.design.patterns.behavioural.mediatordesignpattern;

public interface Airplane {
    void requestTakeOff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
