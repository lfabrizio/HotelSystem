package com.fabrizio;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName;
    private int rooms;
    private List<StandardRoom> availableStandards;
    private List<StandardRoom> reservedStandards;
    private List<SuiteRoom> availableSuites;
    private List<SuiteRoom> reservedSuites;
    private List<Client> clients;

    public Hotel(String hotelName, int rooms) {
        this.hotelName = hotelName;
        this.rooms = rooms;
        this.availableStandards = new ArrayList<StandardRoom>();
        this.reservedStandards = new ArrayList<StandardRoom>();
        this.availableSuites = new ArrayList<SuiteRoom>();
        this.reservedSuites = new ArrayList<SuiteRoom>();
        this.clients = new ArrayList<Client>();
    }

    // method overloading
    public void addRoom(){

    }

    public void reserveRoom(){
    
    }


    public void getClientBalance(){

    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRooms() {
        return rooms;
    }

    public List<StandardRoom> getAvailableStandards() {
        return availableStandards;
    }

    public List<StandardRoom> getReservedStandards() {
        return reservedStandards;
    }

    public List<SuiteRoom> getAvailableSuites() {
        return availableSuites;
    }

    public List<SuiteRoom> getReservedSuites() {
        return reservedSuites;
    }

    public List<Client> getClients() {
        return clients;
    }

    static public void welcome(String hotelName) {

        System.out.print("Welcome to " + hotelName);
        System.out.println("\n");
    }
        // getters maybe just whats available

//    public int getStandardRoomsAvailable(){
//        return availableStandards;
//    }

//    public int getAvailableSuites(){
//        return availableSuites;
//    }



}
