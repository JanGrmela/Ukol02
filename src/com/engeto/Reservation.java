package com.engeto;

public class Reservation {
        private int roomOfNumber;
        private String guestsOfHotel;
        private String checkInDate;
        private String checkOutDate;
        private boolean stayType;

        public Reservation(int roomOfNumber, String guestsOfHotel, String checkInDate, String checkOutDate, boolean stayType) {
                this.roomOfNumber = roomOfNumber;
                this.guestsOfHotel = guestsOfHotel;
                this.checkInDate = checkInDate;
                this.checkOutDate = checkOutDate;
                this.stayType = stayType;
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




