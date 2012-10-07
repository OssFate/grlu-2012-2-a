package Data;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Song implements Serializable {
    @Id
    @Column(name = "idSong", nullable = false)
    private int id;
    private String title;
    private Time duration;
    @OneToMany
    Artist artist;

    public Song() {
    }

    public Song(int id, String titulo, Time duracion) {
        this.id = id;
        this.title = titulo;
        this.duration = duracion;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Time getDuration() { return duration; }
    public void setDuration(Time duration) { this.duration = duration; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
