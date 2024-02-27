package Cinema;

import javax.swing.*;
import java.util.ArrayList;
public class Cinema {
    ArrayList<Booking> bookingList;
    ArrayList<Function> functionList;
    ArrayList<Movie> movieList;

    public Cinema() {
        bookingList = new ArrayList<>();
        functionList = new ArrayList<>();
        movieList = new ArrayList<>();
    }

    public void book(String clientName, String clientId,String clientAddress, String movieName){
        Client client = new Client(clientName, clientId, clientAddress);
        boolean noSeEncuentra = true;
        for (int i = 0; i < functionList.size() && noSeEncuentra; i++) {
            if (functionList.get(i).getMovie().getName().equals(movieName)){
                //Se encontró la funcion
                noSeEncuentra=false;
                //Se apunta a la funcion
                Function function = functionList.get(i);
                //Se verifica si hay lugar y se hace la reserva
                if (function.makeBook()){
                    Booking booking = new Booking(client, function);
                    //añade la reserva a la lista de reservas del cine y del cliente
                    client.getBookingList().add(booking);
                    bookingList.add(booking);
                }
            }
        }
    }

    public boolean verificarAsientos(int cantidadAsientos, String nombrePelicula){
        for (int i = 0; i < functionList.size(); i++) {
            if (functionList.get(i).getMovie().getName().equals(nombrePelicula)){
                if (cantidadAsientos>functionList.get(i).getRoom().getSize()){
                    JOptionPane.showMessageDialog(null,"No hay suficientes asientos!");
                    return false;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Si hay suficientes asientos!");
        return true;
    }

}
