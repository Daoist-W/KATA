public class TurkeyAdapter implements Duck {
    // field
    Turkey turkey;

    // constructor
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public String quack() {
        return turkey.gobble();
    }

    public String fly() {
        return turkey.fly();
    }
}
