
public class Arrays {

	public static int[] createArray(int num) {
		int[] array = new  int[num];

		for(int i = 0; i < num; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

		return array;
	}


	public static int[] multiplyArray(int[] array, int factor) {
		
		for(int index = 0; index < array.length; index++) {
			array[index] *= factor;
			System.out.println(array[index]);
		}

		return array;
	}

}