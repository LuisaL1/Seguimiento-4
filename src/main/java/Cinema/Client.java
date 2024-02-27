package Cinema;

import java.util.ArrayList;

public class Client extends Person {
    ArrayList<Booking> bookingList;
    public Client(String name, String id, String address) {
        super(name, id, address);
        bookingList = new ArrayList<>();
    }
    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }
}
