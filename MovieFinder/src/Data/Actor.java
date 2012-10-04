package Data;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

@Entity
public class Actor extends Person implements Serializable{
    public Actor() {
    }
    public Actor(int id, String name, String lastname, String picture, Calendar birthdate,
            String birthplace){
        super(id, name, lastname, picture, birthdate, birthplace);
    }
}

