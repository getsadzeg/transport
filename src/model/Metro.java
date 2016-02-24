
package transport.src.model;
import transport.src.enums.MetroStopping;

public class Metro {
    private MetroStopping stopping;
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
    
}
