package arrays;

import java.util.Random;

public class classwork {
	public static void main(String[] args) {
		System.out.println("Maximum is " + maximum());
	}

	public static int maximum() {
		int[] array = new int[10];
		int max = 0;
		Random randGen = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = randGen.nextInt(50 + 1 + 50) - 100;
			System.out.println(array[i]);
			if (array[i] > max || i==0) {
				max = array[i];
			}
		}
		return max;
	}
}