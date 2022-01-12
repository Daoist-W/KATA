

public abstract class Vehicle {
    // field
    private String plateNumber;
    private int idNum;

    // constructor
    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public abstract double calculateCost();

    public void setIdNum(int id) {
        this.idNum = id;
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