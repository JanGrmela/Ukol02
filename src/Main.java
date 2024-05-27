import com.engeto.Booking;
import com.engeto.GuestsOfHotel;
import com.engeto.Room;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
        public static void main(String[] args) {
                int roomNumber;
                String bookingList;
                List<GuestsOfHotel>guestOfHotels;
                String checkInDate;
                String checkOutDate;
                boolean stayType;
        //Booking bookingfirst = new Booking(roomNumber,guestOfHotels,checkInDate,checkOutDate,stayType);


        ListOfBooking (List<Booking> bookingList) {
                        this.bookingList = bookingList;
                        System.out.println("All Reservations:"+ bookingList);
                }







        GuestsOfHotel firstguest = new GuestsOfHotel( "Adéla", "Malíková",LocalDate.of(1993,3,13));
        GuestsOfHotel secondguest = new GuestsOfHotel("Jan","Dvořáček", LocalDate.of(1995,05,05));


        Room first = new Room(01,1,true,true,1000);
        Room second = new Room(02,1,true,true,1000);
        Room third = new Room(03,3,false,true,2400);


        System.out.println(firstguest.getName()+" " +firstguest.getSurname()+" "+"("+ firstguest.getDateOfBirth()+")");
        System.out.println(secondguest.getName()+" "+secondguest.getSurname()+" "+"("+secondguest.getDateOfBirth()+")");


        System.out.println("číslo pokoje:"+first.getRoomNumber()+" "+first.getNumberOfBeds()+" "+ first.getPricePerNight() + " "+ first.isHasBalcony()+" "+ first.isHasSeaView());
        System.out.println("číslo pokoje:"+second.getRoomNumber()+" "+second.getNumberOfBeds()+" "+ second.getPricePerNight() +" "+ second.isHasBalcony()+" "+ second.isHasSeaView());
        System.out.println("číslo pokoje:"+ third.getRoomNumber()+" "+ third.getNumberOfBeds()+" "+ third.getPricePerNight() +" "+ third.isHasBalcony()+" "+ third.isHasSeaView());




        }

}