package com.mikkytrionze.design.patterns.behavioural.observerdesignpattern;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public NotificationService getNotificationService() {
        return this.notificationService;
    }

    public void newItemPurchased() {
        this.notificationService.notifySubscribers();
    }
}
