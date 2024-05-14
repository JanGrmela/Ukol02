import com.engeto.Booking;
import com.engeto.GuestsofHotel;
import com.engeto.Room;
import java.time.LocalDate;


public class Main {
        public static void main(String[] args) {

        GuestsofHotel firstguest = new GuestsofHotel( "Adéla", "Malíková",LocalDate.of(1993,3,13));
        GuestsofHotel secondguest = new GuestsofHotel("Jan","Dvořáček", LocalDate.of(1995,05,05));


        Room first = new Room(01,1,true,true,1000);
        Room second = new Room(02,1,true,true,1000);
        Room third = new Room(03,3,false,true,2400);

        Booking booking = new Booking();









        System.out.println(firstguest.getName()+" " +firstguest.getSurname()+" "+"("+ firstguest.getBirthdate()+")");
        System.out.println(secondguest.getName()+" "+secondguest.getSurname()+" "+"("+secondguest.getBirthdate()+")");


        System.out.println("číslo pokoje:"+first.getNumberofRoom()+" "+first.getNumberofBeds()+" "+ first.getPricePerNight() + first.isBalcony()+ first.isSeeview());

        }

}