package arrays;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrintBiggerNumber {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(compareNumbers(createArray(), inputedNumber())));
		System.out.println(averageOfArray(createArray()));
	}

	public static int[] createArray() {
		int[] created = new int[10];
		Random randGen = new Random();
		for (int i = 0; i <= 9; i++) {
			created[i] = randGen.nextInt(100 + 1 + 100) - 100;
		}
		System.out.println("The initial array of numbers is " + Arrays.toString(created));
		return created;
	}

	public static int inputedNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to compare with an array.");
		int x = scan.nextInt();
		scan.close();
		return x;
	}

	public static int[] compareNumbers(int[] a, int b) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int i : a) {
			if (i > b) {
				c.add(i);
			}
		}
		int[] d = c.stream().mapToInt(i -> i).toArray();
		return d;
	}

	public static double averageOfArray(int[] array) {
		double sum = 0;
		for (int element : array) {
			sum += element;
		}
		double average = sum / array.length;
		return average;
	}
}