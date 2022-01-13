import java.util.ArrayList;

public class Doggo {

    public static ArrayList<String> placement(int placement) {
        String[] suffixes = {"st", "nd", "rd", "th"};
        ArrayList<String> results = new ArrayList<>();


        for (int i = 1; i <= 100; i++) {
            // loop to skip chosen placement
            if (i == placement) {
                continue;
            }

            // loop to add placements
            if (i % 10 == 1 && i != 11) {
                // add st
                results.add(i + suffixes[0]);
            } else if (i % 10 == 2 && i != 12) {
                // add nd
                results.add(i + suffixes[1]);
            } else if (i % 10 == 3 && i != 13) {
                // add rd
                results.add(i + suffixes[2]);
            } else {
                // add th
                results.add(i + suffixes[3]);
            }
        }

        return results;
    }
}
