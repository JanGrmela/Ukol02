package com.engeto;

public class Rooms {
    private int numberofRoom;
    private int numberofBeds;
    boolean balcony;
    boolean seeview;
    private int pricePerNight;

    public int getNumberofRoom() {
        return numberofRoom;
    }

    public void setNumberofRoom(int numberofRoom) {
        this.numberofRoom = numberofRoom;
    }

    public int getNumberofBeds() {
        return numberofBeds;
    }

    public void setNumberofBeds(int numberofBeds) {
        this.numberofBeds = numberofBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeeview() {
        return seeview;
    }

    public void setSeeview(boolean seeview) {
        this.seeview = seeview;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Rooms(int numberofRoom, int numberofBeds, boolean balcony, boolean seeview, int pricePerNight) {
        this.numberofRoom = numberofRoom;
        this.numberofBeds = numberofBeds;
        this.balcony = balcony;
        this.seeview = seeview;
        this.pricePerNight = pricePerNight;


    }
}
