package com.mikkytrionze.design.patterns.behavioural.observerdesignpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {

    private final Map<Event, List<EventListener>> subscribers;

    public NotificationService() {
        this.subscribers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> subscribers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event event, EventListener listener) {
        this.subscribers.get(event).add(listener);
    }

    public void unsubscribe(Event event, EventListener listener) {
        this.subscribers.get(event).remove(listener);
    }

    public void notifySubscribers (Event event) {
        this.subscribers.get(event).forEach(EventListener::updateSubscribers);
    }
}
