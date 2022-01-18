package test.java;

public class Email implements Notifier{

    public String generateWeatherAlert(String conditions) {
        return "The weather is " + conditions;
    }
}
