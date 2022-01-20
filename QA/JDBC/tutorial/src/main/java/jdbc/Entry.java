package jdbc;

// this interface provides a template for Table entry objects
public interface Entry {
    @Override
    String toString();

    Entry newInstance(String[] sList);

    public int getAttr1();

    public String getAttr2();

    public String getAttr3();

    public String getAttr4();

}
