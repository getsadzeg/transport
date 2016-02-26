
package transport.src.model;
import transport.src.enums.*;
import transport.src.exceptions.*;
import java.util.*;
//import static transport.src.enums.Status.PUPIL;

public class Card {
    private Status status;
    private double cash;
   // private HashMap type = new HashMap<PStatus, String>();
    public Card() {
        
    }
    public Card(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
    public void fill(double cash) {
        setCash(cash);
    }
}
