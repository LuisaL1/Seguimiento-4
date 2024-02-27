package Cinema;

import javax.swing.*;
import java.util.ArrayList;

public class Room {
    int numberRoom;
    int size;
    ArrayList<Seat> seatList;

    public Room(int numberRoom, int size) {
        this.numberRoom = numberRoom;
        this.size = size;
        seatList = new ArrayList<>();
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public boolean encontrarAsiento(){
        for (int i = 0; i < seatList.size(); i++) {
            if (seatList.get(i).getState() != "Asiento ocupado" && seatList.get(i).getState() != "reservado" ){
                seatList.get(i).book();
                JOptionPane.showMessageDialog(null,"El asiento con fila "+seatList.get(i).getRow()+" y columna "+seatList.get(i).getColumn()+" ha sido reservado correctamente");
                size--;
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No hay asientos disponibles");
        return false;
    }
}
