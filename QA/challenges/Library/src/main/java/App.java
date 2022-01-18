import documents.Book;
import documents.Journal;
import documents.Map;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Customer customer1 = new Customer("Don");
        library.register(customer1);

        Book book1 = new Book("book", "book");
        Map map = new Map("map", "map");
        Journal journal = new Journal("map", "map");

        library.addDocs(book1, map, journal);
        library.updateDoc(book1.getDocId(), "title", "Bellend");

        customer1.requestDoc(library, book1);
        customer1.requestDoc(library, map);
        customer1.requestDoc(library, journal);
        customer1.returnDoc(library, book1);

        String s = library.getAcc(customer1.getCustId()).toString();

        System.out.println(s);
        System.out.println(library.getDoc(book1.getDocId()).print());

    }

}
