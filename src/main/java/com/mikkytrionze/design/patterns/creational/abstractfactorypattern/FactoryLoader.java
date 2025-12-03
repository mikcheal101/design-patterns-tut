package com.mikkytrionze.design.patterns.creational.abstractfactorypattern;

import java.util.Map;
import java.util.function.Supplier;

public class FactoryLoader {

    private static final Map<String, Supplier<NotificationFactory>> factories = Map.of(
        "desktop", DesktopNotificationFactory::new,
        "mobile", MobileNotificationFactory::new,
        "web", WebNotificationFactory::new);

    public static NotificationFactory getFactory(String platform) {
        platform = platform.toLowerCase();
        Supplier<NotificationFactory> factory = factories.get(platform);
        if (factory != null) {
            return factory.get();
        }
        throw new IllegalArgumentException("Unknown platform: " + platform);
    }
}
