public class Runner {

    public static void main(String[] args) {
        String path = "./src/main/resources/entries.txt";
        CustomerManager manager = new CustomerManager();
        Customers customer = new Customers();

//        TxtFileTool txtFileTool = new TxtFileTool(path);
//        txtFileTool.readValuesFromTxt(manager, customer);
//
//        System.out.println(manager.viewCustomer(9));

//        manager.deleteCustomer(7, "customer_id");

        // this will print all objects returned
        for (Customers customers : manager.viewAll()) {
            System.out.println(customers);
        }
    }
}
