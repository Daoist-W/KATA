package test.java;

public class Greeter {
    // fields
    private Greeting greeting;

    public Greeter(Greeting greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return greeting.greetingMessage();
    }

}
