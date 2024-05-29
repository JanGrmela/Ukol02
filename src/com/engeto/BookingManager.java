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


    // Získání rezervace se zadaným indexem ze seznamu
    public Reservation getReservationByIndex(List<Reservation> reservationList, int index) {
        if (index >= 0 && index < reservationList.size()) {
            return reservationList.get(index);
        } else {
            return null;
        }
    }

    // Získání seznamu rezervací
    public void ListOfAllReservations() {
           List<Reservation> allReservations = reservationList.get(Reservation);


    //Vymazání seznamu rezervací:
           List<Reservation> reservationList = new ArrayList<>();
            {
            reservationList.clear();
            }
        }
    }

