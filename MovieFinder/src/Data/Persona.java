package Data;

import java.util.Calendar;
import javax.persistence.*;

@Entity
public class Persona {
    @Id
    @Column(name = "idPersona", nullable = false)
    private int id;
    private String name, lastname, picture, birthplace;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar birthdate;

    public Persona() {
    }
    
    public Persona(int id, String name, String lastname, String picture, Calendar birthdate,
            String birthplace){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.picture = picture;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    
    public String getPicture() { return picture; }
    public void setPicture(String picture) { this.picture = picture;}
    
    public Calendar getBirthdate() { return birthdate; }
    public void setBirthdate(Calendar birthdate) { this.birthdate = birthdate; }
    
    public String getBirthplace() { return birthplace; }
    public void setBirthplace(String birthplace) { this.birthplace = birthplace; }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
}
