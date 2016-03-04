
package transport.src.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import transport.src.enums.Address;
import transport.src.enums.MetroStopping;
import transport.src.enums.Status;
import transport.src.exceptions.InsufficientCashException;

public class Metro extends Transport {
    private MetroStopping stopping;
    private boolean isEntered = false;
    public double price = Bus.price;
    public Metro() {
        
    }
    public Metro(MetroStopping stopping) {
        this.stopping = stopping;
    }

    public MetroStopping getStopping() {
        return stopping;
    }

    public void setStopping(MetroStopping stopping) {
        this.stopping = stopping;
    }
    
    @Override
    public void enter(Card card) throws InsufficientCashException {
        if(isEntered) {
            price = 0.4;
        }
        else isEntered = true;
        if(card.getStatus() == Status.STUDENT) {
            if(card.getCash() < (price - 0.3)) throw new InsufficientCashException("There's Insufficient " + 
                    ((price - 0.3) - card.getCash()) +  " on your card");
            card.setCash(card.getCash() - price + 0.3); 
            System.out.println("Your remaining cash is " + card.getCash());
        }
        else if(card.getStatus() == Status.DEFAULT){
            if(card.getCash() < price) throw new InsufficientCashException("There's Insufficient " + 
                    ((price) - card.getCash()) +  " on your card");
            card.setCash(card.getCash() - price);
            System.out.println("Your remaining cash is " + card.getCash());
        }
        else if(card.getStatus() == Status.PENSIONER) {
            if(card.getCash() < (price - 0.2)) throw new InsufficientCashException("There's Insufficient " + 
                    ((price - 0.2) - card.getCash()) +  " on your card");
            card.setCash(card.getCash() - price + 0.2);
            System.out.println("Your remaining cash is " + card.getCash());
        }
    }
    @Override
    public List readRoutes() throws IOException {
        List<MetroStopping> stoppings = Arrays.asList(MetroStopping.values());
        return stoppings;
    }
    @Override
    public String toString() {
        String str = "";
        str += "Price of our service is " + price + "gel" + "for students and pensioners - " +  (price-0.3) + "for pupils it's free" + System.lineSeparator();
        return str;
    }
}
