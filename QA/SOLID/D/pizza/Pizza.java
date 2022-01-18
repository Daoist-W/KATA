package test.java;

public class Pizza {
    // fields
    private String type;

    public Pizza(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // class specific order
    public void cookPizza(PizzaCooker pizzaCooker) {
        pizzaCooker.cookPizza(this);
    }
}
