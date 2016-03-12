
package transport.src.model;
import transport.src.enums.*;
import transport.src.exceptions.*;
import java.util.*;
import static transport.src.model.Bus.price;

public class Card {
    private Status status;
    private double cash;
    private Date date;
    
    public Card() {
        
    }
    public Card(Status status) {
        this.status = status;
        date = new Date();
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
        setCash(this.cash + cash);
    }
    public boolean isEntered() {
        boolean isEntered = false;
        long mills = date.getTime();
        long anothermills = 0;
        if(isEntered) {
            anothermills = mills;
            mills = date.getTime();
            if(mills - anothermills == 9000000) price = 0.4;
        }
        else isEntered = true;
        return isEntered;
    }
}
