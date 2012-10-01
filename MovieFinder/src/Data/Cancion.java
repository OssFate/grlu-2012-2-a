package Data;

import java.sql.Time;

public class Cancion {
    private String titulo;
    private Time duracion;

    public Cancion(String titulo, Time duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Time getDuracion() { return duracion; }
    public void setDuracion(Time duracion) { this.duracion = duracion; }
}
