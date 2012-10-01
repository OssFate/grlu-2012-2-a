package Data;

import java.util.Calendar;
import javax.persistence.*;

@Entity
public class Actor extends Persona{
    public Actor() {
    }
    public Actor(int id, String name, String lastname, String picture, Calendar birthdate,
            String birthplace){
        super(id, name, lastname, picture, birthdate, birthplace);
    }
}

