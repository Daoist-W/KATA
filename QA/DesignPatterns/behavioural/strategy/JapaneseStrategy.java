public class JapaneseStrategy implements FarewellStrategy, GreetingsStrategy {
    @Override
    public void sayFarewell(String name) {
        System.out.printf("さようなら! %s san! \n", name);
    }

    @Override
    public void sayGreeting(String name) {
        System.out.printf("こんにちは! %s san! \n", name);
    }
}
