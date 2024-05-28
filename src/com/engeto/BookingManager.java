package com.engeto;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    String ListOfBooking;
    int index;

//Vložení rezervace do seznamu
    public void addBooking(Reservation newReservation) {
            bookingsList.add(newReservation);

}

// Získání rezervace se zadaným indexem ze seznamu
    public static class bookingList {
        public static Reservation getBookingByIndex(List<Reservation> reservationList, int index) {
            if (index >= 0 && index < reservationList.size()) {
                return reservationList.get(index);
            }
            return null;
        }
    }
// Získání seznamu rezervací
    List<Reservation> reservationList = reservationList.getAllBooking();

//Vymazání seznamu rezervací:
    List<Reservation> reservationList = new ArrayList<>();
    //}  bookingList.clear();

