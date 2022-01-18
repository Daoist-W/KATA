package test.java;

public class Runner {
    public static void main(String[] args) {
    Pizza pizza1 = new Pizza("Pepperoni");
    Pizza pizza2 = new Pizza("Hawaiian");
    Pizza pizza3 = new Pizza("Vegan");

    PizzaCookerOven pizzaCookerOven = new PizzaCookerOven();

    printAll(
            pizzaCookerOven.cookPizza(pizza1),
            pizzaCookerOven.cookPizza(pizza2),
            pizzaCookerOven.cookPizza(pizza3)
    );

    }

    public static void printAll(String... strings) {
        for(String item : strings) {
            System.out.println(item);
        }
    }

}
