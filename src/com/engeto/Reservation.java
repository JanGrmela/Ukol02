package com.engeto;

import java.time.LocalDate;
import java.util.List;

public class Reservation {
        private Room room;
        private GuestsOfHotel guestsOfHotel;
        private List<GuestsOfHotel> guestsOfHotelList;
        private LocalDate checkInDate;
        private LocalDate checkOutDate;
        private boolean stayType;


        public Reservation(Room room, GuestsOfHotel guestsOfHotel, List<GuestsOfHotel> guestsOfHotelList, LocalDate checkInDate, LocalDate checkOutDate, boolean stayType) {
                this.room = room;
                this.guestsOfHotel = guestsOfHotel;
                this.guestsOfHotelList = guestsOfHotelList;
                this.checkInDate = checkInDate;
                this.checkOutDate = checkOutDate;
                this.stayType = stayType;
        }

        public Room getRoom() {
                return room;
        }

        public void setRoom(Room room) {
                this.room = room;
        }

        public GuestsOfHotel getGuestsOfHotel() {
                return guestsOfHotel;
        }

        public void setGuestsOfHotel(GuestsOfHotel guestsOfHotel) {
                this.guestsOfHotel = guestsOfHotel;
        }

        public List<GuestsOfHotel> getGuestsOfHotelList() {
                return guestsOfHotelList;
        }

        public void setGuestsOfHotelList(List<GuestsOfHotel> guestsOfHotelList) {
                this.guestsOfHotelList = guestsOfHotelList;
        }

        public LocalDate getCheckInDate() {
                return checkInDate;
        }

        public void setCheckInDate(LocalDate checkInDate) {
                this.checkInDate = checkInDate;
        }

        public LocalDate getCheckOutDate() {
                return checkOutDate;
        }

        public void setCheckOutDate(LocalDate checkOutDate) {
                this.checkOutDate = checkOutDate;
        }

        public boolean isStayType() {
                return stayType;
        }

        public void setStayType(boolean stayType) {
                this.stayType = stayType;
        }
}

