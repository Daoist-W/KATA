

public class Runner {
    public static void main(String[] args) {

        Person person1 = new Person("Don Blob", 30);
        Person person2 = new Person("Matt Blob", 20);
        Person person3 = new Person("Pool Blob", 40);

        // testing toString() works
        System.out.println(person1);

        //creating register adding people
        Register register = new Register();

        register.addPerson(person1);
        register.addPerson(person2);
        register.addPerson(person3);

        // finding people by name
        register.findPerson("Blob");


        // printing contents of register
        register.printRegister();

    }
}
