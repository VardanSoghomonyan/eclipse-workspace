package arrays;

import java.util.Arrays;

public class ArrayMethods {
	static int[] array = { 10, 15, 36, 2, 34, 56, 15, 22, 45 };
	static int[] array1 = { 12, 45, 98, 7, 2, 77, 45 };
	static int number = 17;

	public static void main(String[] args) {
		// System.out.println("The result is " + isDigitExists(array, number) + ".");
		// System.out.println(digitIndex(array, number));
		// System.out.println(Arrays.toString(revertArray(array)));
		// repeatedItems(array, array1);
		// dublicateItems(array);
		// printSquarePicks();
		// printLeftTriangle();
		// printTriangle();
		// printTriangle1();
		// printEquilateralTriangle();
		// printRevertEquilateralTriangle();
		printRhombus();

	}

	public static boolean isDigitExists(int[] a, int b) {
		for (int element : a) {
			if (element == b) {
				return true;
			}
		}
		return false;
	}

	public static int digitIndex(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return i;
			}
		}
		return -1; // for any case, if number doesn't exist in the array
	}

	// public static int[] revertArray(int[] a) { //version 1
	// int[] newArray = new int[a.length];
	// for (int i = 0; i < a.length; i++) {
	// newArray[a.length - i - 1] = a[i];
	// }
	// return newArray;
	// }
	// public static int[] revertArray(int[] a) { // version 2
	// for (int i = 0; i < a.length / 2; i++) {
	// int k = a[i];
	// a[i] = a[a.length - i - 1];
	// a[a.length - i - 1] = k;
	// }
	// return a;
	// }
	public static int[] revertArray(int[] a) { // version 3
		int[] newArray = new int[a.length];
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			newArray[j] = a[i];
		}
		return newArray;
	}

	public static void dublicateItems(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void repeatedItems(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void printSquarePicks() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				// if ((i == 0 && j == 0) || (i == 0 && j == a) || (i == a && j == 0) || (i == a
				// && j == a)) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printLeftTriangle() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printTriangle() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (j + i >= 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void printTriangle1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printEquilateralTriangle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printRevertEquilateralTriangle() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printRhombus() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int n = 4; n >= 1; n--) {
			for (int j = 5; j > n; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * n - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// }