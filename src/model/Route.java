
package transport.src.model;
import  transport.src.enums.*;

public class Route {
    private Address bringplace;
    private Address destination;
    public Route() {
        
    }

    public Route(Address bringplace, Address destination) {
        this.bringplace = bringplace;
        this.destination = destination;
    }
    
}
