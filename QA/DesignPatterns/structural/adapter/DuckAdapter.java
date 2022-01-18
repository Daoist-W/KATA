public class DuckAdapter implements Turkey {
    // fields
    Duck duck;

    // Constructor
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public String gobble() {
        return duck.quack();
    }

    public String fly() {
        return duck.fly();
    }
}
