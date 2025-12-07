package com.mikkytrionze.design.patterns.behavioural.commanddesignpattern;

public class CommandPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Command Design Pattern");

        // Implementation goes here
        var house = new House();
        house.addRoom(new LivingRoom());
        house.addRoom(new Kitchen());
        house.addRoom(new BedRoom());
        house.addRoom(new BedRoom());
        house.addRoom(new WashRoom());
        house.getRooms().forEach(Room::switchLights);
    }
}
