
package transport.src.model;
import  transport.src.enums.*;

public class Route {
    private Address origin;
    private Address destination;
    public Route() {
        
    }

    public Route(Address bringplace, Address destination) {
        this.origin = bringplace;
        this.destination = destination;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }
    
}
