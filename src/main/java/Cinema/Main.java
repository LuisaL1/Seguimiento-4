package Cinema;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = inicializarDatos();

        JOptionPane.showMessageDialog(null,"Bienvenido a nuestro cine, tenemos las siguientes funciones\n" +
                "Barbie 12:00pm sala 1\nOpenheimer 2:00pm sala 2\nBatman 4:00pm sala 3");

        String nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre");
        String idCLiente = JOptionPane.showInputDialog("Ingrese su identificacion");
        String direccionCliente = JOptionPane.showInputDialog("Ingrese su direccion  de correo");
        String nombrePelicula = JOptionPane.showInputDialog("¿Qué pelicula quiere ver?");

        int cantidadAsientos;
        do {
            cantidadAsientos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos quiere reservar?"));
        }while (!cinema.verificarAsientos(cantidadAsientos, nombrePelicula));


        for (int i = 0; i < cantidadAsientos; i++) {
            cinema.book(nombreCliente,idCLiente,direccionCliente,nombrePelicula);
        }


    }

    public static Cinema inicializarDatos(){
        Cinema cinema = new Cinema();
        Movie movie1 = new Movie("Barbie","Robert", "2021","Comedia");
        Movie movie2 = new Movie("Openheimer","Julio", "2021","Ciencia");
        Movie movie3 = new Movie("Batman","Pepito", "2022","Accion");

        Room room1 = new Room(1,5);
        Seat seat1 = new Seat(1,1,"Ocupado");
        Seat seat2 = new Seat(1,2,"Ocupado");
        Seat seat3 = new Seat(1,3,"Ocupado");
        Seat seat4 = new Seat(1,4,"Ocupado");
        Seat seat5 = new Seat(1,5,"Ocupado");
        room1.seatList.add(seat1);
        room1.seatList.add(seat2);
        room1.seatList.add(seat3);
        room1.seatList.add(seat4);
        room1.seatList.add(seat5);

        Room room2 = new Room(2,20);
        seat1 = new Seat(1,1,"Ocupado");
        seat2 = new Seat(1,2,"Ocupado");
        seat3 = new Seat(1,3,"Ocupado");
        seat4 = new Seat(1,4,"Ocupado");
        seat5 = new Seat(1,5,"Ocupado");
        room2.seatList.add(seat1);
        room2.seatList.add(seat2);
        room2.seatList.add(seat3);
        room2.seatList.add(seat4);
        room2.seatList.add(seat5);

        Room room3= new Room(3,20);
        seat1 = new Seat(1,1,"Ocupado");
        seat2 = new Seat(1,2,"Ocupado");
        seat3 = new Seat(1,3,"Ocupado");
        seat4 = new Seat(1,4,"Ocupado");
        seat5 = new Seat(1,5,"Ocupado");
        room3.seatList.add(seat1);
        room3.seatList.add(seat2);
        room3.seatList.add(seat3);
        room3.seatList.add(seat4);
        room3.seatList.add(seat5);

        Function function1 = new Function(movie1,"12:00pm",room1,30000.00);
        Function function2 = new Function(movie2,"2:00pm",room2,90000.00);
        Function function3 = new Function(movie3,"4:00",room3,120000.00);

        cinema.movieList.add(movie1);
        cinema.movieList.add(movie2);
        cinema.movieList.add(movie3);

        cinema.functionList.add(function1);
        cinema.functionList.add(function2);
        cinema.functionList.add(function3);
        return cinema;
    }
}
