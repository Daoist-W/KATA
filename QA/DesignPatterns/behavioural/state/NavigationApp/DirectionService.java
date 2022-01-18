public class DirectionService {
    // fields
    Navigation travelMode;

    // getters and setters
    public void setTravelMode(Navigation travelMode) {
        this.travelMode = travelMode;
    }

    public Navigation getTravelMode() {
        return travelMode;
    }

    // interface methods
    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }
}
