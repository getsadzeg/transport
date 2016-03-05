
package transport.src.model;

import transport.src.exceptions.*;
import java.util.HashMap;
import java.io.IOException;

public class Minibus extends Bus {
    private double price = 0.8;
    private short number;
    private boolean isEntered = false;
    private static final short MAX = 270;
            
    public Minibus() {
        
    }
    public Minibus(short number) throws IllegalNumberException {
        if(number > MAX) throw new IllegalNumberException("Number must be less than " + MAX);
        this.number = number;
    }
    public Minibus(Route route) {
        super(route);
        
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    @Override
    public void enter(Card card) throws InsufficientCashException {
        if(isEntered) {
            setPrice(0.65);
        }
        else isEntered = true;
        if(card.getCash() < price) throw new InsufficientCashException("There's Insufficient " + 
                    (price - card.getCash()) +  " on your card");
        card.setCash(card.getCash() - getPrice());
        System.out.println("Your remaining cash is " + card.getCash());
    }
    @Override
    public HashMap readRoutes() throws IOException {
        return super.readRoutes();
    }
    @Override
    public String toString() {
        String str = "";
        str += "Max numbering of buses is " + MAX + System.lineSeparator();
        str += "Price of our service is " + getPrice() + "gel" + System.lineSeparator();
        return str;
    }
}
