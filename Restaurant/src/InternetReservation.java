/**
 * Created by grangerabuhoff on 1/6/14.
 */
public class InternetReservation extends Reservation {
    public String website;
    public int phoneNumber;
    public int timeReserved;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTimeReserved() {
        return timeReserved;
    }

    public void setTimeReserved(int timeReserved) {
        this.timeReserved = timeReserved;
    }
}
