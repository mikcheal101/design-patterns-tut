package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class DesktopNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new DesktopEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new DesktopSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new DesktopPushNotification();
    }
}
