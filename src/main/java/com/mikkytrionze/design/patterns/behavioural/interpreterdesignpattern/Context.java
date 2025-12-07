package com.mikkytrionze.design.patterns.behavioural.interpreterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Context {
    /// Any global information needed for interpretation.
    
    private final List<String> evaluationLog;

    public Context() {
        this.evaluationLog = new ArrayList<>();
    }

    public void logEvent(String message) {
        this.evaluationLog.add(message);
    }

    public List<String> getLogHistory() {
        return this.evaluationLog;
    }
}
