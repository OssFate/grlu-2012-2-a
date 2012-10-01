package Data;

import java.util.Calendar;
import javax.persistence.Entity;

@Entity
public class Artista extends Persona{
    public Artista() {
    }
    public Artista(int id, String name, String lastname, String picture, Calendar birthdate, String birthplace) {
        super(id, name, lastname, picture, birthdate, birthplace);
    }  
}
