public class Connector {
    // fields
    ConnectionStrategy connection;

    // constructors
    public Connector() {
    }

    public Connector(ConnectionStrategy connection) {
        this.connection = connection;
    }

    // setter
    public void setConnection(ConnectionStrategy connection) {
        this.connection = connection;
    }

    // Strategy pattern method
    public void connectToPhone(String phone) {
        this.connection.connect(phone);
    }

}
