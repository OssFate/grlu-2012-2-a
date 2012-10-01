/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Santiago
 */
public class Soundtrack {
    
    private int idSoundtrack;
    
    private char imagen[];
    private int cancion;

    public Soundtrack(char[] imagen, int cancion) {
        this.imagen = imagen;
        this.cancion = cancion;
    }

    public int getIdSoundtrack() {
        return idSoundtrack;
    }

    public void setIdSoundtrack(int idSoundtrack) {
        this.idSoundtrack = idSoundtrack;
    }

    public char[] getImagen() {
        return imagen;
    }

    public void setImagen(char[] imagen) {
        this.imagen = imagen;
    }

    public int getCancion() {
        return cancion;
    }

    public void setCancion(int cancion) {
        this.cancion = cancion;
    }
    
    
}
