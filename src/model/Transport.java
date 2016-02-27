
package transport.src.model;
import transport.src.exceptions.*;

public abstract class Transport {
    public abstract void enter(Card card) throws InsufficientCashException;
}
