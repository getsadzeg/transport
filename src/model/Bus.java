
public class Bus {
    private short capacity;
    private short number;
    private double price;


    public Bus() {

    }

    public Bus(short capacity, short number, double price) {
        this.capacity = capacity;
        this.number = number;
        this.price = price;
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
