import documents.Book;
import documents.Journal;
import documents.Map;
import enums.Status;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestApp {
    @Test
    public void hasCheckOutIn() {
        Library library = new Library();
        
        Customer customer1 = new Customer("Don");
        library.register(customer1);

        Book book1 = new Book("book", "book");
        Map map = new Map("map", "map");
        Journal journal = new Journal("map", "map");

        library.addDocs(book1, map, journal);

        customer1.requestDoc(library, book1);
        customer1.requestDoc(library, map);
        customer1.requestDoc(library, journal);
        customer1.returnDoc(library, book1);

        String s2 = library.printStore();
        String s3 = library.printAccount();
        System.out.println(s2);
        System.out.println(s3);

        assertEquals(book1.getStatus(), Status.CHECKED_IN);
        assertEquals(map.getStatus(), Status.CHECKED_OUT);
    }

    @Test
    public void hasAddRemoveItem() {
        Library library = new Library();

        Customer customer1 = new Customer("Don");
        library.register(customer1);

        Book book1 = new Book("book", "book");
        Map map = new Map("map", "map");
        Journal journal = new Journal("map", "map");

        library.addDocs(book1, map, journal);

        library.removeDocs(map);

        assertNull(library.getDoc(map.getDocId()));

    }

    @Test
    public void hasRegisterDeleteCustomer() {
        Library library = new Library();

        Customer customer1 = new Customer("Don");
        Customer customer2 = new Customer("Jerry");
        Customer customer3 = new Customer("Tina");
        Customer customer4 = new Customer("Tina");
        library.register(customer1);
        library.register(customer2);
        library.register(customer3);
        library.register(customer4);

        library.unregister(customer2);

        String s2 = library.printStore();
        String s3 = library.printAccount();
        System.out.println(s2);
        System.out.println(s3);

        assertEquals(library.getDatabase().size(), 3);
    }
}
