import com.engeto.GuestsOfHotel;
import com.engeto.Reservation;
import com.engeto.Room;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {


        public static void main(String[] args) {

// Hosté dle zadání
            GuestsOfHotel firstguest = new GuestsOfHotel("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
            GuestsOfHotel secondguest = new GuestsOfHotel("Jan", "Dvořáček", LocalDate.of(1995, 05, 05));
// Seznam hostů
            List<GuestsOfHotel>guestsOfHotelList= new ArrayList<>();
            guestsOfHotelList.add(firstguest);
            guestsOfHotelList.add(secondguest);
            System.out.println("Seznam hostů:");
            for (GuestsOfHotel allguests : guestsOfHotelList) {
                System.out.println(allguests.getName() + " " + allguests.getSurname() + " " + "(" + allguests.getDateOfBirth() + ")");
            }

//Evidence pokojů
            Room first = new Room(1, 2, true, false, 1500);
            Room second = new Room(2, 1, true, true, 1000);
            Room third = new Room(3, 3, false, true, 2400);

//Seznam pokojů
            List<Room> roomList = new ArrayList<>();
            roomList.add(first);
            roomList.add(second);
            roomList.add(third);
            System.out.println("Seznam pokojů:");
            for (Room allrooms : roomList) {
                System.out.println("číslo pokoje:" + allrooms.getNumberOfRoom() + "; " + "počet lůžek:" + allrooms.getNumberOfBeds() + "; " + "cena za noc:" + allrooms.getPricePerNight() + "; " + "s balkónem:" + allrooms.isHasBalcony() + "; " + "výhled na moře:" + allrooms.isHasSeaView());
            }



// Reservace dle zadání
           Reservation reservationFirst = new Reservation(first,firstguest, guestsOfHotelList, LocalDate.of(2021, 8, 1), LocalDate.of(2021, 8, 8), true);
           Reservation reservationSecond = new Reservation(second,secondguest, guestsOfHotelList, LocalDate.of(2021, 8, 10), LocalDate.of(2021, 8, 15), false);

            System.out.println("Detail rezervací:");
            System.out.println("První reservace: " + "pokoj č.: " + reservationFirst.getRoom().getNumberOfRoom() + " ;host: " + reservationFirst.getGuestsOfHotel() + " ;příjezd: " + reservationFirst.getCheckInDate() + " ;odjezd: " + reservationFirst.getCheckOutDate() + " ;typ pobytu: " + reservationFirst.isStayType());
            System.out.println("Druhá reservace: " + "pokoj č.: " + reservationSecond.getRoom().getNumberOfRoom() + " ;host: " + reservationSecond.getGuestsOfHotel() + " ;příjezd: " + reservationSecond.getCheckInDate() + " ;odjezd: " + reservationSecond.getCheckOutDate() + " ;typ pobytu: " + reservationSecond.isStayType());


// Seznam všech rezervací
            List<Reservation> reservationList = new ArrayList<>();
            reservationList.add(reservationFirst);
            reservationList.add(reservationSecond);
                System.out.println("Seznam rezervací:");
            for (Reservation allreservation : reservationList) {
                System.out.println("Pokoj č.: " + allreservation.getRoom().getNumberOfRoom() + " ;host: " + allreservation.getGuestsOfHotel() + " ;příjezd: " + allreservation.getCheckInDate() + " ;odjezd: " + allreservation.getCheckOutDate() + " ;typ pobytu: " + allreservation.isStayType());

                }
        }
        }







































