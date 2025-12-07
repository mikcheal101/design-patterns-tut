package com.mikkytrionze.design.patterns.behavioural.observerdesignpattern;

public class MobileAppListener implements EventListener {

    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void updateSubscribers() {
        /// Simulate sending of push notifications.
        System.out.printf("Sending push notification to %s.", this.username);
        System.out.println();
    }

}
