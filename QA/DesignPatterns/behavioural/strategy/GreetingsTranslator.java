public class GreetingsTranslator {
    // fields
    GreetingsStrategy gStrategy;

    // constructors
    public GreetingsTranslator() {
    }

    public GreetingsTranslator(GreetingsStrategy gStrategy) {
        this.gStrategy = gStrategy;
    }

    // methods
    public void setgStrategy(GreetingsStrategy gStrategy) {
        this.gStrategy = gStrategy;
    }

    public void greet(String name) {
        this.gStrategy.sayGreeting(name);
    }
}
