package levelUpFirst;

import java.util.Scanner;

public class SignAndOdd {

	static Scanner enter = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Your entered digit is " + digitStatus());
		System.out.println("Your entered sign is " + sign());
	}

	public static String digitStatus() {
		String status;
		System.out.println("Please, enter a digit to see its status.");
		int digit = enter.nextInt();
		if (digit % 2 == 0) {
			status = "even";
		} else {
			status = "odd";
		}
		return status;
	}

	public static String sign() {
		String sign = "";
		System.out.println("Please, enter a sign to see its name.");
		String signEntered = enter.next();
		switch (signEntered) {
		case "+":
			sign = "plus";
			break;
		case "-":
			sign = "minus";
			break;
		case "*":
			sign = "mult_sign";
			break;
		case "/":
			sign = "div_sign";
			System.out.println("in div " + sign);
			break;
		default:
			System.out.println(
					"Your entered character is wrong. You can type only +, -, *, and / characters. Please, reenter the sign.");
			sign();
			break;
		}
		// enterSign.reset();
		System.out.println("in switch " + sign);
		return sign;
	}
}
