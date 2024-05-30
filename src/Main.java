import com.engeto.GuestsOfHotel;
import com.engeto.Reservation;
import com.engeto.Room;
import java.time.LocalDate;


public class Main {


        public static void main(String[] args) {

// Hosté dle zadání
                GuestsOfHotel firstguest = new GuestsOfHotel("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
                GuestsOfHotel secondguest = new GuestsOfHotel("Jan", "Dvořáček", LocalDate.of(1995, 05, 05));

                System.out.println(firstguest.getName() + " " + firstguest.getSurname() + " " + "(" + firstguest.getDateOfBirth() + ")");
                System.out.println(secondguest.getName() + " " + secondguest.getSurname() + " " + "(" + secondguest.getDateOfBirth() + ")");

// Evidence pokojů
                Room first = new Room(1, 1, true, true, 1000);
                Room second = new Room(2, 1, true, true, 1000);
                Room third = new Room(3, 3, false, true, 2400);
                System.out.println("Evidence pokojů :");
                System.out.println("číslo pokoje:" + first.getNumberOfRoom()+"; " + "počet lůžek:" + first.getNumberOfBeds() +"; " +"cena za noc:" + first.getPricePerNight() +"; "+ "s balkónem:" + first.isHasBalcony() +"; "+ "výhled na moře:" + first.isHasSeaView());
                System.out.println("číslo pokoje:" + second.getNumberOfRoom() +"; "+ "počet lůžek:" + second.getNumberOfBeds() +"; " +"cena za noc:" + second.getPricePerNight() +"; "+ "s balkónem:" + second.isHasBalcony() +"; "+ "výhled na moře:" + second.isHasSeaView());
                System.out.println("číslo pokoje:" + third.getNumberOfRoom() +"; "+ "počet lůžek:" + third.getNumberOfBeds() +"; "+ "cena za noc:" + third.getPricePerNight() +"; "+ "s balkónem:" + third.isHasBalcony() +"; "+ "výhled na moře:" + third.isHasSeaView());

// Reservace dle zadání
                Reservation reservationFirst = new Reservation(1,"Adela Malíková","19.07.21","26.07.21",false);
                Reservation reservationSecond = new Reservation(3,"Adela Malíková,Jan Dvořáček","01.09.21","14.09.21",false);

                System.out.println("Reservation Details:");
                System.out.println("První reservace: " + "pokoj č.: "+reservationFirst.getRoomOfNumber()+" ;host: "+ reservationFirst.getGuestsOfHotel() +" ;příjezd: "+reservationFirst.getCheckInDate()+" ;odjezd: "+reservationFirst.getCheckOutDate()+" ;typ pobytu: "+reservationFirst.isStayType());
                System.out.println("Druhá reservace: " + "pokoj č.: "+reservationSecond.getRoomOfNumber()+" ;host: "+ reservationSecond.getGuestsOfHotel() +" ;příjezd: "+reservationSecond.getCheckInDate()+" ;odjezd: "+reservationSecond.getCheckOutDate()+" ;typ pobytu: "+reservationSecond.isStayType());

// Seznam vše rezervací

                System.out.println("Seznam všech rezervací:");



                }









// Rezervace v hotelu
        //        Reservation one = new Reservation();
        //      Reservation two = new Reservation();

        //        List<Reservation> reservationList = new ArrayList<>();
        //        reservationList.add(one);
        //        reservationList.add(two);
        //        reservationList.remove(0);
        //        for (Reservation reservation : reservationList) {
        //        System.out.println("All Reservations:" + reservationList);



        }











