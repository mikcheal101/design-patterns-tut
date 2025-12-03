package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class WebNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new WebEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new WebSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new WebPushNotification();
    }

}
