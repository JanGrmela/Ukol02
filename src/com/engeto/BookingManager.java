package com.engeto;

import java.util.List;

public class BookingManager {
    private Reservation reservation;
    private List<Reservation> reservationList;


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
    public Reservation BookingManager(Reservation reservation, int numberOfReservationStayTypeWorking) {
        if (reservation.isStayType() == false) {
            numberOfReservationStayTypeWorking++;
            return reservation;
        } else {
            return null;
        }

    }

    //Průměrný počet hostů na rezervaci
    public double averageNumberOfGuestsOnReservation(List<Reservation> reservationList) {
            double sum = 0;
        for (Reservation reservation : reservationList) {
            sum += reservation.getOtherGuest().size();
        }
             return sum / reservationList.size();


    }
}














