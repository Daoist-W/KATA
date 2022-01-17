import documents.Document;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    /*
     * The customer is representation of a person
     * They can exchange instances of books with the library
     * through the librarian
     * all interaction with the library is done through the
     * the librarian
     */

    // fields
    private String name;
    private String custId;
    private ArrayList<Document> bag = new ArrayList<>();

    // constructor
    public Customer(String name) {
        this.name = name;
    }

    // methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public ArrayList<Document> getBag() {
        return bag;
    }

    private void addDoc(Document... documents) {
        this.bag.addAll(Arrays.asList(documents));
    }

    private void removeDoc(Document... documents) {
        this.bag.removeAll(Arrays.asList(documents));
    }

    public void requestDoc(LibrarianImpl librarian, Document document) {
        this.addDoc(librarian.checkOut(this, document.getDocId()));
    }

    public void returnDoc(LibrarianImpl librarian, Document document) {
        this.removeDoc(librarian.checkIn(this, document.getDocId()));
    }


}
