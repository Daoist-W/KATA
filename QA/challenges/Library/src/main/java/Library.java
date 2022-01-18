import documents.Document;
import enums.Status;

import java.util.HashMap;

public class Library implements Librarian {
    /*
     * This class functions only to store documents.Documents and Customer
     * information
     * */
    // fields
    HashMap<String, Document> store = new HashMap<>();
    HashMap<String, Account> database = new HashMap<>();

    // Core methods
    public HashMap<String, Document> getStore() {
        return store;
    }

    public void putDocs(Document... documents) {
        for (Document doc : documents) {
            store.put(doc.getDocId(), doc);
        }
    }

    public String addAccount(String name) {
        Account a = new Account(name);
        database.put(a.getCustId(), a);
        return a.getCustId();
    }

    public void removeAccounts(String... custIds) {
        for (String custId : custIds) {
            database.remove(custId);
        }
    }

    public Document getDoc(String docId) {
        if (this.store.containsKey(docId)) {
            return store.get(docId);
        } else {
            System.out.println("Document does not exist in database");
        }
        return null;
    }

    public void setDoc(String docId, String field, String newInput) {
        if (field.equals("title")) {
            store.get(docId).setTitle(newInput);
        } else if (field.equals("author")) {
            store.get(docId).setAuthor(newInput);
        } else {
            System.out.println("invalid field");
        }
    }

    public Account getAcc(String custId) {
        if (this.database.containsKey(custId)) {
            return database.get(custId);
        } else {
            System.out.println("Customer does not exist in database");
        }
        return null;
    }

    public void modifyAcc(String custId, String docId, Status status) {
        if (this.database.containsKey(custId)) {
            database.get(custId).addHistory(docId, status);
        } else {
            System.out.println("Customer does not exist in database");
        }
    }

    public void modifyAcc(String custId, String name) {
        if (this.database.containsKey(custId)) {
            database.get(custId).setCustomerName(name);
        } else {
            System.out.println("Customer does not exist in database");
        }
    }

    public void clearAccount(String custId) {
        if (this.database.containsKey(custId)) {
            database.get(custId).clearHistory();
        } else {
            System.out.println("Customer does not exist in database");
        }
    }

    public HashMap<String, Account> getDatabase() {
        return database;
    }

    public String printStore() {
        String pages = "";
        for (String item : store.keySet()) {
            pages += item + "->" + store.get(item).toString();
        }
        return pages;
    }

    public String printAccount() {
        String pages = "";
        for (String item : database.keySet()) {
            pages += item + "->" + database.get(item).toString();
        }
        return pages;
    }

    // #########################################################
    //                  implementation methods
    // #########################################################

    @Override
    public Document checkIn(Customer customer, String docId) {
        Document d = this.getDoc(docId);
        String cId = customer.getCustId();

        if (this.getDatabase().containsKey(cId)) {
            d.setStatus(Status.CHECKED_IN);
            this.modifyAcc(cId, docId, d.getStatus());
            return d;
        } else {
            System.out.println("invalid customer id");
            return null;
        }
    }

    @Override
    public Document checkOut(Customer customer, String docId) {
        Document d = this.getDoc(docId);
        String cId = customer.getCustId();

        if (this.getDatabase().containsKey(cId)) {
            d.setStatus(Status.CHECKED_OUT);
            this.modifyAcc(cId, docId, d.getStatus());
            return d;
        } else {
            System.out.println("invalid customer id");
            return null;
        }
    }

    @Override
    public void addDocs(Document... documents) {
        this.putDocs(documents);
    }

    @Override
    public void removeDocs(Document... documents) {
        for (Document doc : documents) {
            store.remove(doc.getDocId());
        }
    }

    @Override
    public void updateDoc(String docId, String field, String newInput) {
        this.setDoc(docId, field, newInput);
    }

    @Override
    public void register(Customer... customers) {
        for (Customer customer : customers) {
            // the line below creates multiple accounts and returns their ID's in order
            // to populate the custId stored in Customer object
            String custId = this.addAccount(customer.getName());
            customer.setCustId(custId);
            // we then use this to populate the Customer field and maintain separation
        }
    }

    @Override
    public void unregister(Customer... customers) {
        for (Customer customer : customers) {
            this.removeAccounts(customer.getCustId());
        }
    }

    @Override
    public void updateCustomer(String custId, String newName, boolean shouldClear) {
        if (shouldClear) {
            this.clearAccount(custId);
        }
        this.modifyAcc(custId, newName);
    }

}
