package cse_assessment1_2016;

import java.util.Scanner;

/*
 * Student Number:	A00190204
 * Name:			Stephan Breen
 */
public class CSE_Assessment1_2016 {
	// Initalise a scanner object
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Call q1
		q1();
		// Declare 3 integers
		int x, y, z;

		// Request user input of three integers
		System.out.println("Enter value one:");
		x = sc.nextInt();
		System.out.println("Enter value one:");
		y = sc.nextInt();
		System.out.println("Enter value one:");
		z = sc.nextInt();
		// Call q2 passing in x,y and z
		int product = q2(x, y, z);
		// Output return value of q2 to screen
		System.out.println("Product= " + product);

		// Call q3
		q3();

		// Prompt user for amount of stars
		System.out.println("How many stars --> ");
		// Store user input
		int n = sc.nextInt();
		// Call q4 passing in number of stars
		q4(n);

	}

	public static void q1() {
		// Declare a string shippingMethod
		String shippingMethod;
		// Declare and initalise a double shippingCost
		double shippingCost = 0.0;

		// Prompt user for delivery type
		System.out.println("Select Shipping Method");
		// Store user input
		shippingMethod = sc.next();

		// Check if delivery type is UPS
		if (shippingMethod.equalsIgnoreCase("UPS")) {
			// Prompt user to enter weight
			System.out.println("Enter Weight");
			// Store user input as an integer
			int weight = sc.nextInt();
			// If lighter that or equal to 5
			if (weight <= 5) {
				// Set cost to 4.95
				shippingCost = 4.95;
				// If heavier than five but lighter than or equal to 10
			} else if (weight > 5 && weight <= 10) {
				// Set cost to 7.95
				shippingCost = 7.95;
				// If heavier than 10
			} else if (weight > 10) {
				// Set cost to 10.95
				shippingCost = 10.95;
			}
			// Check if delivery type is Fedex
		} else if (shippingMethod.equalsIgnoreCase("FEDEX")) {
			// Set cost to 7.95
			shippingCost = 7.95;
			// Any other delivery method
		} else {
			// Set cost to 9.95
			shippingCost = 9.95;
		}
		// Print cost to screen
		System.out.println("Shipping Cost: " + shippingCost);
	}

	public static int q2(int x, int y, int z) {
		// Return product of three integers
		return x * y * z;

	}

	public static void q3() {
		// Prompt user for a vowel
		System.out.println("Enter a vowel(A/E/I/O/U): ");
		// Take in the first element of the string set it to uppercase and store
		// as a char
		char usersLetter = sc.next().toUpperCase().charAt(0);
		// Initalise string output
		String output = null;
		// Initalise bool correctInput
		boolean correctInput = false;

		// Perform a switch on userLetter
		switch (usersLetter) {
			// If userLetter is A
			case 'A':
				// Set output to "A is the 1st Letter in the alphabet"
				output = "A is the 1st Letter in the alphabet";
				correctInput = true;
				break;
			// If userLetter is E
			case 'E':
				output = "E is the 5th Letter in the alphabet";
				correctInput = true;
				break;
			// If userLetter is I
			case 'I':
				output = "I is the 9thLetter in the alphabet";
				correctInput = true;
				break;
			// If userLetter is O
			case 'O':
				output = "O is the 15th Letter in the alphabet";
				correctInput = true;
				break;
			// If userLetter is U
			case 'U':
				output = "U is the 21st Letter in the alphabet";
				correctInput = true;
				break;
			// If userLetter is neither A,E,I,O or U
			default:
				// Print error to screen
				System.out.println("Invalid input: " + usersLetter);
		}
		// If a vowel was entered
		if (correctInput) {
			// Print output String
			System.out.println(output);
		}

	}

	public static void q4(int n) {

		// Outer loop from 0 to taken in value 'n'
		for (int i = 0; i < n; i++) {
			// Inner loop from 0 to current value of 'i'
			for (int j = 0; j <= i; j++) {
				// Print a star
				System.out.print("*");
			}
			// Space
			System.out.println("");
		}
		// Initalise i and j
		int i = 0, j = 0;
		// Outer loop from 0 to taken in value of 'n'
		while (i < n) {
			// Inner loop from 0 to current value of 'i'
			while (j <= i) {
				// Print a star
				System.out.print("*");
				// Increment inner loop iterator
				j++;
			}
			// Reset j to 0
			j = 0;
			// Increment outer loop iterator
			i++;
			// Space
			System.out.println("");
		}
	}

}
