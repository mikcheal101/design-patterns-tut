package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

public class AbstractFactoryPattern {

    public void run() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Creational Design Patterns:");
        System.out.println("Abstract Factory Design Pattern:");
        
        // Implementation of Abstract Factory Pattern would go here
        UIFactory uiFactory = new MacOsFactory();
        Button uiButton = uiFactory.createButton();
        TextField uiTextField = uiFactory.createTextField();
        uiButton.render();
        uiTextField.render();

        NotificationFactory notificationFactory = FactoryLoader.getFactory("DESKTOP");
        Notification emailNotification = notificationFactory.createEmailNotification();
        Notification smsNotification = notificationFactory.createSMSNotification();
        Notification pushNotification = notificationFactory.createPushNotification();

        emailNotification.send("sample@mail.com", "This is a sample email message.");
        smsNotification.send("+1234567890", "This is a sample SMS message.");
        pushNotification.send("userDeviceToken", "This is a sample push notification message.");
    }
}
