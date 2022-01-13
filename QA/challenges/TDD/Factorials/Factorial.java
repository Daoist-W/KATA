

public class Factorial {

	// methods 
	public static String findFactorial(int num) {
		for(int i = 1, sum = 0; sum <= num; i++) {
			if(sum == num) {
				return i + "!";
			}
		}
		return "NONE";
	}
}