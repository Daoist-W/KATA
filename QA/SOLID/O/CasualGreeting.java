package test.java;

public class CasualGreeting implements Greeting{
    // fields
    private String greeting;

    public CasualGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String greetingMessage() {
        return this.greeting;
    }
}
