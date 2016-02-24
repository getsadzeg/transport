
package transport.src.model;


public class MetroTrain {
    private Metro station;
    private short capacity;
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

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }
    
}
