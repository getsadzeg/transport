
package transport.src.model;
import transport.src.exceptions.*;
import java.io.IOException;
import java.util.HashMap;

public abstract class Transport {
    public abstract void enter(Card card) throws InsufficientCashException;
    public abstract HashMap readRoutes() throws IOException;
}
