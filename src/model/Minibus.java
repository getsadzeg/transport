
package transport.src.model;

import transport.src.exceptions.*;


public class Minibus extends Bus {
    public Minibus() {
        
    }
    public Minibus(short number) throws IllegalNumberException {
        super(number);
    }
    public Minibus(Place bring, Place destination) {
        super(bring, destination);
    }
    
}
