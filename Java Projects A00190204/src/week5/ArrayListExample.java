package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ADD = 1, UPDATE = 2, DELETE = 3, DISPLAY = 4, EXIT = 5;
		// Do while functionality
		String userContinue = "Y";
		ArrayList<String> destinations = new ArrayList<>();
		System.out.println("Holiday Destination Program");

		while (userContinue.equalsIgnoreCase("Y")) {

			switch (userChoice()) {
				case ADD:
					destinations.add(add());
					break;
				case UPDATE:
					update(destinations);
					break;
				case DELETE:
					delete(destinations);
					break;
				case DISPLAY:
					display(destinations);
					break;
				case EXIT:
					userContinue = "N";
					break;
				default:
					System.out.println("Error Input:");
					break;
			}
		}
		System.out.println(destinations);
	}

	public static void update(ArrayList<String> list) {
		// TODO Auto-generated method stub
		System.out.println(list + "Enter the Index to Update:");
		int index = sc.nextInt();
		System.out.println("Whats the new destination? ");
		list.set(index, sc.next().toUpperCase());
		System.out.println("After Changes: " + list);
	}

	public static int userChoice() {
		System.out.println("What do you want to do?\n1: Add\n2: Update\n3: Delete\n4: Display\n5: Exit");
		return sc.nextInt();

	}

	public static String add() {
		System.out.println("Enter Destination: ");
		return sc.next().toUpperCase();
	}

	public static void delete(ArrayList<String> list) {
		System.out.println(list + "Enter Index to delete: ");
		list.remove(sc.nextInt());
		System.out.println("After Changes:\n" + list + "\n");
	}

	public static void display(ArrayList<String> list) {
//		for (String places : list) {
//			System.out.println(places);
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
