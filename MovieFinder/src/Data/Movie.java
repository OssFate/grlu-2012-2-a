package Data;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Movie implements Serializable {
    @Id
    @Column(name = "idPelicula", nullable = false)
    private int id, year;
    private String name, cover, genre;
    private double rating;
    private Time duration;
    private boolean rentable;
    private boolean purchasable;
    @OneToOne
    Soundtrack soundtrack;
    @OneToMany
    Director director;

    public Movie() {
    }

    public Movie(int id, String name, int year, String cover, String genre,
            double rating, Time duration, boolean rentable, boolean purchasable) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.cover = cover;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.rentable = rentable;
        this.purchasable = purchasable;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    
    public String getCover() { return cover; }
    public void setCover(String cover) { this.cover = cover; }
    
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    
    public Time getDuration() { return duration; }
    public void setDuration(Time duration) { this.duration = duration; }
    
    public boolean isRentable() { return rentable; }
    public void setRentable(boolean rentable) { this.rentable = rentable; }
    
    public boolean isPurchasable() { return purchasable; }
    public void setPurchasable(boolean purchasable) { this.purchasable = purchasable; }
}
