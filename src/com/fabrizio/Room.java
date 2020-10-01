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
        this.roomType=roomType;
        this.rooms = rooms;
        this.beds = beds;
    }

    public void reserve(){

    }

    public void checkout(){

    }

    public void needsCleaning(){

    }

    // getters and setters
    public boolean occupied(){
        return isOccupied;
    }

    public String getRoomType(){
        return roomType;
    }

    public int getFloor(){
        return floor;
    }

    public int getRooms(){
        return rooms;
    }

    public int getBeds(){
        return beds;
    }
}
