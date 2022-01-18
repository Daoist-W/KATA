package test.java;

public class WeatherTracker {
    // fields
    private String conditions;

    //constructor

    public WeatherTracker(String conditions) {
        this.conditions = conditions;
    }

    // getters and setters
    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    // interface dependent methods
    public String notify(Notifier notifier) {
        return notifier.generateWeatherAlert(getConditions());
    }

}
