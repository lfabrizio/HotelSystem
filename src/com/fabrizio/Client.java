package com.fabrizio;

public class Client {
    private String name;
    private String firstName;
    private String lastName;
    private int partySize;
    private String clientId;
    private double currentBill;
    private double prePaid;
    private String phoneNumber;
    private String roomNumber;
    private String roomType;



    public Client(String name, int partySize,  String roomType ){
        this.name = name;
        this.partySize = partySize;
        this.roomType = roomType;

        //balance after prepaid
        this.currentBill -= prePaid;
    }

    public double makePayment(double payment){
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

    public String getPhoneNumber(){
        return phoneNumber;
    }
    // this needs to be corrected
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber; // this needs to be corrected
    }

    public double getCurrentBill() {
        return currentBill;
    }


    public void setCurrentBill(double currentBill) {
       this.currentBill = currentBill;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    // need to implement a toString method for name and phone number
}
