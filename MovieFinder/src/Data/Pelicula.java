package Data;

import java.sql.Time;

public class Pelicula {
    private String nombre, portada, genero;
    private int anio;
    private double puntaje;
    private Time duracion;
    private boolean alquilable;
    private boolean comprable;

    public Pelicula(String nombre, int anio, String portada, String genero,
            double puntaje, Time duracion, boolean alquilable, boolean comprable) {
        this.nombre = nombre;
        this.anio = anio;
        this.portada = portada;
        this.genero = genero;
        this.puntaje = puntaje;
        this.duracion = duracion;
        this.alquilable = alquilable;
        this.comprable = comprable;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }
    
    public String getPortada() { return portada; }
    public void setPortada(String portada) { this.portada = portada; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public double getPuntaje() { return puntaje; }
    public void setPuntaje(double puntaje) { this.puntaje = puntaje;}

    public Time getDuracion() { return duracion; }
    public void setDuracion(Time duracion) { this.duracion = duracion;}

    public boolean esAlquilable() { return alquilable; }
    public void setAlquilable(boolean alquilable) { this.alquilable = alquilable; }

    public boolean esComprable() { return comprable; }
    public void setComprable(boolean comprable) { this.comprable = comprable; }
}
