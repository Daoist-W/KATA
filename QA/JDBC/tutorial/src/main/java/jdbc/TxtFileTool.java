package jdbc;

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


    // this method parses a text file and transmits the data as a list
    // to an Entry Class, which uses that information to instantiate
    public void readValuesFromTxt(Manager manager, Entry entry) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.path))) {
            String[] sList;
            String s = bufferedReader.readLine();
            while (s != null) {
                sList = s.split(",");
                System.out.println(Arrays.toString(sList));
                entry = entry.newInstance(sList);
                manager.addEntry(entry);
                s = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("OOPS, something went wongggg");
            e.printStackTrace();
        }
    }


}
