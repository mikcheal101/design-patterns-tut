package com.mikkytrionze.design.patterns.structural.decoratordesignpattern;

public class WhatsAppNotifier extends Notifier {

    public WhatsAppNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String phoneNumber = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.printf("Sending WhatsApp notification to %s: %s%n", phoneNumber, message);
    }

}
