package com.engeto;

import java.util.ArrayList;
import java.util.List;


public class ListOfBooking {

    List<Booking> bookingList = new ArrayList<Booking>();

    public ListOfBooking(List<Booking> bookingList) {
        this.bookingList = bookingList;
        System.out.println("All Reservations:"+ bookingList);
        }

    }

    

    
    
    
    