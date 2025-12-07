package com.mikkytrionze.design.patterns.behavioural.observerdesignpattern;

public class EmailMsgListener implements EventListener {
    
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void updateSubscribers() {
        /// Simulate sending of email
        System.out.printf("Sending email to %s.", this.email);
        System.out.println();
    }
}
