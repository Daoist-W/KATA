public class App {
    public static void main(String[] args) {

        builder();

    }

    public static void builder() {
        Pizza pepperoni = new PizzaBuilder()
                .size(12)
                .buildPizza();

        Product product = new ProductBuilder()
                .addAttrb1("hola")
                .addAttrb3("como")
                .buildProduct();


        BankAccount bankAccount = new BankAccBuilder()
                .setAccNum(100L)
                .setBalance(13554654.5)
                .setBranch("London")
                .setInterestRate(0.0)
                .setOwner("Homo Deus")
                .buildAccount();
    }


}
