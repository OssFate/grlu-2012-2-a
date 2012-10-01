package Data;

import java.util.Calendar;

public class Persona {
    private String name, lastname, picture, birthplace;
    private Calendar birthdate;
    
    public Persona(String name, String lastname, String picture, Calendar birthdate,
            String birthplace){
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
}
