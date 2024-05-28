package com.engeto;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    String ListOfBooking;
    int index;

//Vložení rezervace do seznamu
    public void addBooking(Booking newBooking) {
            bookingsList.add(newBooking);

}

// Získání rezervace se zadaným indexem ze seznamu
    public static class bookingList {
        public static Booking getBookingByIndex(List<Booking>bookingList, int index) {
            if (index >= 0 && index < bookingList.size()) {
                return bookingList.get(index);
            }
            return null;
        }
    }
// Získání seznamu rezervací
    List<Booking> bookingList = bookingList.getAllBooking();

//Vymazání seznamu rezervací:
    List<Booking> bookingList = new ArrayList<>();
    bookingList.clear();

