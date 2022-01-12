import java.util.ArrayList;
import java.util.HashMap;

public class Garage {
    // field
    private ArrayList<Vehicle> vehicles = new ArrayList<>(100);
    private HashMap<String, Double> invoices = new HashMap<>(100);
    private int currentId = 0;

    // methods
    public void calculateBills() {
        invoices.clear();
        for (Vehicle vehicle : vehicles) {
            double cost = costToFixVehicle(vehicle);
            invoices.put(vehicle.getPlateNumber(), cost);
        }
    }

    public void storeVehicle(Vehicle vehicle) {
        vehicle.setIdNum(currentId);
        this.vehicles.add(vehicle);
        currentId++;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public double costToFixVehicle(Vehicle vehicle) {
        return vehicle.calculateCost();
    }

    public void emptyGarage() {
        this.vehicles.clear();
    }

    public void removeByType(Class<?> type) {
        // this code block loops through the list of Vehicles and removes the Objects with class type matching argument 'type'
        for (Vehicle vehicle : new ArrayList<>(this.vehicles)) {
            if (vehicle.getClass() == type) {
                this.vehicles.remove(vehicle);
            }
        }
    }
}