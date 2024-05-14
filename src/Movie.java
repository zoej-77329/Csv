import java.util.Objects;

public class Movie {
    String title;
    int year;
    String genre;
    String rating;

    public Movie(String title, int year, String genre, String rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }
    @Override
    public String toString()
    {
        return "Movie:{" +
                "Title:" + title + "\t," + "Year:" + year + "\t," + "Genre:" + genre + "\t," + "Rating:"
                + rating + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(title, movie.title) && Objects.equals(genre, movie.genre) && Objects.equals(rating, movie.rating);
    }


}
