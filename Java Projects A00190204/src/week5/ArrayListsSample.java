package week5;

import java.util.ArrayList;
import java.util.Scanner;



class Person {
	private int age;
	private String name, address;

	public int getAge() {
		return age;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Person setAddress(String address) {
		this.address = address;
		return this;
	}

	// Overloaded Constructor
	public Person(String nameParam, int ageParam, String addressParam) {
		age = ageParam;
		name = nameParam;
		address = addressParam;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nAge: " + age + "\nAddress: " + address+"\n";
	}

	// Default Constructor
	public Person() {

	}

}

public class ArrayListsSample {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// String name=arrayListStringLiterals();
		// System.out.println("main:: "+name);
		// arrayListStringsNoLoops();
		// arrayListStringsWithLoop();
		// arrayListInteger();
		// arrayListPerson();
		arrayListPerson();
		// Person p = new Person("Steve", 25, "Ireland");
		// Person p2 = new Person();
		// p2.setName("Steve2").setAge(26).setAddress("Sweden");
		// System.out.println(p2);
	}

	public static void arrayListPerson() {
		ArrayList<Person> people = new ArrayList<Person>();

		while (true) {
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			System.out.println("Enter Address: ");
			String address = sc.next();

			Person p = new Person(name, age, address);
			people.add(p);
			System.out.println("Continue? (y/n)");
			if (sc.next().equalsIgnoreCase("N")) {
				break;
			}

		}
		for (Person folk : people) {
			System.out.println(folk);
		}
	}

	public static void arrayListStringsWithLoop() {
		// TODO Auto-generated method stub
		boolean inputOkay = false;

		ArrayList<String> names = new ArrayList<>();
		System.out.println("Enter a name: (X:Exit)");
		String name = sc.next();

		while (!name.equalsIgnoreCase("x")) {
			inputOkay = true;
			names.add(name);
			System.out.println("Enter a name: (X:Exit)");
			name = sc.next();
		}
		if (inputOkay) {
			for (String aName : names) {
				System.out.println(aName);
			}
		} else {
			System.out.println("No names entered.");
		}

	}

	public static void arrayListStringsNoLoops() {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		System.out.println("Enter a name: ");
		names.add(sc.next());
		System.out.println("Enter a name: ");
		names.add(sc.next());
		System.out.println("Enter a name: ");
		names.add(sc.next());
		System.out.println("Enter a name: ");
		names.add(sc.next());
		System.out.println(names);

	}

	// Duplicates are allowed
	public static String arrayListStringLiterals() {
		ArrayList<String> names = new ArrayList<>();
		names.add("Zoe");
		names.add("Paul");
		names.add("Paul");
		names.add("Alan");
		names.add("Thomas");
		System.out.println(names);
		return names.get(3);
	}

	public static void arrayListInteger() {

		ArrayList<Integer> numbers = new ArrayList<>(3);
		System.out.println("Enter a number: (-1:Exit)");
		int n = sc.nextInt();

		while (n != -1) {
			numbers.add(n);
			System.out.println("Enter a number: (-1:Exit)");
			n = sc.nextInt();
		}

		for (Integer digit : numbers) {
			System.out.println(digit);
		}
	}
}
