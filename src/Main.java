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
                Room first = new Room(01, 1, true, true, 1000);
                Room second = new Room(02, 1, true, true, 1000);
                Room third = new Room(03, 3, false, true, 2400);

                System.out.println("číslo pokoje:" + first.getroomOfNumber() + "počet lůžek:" + first.getNumberOfBeds() + "cena za noc:" + first.getPricePerNight() + "s balkónem:" + first.isHasBalcony() + "výhled na moře:" + first.isHasSeaView());
                System.out.println("číslo pokoje:" + second.getRoomOfNumber() + "počet lůžek:" + second.getNumberOfBeds() + "cena za noc:" + second.getPricePerNight() + "s balkónem:" + second.isHasBalcony() + "výhled na moře:" + second.isHasSeaView());
                System.out.println("číslo pokoje:" + third.getRoomOfNumber() + "počet lůžek:" + third.getNumberOfBeds() + "cena za noc:" + third.getPricePerNight() + "s balkónem:" + third.isHasBalcony() + "výhled na moře:" + third.isHasSeaView());

// Reservace dle zadání
                Reservation reservationFirst = new Reservation(01,"Adela Malíková","19.07.21","26.07.21",false);
                Reservation reservationSecond = new Reservation(03,"Adela Malíková,Jan Dvořáček","01.09.21","14.09.21",false)
// Seznam všech reservací



                                String guestsOfHotels = "Adéla";
                                int roomNumber = 1;
                                String checkInDate = "19th July 2021";
                                String checkOutDate = "26th July 2021";

                                System.out.println("Reservation Details:");
                                System.out.println("Guest Name: " + guestsOfHotels);
                                System.out.println("Room Number: " + roomNumber);
                                System.out.println("Check-in Date: " + checkInDate);
                                System.out.println("Check-out Date: " + checkOutDate);
                        }
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


        }




}






