

public static class Vehicle {
    // field
    private String make;
    private String model;
    private int year;
    private int mileage;
    private int numSeats;
    private int numWheels;
    private int cost;
    private String plateNumber;

    // constructor
    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }


    public double calculateCost() {
        return 0; // will be overridden;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return plateNumber;
    }
}