package com.fabrizio;

public class Room {
    private int roomNumber;
    private String roomType;
    private int floor;
    private boolean isOccupied = false;
    private boolean needsCleaning = false;
    private Client occupant;
    private double avgPrice;


//roomNumber, roomType and floor
    public Room(int roomNumber, String roomType, int floor, float avgPrice){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.floor = floor;
        this.avgPrice = avgPrice;
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
        System.out.println("This Room is Now Vacant");
    }

    public boolean needsCleaning(){
        return needsCleaning;
    }

    // getters and setters


    public int getNumber() {
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


    public Client getOccupant() {
        return occupant;
    }

    public void setOccupant(Client occupant) {
        this.occupant = occupant;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(int avgPrice) {
        this.avgPrice = avgPrice;
    }

    // to print out to console
    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", floor=" + floor +
                ", isOccupied=" + isOccupied +
                ", needsCleaning=" + needsCleaning +
                ", occupant=" + occupant +
                ", avgPrice=" + avgPrice +
                '}';
    }
}
