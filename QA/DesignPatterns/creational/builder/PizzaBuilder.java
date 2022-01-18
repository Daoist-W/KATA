public class PizzaBuilder {

    // Are gonna be fields that are passed in, as well as default values if wanted
    private String cheese = "";
    private String crust = "";
    private int size;
    private String sauce = "";

    // Creating pizza objects
    public PizzaBuilder() {
    }

    // returning our filly made pizza, will be called last
    public Pizza buildPizza() {
        return new Pizza(cheese, crust, size, sauce);
    }

    public PizzaBuilder cheese(String passedCheese) {
        this.cheese = passedCheese;
        return this;
    }

    public PizzaBuilder size(int passedSize) {
        this.size = passedSize;
        return this;
    }
}
