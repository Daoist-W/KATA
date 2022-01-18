
public class Runner {
	public static void main(String[] args) {
		
	}


	public void builder() {
		Product product = new ProductBuilder()
			.addAttrb1("blah")
			.addAttrb2("blah")
			.addAttrb3("blah")
			.addAttrb4("blah")
			.buildProduct();
	}
}