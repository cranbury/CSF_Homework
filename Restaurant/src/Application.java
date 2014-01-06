/**
 * Created by grangerabuhoff on 12/16/13.
 */
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Restaurant cosi = new Restaurant();
        newReservation(cosi);

//        Restaurant cosi = new Restaurant();
//        cosi.setName("Pizza Hut");
//        cosi.addReservation(7, "Terry", 5);
//        cosi.printAllReservations();
    }

    public static void newReservation(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reservation type 1) phone 2) internet 3) in person");
        int choice = scanner.nextInt();


        if(choice == 1) {
           PhoneReservation res = inputPhoneRes();
           makePhoneRes(res, restaurant);
        }
        else if(choice == 2) {
            InternetReservation res = inputIntRes();
            makeInternetRes(res, restaurant);
        }
        else if(choice == 3) {
            Reservation res = inputInPerson();
            makeRes(res, restaurant);
        }
    }

    public static PhoneReservation inputPhoneRes() {
        Scanner scanner = new Scanner(System.in);
        PhoneReservation res = new PhoneReservation();

        System.out.println("Enter phone number: ");
        res.setPhoneNumber(scanner.nextInt());

        System.out.println("Enter name: ");
        res.setName(scanner.next());

        System.out.println("Enter time: ");
        res.setTime(scanner.nextInt());

        System.out.println("Enter number of guests: ");
        res.setNumberOfGuests(scanner.nextInt());

        return res;
    }

    public static InternetReservation inputIntRes() {
        Scanner scanner = new Scanner(System.in);
        InternetReservation res = new InternetReservation();

        System.out.println("Enter phone number: ");
        res.setPhoneNumber(scanner.nextInt());

        System.out.println("Enter name: ");
        res.setName(scanner.next());

        System.out.println("Enter time: ");
        res.setTime(scanner.nextInt());

        System.out.println("Enter number of guests: ");
        res.setNumberOfGuests(scanner.nextInt());

        System.out.println("Enter website: ");
        res.setNumberOfGuests(scanner.nextInt());

        System.out.println("Enter time reserved: ");
        res.setTimeReserved(scanner.nextInt());

        return res;
    }

    public static Reservation inputInPerson() {
        Scanner scanner = new Scanner(System.in);
        Reservation res = new Reservation();

        System.out.println("Enter name: ");
        res.setName(scanner.next());

        System.out.println("Enter time: ");
        res.setTime(scanner.nextInt());

        System.out.println("Enter number of guests: ");
        res.setNumberOfGuests(scanner.nextInt());

        return res;
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
