public class Customers {
    // fields
    private int customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_phone;

    // constructors, we need a constructor for posting without ID
    public Customers() {
    }

    public Customers(Object[] args) {
        try {
            this.customer_name = (String) args[0];
            this.customer_email = (String) args[1];
            this.customer_phone = (String) args[2];
        } catch (ClassCastException e) {
            System.out.println("Arguments are of incorrect type: " +
                    "Expecting (String a, String b, String c) please check");
        }

    }

    public Customers(String customer_name, String customer_email, String customer_phone) {
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
    }

    // constructor for reading with ID
    public Customers(int customer_id, String customer_name, String customer_email, String customer_phone) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String toString() {
        return "Customer{ \n" +
                "customer_id=" + customer_id +
                ",\n customer_name='" + customer_name + '\'' +
                ",\n customer_email='" + customer_email + '\'' +
                ",\n customer_phone='" + customer_phone + '\'' +
                "\n}";
    }
}
