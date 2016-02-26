package transport.src.model;
import transport.src.exceptions.*;
import transport.src.enums.*;

public class Bus extends Transport {
    private static final short MAX = 150;
    private final short capacity = 30;
    private short number;
    public final double price = 0.5;
    private Place bring;
    private Place destination;

    public Bus() {

    }

    public Bus(short number) throws IllegalNumberException {
        if(number > MAX) throw new IllegalNumberException("Number must be less than 150");
        this.number = number;
    }
    public Bus(Place bring, Place destination) {
        
        this.bring = bring;
        this.destination = destination;
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
    public void enter(Card card) {
        if(card.getStatus() == Status.STUDENT) {
            card.setCash(card.getCash() - price + 0.3);
        }
        else if(card.getStatus() == Status.DEFAULT){
            card.setCash(card.getCash() - price);
        }
        else if(card.getStatus() == Status.PENSIONER) {
            card.setCash(card.getCash() - price + 0.2);
        }
    }
}
