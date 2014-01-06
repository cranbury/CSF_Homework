import java.util.LinkedList;

/**
 * Created by grangerabuhoff on 12/16/13.
 */
public class Restaurant {
    private String name;
    private LinkedList<Reservation> reservationListing = new LinkedList<Reservation>();
    private LinkedList<InternetReservation> internetReservationListing = new LinkedList<InternetReservation>();
    private LinkedList<PhoneReservation> phoneReservationListing = new LinkedList<PhoneReservation>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addReservation(Reservation res) {
//        Reservation res = new Reservation(time, name, numberOfGuests);
        reservationListing.add(res);
    }
    public void addInternetReservation(InternetReservation res) {
//        Reservation res = new Reservation(time, name, numberOfGuests);
        internetReservationListing.add(res);
    }
    public void addPhoneReservation(PhoneReservation res) {
//        Reservation res = new Reservation(time, name, numberOfGuests);
        phoneReservationListing.add(res);
    }

    public void printAllReservations() {
        for(int i = 0; i < reservationListing.size(); i++) {

            System.out.println(reservationListing.get(i).toString());
        }
        for(int i = 0; i < phoneReservationListing.size(); i++) {

            System.out.println(reservationListing.get(i).toString());
        }
        for(int i = 0; i < internetReservationListing.size(); i++) {

            System.out.println(reservationListing.get(i).toString());
        }
    }

    public int roomLeft(int hour) {
        int bookedGuests = 0;
        int capacity = 50;

        for(int i = 0; i < reservationListing.size(); i++) {
            if(reservationListing.get(i).time == hour) {
               bookedGuests += reservationListing.get(i).numberOfGuests;
            }
        }
        for(int i = 0; i < internetReservationListing.size(); i++) {
            if(internetReservationListing.get(i).time == hour) {
                bookedGuests += internetReservationListing.get(i).numberOfGuests;
            }
        }
        for(int i = 0; i < phoneReservationListing.size(); i++) {
            if(phoneReservationListing.get(i).time == hour) {
                bookedGuests += phoneReservationListing.get(i).numberOfGuests;
            }
        }

        return (capacity - bookedGuests);

    }

    public void removeReservation(int hour, String name) {
        for(int i = 0; i < reservationListing.size(); i++) {
            if(reservationListing.get(i).time == hour && reservationListing.get(i).getName() == name) {
                reservationListing.remove(i);
                System.out.println("Reservation at " + hour + " under " + name + " removed.");
            }

        }
    }

    public static boolean makeRes(Reservation res, Restaurant restaurant) {
        int roomleft = restaurant.roomLeft(res.getTime());
        if(roomleft < res.getNumberOfGuests()) {
            System.out.println("Not enough room.");
            return false;
        }
        else {
            restaurant.addReservation(res);
            System.out.println("You just made a reservation.");
            return true;
        }
    }
    public static boolean makePhoneRes(PhoneReservation res, Restaurant restaurant) {
        int roomleft = restaurant.roomLeft(res.getTime());
        if(roomleft < res.getNumberOfGuests()) {
            System.out.println("Not enough room.");
            return false;
        }
        else {
            restaurant.addPhoneReservation(res);
            System.out.println("You just made a reservation.");
            return true;
        }
    }
    public static boolean makeInternetRes(InternetReservation res, Restaurant restaurant) {
        int roomleft = restaurant.roomLeft(res.getTime());
        if(roomleft < res.getNumberOfGuests()) {
            System.out.println("Not enough room.");
            return false;
        }
        else {
            restaurant.addInternetReservation(res);
            System.out.println("You just made a reservation.");
            return true;
        }
    }

}
