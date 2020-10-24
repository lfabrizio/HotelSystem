package com.fabrizio;

public class SuiteRoom extends Room {
    private int rooms;
    private int beds;
    private boolean kitchenette;
    private boolean needsRestock;


    public SuiteRoom(int roomNumber, String roomType, int floor, float avgPrice, int rooms, int beds, boolean kitchenette) {
        super(roomNumber, roomType, floor, avgPrice);
        this.rooms = rooms;
        this.beds = beds;

        this.kitchenette = kitchenette;
        this.needsRestock = false;
    }

    @Override
    public boolean reserve(Client occupant){
        if(this.kitchenette && this.needsRestock){
            System.out.println("Cant book, room needs restock");
            return false;
        }
        return super.reserve(occupant);
    }


    //restock method
        public void reStock() {
            if (!needsRestock){
                this.needsRestock = true;
        }
    }
}
