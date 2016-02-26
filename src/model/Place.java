
package transport.src.model;
import  transport.src.enums.*;

public class Place {
    private Address bringplace;
    private Address destination;
    public Place() {
        
    }

    public Place(Address bringplace, Address destination) {
        this.bringplace = bringplace;
        this.destination = destination;
    }
    
}
