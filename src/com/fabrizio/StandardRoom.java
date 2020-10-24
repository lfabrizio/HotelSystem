package com.fabrizio;

import java.util.Stack;

public class StandardRoom extends Room {
        //inherit
    private int rooms;
    private int beds;


    public StandardRoom(int roomNumber, String roomType, int floor, float avgPrice, int rooms, int beds) {
        super(roomNumber, roomType, floor, avgPrice); // from parent class
        // assign vars
        this.rooms = rooms;
        this.beds = beds;
    }
        @Override
        public boolean reserve(Client occupant){
        if(occupant.getPartySize() > this.beds * 2){
            System.out.println("room is unavailable");
        return false;
        }
        return super.reserve(occupant);
    }
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }



}
