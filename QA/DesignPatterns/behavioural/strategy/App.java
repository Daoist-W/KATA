public class App {
    public static void main(String[] args) {
        strategy1();

        strategy2();
    }

    public static void strategy1() {
        Connector connector = new Connector();
        connector.setConnection(new AuxStrategy());
        connector.connectToPhone("Don's Phone");
        connector.setConnection(new HdmiStrategy());
        connector.connectToPhone("Don's Phone");
        connector.setConnection(new BluetoothStrategy());
        connector.connectToPhone("Don's Phone");
    }

    public static void strategy2() {
        FarewellTranslator farewellTranslator = new FarewellTranslator();
        GreetingsTranslator greetingsTranslator = new GreetingsTranslator();

        farewellTranslator.setfStrategy(new EnglishStrategy());
        farewellTranslator.sayFarewell("Don");
        farewellTranslator.setfStrategy(new JapaneseStrategy());
        farewellTranslator.sayFarewell("Don");
        farewellTranslator.setfStrategy(new RussianStrategy());
        farewellTranslator.sayFarewell("Don");

        greetingsTranslator.setgStrategy(new EnglishStrategy());
        greetingsTranslator.greet("Bob");
        greetingsTranslator.setgStrategy(new JapaneseStrategy());
        greetingsTranslator.greet("Bob");
        greetingsTranslator.setgStrategy(new RussianStrategy());
        greetingsTranslator.greet("Bob");
    }


}
