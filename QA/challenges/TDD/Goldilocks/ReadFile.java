import java.io.*;
import java.util.ArrayList;

public class ReadFile {

    /*
     * Constructs a 2 dimensional list from a text file containing the
     * parameters of a Goldilocks object as well as parameters for the
     * chair, porridge and light objects
     */

    public static ArrayList<ArrayList<Integer>> getInputs(String path) throws IOException {

        // Local variable set up
        FileReader fileReader = null;
        ArrayList<ArrayList<Integer>> listInputs = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));) {
            // try-with-resource to ensure file closed regardless of outcome
            // here we are trying to open and read the file line by line
            // processing the string input into Integer form and storing the results 
            // into a 2 dimensional array
            String s;
            String[] line;
            ArrayList<Integer> numbers;
            while ((s = bufferedReader.readLine()) != null) {
                line = s.split("\\s");
                numbers = new ArrayList<>();
                for (String number : line) {
                    numbers.add(Integer.parseInt(number));
                }
                listInputs.add(numbers);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return listInputs;
    }
}
