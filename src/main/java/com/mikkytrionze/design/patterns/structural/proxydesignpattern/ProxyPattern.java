package com.mikkytrionze.design.patterns.structural.proxydesignpattern;

/***
 * Proxy Pattern
 * 
 * Intent: Provide a surrogate or placeholder for another object to control access to it.
 * Motivation: In certain situations, you may want to control access to an object, for example, to add
 * security, logging, or caching. The Proxy Pattern provides a way to do this by creating a proxy
 * object that acts as an intermediary between the client and the real object.
 * * Applicability: Use the Proxy Pattern when you need to control access to an object, add additional
 * functionality, or manage resources.
 * * Structure: The Proxy Pattern typically involves three components: the Subject interface, the Real
 * Subject, and the Proxy.
 * * Participants:
 * - Subject: An interface that defines the common operations for both the Real Subject and the Proxy.
 * - Real Subject: The actual object that the proxy represents and controls access to.
 * - Proxy: The intermediary that controls access to the Real Subject and may add additional
 * functionality.
 * * Consequences:
 * - Control Access: The Proxy Pattern allows you to control access to the Real Subject, providing
 * additional security or functionality.
 * - Resource Management: Proxies can manage resources, such as lazy loading or caching, to improve
 * performance.
 * - Transparency: The Proxy Pattern can be transparent to the client, meaning the client interacts
 */
public class ProxyPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Structural Design Patterns:");
        System.out.println("Proxy Design Pattern:");

        // Implementation of Proxy Pattern would go here
        Internet internet = new RealInternet();
        internet.connectTo("example.com");
        internet.connectTo("blocked.com");

        // Using Proxy
        Internet proxyInternet = new ProxyInternet();
        proxyInternet.connectTo("example.com");
        proxyInternet.connectTo("blocked.com");
    }
}
