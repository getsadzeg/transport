
package transport.src.model;
import transport.src.exceptions.*;
import java.io.IOException;

public abstract class Transport {
    public abstract void enter(Card card) throws InsufficientCashException;
   /// public abstract void getRoutes() throws IOException;
}
