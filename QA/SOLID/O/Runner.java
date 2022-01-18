package test.java;

public class Runner {
    public static void main(String[] args) {
        Greeting greeting1 = new CasualGreeting("Hello");
        Greeting greeting2 = new CasualGreeting("Hey");
        Greeting greeting3 = new CasualGreeting("Hiiiii");

        // Greeting interface fulfills the needs of Greeter
        Greeter greeter1 = new Greeter(greeting1);
        Greeter greeter2 = new Greeter(greeting2);
        Greeter greeter3 = new Greeter(greeting3);

        Runner.printAll(
                greeter1.greet(),
                greeter2.greet(),
                greeter3.greet()
        );

    }

    public static void printAll(String... strings) {
        for(String item : strings) {
            System.out.println(item);
        }
    }

}
