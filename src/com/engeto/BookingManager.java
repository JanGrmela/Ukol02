package com.engeto;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    int index;

//Vložení rezervace do seznamu
    private List<Reservation> reservationList = new ArrayList<>();

    public BookingManager(List<Reservation> newReservations) {
        this.reservationList.addAll(newReservations);
    }

    public void addReservation(Reservation reservations) {

        reservationList.add(reservations);
     }

}

// Získání rezervace se zadaným indexem ze seznamu
    public static class bookingList {
        public static Reservation getBookingByIndex(List<Reservation> reservationList, int index) {
            if (index >= 0 && index < reservationList.size()) {
                return reservationList.get(index);
            }


// Získání seznamu rezervací
    List<Reservation> newreseravtion = List.of(new Reservation());


//Vymazání seznamu rezervací:
    List<Reservation> reservationList = new ArrayList<>();
    //}  bookingList.clear();

