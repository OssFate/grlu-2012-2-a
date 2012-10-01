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
public class Persona {
    
    private int idpersona;
    private char nombre[];
    private char apellido[];
    private char lugarnacim[];
    private char imagen[];
    private Calendar fechanacim;

    public Persona(int idpersona, char[] nombre, char[] apellido, char[] lugarnacim, char[] imagen, Calendar fechanacim) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugarnacim = lugarnacim;
        this.imagen = imagen;
        this.fechanacim = fechanacim;
    }
    
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public char[] getNombre() {
        return nombre;
    }

    public void setNombre(char[] nombre) {
        this.nombre = nombre;
    }

    public char[] getApellido() {
        return apellido;
    }

    public void setApellido(char[] apellido) {
        this.apellido = apellido;
    }

    public char[] getLugarnacim() {
        return lugarnacim;
    }

    public void setLugarnacim(char[] lugarnacim) {
        this.lugarnacim = lugarnacim;
    }

    public char[] getImagen() {
        return imagen;
    }

    public void setImagen(char[] imagen) {
        this.imagen = imagen;
    }

    public Calendar getFechanacim() {
        return fechanacim;
    }

    public void setFechanacim(Calendar fechanacim) {
        this.fechanacim = fechanacim;
    }
    
    

    
}
