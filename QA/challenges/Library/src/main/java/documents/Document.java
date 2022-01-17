package documents;

import enums.Status;

import java.util.Date;
import java.util.Formatter;

public abstract class Document {
    /*
     * This class is the formal category for all objects stored
     * inside the library. it sets out the common attributes
     * between all stored objects and some common methods
     * it also sets out abstract methods that need to have
     * unique implementations for each sub class
     */

    // fields
    private static int generateId = 100000;
    private String docId;
    private String title;
    private String author;
    private Date dueDate;
    private Status status;

    // constructor
    public Document(String title, String author) {
        this.title = title;
        this.author = author;
        setDocId("D" + generateId);
        generateId++;
    }

    // methods

    public String getDocId() {
        return docId;
    }

    private void setDocId(String docId) {
        this.docId = docId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract String print();

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        // formatting string for readability
        Formatter formatter = new Formatter(output);
        formatter.format(" \n" +
                        " Document id: %s \n" +
                        "       Title: %s \n" +
                        "      Author: %s \n" +
                        "      Status: %s \n" +
                        "    Due Date: %s \n",
                docId, title, author, status, dueDate
        );

        return output.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return getTitle().equals(document.getTitle()) && getAuthor().equals(document.getAuthor());
    }

}
