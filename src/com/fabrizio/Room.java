package com.fabrizio;

public class Room {
    private String roomNumber;
    private String roomType;
    private int floor;
    private boolean isOccupied = false;
    private boolean needsCleaning = false;
    private Client occupant; //check this
    private double avgPrice;


//roomNumber, roomType and floor
    public Room(String RoomNumber, String roomType, int floor){
        this.roomType = roomType;
        this.floor = floor;
    }

    public boolean reserve(Client occupant) {
        if(!this.isOccupied && !this.needsCleaning){
            this.isOccupied = true;
            this.occupant = occupant;
           occupant.setCurrentBill(this.avgPrice); //in client
            return true;
        }
        System.out.println("Unavailable");
        return false;
    }


    public void checkout(){
    this.occupant = null;
    this.isOccupied = false;
    this.needsCleaning = true;
        System.out.println("this room is now vacant");
    }

    public boolean needsCleaning(){
            return needsCleaning;
    }

    // getters and setters


    public String getNumber() {
        return roomNumber;
    }

    public void setNumber(int number) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isNeedsCleaning() {
        return needsCleaning;
    }

    public void setNeedsCleaning(boolean needsCleaning) {
        this.needsCleaning = needsCleaning;
    }

    public String getOccupant() {
        return occupant;
    }

    public void setOccupant(String occupant) {
        this.occupant = occupant;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(int avgPrice) {
        this.avgPrice = avgPrice;
    }
}
