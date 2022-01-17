import enums.Status;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;

public class Account {
    /*
     * This class stores customer accounts
     * it holds their name, a HashMap of their client history
     * and a variable storing the last time the account was updated
     */

    // fields
    private static int generateCustomerId = 100000;
    private final String custId;
    private String customerName;
    private HashMap<String, Status> history = new HashMap<String, Status>();
    private String lastUpdate;

    // constructor
    public Account(String customerName) {
        this.customerName = customerName;
        this.custId = "C" + generateCustomerId;
        generateCustomerId++;
        setLastUpdate();
    }

    public String getCustId() {
        return custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        setLastUpdate();
    }

    public HashMap<String, Status> getHistory() {
        return history;
    }

    public void addHistory(String docId, Status status) {
        history.put(docId, status);
        setLastUpdate();
    }

    public void clearHistory() {
        history.clear();
        setLastUpdate();
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate() {
        lastUpdate = new SimpleDateFormat("yyyy.MM.dd|HH:mm:ss").format(new Date());
    }

    @Override
    public String toString() {
        // generating a readable String for Account history ArrayList
        StringBuilder output = new StringBuilder();
        StringBuilder parseHistory = new StringBuilder();
        for (String id : this.history.keySet()) {
            String value = this.history.get(id).toString();
            parseHistory.append(id).append(" : ").append(value).append("\n");
        }

        // formatting string for readability
        Formatter formatter = new Formatter(output);
        formatter.format("\n" +
                        "Customer id  : %s \n" +
                        "Customer Name: %s \n" +
                        "History: \n" +
                        " Doc ID | Status \n%s" +
                        "Last Update: %s ",
                custId, customerName, parseHistory, lastUpdate
        );

        return output.toString();
    }
}
