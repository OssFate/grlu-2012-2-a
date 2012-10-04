package Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Soundtrack implements Serializable {
    @Id
    @Column(name = "idSoundtrack", nullable = false)
    int id;
    private String picture;

    public Soundtrack() {
    }

    public Soundtrack(String picture) {
        this.picture = picture;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getPicture() { return picture; }
    public void setPicture(String picture) { this.picture = picture; }
}
