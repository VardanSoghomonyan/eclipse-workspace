package levelUpFirst;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFunctionality {
	public static void main(String[] args) {
		printTo100();
		enter10();
	}

	public static void printTo100() {
		int i = 0;
		while (i < 100) {
			System.out.println(++i);
		}
	}

	public static void enter10() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 10 to exit.");
		int i = 0;
		try {
			do {
				i = scan.nextInt();
				if (i != 10) {
					System.out.println("Please enter 10. You entered " + i + ".");
				}
			} while (i != 10);
			System.out.println("You entered " + i + ". The terminal is closed.");
			scan.close();
		} catch (InputMismatchException e) {
			System.out.println("You entered not number!");
			enter10();
		}
	}
}
