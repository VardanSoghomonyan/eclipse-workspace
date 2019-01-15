package levelUpFirst;

import java.util.Scanner;

public class Calculator {
	
    static Scanner enteredInt = new Scanner(System.in);
    static int a,b;
    
	public static void main(String[] args) {
//		calculator();
//		public static void calculator() {
	    Scanner enteredOption = new Scanner(System.in);
	    System.out.println("Type the first letter of the following options to proceed: Addition, Substitution, Multiplication, Division.");
	    String option = enteredOption.next();
	    switch (option) {
	        case "A":
	            System.out.println("You are going to calculate the sum of 2 numbers.");
	        	System.out.println("The sum of your entered numbers is: " + addition(a, b));
	        	break;	        
	        case "S":
	            System.out.println("You are going to calculate the difference of 2 numbers.");
	            System.out.println("The difference of your entered numbers is: " + substitution(a, b));
	            break;
	        case "M":
	            System.out.println("You are going to calculate the multiplication of 2 numbers.");
	            System.out.println("The multiplication of your entered numbers is: " + multiplication(a, b));
	            break;
	        case "D":
	            System.out.println("You are going to calculate the division of 2 numbers.");
	            System.out.println("The division of your entered numbers is: " + division(a, b));
	            break;
	        default:
	            System.out.println("Your entered option does not exist. Please, try again later.");
//	            calculator();
	            break;
	}
	    System.out.println("Closing the scanner...");
	    enteredOption.close();
	    System.out.println("The scanner is closed.");
	}
//	}
	public static int addition (int a, int b) {
		System.out.println("Enter the first integer:");
		a = enteredInt.nextInt();
		System.out.println("Enter the second integer:");
	    b = enteredInt.nextInt();
		int c = a + b;
		return c;
	}
	
	public static int substitution (int a, int b) {
		System.out.println("Enter the first integer:");
		a = enteredInt.nextInt();
		System.out.println("Enter the second integer:");
	    b = enteredInt.nextInt();
		int c = a - b;
		return c;
	}
	
	public static int multiplication (int a, int b) {
		System.out.println("Enter the first integer:");
		a = enteredInt.nextInt();
		System.out.println("Enter the second integer:");
	    b = enteredInt.nextInt();
		int c = a * b;
		return c;
	}
	
	public static float division (float a, float b) {
		System.out.println("Enter the first integer:");
		a = enteredInt.nextInt();
		System.out.println("Enter the second integer:");
	    b = enteredInt.nextInt();
		float c = a / b;
		return c;
	}
	
}