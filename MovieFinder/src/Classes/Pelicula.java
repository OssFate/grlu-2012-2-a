/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Time;
   
    
/**   
 *
 * @author Santiago
 */
public class Pelicula {
 
    private int idPelicula;
    private char nombre[];
    private char portada[];
    private char genero[];
    private short puntaje;
    private Time duracion[];
    private boolean alquilable;
    private boolean comprable;
    
    private int soundtrack;
    private int director;

    public Pelicula(int idPelicula, char[] nombre, char[] portada, char[] genero, short puntaje, Time[] duracion, boolean alquilable, boolean comprable, int soundtrack) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.portada = portada;
        this.genero = genero;
        this.puntaje = puntaje;
        this.duracion = duracion;
        this.alquilable = alquilable;
        this.comprable = comprable;
        this.soundtrack = soundtrack;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public char[] getNombre() {
        return nombre;
    }

    public void setNombre(char[] nombre) {
        this.nombre = nombre;
    }

    public char[] getPortada() {
        return portada;
    }

    public void setPortada(char[] portada) {
        this.portada = portada;
    }

    public char[] getGenero() {
        return genero;
    }

    public void setGenero(char[] genero) {
        this.genero = genero;
    }

    public short getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(short puntaje) {
        this.puntaje = puntaje;
    }

    public Time[] getDuracion() {
        return duracion;
    }

    public void setDuracion(Time[] duracion) {
        this.duracion = duracion;
    }

    public boolean isAlquilable() {
        return alquilable;
    }

    public void setAlquilable(boolean alquilable) {
        this.alquilable = alquilable;
    }

    public boolean isComprable() {
        return comprable;
    }

    public void setComprable(boolean comprable) {
        this.comprable = comprable;
    }

    public int getSoundtrack() {
        return soundtrack;
    }

    public void setSoundtrack(int soundtrack) {
        this.soundtrack = soundtrack;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }
    
    
    
    
    
}
