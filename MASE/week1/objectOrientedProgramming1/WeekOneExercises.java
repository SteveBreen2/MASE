package objectOrientedProgramming1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekOneExercises {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if (didOswaldActAlone()) {
		// System.out.println("Oswald acted alone.");
		// } else {
		// System.out.println("Oswald did not act alone.");
		// }

		// filmRating();

		System.out.println("Main::Swimmer Country: " + swimmerRating());
	}

	public static boolean didOswaldActAlone() {
		System.out.println("Did Oswald act alone?");
		return sc.nextBoolean();
	}

	public static void filmRating() {
		String filmName = "";
		int filmRating = 0;

		System.out.println("Enter a film: ");
		filmName = sc.next();
		System.out.println("Enter a rating for " + filmName);
		try {
			filmRating = sc.nextInt();
			System.out.println("Film Name: " + filmName + "\n" + "Rating: " + filmRating);
		} catch (InputMismatchException e) {
			System.out.println("Exception Caught");
		}

	}

	public static String swimmerRating() {
		String swimmerName = "", swimmerCountry = "error";
		double swimmerRating = 0;

		System.out.println("Enter a swimmers name: ");
		swimmerName = sc.nextLine();

		System.out.println("Enter a swimmers rating: ");
		if (sc.hasNextDouble()) {
			swimmerRating = sc.nextDouble();
			System.out.println("Swimmers name: " + swimmerName);
			System.out.println("Swimmers rating: " + swimmerRating);
			swimmerCountry = getSwimmerCountry(swimmerName);
		} else {
			System.out.println("Error");
		}

		return swimmerCountry;

	}

	public static String getSwimmerCountry(String swimmerName) {

		System.out.println("Enter " + swimmerName + "'s country: ");
		return sc.next();
	}

	
	
}
