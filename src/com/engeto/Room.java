package com.engeto;

public class Room {
    private int numberOfRoom;
    private int numberOfBeds;
    boolean hasBalcony;
    boolean hasSeaView;
    private double pricePerNight;
    private String guestsOfHotelList;


    public Room(int numberOfRoom, int numberOfBeds, boolean balcony, boolean seeview, double pricePerNight,String guestsOfHotelList ) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = balcony;
        this.hasSeaView = seeview;
        this.pricePerNight = pricePerNight;
        this.guestsOfHotelList = guestsOfHotelList;

    }

    public String getGuestsOfHotelList() {
        return guestsOfHotelList;
    }

    public void setGuestsOfHotelList(String guestsOfHotelList) {
        this.guestsOfHotelList = guestsOfHotelList;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
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

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
