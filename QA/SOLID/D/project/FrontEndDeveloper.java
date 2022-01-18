package test.java;

public class FrontEndDeveloper implements Developer{
    // fields
    private String position;

    public FrontEndDeveloper(String position) {
        this.position = position;
    }

    public String develop() {
        return position + ": " + "JavaScript is used everywhere anyway.";
    }
}
