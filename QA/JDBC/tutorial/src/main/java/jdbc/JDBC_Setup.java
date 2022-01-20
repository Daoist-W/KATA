package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Setup {

    // variables to connect to our database
    // a driver is a piece of software to aid communication
    // from one node to another
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    //
    final String db_url = "jdbc:mysql://localhost:3306/babyamazon";

    // Adding our Database credentials
    final String user = "Don";
    final String password = "";

    // creating a connection object and setting it to null
    Connection conn = null;

    // return a connection object
    public Connection connect() {
        System.out.println("Attempting to connect to database...");
        // we are attempting to connect to something outside of Java JDK
        try {
            // What class.forname does is basically check that a java class
            // exists at that location, that it is a valid class
            // as the sql needs it
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(db_url, user, password);
            System.out.println("Database connected!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed, please check why");
            e.printStackTrace();
        }

        return conn;
    }

    // This is a method to read data from JDCB and use data to create an object
    // results set is what jdbc returns from the database
    public Customers returnResults(ResultSet resultSet) {
        try {
            //Create a new variable
            // Equal to the set of the results, and find the value with field id
            // that is an int
            int customer_id = resultSet.getInt("customer_id");
            String customer_name = resultSet.getString("customer_name");
            String customer_email = resultSet.getString("customer_email");
            String customer_phone = resultSet.getString("customer_phone");

            // create our pizza object
            return new Customers(customer_id, customer_name, customer_email, customer_phone);

        } catch (SQLException e) {
            System.out.println("Something went wrong with getting results");
            e.printStackTrace();
        }
        return null;
    }

}
