package Cinema;

public class Seat {
    int row;
    int column;
    String state;
    public Seat(int row, int column, String state) {
        this.row = row;
        this.column = column;
        this.state = state;
    }
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getState() {
        return state;
    }
    public void book(){
        this.state = "reservado";
    }
    public void occupied(){
        this.state = "Asiento ocupado";
    }
}
