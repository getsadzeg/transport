package transport.src.model;
import transport.src.exceptions.*;

public class Bus {
    private static final short MAX = 150;
    private short capacity;
    private short number;
    private double price;
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

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
