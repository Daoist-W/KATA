package documents;

import java.util.Formatter;

public class Book extends Document {
    boolean isHardBack;
    int bookRef;

    public Book(String title, String author) {
        super(title, author);
    }

    public String print() {
        StringBuilder output = new StringBuilder();
        // formatting string for readability
        Formatter formatter = new Formatter(output);
        formatter.format("   Hardback?: %s \n" +
                        "    Book ref: %s \n",
                isHardBack, bookRef
        );
        return super.toString() + output;
    }
}
