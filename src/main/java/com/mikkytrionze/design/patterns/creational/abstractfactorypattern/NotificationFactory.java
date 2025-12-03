package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSMSNotification();
    Notification createPushNotification();
}
