package com.engeto;

public class BookingManager {
    private Reservation reservation;

    public BookingManager(Reservation reservation) {
        this.reservation = reservation;

    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }



    }










