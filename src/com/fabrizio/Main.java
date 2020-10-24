package com.fabrizio;

public class Main {

    public static void main(String[] args) {
        Hotel.welcome("Hotel RI");
        Hotel HotelRI = new Hotel("Hotel RI", 50);
        Client Lou = new Client("Lou", 2, "Standard");
        StandardRoom LousRoom = new StandardRoom(15, "single", 2, 100, 1, 1);
        System.out.println("Room Number: " + LousRoom.getNumber() + "Beds" + LousRoom.getBeds());
    }
}
