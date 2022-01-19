import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TxtFileTool {
    /*
     *
     * The purpose of this class is to host methods
     * that allows us to parse data or scripts written
     * in txt files
     *
     */
    // fields
    private String path = "./src/main/resources/entries.txt";

    // constructor
    public TxtFileTool() {
    }

    public TxtFileTool(String path) {
        this.path = path;
    }

    // getter and setter
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    // methods for facade implementation of <TableManager>,<Table> text file parsing
    // I need to employ the factory method here to make this more flexible
    // the aim is to make a generic tool that I can use for any manager, and any table
    public <K> void readValuesFromTxt(CustomerManager manager, Customers customer) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.path))) {
            String[] sList;
            String s = bufferedReader.readLine();
            while (s != null) {
                sList = s.split(",");
                System.out.println(Arrays.toString(sList));
                customer = new Customers(sList);
                manager.addCustomer(customer);
                s = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("OOPS, something went wongggg");
            e.printStackTrace();
        }
    }
}
