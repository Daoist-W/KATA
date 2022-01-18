import documents.Document;
import enums.Status;

public class LibrarianImpl implements Librarian {
    // fields
    Library library;

    // constructor
    public LibrarianImpl(Library library) {
        this.library = library;
    }

    // methods
    public Document checkIn(Customer customer, String docId) {
        Document d = library.getDoc(docId);
        String cId = customer.getCustId();

        if (library.getDatabase().containsKey(cId)) {
            d.setStatus(Status.CHECKED_IN);
            library.modifyAcc(cId, docId, d.getStatus());
            return d;
        } else {
            System.out.println("invalid customer id");
            return null;
        }
    }

    public Document checkOut(Customer customer, String docId) {
        Document d = library.getDoc(docId);
        String cId = customer.getCustId();

        if (library.getDatabase().containsKey(cId)) {
            d.setStatus(Status.CHECKED_OUT);
            library.modifyAcc(cId, docId, d.getStatus());
            return d;
        } else {
            System.out.println("invalid customer id");
            return null;
        }
    }

    public void addDocs(Document... documents) {
        library.putDocs(documents);
    }

    public void removeDocs(Document... documents) {
        library.removeDocs(documents);
    }

    public void updateDoc(String docId, String field, String newInput) {
        library.setDoc(docId, field, newInput);
    }

    public void register(Customer... customers) {

        for (Customer customer : customers) {
            // the line below creates multiple accounts and returns their ID's in order
            // to populate the custId stored in Customer object
            String custId = library.addAccount(customer.getName());
            customer.setCustId(custId);
            // we then use this to populate the Customer field and maintain separation
        }
    }

    public void unregister(Customer... customers) {
        for (Customer customer : customers) {
            library.removeAccounts(customer.getCustId());
        }
    }

    public void updateCustomer(String custId, String newName, boolean shouldClear) {
        if (shouldClear) {
            library.clearAccount(custId);
        }
        library.modifyAcc(custId, newName);
    }
}
