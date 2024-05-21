package com.engeto;

public class Booking {
        int roomNumber;
        private String checkInDate;
        private String checkOutDate;
        private String stayTape;

        public Booking() {
                this.roomNumber = roomNumber;
                this.checkInDate = checkInDate;
                this.checkOutDate = checkOutDate;
                this.stayTape = stayTape;
        }

        public int getRoomNumber() {
                return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
                this.roomNumber = roomNumber;
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

        public String getStayTape() {
                return stayTape;
        }

        public void setStayTape(String stayTape) {
                this.stayTape = stayTape;
        }
}
