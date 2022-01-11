import java.util.ArrayList;

public class Register {
    // fields
    ArrayList<Person> register = new ArrayList<>(100);

    // methods
    public void addPerson(Person person) {
        this.register.add(person);
    }

    public void removePerson(Person person) {
        this.register.remove(person);
    }

    public void findPerson(String name) {
        boolean noResultsFound = true;
        System.out.println("Search results for (" + name + "): ");
        for (Person person : register) {
            if (person.getName().toLowerCase().contains(name.toLowerCase())) {
                noResultsFound = false;
                System.out.println("- " + person.getName());
            }
        }
        if (noResultsFound == true) {
            System.out.println("No results found");
        }
    }

    public void printRegister() {
        for (Person person : register) {
            System.out.println(person);
        }
    }

}