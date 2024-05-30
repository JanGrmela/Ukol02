import com.engeto.Reservation;
import com.engeto.GuestsOfHotel;
import com.engeto.Room;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
// Hosté dle zadání
                GuestsOfHotel firstguest = new GuestsOfHotel("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
                GuestsOfHotel secondguest = new GuestsOfHotel("Jan", "Dvořáček", LocalDate.of(1995, 05, 05));

                System.out.println(firstguest.getName() + " " + firstguest.getSurname() + " " + "(" + firstguest.getDateOfBirth() + ")");
                System.out.println(secondguest.getName() + " " + secondguest.getSurname() + " " + "(" + secondguest.getDateOfBirth() + ")");

// Evidence pokojů
                Room first = new Room(01, 1, true, true, 1000);
                Room second = new Room(02, 1, true, true, 1000);
                Room third = new Room(03, 3, false, true, 2400);

                System.out.println("číslo pokoje:" + first.getRoomNumber() + " " + first.getNumberOfBeds() + " " + first.getPricePerNight() + " " + first.isHasBalcony() + " " + first.isHasSeaView());
                System.out.println("číslo pokoje:" + second.getRoomNumber() + " " + second.getNumberOfBeds() + " " + second.getPricePerNight() + " " + second.isHasBalcony() + " " + second.isHasSeaView());
                System.out.println("číslo pokoje:" + third.getRoomNumber() + " " + third.getNumberOfBeds() + " " + third.getPricePerNight() + " " + third.isHasBalcony() + " " + third.isHasSeaView());

// Reservace dle zadání
                Reservations reservationList =
                                String guestsOfHotels = "Adéla";
                                int roomNumber = 1;
                                String checkInDate = "19th July 2021";
                                String checkOutDate = "26th July 2021";

                                System.out.println("Reservation Details:");
                                System.out.println("Guest Name: " + guestName);
                                System.out.println("Room Number: " + roomNumber);
                                System.out.println("Check-in Date: " + checkInDate);
                                System.out.println("Check-out Date: " + checkOutDate);
                        }
                }









// Rezervace v hotelu
                Reservation one = new Reservation();
                Reservation two = new Reservation();

                List<Reservation> reservationList = new ArrayList<>();
                reservationList.add(one);
                reservationList.add(two);
                reservationList.remove(0);
                for (Reservation reservation : reservationList) {
                System.out.println("All Reservations:" + reservationList);
                }


        }




}






