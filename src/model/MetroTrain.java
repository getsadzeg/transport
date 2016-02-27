
package transport.src.model;


public class MetroTrain {
    private Metro station;
    public final short capacity = 50;
    public MetroTrain() {
        
    }
    public MetroTrain(Metro station) {
        
    }

    public Metro getStation() {
        return station;
    }

    public void setStation(Metro station) {
        this.station = station;
    }

    public short getCapacity() {
        return capacity;
    }
    
}
