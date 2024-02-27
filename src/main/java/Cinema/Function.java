package Cinema;

public class Function {
    Movie movie;
    String timeStart;
    Room room;
    Double price;
    public Function(Movie movie, String timeStart, Room room, Double price) {
        this.movie = movie;
        this.timeStart = timeStart;
        this.room = room;
        this.price = price;
    }
    public Movie getMovie() {
        return movie;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public Room getRoom() {
        return room;
    }

    public Double getPrice() {
        return price;
    }

    public boolean makeBook(){
        //Este metodo hace que la sala encuentre un lugar vacio y lo ocupe o reserve
        return room.encontrarAsiento();
    }
}
