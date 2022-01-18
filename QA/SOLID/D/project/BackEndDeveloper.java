package test.java;

public class BackEndDeveloper implements Developer{
    // field
    private String position;

    public BackEndDeveloper(String position) {
        this.position = position;
    }

    public String develop() {
        return position + ": " + "C# is just Microsoft Java anyway.";
    }
}
