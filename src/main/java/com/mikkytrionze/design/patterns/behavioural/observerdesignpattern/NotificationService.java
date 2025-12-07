package com.mikkytrionze.design.patterns.behavioural.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<EventListener> customers;

    public NotificationService() {
        this.customers = new ArrayList<>();
    }

    public void subscribe(EventListener listener) {
        this.customers.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        this.customers.remove(listener);
    }

    public void notifySubscribers () {
        this.customers.forEach(EventListener::updateSubscribers);
    }
}
