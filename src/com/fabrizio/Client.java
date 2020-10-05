package com.fabrizio;

public class Client {
    private String name;
    private String firstName;
    private String lastName;
    private int partySize;
    private String clientId;
    private double currentBill;
    private float prePaid;
    private int phoneNumber;
    private int roomNumber;
    private String roomType;


    public Client(String name, int partySize, float currentBill, float prePaid, int roomNumber, String roomType ){
        this.name = name;
        this.partySize = partySize;
        this.currentBill = currentBill;
        this.prePaid = prePaid;
        this.roomNumber = roomNumber;
        this.roomType = roomType;

    }

    public float makePayment(float payment){
        prePaid += payment;
        return prePaid;
    }

    public double chargeRoom(float chargedFee){
        currentBill += chargedFee;
        return currentBill;
    }

    public double getOutstanding(){
        return currentBill;
    }

    // add getters and setters
    public String getName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        name= firstName + lastName;
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }
    // this needs to be corrected
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber; // this needs to be corrected
    }

    public double getCurrentBill() {
        return currentBill;
    }

    public void setCurrentBill(double currentBill) {
        this.currentBill = currentBill;
    }

}
