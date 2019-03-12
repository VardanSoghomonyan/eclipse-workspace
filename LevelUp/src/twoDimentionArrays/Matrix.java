package twoDimentionArrays;

import java.util.Arrays;

public class Matrix {
	static int[][] matrix = { { 45, 76 }, { 98, 45, 32, 34, 77 }, { 55, 23, 56, 46 }, };

	public static void main(String[] args) {
		// printMatrix(matrix);
		// System.out.println(getMaxLength(matrix));
		// System.out.println(getMinLength(matrix));
		// System.out.println(printMaxElementMaxLength(matrix));
		// System.out.println(Arrays.toString(printArrayOfMaxElements(matrix)));
		// printRevertMatrix(matrix);
		printRevertMatrixFinal(matrix);
		// printMatrixWithAsterix(matrix);
	}

	public static void printMatrix(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int getMaxLength(int[][] table) {
		int max = table[0].length;
		for (int i = 1; i < table.length; i++) {
			if (table[i].length > max) {
				max = table[i].length;
			}
		}
		return max;
	}

	public static int getMinLength(int[][] table) {
		int min = table[0].length;
		for (int i = 1; i < table.length; i++) {
			if (table[i].length < min) {
				min = table[i].length;
			}
		}
		return min;
	}

	public static int printMaxElementMaxLength(int[][] table) {
		int[] max = table[0];
		for (int i = 1; i < table.length; i++) {
			if (table[i].length > max.length) {
				max = table[i];
			}
		}
		int maxElement = max[0];
		for (int i = 1; i < max.length; i++) {
			if (max[i] > maxElement) {
				maxElement = max[i];
			}
		}
		return maxElement;
	}

	public static int[] printArrayOfMaxElements(int[][] table) {
		int[] max = new int[table.length];
		for (int i = 0; i < table.length; i++) {
			int maxElement = table[i][0];
			for (int j = 1; j < table[i].length; j++) {
				if (table[i][j] > maxElement) {
					maxElement = table[i][j];
				}
			}
			max[i] = maxElement;
		}
		return max;
	}

	public static void printRevertMatrixFinal(int[][] table) {
		int[][] revertedTable = printRevertMatrix(table);
		for (int i = 0; i < revertedTable.length; i++) {
			getRevertElements(revertedTable[i]);
			System.out.println(Arrays.toString(revertedTable[i]));
		}
	}

	public static int[][] printRevertMatrix(int[][] table) {
		int[][] newTable = new int[table.length][];
		for (int i = 0, z = newTable.length - 1; i < table.length; i++, z--) {
			newTable[z] = table[i];
		}
		// for (int k = 0; k < newTable.length; k++) {
		// for (int j = 0; j < newTable[k].length; j++) {
		// System.out.print(newTable[k][j] + " ");
		// }
		// System.out.println();
		// }
		return newTable;
	}

	public static int[] getRevertElements(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int a = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = a;
		}
		return array;
	}

	public static void printMatrixWithAsterix(int[][] table) {
		int max = getMaxLength(table);
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			if (table[i].length < max) {
				for (int k = table[i].length; k < max; k++) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}