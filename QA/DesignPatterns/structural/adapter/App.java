public class App {
    public static void main(String[] args) {
        DuckTurkey();
    }

    public static void DuckTurkey() {
        Mallard mallard = new Mallard();
        WildTurkey wildTurkey = new WildTurkey();

        DuckAdapter duckAdapter = new DuckAdapter(mallard);
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        // running normally test
        System.out.printf("Mallard says: %s \n" +
                        "Turkey(Duck) says: %s \n" +
                        "Wild Turkay says: %s \n" +
                        "Mallard(Turkey) says: %s \n",
                mallard.quack(),
                turkeyAdapter.quack(),
                wildTurkey.gobble(),
                duckAdapter.gobble());

    }

}
