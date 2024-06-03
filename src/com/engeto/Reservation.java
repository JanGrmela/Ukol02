package com.engeto;

import java.time.LocalDate;

public class Reservation {
        private int roomOfNumber;
        private String guestsOfHotel;
        private LocalDate checkInDate;
        private LocalDate checkOutDate;
        private boolean stayType;
        private String guestsOfHotelList;
        private String roomList;




        public Reservation(int roomOfNumber, String guestsOfHotel, LocalDate checkInDate, LocalDate checkOutDate, boolean stayType, String guestsOfHotelList, String roomList) {
            this.roomOfNumber = roomOfNumber;
            this.guestsOfHotel = guestsOfHotel;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.stayType = stayType;
            this.guestsOfHotelList = guestsOfHotelList;
            this.roomList = roomList;

        }
        public String getGuestsOfHotelList() {
            return guestsOfHotelList;
        }
        public void setGuestsOfHotelList(String guestsOfHotelList) {
            this.guestsOfHotelList = guestsOfHotelList;
        }
        public String getRoomList() {
            return roomList;
        }
        public void setRoomList(String roomList) {
            this.roomList = roomList;
        }

        public int getRoomOfNumber() {
            return roomOfNumber;
        }
        public void setRoomOfNumber(int roomOfNumber) {
            this.roomOfNumber = roomOfNumber;
        }
        public String getGuestsOfHotel() {
            return guestsOfHotel;
        }
        public void setGuestsOfHotel(String guestsOfHotel) {
            this.guestsOfHotel = guestsOfHotel;
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









