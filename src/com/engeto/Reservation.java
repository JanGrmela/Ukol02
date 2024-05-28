package com.engeto;

public class Reservation {
        private int roomNumber;
        private String guestsOfHotels;
        private String checkInDate;
        private String checkOutDate;
        private boolean stayType;

        public Reservation(int roomNumber, String guestsOfHotels, String checkInDate, String checkOutDate, boolean stayType) {
                this.roomNumber = roomNumber;
                this.guestsOfHotels = guestsOfHotels;
                this.checkInDate = checkInDate;
                this.checkOutDate = checkOutDate;
                this.stayType = stayType;

        }

        public int getRoomNumber() {
                return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
                this.roomNumber = roomNumber;
        }

        public String getGuestsOfHotels() {
                return guestsOfHotels;
        }

        public void setGuestsOfHotels(String guestsOfHotels) {
                this.guestsOfHotels = guestsOfHotels;
        }

        public String getCheckInDate() {
                return checkInDate;
        }

        public void setCheckInDate(String checkInDate) {
                this.checkInDate = checkInDate;
        }

        public String getCheckOutDate() {
                return checkOutDate;
        }

        public void setCheckOutDate(String checkOutDate) {
                this.checkOutDate = checkOutDate;
        }

        public boolean isStayType() {
                return stayType;
        }

        public void setStayType(boolean stayType) {
                this.stayType = stayType;
        }


}


