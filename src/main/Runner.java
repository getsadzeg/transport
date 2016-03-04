
package transport.src.main;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import transport.src.exceptions.IllegalNumberException;
import transport.src.model.*;
import transport.src.enums.*;
import transport.src.exceptions.InsufficientCashException;

public class Runner {
    public static void main(String[] args) {
        Bus bus;
        Bus secondbus;
        Minibus minibus;
        Metro metro;
        try {
            bus = new Bus((short)127);
            secondbus = new Bus(new Route(Address.Freedom_Square, Address.Samtredia_St));
            minibus = new Minibus((short)147);
            metro = new Metro(MetroStopping.Delisi_Metro);
            Card card = new Card(Status.DEFAULT);
            card.fill(15);
            try {
                bus.enter(card);
                bus.enter(card);
            } catch (InsufficientCashException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println(bus.readRoutes());
                System.out.println(secondbus.getByRoute());
                System.out.println(minibus.readRoutes());
                System.out.println(metro.readRoutes());
            } catch (IOException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IllegalNumberException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
