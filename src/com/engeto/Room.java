package com.engeto;

public class Room {
    private int numberOfRoom;
    private int numberOfBeds;
    boolean hasBalcony;
    boolean hasSeaView;
    private double pricePerNight;


    public Room(int numberOfRoom, int numberOfBeds, boolean balcony, boolean seeview, double pricePerNight) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = balcony;
        this.hasSeaView = seeview;
        this.pricePerNight = pricePerNight;
    }






}
