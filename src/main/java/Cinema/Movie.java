package Cinema;

public class Movie {
    String name;
    String author;
    String date;
    String category;

    public Movie(String name, String author, String date, String category) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.category = category;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }
}
