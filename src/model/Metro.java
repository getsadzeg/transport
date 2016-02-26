
package transport.src.model;
import transport.src.enums.MetroStopping;
import transport.src.enums.Status;

public class Metro extends Transport {
    private MetroStopping stopping;
    public final double price = 0.5;
    public Metro() {
        
    }
    public Metro(MetroStopping stopping) {
        this.stopping = stopping;
    }

    public MetroStopping getStopping() {
        return stopping;
    }

    public void setStopping(MetroStopping stopping) {
        this.stopping = stopping;
    }
    
    @Override
    public void enter(Card card) {
        if(card.getStatus() == Status.STUDENT) {
            card.setCash(card.getCash() - price + 0.3);
        }
        else if(card.getStatus() == Status.DEFAULT){
            card.setCash(card.getCash() - price);
        }
        else if(card.getStatus() == Status.PENSIONER) {
            card.setCash(card.getCash() - price + 0.2);
        }
    }
}
