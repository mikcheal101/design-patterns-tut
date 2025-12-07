package com.mikkytrionze.design.patterns.behavioural.observerdesignpattern;

public class ObserverPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Observer Design Pattern");

        // Implementation goes here
        var store = new Store();
        var notificationService = store.getNotificationService();
        notificationService.subscribe(
            new EmailMsgListener("mikkytrionze@samplemail.com")
        );
        notificationService.subscribe(
            new EmailMsgListener("customerservice@samplemail.com")
        );
        notificationService.subscribe(
            new MobileAppListener("jane.smith")
        );
        store.newItemPurchased();
    }

}
