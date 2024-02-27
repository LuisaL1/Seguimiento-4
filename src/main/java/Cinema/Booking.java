package Cinema;

import java.util.ArrayList;
public class Booking {
    Client client;
    Function function;
    ArrayList<Seat> seatList;

    public Booking(Client client, Function function) {
        this.client = client;
        this.function = function;
        seatList = new ArrayList<>();
    }
    public Client getClient() {
        return client;
    }

    public Function getFunction() {
        return function;
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }
}
