package optionals;

import java.util.List;
import java.util.Optional;

public class OptionalRunner {

    // make a list of names for use with the code
    private List<String> listNames = List.of("Hally", "Morgan", "Reece");

    // method to filter through the names and return the chosen one
    private String filter(String query) {
        for (String name : listNames) {
            if (name.equals(query)) {
                return name;
            }
        }
        return "no name found";
    }

    private Optional<String> filterOptional(String query) {
        for (String name : listNames) {
            if (name.equals(query)) {
                return Optional.of(name);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        OptionalRunner runner = new OptionalRunner();

        // creare a new object called s, its equal to whatever is returned
        Optional<String> s = runner.filterOptional("Hally");
        System.out.println(s);
    }
}
