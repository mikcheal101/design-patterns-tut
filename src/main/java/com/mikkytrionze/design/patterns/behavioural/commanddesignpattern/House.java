package com.mikkytrionze.design.patterns.behavioural.commanddesignpattern;

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public List<Room> getRooms() {
        return this.rooms;
    }
}
