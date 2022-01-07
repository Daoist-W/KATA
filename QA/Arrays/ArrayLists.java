
class ArrayLists {
	
	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<>();

		myArray.add("Hello1");
		myArray.add("Hello2");
		myArray.add("Hello3");
		myArray.add("Hello4");
		myArray.add("Hello5");
		myArray.add("Hello6");


		System.out.println(myArray);

		for(String element : myArray) {
			System.out.println(element);
		}


		myArray.get(0);

		myArray.set(3, "hola");

		myArray.remove(2);


		Collections.sort(myArray);

		Collections.reverse(myArray);

		Collections.swap(myArray, 1, 2);


		ArrayList<String> clonedArray = new ArrayList<>();

		clonedArray = (ArrayList<String>) myArray.clone();





	}	
}