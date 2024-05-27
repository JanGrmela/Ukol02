package com.engeto;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    boolean hasBalcony;
    boolean hasSeaView;
    private double pricePerNight;


    public Room(int numberofRoom, int numberofBeds, boolean balcony, boolean seeview, double pricePerNight) {
        this.roomNumber = numberofRoom;
        this.numberOfBeds = numberofBeds;
        this.hasBalcony = balcony;
        this.hasSeaView = seeview;
        this.pricePerNight = pricePerNight;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }


}
