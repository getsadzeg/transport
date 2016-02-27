
package transport.src.model;

import transport.src.exceptions.*;


public class Minibus extends Bus {
    public Minibus() {
        
    }
    public Minibus(short number) throws IllegalNumberException {
        super(number);
    }
    public Minibus(Route route) {
        super(route);
    }
    @Override
    public void enter(Card card) {
        price = 0.8;
        card.setCash(card.getCash() - price);
    }
}
