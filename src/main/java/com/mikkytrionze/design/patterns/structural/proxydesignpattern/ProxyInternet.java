package com.mikkytrionze.design.patterns.structural.proxydesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static final List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("blocked.com");
        bannedSites.add("malware.com");
        bannedSites.add("phishing.com");
    }

    @Override
    public void connectTo(String serverHost) {
        if (bannedSites.contains(serverHost)){
            System.out.println("Access Denied to " + serverHost);
            return;
        }
        internet.connectTo(serverHost);
    }

}
