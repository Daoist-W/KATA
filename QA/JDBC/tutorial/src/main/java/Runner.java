import jdbc.CustomerManager;
import jdbc.Customers;
import jdbc.Entry;
import jdbc.TxtFileTool;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        String path = "./src/main/resources/entries.txt";
        CustomerManager manager = new CustomerManager();
        Customers customer = new Customers();

        TxtFileTool txtFileTool = new TxtFileTool(path);
        txtFileTool.readValuesFromTxt(manager, customer);
        System.out.println(manager.viewEntry(9));

        manager.deleteEntry(7, "customer_id");

        //this will print all objects returned
        for (Entry customers : manager.viewAll()) {
            System.out.println(customers);
        }

        Customers newCustomer = new Customers("Bob", "test", "test");
        ArrayList<Entry> s = manager.updateWhere(newCustomer, "customer_id", "6");
        printArray(s);
    }

    public static void printArray(ArrayList<Entry> array) {
        for (Entry element : array) {
            System.out.println(element);
        }
    }
}
