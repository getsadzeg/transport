
package transport.src.model;

import transport.src.exceptions.*;


public class Minibus extends Bus {
    private double price = 0.8;
    private boolean isEntered = false;
    public Minibus() {
        
    }
    public Minibus(short number) throws IllegalNumberException {
        super(number);
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
    public String toString() {
        String str = "";
       // str += "Max numbering of buses is " + MAX + System.lineSeparator();
        str += "Price of our service is " + getPrice() + "gel" + System.lineSeparator();
        return str;
    }
}
