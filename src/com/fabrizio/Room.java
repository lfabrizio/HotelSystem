package com.fabrizio;

public class Room {
    private int number;
    private String roomType;
    private int floor;
    private boolean isOccupied = false;
    private boolean needsCleaning = false;
    private String occupant;
    private int avgPrice;


//roomNumber, roomType and floor
    public Room(int number, String roomType, int floor){
        this.number = number;
        this.roomType = roomType;
        this.floor = floor;
    }

    public boolean reserve(String occupant) {
        if(!this.isOccupied && !this.needsCleaning){
            this.isOccupied = true;
            this.occupant = occupant;
          //  occupant.setCurrentBill(this.avgPrice);
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


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(int avgPrice) {
        this.avgPrice = avgPrice;
    }
}
