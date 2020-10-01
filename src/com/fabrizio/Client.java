package com.fabrizio;

public class Client {
    private String name;
    private String firstName;
    private String lastName;
    private String clientId;
    private float currentBill;
    private float prePaid;
    private int phoneNumber;
    private int roomNumber;
    private String roomType;

    public Client(){
        //empty constructor
    }

    public Client(String firstName, String lastName, int phoneNumber, String roomType ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.roomType = roomType;

    }

    public float makePayment(float payment){
        prePaid += payment;
        return prePaid;
    }

    public float chargeRoom(float chargedFee){
        currentBill += chargedFee;
        return currentBill;
    }

    public float getOutstanding(){
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



}
