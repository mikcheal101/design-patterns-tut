package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class MobileNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new MobileEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new MobileSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new MobilePushNotification();
    }

}
