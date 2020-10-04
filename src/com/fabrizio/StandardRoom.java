package com.fabrizio;

import java.util.Stack;

public class StandardRoom extends Room {
//inherit
    private String roomType;
    private int rooms;
    private int beds;

    public StandardRoom(String roomNumber, String roomType, int floor, double avgPrice, int rooms, int beds) {
        super(roomNumber, roomType, floor);
        this.rooms = rooms;
        this.beds = beds;
    }
}
