package week4;

import java.util.Scanner;

public class ForProgram {
	static boolean run = true;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionSelection();
	}

	public static void forHeaderTesting() {
		int total = 0;
		int input;
		outerloop: for (int i = 0;i<9999; i++) {
			System.out.println("Enter a number (-1 to Exit): ");

			input = sc.nextInt();
			if (input == -1) {
				break outerloop;
			} else {
				total += input;
			}
		}
		System.out.println("Total: " + total);
	}

	public static void forHeaderTesting2() {
		final int NUM_INPUTS = 3;
		int input = 0;
		int sum = 0;
		int count = 1;

		for (; count <= NUM_INPUTS; count++) {
			System.out.println("Enter a number : ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.println("Sum: " + sum);
	}

	public static void forHeaderTesting3() {
		final int NUM_INPUTS = 3;
		int input = 0;
		int sum = 0;

		for (int i = 1; i <= NUM_INPUTS;) {
			System.out.println("Enter a number : ");
			input = sc.nextInt();
			sum += input;
			i++;
		}
		System.out.println("Sum: " + sum);
	}

	public static void forHeaderTesting4() {
		int total = 0;
		int input;
		outerloop: for (;;) {
			System.out.println("Enter a number (-1 to Exit): ");

			input = sc.nextInt();
			if (input == -1) {
				break outerloop;
			} else {
				total += input;
			}
		}
		System.out.println("Total: " + total);
	}

	public static void forSmallestLargest() {
		System.out.println("Select lenght of array ");
		int input = 0;
		int[] intArray = null;

		int largest = 0, smallest = 0;
		input = sc.nextInt();
		intArray = new int[input];

		for (int i = 0; i < input; i++) {
			System.out.println("Enter number(" + i + ")");
			intArray[i] = sc.nextInt();
			if (input <= 0) {
				System.out.println("Invalid Entry: " + input);
			} else {
				System.out.println("Input okay ");
			}
		}
		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] < smallest || smallest == 0) {
				smallest = intArray[i];
			}
			if (intArray[i] > largest || largest == 0) {
				largest = intArray[i];
			}
		}
		System.out.println("Min: " + smallest + "Max: " + largest);
	}

	public static void forHistogram() {
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter columns: ");
		int columns = sc.nextInt();
		System.out.println("Enter character: ");
		String character = sc.next();

		for (int j = 0; j < rows; j++) {
			System.out.print("\n");
			for (int i = 0; i < columns; i++) {
				System.out.print(character);
			}
		}
		System.out.print("\n");
	}

	public static void forAverage() {
		System.out.println("Select lenght of array ");
		int iterations = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < iterations; i++) {
			System.out.println("Enter Number (" + i + ")");
			sum += sc.nextInt();
		}
		System.out.println("Average= " + sum / iterations);
	}

	public static void forSequence() {
		int current = 1;
		for (int i = 3; i <= 21; i += 2) {
			if (!(i == 21)) {
				System.out.print(current + ",");
			} else {
				System.out.print(current);
			}
			current += i;
		}
	}

	public static void forSumEvenNumber() {
		System.out.println("Enter first even number: ");
		int firstEvenNum = sc.nextInt();
		System.out.println("Enter second even number: ");
		int secondEvenNum = sc.nextInt();
		if ((firstEvenNum % 2 == 0) && (secondEvenNum % 2 == 0)) {

			int total = 0;
			for (int i = firstEvenNum + 2; i < secondEvenNum; i += 2) {

				if (i == secondEvenNum - 2) {
					System.out.println(i);
				} else
					System.out.println(i + "\n+");
				total += i;
			}
			System.out.println("=\n " + total);
		} else {
			System.out.print("Invalid input");
		}
	}

	public static void twelveDaysOfChristmas() {
		final int daysOfChristmas = 2;
		String[] stringArray;
		stringArray = new String[daysOfChristmas];
		stringArray[0] = "first";
		stringArray[1] = "second";
		for (int i = 0; i < daysOfChristmas; i++) {
			System.out.println("On the ");
			switch (i) {
				case 0:
					System.out.print("first");
					break;
				case 1:
					System.out.print("second");
					break;
			}
			System.out.println(" day of Christmas,\nMy true love gave to me:");
			switch (i) {
				case 1:
					System.out.println("         Two turtle doves, and");

				case 0:
					System.out.println("         A partridge in a pear tree.\n");
					break;
			}
		}
	}

	public static void functionSelection() {
		final int NUMBER_OF_ENTRIES = 10;
		while (run) {
			System.out.println("Please Enter a Question number\n" + "0:Exit\n1:forHeaderTesting\n"
					+ "2:forHeaderTesting2\n" + "3:forHeaderTesting3\n" + "4:forHeaderTesting4\n"
					+ "5:forSmallestLargest\n" + "6:forHistogram\n" + "7:forAverage\n" + "8:forSequence\n"
					+ "9:forSumEvenNumber\n" + "10:twelveDaysOfChristmas\n");
			try {
				if (sc.hasNextInt()) {
					int selection = sc.nextInt();
					if (selection >= 0 && selection <= NUMBER_OF_ENTRIES) {

						switch (selection) {
							case 1: {
								forHeaderTesting();
								break;
							}
							case 2: {
								forHeaderTesting2();
								break;
							}
							case 3: {
								forHeaderTesting3();
								break;
							}
							case 4: {
								forHeaderTesting4();
								break;
							}
							case 5: {
								forSmallestLargest();
								break;
							}
							case 6: {
								forHistogram();
								break;
							}
							case 7: {
								forAverage();
								break;
							}
							case 8: {
								forSequence();
								break;
							}
							case 9: {
								forSumEvenNumber();
								break;
							}
							case 10: {
								twelveDaysOfChristmas();
								break;
							}
							case 0: {
								System.out.println("Exiting...");
								run = false;
							}
						}
					} else {
						System.out.println("Number out of Range. " + selection);
					}
				} else {
					System.out.println("Invalid entry");
					run = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error2");
				run = false;
			}
		}
	}

}
