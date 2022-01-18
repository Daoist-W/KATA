package test.java;

public class Phone implements Notifier{

    public String generateWeatherAlert(String conditions) {
        return "The weather is " + conditions;
    }
}
