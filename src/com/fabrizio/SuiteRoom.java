package com.fabrizio;

public class SuiteRoom extends Room {
    private String type = "Suite";
    private String rooms;
    private String beds;
    private int partySize;
    private boolean kitchenette;
    private boolean needsRestock = false;


    public SuiteRoom(String roomNumber, String roomType, int floor, double avgPrice, String rooms, String beds, int partySize, boolean kitchenette) {
        super(roomNumber, roomType, floor, avgPrice);
        this.rooms = rooms;
        this.beds = beds;
        this.partySize = partySize;
        this.kitchenette = kitchenette;
    }
}
