package test.java;

public class Falcon implements EggLayingCreature, FlyingCreature{
    // fields
    private String currentLocation;
    private int numEggs;

    // constructors
    public Falcon(int numEggs) {
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

    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying!");
    }
}
