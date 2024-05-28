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


// Rezervace v hotelu
                Reservation one = new Reservation(1, "Adéla", "23.2.24", "25.2.24", true);
                Reservation two = new Reservation(2, "Tonda", "24.3.24", "26.4.24", false);

                List<Reservation> reservationList = new ArrayList<>();
                reservationList.add(one);
                reservationList.add(two);
                reservationList.remove(0);

                for (Reservation reservation : reservationList) ;{

                System.out.println("All Reservations:" + reservation());
                }


        }



}






