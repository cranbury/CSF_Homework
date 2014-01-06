/**
 * Created by grangerabuhoff on 12/16/13.
 */
public class Reservation {
    public int time;
    public String name;
    public int numberOfGuests;

//    public Reservation(int time, String name, int numberOfGuests) {
//        this.time = time;
//        this.name = name;
//        this.numberOfGuests = numberOfGuests;
//    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        String line = "time: " + this.time + ", name: " + this.name + ". number of guests: " + this.numberOfGuests;
        return line;
    }

}
