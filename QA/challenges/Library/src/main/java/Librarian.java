import documents.Document;

public interface Librarian {

    // methods
    Document checkIn(Customer customer, String docId);

    Document checkOut(Customer customer, String docId);

    void addDocs(Document... documents);

    void removeDocs(Document... documents);

    void updateDoc(String docId, String field, String newInput);

    void register(Customer... customers);

    void unregister(Customer... customers);

    void updateCustomer(String custId, String newName, boolean shouldClear);

}
