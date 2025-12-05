package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

/**
 * Demonstrates the Decorator Design Pattern in Java.
 * 
 * This class contains examples of:
 * 1. Notification decorators (Facebook, WhatsApp)
 * 2. Messaging decorators (Email, SMS)
 * 
 * Task Context:
 * You are designing a notification system for a banking application.
 * Users can receive messages via multiple channels (Email, SMS, Push Notification)
 * without modifying existing classes. The Decorator Pattern allows dynamic
 * composition of channels at runtime.
 */
public class DecoratorPattern {

    /**
     * Execute method demonstrates usage of the Decorator Pattern.
     */
    public void execute() {
        // Header output for clarity in console
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Decorator Design Pattern:");

        // -------------------------------
        // Example 1: Notification system
        // -------------------------------
        // Create a composed notification object:
        // Notifier -> WhatsAppDecorator -> FacebookDecorator
        // Dynamic decoration allows multiple notification channels
        INotifier notifier = new FacebookDecorator(
                                new WhatsAppDecorator(
                                    new Notifier("Helloworld")));
        notifier.send("This is a notification message!!!");

        /**
         * Task Details for Learning the Decorator Pattern:
         * 
         * Scenario:
         * - Notification service for a banking app.
         * - Users can receive messages via Email, SMS, Push Notification.
         * 
         * Requirements:
         * - Base Interface: Notification with method: void send(String message)
         * - Concrete Implementation: BasicNotification (prints message to console)
         * - Decorators: EmailNotificationDecorator, SMSNotificationDecorator, PushNotificationDecorator
         * - Dynamic composition allows users to combine channels at runtime
         * 
         * Example Usage:
         * Notification notification = new EmailNotificationDecorator(
         *                                 new SMSNotificationDecorator(
         *                                     new BasicNotification()));
         * notification.send("Transaction alert: $500 debited");
         * 
         * Expected Output:
         * Basic: Transaction alert: $500 debited
         * SMS: Transaction alert: $500 debited
         * Email: Transaction alert: $500 debited
         */

        // -------------------------------
        // Example 2: Messaging system
        // -------------------------------
        // Demonstrates dynamic composition of decorators for messaging
        IMessenger messenger = new EmailMessenger(
                                  new SMSMessenger(
                                      new Messenger())); // Base messenger
        messenger.send("Transaction alert: $500 debited");
    }
}
