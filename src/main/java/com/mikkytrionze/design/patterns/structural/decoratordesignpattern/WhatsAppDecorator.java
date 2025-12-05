package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class WhatsAppDecorator extends BaseNotifierDecorator {

    public WhatsAppDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String waName = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.printf("Sending WhatsApp notification to %s: %s%n", waName, message);
    }
}
