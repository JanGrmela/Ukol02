package com.engeto;

public class Reservation {
        private int roomNumber;
        private String guestsOfHotel;
        private String checkInDate;
        private String checkOutDate;
        private boolean stayType;

        public Reservation() {
                this.roomNumber = roomNumber;
                this.guestsOfHotel = guestsOfHotel;
                this.checkInDate = checkInDate;
                this.checkOutDate = checkOutDate;
                this.stayType = stayType;

        }

        Reservation





        public int getRoomNumber() {
                return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
                this.roomNumber = roomNumber;
        }

        public String getGuestsOfHotels() {
                return guestsOfHotel;
        }

        public void setGuestsOfHotels(String guestsOfHotel) {
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


