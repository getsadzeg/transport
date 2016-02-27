package transport.src.model;
import transport.src.exceptions.*;
import transport.src.enums.*;

public class Bus extends Transport {
    private static final short MAX = 150;
    private final short capacity = 30;
    private short number;
    public double price = 0.5;
    private Route route;

    public Bus() {

    }

    public Bus(short number) throws IllegalNumberException {
        if(number > MAX) throw new IllegalNumberException("Number must be less than 150");
        this.number = number;
    }
    public Bus(Route route) {
        this.route = route;
    }

    public short getCapacity() {
        return capacity;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

   

    @Override
    public void enter(Card card) throws InsufficientCashException {
        if(card.getStatus() == Status.STUDENT) {
            if(card.getCash() < (price - 0.3)) throw new InsufficientCashException("There's Insufficient cash on your card");
            card.setCash(card.getCash() - price + 0.3);
            
        }
        else if(card.getStatus() == Status.DEFAULT){
            if(card.getCash() < price) throw new InsufficientCashException("There's Insufficient cash on your card");
            card.setCash(card.getCash() - price);
        }
        else if(card.getStatus() == Status.PENSIONER) {
            if(card.getCash() < (price - 0.2)) throw new InsufficientCashException("There's Insufficient cash on your card");
            card.setCash(card.getCash() - price + 0.2);
        }
    }
}
