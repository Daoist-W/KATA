package documents;

import java.util.Formatter;

public class Journal extends Document {
    // fields
    boolean peerReviewed;
    int journalRef;

    public Journal(String title, String author) {
        super(title, author);
    }

    public String print() {
        StringBuilder output = new StringBuilder();
        // formatting string for readability
        Formatter formatter = new Formatter(output);
        formatter.format("Peer reviewed:|%s \n" +
                        "Journal ref:  |%s \n",
                peerReviewed, journalRef
        );
        return super.toString() + output;
    }
}
