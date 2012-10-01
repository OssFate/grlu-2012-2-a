package Data;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cancion {
    @Id
    @Column(name = "idCancion", nullable = false)
    private int id;
    private String titulo;
    private Time duracion;

    public Cancion() {
    }

    public Cancion(int id, String titulo, Time duracion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Time getDuracion() { return duracion; }
    public void setDuracion(Time duracion) { this.duracion = duracion; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
