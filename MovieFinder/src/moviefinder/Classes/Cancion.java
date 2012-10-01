/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Calendar;

/**
 *
 * @author Santiago
 */
public class Cancion {
    
    private int idCancion;
    private char titulo[];
    private Calendar duracion;
    private int Artista;

    public Cancion(int idCancion, char[] titulo, Calendar duracion, int Artista) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.duracion = duracion;
        this.Artista = Artista;
    }
    
    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public char[] getTitulo() {
        return titulo;
    }

    public void setTitulo(char[] titulo) {
        this.titulo = titulo;
    }

    public Calendar getDuracion() {
        return duracion;
    }

    public void setDuracion(Calendar duracion) {
        this.duracion = duracion;
    }

    public int getArtista() {
        return Artista;
    }

    public void setArtista(int Artista) {
        this.Artista = Artista;
    }
    
    
    
}
