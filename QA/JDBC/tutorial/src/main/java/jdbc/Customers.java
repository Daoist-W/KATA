package jdbc;

public class Customers implements Entry {
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

    // #################################
    // interface implementations methods
    // #################################
    @Override
    public String toString() {
        return "Customer{ \n" +
                "customer_id=" + customer_id +
                ",\n customer_name='" + customer_name + '\'' +
                ",\n customer_email='" + customer_email + '\'' +
                ",\n customer_phone='" + customer_phone + '\'' +
                "\n}";
    }

    // interface methods
    @Override
    public Entry newInstance(String[] sList) {
        return new Customers(sList);
    }

    @Override
    public int getAttr1() {
        return this.customer_id;
    }

    @Override
    public String getAttr2() {
        return this.customer_name;
    }

    @Override
    public String getAttr3() {
        return this.customer_email;
    }

    @Override
    public String getAttr4() {
        return this.customer_phone;
    }
}
