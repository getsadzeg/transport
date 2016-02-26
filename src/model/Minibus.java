
package transport.src.model;

import transport.src.exceptions.*;


public class Minibus extends Bus {
    public final double price = 0.8; 
    public Minibus() {
        
    }
    public Minibus(short number) throws IllegalNumberException {
        super(number);
    }
    public Minibus(Place bring, Place destination) {
        super(bring, destination);
    }
    @Override
    public void enter(Card card) {
        card.setCash(card.getCash() - price);
    }
}
