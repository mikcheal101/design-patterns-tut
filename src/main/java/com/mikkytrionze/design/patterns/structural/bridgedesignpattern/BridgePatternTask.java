package com.mikkytrionze.design.patterns.structural.bridgedesignpattern;

/*** 
    You are designing a cross-platform notification system for a large fintech platform (like Microsoft).
    The system must support multiple notification channels and multiple message types, and these two dimensions must evolve independently.

    Business Requirements (the problem)
    1. There will be different types of messages, such as:
        - Transaction alerts.
        - Security warnings.
        - Promotional messages.
        - System admin messages.
    2. There will be multiple delivery channels, such as:
        - Email.
        - SMS.
        - Push notification.
        - In-app messaging.
    3. New message types will be added frequently.
    4. New notification channels will also be added by other engineering teams.
    5. Neither the message types nor the delivery channels should depend on each other’s implementation.
    6. The system must allow any message type to be delivered over any channel without rewriting or duplicating code.

    Your Goal:
    Design the architecture in a way that:
        - Adding new message types does not require modifying the notification channels.
        - Adding new channels does not require modifying the message types.
        - Messages and channels combine at runtime.
        - Each message type may define its own formatting logic.
        - Each channel may define its own delivery mechanism.
*/
public class BridgePatternTask {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Bridge Pattern Task Execution");
        System.out.println("-----------------------------");


        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification();
        Notification pushNotification = new PushNotification();
        Notification inAppMessageNotification = new InAppMessageNotification();

        Message transactionAlert = new TransactionAlert("Your transaction of $500 has been processed.");
        transactionAlert.setChannel(emailNotification);
        transactionAlert.sendNotification();

        Message transactionAlertSms = new TransactionAlert("Your transaction of $300 has been processed.");
        transactionAlertSms.setChannel(smsNotification);
        transactionAlertSms.sendNotification();

        Message transactionAlertPush = new TransactionAlert("Your transaction of $200 has been processed.");
        transactionAlertPush.setChannel(pushNotification);
        transactionAlertPush.sendNotification();

        Message transactionAlertInApp = new TransactionAlert("Your transaction of $100 has been processed.");
        transactionAlertInApp.setChannel(inAppMessageNotification);
        transactionAlertInApp.sendNotification();

        Message securityWarnings = new SecurityWarnings("Unusual login activity detected.");
        securityWarnings.setChannel(emailNotification);
        securityWarnings.sendNotification();

        Message promotionalMessages = new PromotionalMessages("Get 20% off on your next purchase!");
        promotionalMessages.setChannel(smsNotification);
        promotionalMessages.sendNotification();

        Message systemAdminMessages = new SystemAdminMessages("System maintenance scheduled for midnight.");
        systemAdminMessages.setChannel(pushNotification);
        systemAdminMessages.sendNotification();
    }
}
