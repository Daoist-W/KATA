public class EnglishStrategy implements FarewellStrategy, GreetingsStrategy {
    @Override
    public void sayFarewell(String name) {
        System.out.printf("Goodbye! %s \n", name);
    }

    @Override
    public void sayGreeting(String name) {
        System.out.printf("Goodmorrow! %s \n", name);
    }
}
