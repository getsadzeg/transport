
package transport.src.main;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import transport.src.exceptions.IllegalNumberException;
import transport.src.model.*;

public class Runner {
    public static void main(String[] args) {
        Bus bus;
        try {
            bus = new Bus((short)38);
            try {
                bus.readRoutes();
            } catch (IOException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IllegalNumberException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
