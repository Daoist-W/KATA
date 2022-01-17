import documents.Book;
import documents.Journal;
import documents.Map;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        LibrarianImpl librarian = new LibrarianImpl(library);

        Customer customer1 = new Customer("Don");
        librarian.register(customer1);

        Book book1 = new Book("book", "book");
        Map map = new Map("map", "map");
        Journal journal = new Journal("map", "map");

        librarian.addDocs(book1, map, journal);
        librarian.updateDoc(book1.getDocId(), "title", "Bellend");

        customer1.requestDoc(librarian, book1);
        customer1.requestDoc(librarian, map);
        customer1.requestDoc(librarian, journal);
        customer1.returnDoc(librarian, book1);

        String s = library.getAcc(customer1.getCustId()).toString();

        System.out.println(s);
        System.out.println(library.getDoc(book1.getDocId()).print());

    }

}
