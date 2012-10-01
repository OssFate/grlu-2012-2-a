package Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Soundtrack {
    @Id
    @Column(name = "idSoundtrack", nullable = false)
    int id;
    private String imagen;

    public Soundtrack() {
    }

    public Soundtrack(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }   

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
