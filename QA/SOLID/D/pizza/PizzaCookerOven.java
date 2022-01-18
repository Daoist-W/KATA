package test.java;

public class PizzaCookerOven implements PizzaCooker {

    @Override
    public String cookPizza(Pizza chosenPizza) {
        return chosenPizza.getType() + " Pizza is being cooked!";
    }
}
