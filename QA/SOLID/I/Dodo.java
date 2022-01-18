package test.java;

public class Dodo implements EggLayingCreature, ExtinctCreature {
    // fields
    private String currentLocation;
    private int numEggs;

    // constructors
    public Dodo(int numEggs) {
        this.numEggs = numEggs;
    }

    // getters and setters
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getNumEggs() {
        return numEggs;
    }

    public void setNumEggs(int numEggs) {
        this.numEggs = numEggs;
    }

    // interface methods

    public void layEggs() {
        setNumEggs(getNumEggs() + 1);
    }

    public void goExtinct() {
        setCurrentLocation(getClass().getSimpleName() + " is in a museum");
    }
}
