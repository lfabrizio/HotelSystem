package com.fabrizio;

public class Room {
    private int number;
    private String roomType;
    private int floor;
    private boolean isOccupied;
    private boolean needsCleaning;
    private String occupant;
    private int avgPrice;
    private int rooms;
    private int beds;

    public Room(int number, int floor, String occupant){
        this.number = number;
        this.floor = floor;
        this.occupant = occupant;
    }

    public void reserve(String roomType, int rooms, int beds){

    }

    public void reserve(){

    }

    public void checkout(){

    }

    public void needsCleaning(){

    }

}
