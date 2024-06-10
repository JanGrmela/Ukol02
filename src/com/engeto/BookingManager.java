package com.engeto;

public class BookingManager {
    private Reservation reservation;
    private int numberOfReservationStayTypeWorking;

    public BookingManager(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    //Počet pracovních pobytů
    public Reservation BookingManager (Reservation reservation,int numberOfReservationStayTypeWorking) {
        if (reservation.isStayType() == false) {
            numberOfReservationStayTypeWorking++;
            return reservation;
        } else {
            return null;
        }

        }
    }














