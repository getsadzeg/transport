
package transport.src.model;

import transport.src.exceptions.*;


public class Minibus extends Bus {
    private final double price = 0.8;
    public Minibus() {
        
    }
    public Minibus(short number) throws IllegalNumberException {
        super(number);
    }
    public Minibus(Route route) {
        super(route);
        
    }
    public double getPrice() {
        return price;
    }
    @Override
    public void enter(Card card) {
        card.setCash(card.getCash() - getPrice());
    }
    @Override
    public String toString() {
        String str = "";
       // str += "Max numbering of buses is " + MAX + System.lineSeparator();
        str += "Price of our service is " + getPrice() + "gel" + System.lineSeparator();
        str+= "Routes:" + System.lineSeparator(); //not yet
        return str;
    }
}
