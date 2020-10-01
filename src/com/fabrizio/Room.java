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

    public boolean reserve(String occupant) {
        this.occupant = occupant;
        this.isOccupied = true;
        if (this.isOccupied && !this.needsCleaning) {
            System.out.println("Room is unavailable at this time");
        } else {
            System.out.println("This room is now reserved!");
            return true;
        }
        return false;
    }


    public void checkout(){
    this.occupant = null;
    this.isOccupied = false;
        System.out.println("this room is now vacant");
    }

    public boolean needsCleaning(){
            return needsCleaning;
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
