package com.mikkytrionze.design.patterns.behavioural.commanddesignpattern;

public class CommandPattern {

    public void execute() {
        System.out.println("Design Patterns in Java");
        System.out.println("-----------------------");
        System.out.println("Behavioural Design Patterns:");
        System.out.println("Command Design Pattern");

        // Implementation goes here
        var house = new House();
        var livingRoom = new LivingRoom();

        var switchCommand = new SwitchLightCommand(new Light());
        livingRoom.setCommand(switchCommand);
        livingRoom.executeCommand();
        house.addRoom(livingRoom);

        var kitchen = new Kitchen();
        kitchen.setCommand(switchCommand);
        house.addRoom(kitchen);

        var masterBedRoom = new BedRoom();
        house.addRoom(masterBedRoom);

        var guestBedRoom = new BedRoom();
        house.addRoom(guestBedRoom);

        var bathRoom = new WashRoom();
        bathRoom.setCommand(switchCommand);
        house.addRoom(bathRoom);
        
    }
}
