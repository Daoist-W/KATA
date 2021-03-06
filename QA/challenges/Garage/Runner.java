

public class Runner {
    public static void main(String[] args) {
        Garage garage = new Garage();

        // creating vehicles
        Car car = new Car("1325DDD");
        Car car2 = new Car("135DDD");
        Car car3 = new Car("125DDD");
        Car car4 = new Car("325DDD");
        Van van = new Van("13548AAA");
        Motorbike motorbike = new Motorbike("7895SSS");

        // storing vehicles
        garage.storeVehicle(car);
        garage.storeVehicle(car2);
        garage.storeVehicle(car3);
        garage.storeVehicle(car4);
        garage.storeVehicle(van);
        garage.storeVehicle(motorbike);


        // removing one vehicle
        garage.removeVehicle(car2);

        // removing multiple vehicles
        garage.removeByType(Car.class);

        // calculating costs
        garage.calculateBills();
        


    }


}
