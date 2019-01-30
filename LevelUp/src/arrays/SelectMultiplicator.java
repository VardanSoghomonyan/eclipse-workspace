package arrays;

public class SelectMultiplicator {
	static int size = 50, multiplicator = 3, divisible = 9;

	public static void main(String[] args) {
		createArray();
	}

	public static void createArray() {
		int[] arrayA = new int[size];
		int a = 30;
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = a;
			a += multiplicator;
			if (arrayA[i] % divisible == 0) {
				System.out.println(arrayA[i]);
			}
		}
	}
}
