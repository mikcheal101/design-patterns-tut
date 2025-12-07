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
        System.out.println("Notifying subscribers of a new item brought to the store.");
        this.notificationService.notifySubscribers(Event.NEW_ITEM);
    }

    public void itemsSoldOut() {
        System.out.println("Notifying subscribers of a sale.");
        this.notificationService.notifySubscribers(Event.SALE);
    }
}
