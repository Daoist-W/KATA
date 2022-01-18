public class RussianStrategy implements FarewellStrategy, GreetingsStrategy {
    @Override
    public void sayFarewell(String name) {
        System.out.printf("до свидания! %s \n", name);
    }

    @Override
    public void sayGreeting(String name) {
        System.out.printf("Привет! %s \n", name);
    }
}
