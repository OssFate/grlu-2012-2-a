package Data;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;

@Entity
public class Artist extends Person implements Serializable{
    public Artist() {
    }
    public Artist(int id, String name, String lastname, String picture, Calendar birthdate, String birthplace) {
        super(id, name, lastname, picture, birthdate, birthplace);
    }  
}
