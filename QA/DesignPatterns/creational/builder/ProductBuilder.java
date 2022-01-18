public class ProductBuilder {
    // field
    private String attrb1 = "";
    private String attrb2 = "";
    private String attrb3 = "";
    private String attrb4 = "";

    public ProductBuilder() {
    }

    public Product buildProduct() {
        return new Product(attrb1, attrb2, attrb3, attrb4);
    }

    public ProductBuilder addAttrb1(String newAttrb) {
        this.attrb1 = newAttrb;
        return this;
    }

    public ProductBuilder addAttrb2(String newAttrb) {
        this.attrb2 = newAttrb;
        return this;
    }

    public ProductBuilder addAttrb3(String newAttrb) {
        this.attrb3 = newAttrb;
        return this;
    }

    public ProductBuilder addAttrb4(String newAttrb) {
        this.attrb4 = newAttrb;
        return this;
    }

}
