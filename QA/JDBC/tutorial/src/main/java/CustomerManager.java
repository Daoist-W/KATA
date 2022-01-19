import java.sql.*;
import java.util.ArrayList;
import java.util.Formatter;

public class CustomerManager {
    /*
     * This class will be responsible for handling all of our queries
     *
     */
    // Statement is imported from JDBC - an object for our MySQL queries
    // -> "SELECT * FROM Customer"
    static Statement stmt;

    static Connection conn;

    // create an object of our JDBC_Setup
    JDBC_Setup jdbc = new JDBC_Setup();

    // use this to connect and start to make some queries
    // method to post data to our MySQL DB
    public void addCustomer(Customers customers) {
        try {
            // try and connect
            conn = jdbc.connect();
            // create a new statement using the connection object
            stmt = conn.createStatement();

            // create a query to put into out statement
            // eventually we will be passing in our values with variables etc.
            StringBuilder sb = new StringBuilder();
            Formatter sbFormatter = new Formatter(sb);

            sbFormatter.format(
                    "INSERT INTO Customers (customer_name, " +
                            "customer_email, customer_phone)\n" +
                            "VALUES " +
                            "(\"%s\",\"%s\",\"%s\")",
                    customers.getCustomer_name(),
                    customers.getCustomer_email(),
                    customers.getCustomer_phone()
            );

            String query = sb.toString();

            // using our statement object, we need to run the query
            // this is for when youre sending, not recieving
            stmt.executeUpdate(query);

            // notification upon success
            System.out.printf("%s added successfully! \n", customers.getCustomer_name());
        } catch (SQLException e) {
            System.out.println("OOPS! Something went wrong...");
            e.printStackTrace();
        }
    }

    // Creating a view all query to send to the database
    // Implementing a way to read the data JDBC sends us

    public Customers viewCustomer(int customer_id) {
        try {
            conn = jdbc.connect();
            stmt = conn.createStatement();
            String query = String.format("SELECT * FROM Customers WHERE customer_id = %d", customer_id);
            ResultSet result = stmt.executeQuery(query);
            // our result is a spreadsheet from the database, the first row being meta data
            // go down to the next row of data (our useful data)
            result.next();
            // pass in the useful data to our returnResults method, return this
            return jdbc.returnResults(result);
        } catch (Exception e) {
            System.out.println("something went wrong with viewCustomer");
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Customers> viewAll() {
        try {
            conn = jdbc.connect();
            stmt = conn.createStatement();
            ArrayList<Customers> customers = new ArrayList<>();
            String query = "SELECT * FROM Customers";
            ResultSet result = stmt.executeQuery(query);
            // our result is a spreadsheet from the database, the first row being meta data
            // go down to the next row of data (our useful data)
            while (result.next()) {
                customers.add(jdbc.returnResults(result));
            }
            System.out.println("results succesfully retrieved \n\n" +
                    "Printing results...\n\n");
            Thread.sleep(3000);
            // pass in the useful data to our returnResults method, return this
            return customers;
        } catch (SQLException | InterruptedException e) {
            System.out.println("Something went wrong with viewAll");
            e.printStackTrace();
        }
        return null;
    }

    // prepared statements
    // nicer ways of making longer queries
    public void deleteCustomer(int customer_id, String col_name) {
        try {
            conn = jdbc.connect();

            // prepared statements use SQL ? syntax
            // ? relates to a variable we can pass in
            PreparedStatement preStmnt = conn.prepareStatement("DELETE FROM Customers where " + col_name + " = ?");
            // here we are saying find the first ? set its value to be the <customer_id>
            preStmnt.setInt(1, customer_id);

            // execute the statement
            preStmnt.executeUpdate();
            System.out.println(preStmnt + " successful");
        } catch (Exception e) {
            System.out.println("Something went wrong with deleteCustomer");
            e.printStackTrace();
        }
    }

}
