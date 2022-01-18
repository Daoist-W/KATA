package test.java;

public class Runner {
    public static void main(String[] args) {
    WeatherTracker weatherTracker = new WeatherTracker("Sunny");
    WeatherTracker weatherTracker2 = new WeatherTracker("Cloudy");
    Email email = new Email();
    Phone phone = new Phone();

    printAll(
            weatherTracker.notify(email),
            weatherTracker2.notify(phone)
    );

    }

    public static void printAll(String... strings) {
        for(String item : strings) {
            System.out.println(item);
        }
    }

}
