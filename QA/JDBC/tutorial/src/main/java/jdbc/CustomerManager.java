package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Formatter;

// This class will be responsible for handling all of our queries/updates to a database
public class CustomerManager implements Manager {

    // Statement class is imported from JDBC - an object for our MySQL queries
    static Statement stmt;
    static Connection conn;
    JDBC_Setup jdbc = new JDBC_Setup();

    // #################################
    // interface implementations methods
    // #################################

    // Create
    @Override
    public void addEntry(Entry entry) {
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
                    entry.getAttr2(),
                    entry.getAttr3(),
                    entry.getAttr4()
            );

            String query = sb.toString();

            // using our statement object, we need to run the query
            // this is for when youre sending, not recieving
            stmt.executeUpdate(query);

            // notification upon success
            System.out.printf("%s added successfully! \n", entry.getAttr2());
        } catch (SQLException e) {
            System.out.println("OOPS! Something went wrong...");
            e.printStackTrace();
        }
    }


    // Delete
    @Override
    public void deleteEntry(int entry_id, String col_name) {
        try {
            conn = jdbc.connect();

            // prepared statements use SQL ? syntax
            // ? relates to a variable we can pass in
            PreparedStatement preStmnt = conn.prepareStatement("DELETE FROM Customers where " + col_name + " = ?");
            // here we are saying find the first ? set its value to be the <customer_id>
            preStmnt.setInt(1, entry_id);

            // execute the statement
            preStmnt.executeUpdate();
            System.out.println(preStmnt + " successful");
        } catch (Exception e) {
            System.out.println("Something went wrong with deleteCustomer");
            e.printStackTrace();
        }
    }


    // Read
    @Override
    public Entry viewEntry(int entry_id) {
        try {
            conn = jdbc.connect();
            stmt = conn.createStatement();
            String query = String.format("SELECT * FROM Customers WHERE customer_id = %d", entry_id);
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

    @Override
    public ArrayList<Entry> viewAll() {
        try {
            conn = jdbc.connect();
            stmt = conn.createStatement();
            ArrayList<Entry> customers = new ArrayList<>();
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

    @Override
    public ArrayList<Entry> viewAllWhere(String condition) {
        try {
            conn = jdbc.connect();
            stmt = conn.createStatement();
            ArrayList<Entry> customers = new ArrayList<>();
            String query = "SELECT * FROM Customers WHERE " + condition;
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
            System.out.println("Something went wrong with viewAllWhere");
            e.printStackTrace();
        }
        return null;
    }


    // Update
    @Override
    public ArrayList<Entry> updateWhere(Entry entry, String condition, String value) {
        try {
            conn = jdbc.connect();
            String update = String.format("UPDATE Customers SET " +
                    "customer_name = ?," +
                    "customer_email = ?," +
                    "customer_phone = ?" +
                    "WHERE %s = ?;", condition);
            PreparedStatement prepStmt = conn.prepareStatement(update);
            prepStmt.setString(1, entry.getAttr2());
            prepStmt.setString(2, entry.getAttr3());
            prepStmt.setString(3, entry.getAttr3());
            prepStmt.setString(4, value);

            prepStmt.executeUpdate();
            System.out.printf("Update of entry matching %s successful", value);
            return viewAllWhere(String.format("%s = %s", condition, value));

        } catch (SQLException e) {
            System.out.println("something went wrong with updating entry");
            e.printStackTrace();
        }
        return null;
    }

}
