
package transport.src.model;
import transport.src.enums.*;

public class Person {
    private String Name;
    private String surName;
    private String Age;
    private String ID;
    private PStatus status;
    public Person() {
        
    }
    public Person(String Name, String surName, String Age, String ID) {
        this.Name = Name;
        this.surName = surName;
        this.Age = Age;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public PStatus getStatus() {
        return status;
    }

    public void setStatus(PStatus status) {
        this.status = status;
    }
    
}
