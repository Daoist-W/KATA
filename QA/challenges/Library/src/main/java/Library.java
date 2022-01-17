import documents.Document;
import enums.Status;

import java.util.HashMap;

public class Library {
    /*
     * This class functions only to store documents.Documents and Customer
     * information
     * */
    // fields
    HashMap<String, Document> store = new HashMap<>();
    HashMap<String, Account> database = new HashMap<>();

    // methods
    public HashMap<String, Document> getStore() {
        return store;
    }

    public void putDocs(Document... documents) {
        for (Document doc : documents) {
            store.put(doc.getDocId(), doc);
        }
    }

    public void removeDocs(Document... documents) {
        for (Document doc : documents) {
            store.remove(doc.getDocId());
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
}
