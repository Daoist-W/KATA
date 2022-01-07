import java.util.ArrayList;
import java.util.HashMap;

public class Garage {
    // field
    private ArrayList<Vehicle> vehicles = new ArrayList<>(100);
    private HashMap<String, Double> invoices = new HashMap<>(100);

    // methods
    public void calculateBills() {
        invoices.clear();
        for (Vehicle vehicle : vehicles) {
            double cost = costToFixVehicle(vehicle);
            invoices.put(vehicle.getPlateNumber(), cost);
        }
    }

    public void storeVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
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

    public void removeByType(String type) {
        // this code block loops through the list of Vehicles and removes the Objects with class type matching argument 'type'
        for (int i = 0; i < vehicles.size(); i++) {
            if (String.valueOf(vehicles.get(i).getClass()).contains(type)) {
                vehicles.remove(i);
                System.out.println(vehicles.get(i) + "removed");
                i--;
            }
        }
    }
}