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
    }


    //Vymazání seznamu rezervací:
    public void ClearAllReaservations() {
        List<Reservation> reservationList = new ArrayList<>();
        {
            reservationList.clear();
        }
    }


    //Rezervace s pracovnim pobytem
    public void NumberOfWorkingReservations() {
    }



     //Průměrný počet hostů na rezervaci
     public void AverageNumberOfGuests() {

        }


    }
}