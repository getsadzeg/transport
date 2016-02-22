package transport.src.model;


public class Bus {
    private short capacity;
    private short number;
    private double price;
    private Bringplace bring;
    private Destination destination;

    public Bus() {

    }

    public Bus(short number) {
        this.number = number;
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
