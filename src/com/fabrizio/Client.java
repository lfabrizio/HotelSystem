package com.fabrizio;

public class Client {
    private String name;
    private String firstName;
    private String lastName;
    private String middleName;
    private String clientId;
    private float currentBill;
    private String prePaid;
    private int phoneNumber;
    private int roomNumber;
    private String roomType;

    public Client(String firstName, String lastName, int phoneNumber, String roomType ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.roomType = roomType;

    }

    public void makePayment(){

    }

    public void chargeRoom(){

    }

    public void getOutstanding(){

    }
}
