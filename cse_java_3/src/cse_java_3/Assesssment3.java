package cse_java_3;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: Stephan Breen
 * Student Number: A00190204
 */


class Prisoner {
	private String inmateNumber;
	private String name;
	private double sentence;

	public String getInmateNumber() {
		return inmateNumber;
	}

	public void setInmateNumber(String inmateNumber) {
		this.inmateNumber = inmateNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSentence() {
		return sentence;
	}

	public void setSentence(double sentence) {
		this.sentence = sentence;
	}

	public Prisoner() {

	}

	public Prisoner(String inmateNumber, String name, double sentence) {
		this.name = name;
		this.inmateNumber = inmateNumber;
		this.sentence = sentence;

	}

	@Override
	public String toString() {
		return ("[Prisoner{Name=" + name + ", Inmate Number=" + inmateNumber + ", Sentence: " + sentence + "}]\n");
	}

}

public class Assesssment3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ADD = 1;
		final int CHANGE = 2;
		final int RELEASE = 3;
		final int LIFERS = 4;
		final int SHOW = 5;
		final int EXIT = 6;

		ArrayList<Prisoner> register = new ArrayList<>();

		boolean run = true;
		while (run) {
			switch (userChoice()) {

				case ADD:
					addPrisoner(register);
					break;
				case CHANGE:
					changePrisonerSentence(register);
					break;
				case RELEASE:
					releasePrisoner(register);
					break;
				case LIFERS:
					howManyLifers(register);
					break;
				case SHOW:
					showPrisoners(register);
					break;
				case EXIT:
					System.out.println("Exiting...");
					run = false;
					break;
			}
		}
	}

	public static int userChoice() {
		System.out.println(
				"What do you want to do? \n1.Add a prisoner\n2.Change a prisoners senetence\n3.Release a prisoner\n4.How many lifers?\n5.Show prisoners\n6.Exit");
		return sc.nextInt();
	}

	public static void addPrisoner(ArrayList<Prisoner> prisoners) {
		String entry;
		System.out.println("Enter Inmate Number --> ");
		entry = sc.next();
		if (prisonerAlreadyExists(entry, prisoners) != -1) {
			System.out.println("Prisoner " + entry + " already exists...");
		} else {
			System.out.println("Enter the prisoners name --->");
			String name = sc.next();
			System.out.println("Enter the prisoners sentence --->");
			double sentence = sc.nextDouble();

			Prisoner p = new Prisoner(entry, name, sentence);
			prisoners.add(p);
		}
	}

	public static int prisonerAlreadyExists(String inmateNumber, ArrayList<Prisoner> prisoners) {

		for (int i = 0; i < prisoners.size(); i++) {
			if (prisoners.get(i).getInmateNumber().equals(inmateNumber)) {
				return i;
			}
		}
		return -1;
	}

	public static void howManyLifers(ArrayList<Prisoner> prisoners) {
		final double LIFER = 999;
		int count = 0;
		for (Prisoner prisoner : prisoners) {
			if (prisoner.getSentence() == LIFER) {
				count++;
			}
		}
		System.out.println("Number of Lifers: " + count + "\n");

	}

	public static void releasePrisoner(ArrayList<Prisoner> prisoners) {
		System.out.println("Prisoners before: ");
		for (Prisoner prisoner : prisoners) {
			System.out.println(prisoner);
		}
		System.out.println();

		String entry;
		System.out.println("Enter Inmate Number --> ");
		entry = sc.next();

		int index = prisonerAlreadyExists(entry, prisoners);

		if (index == -1) {
			System.out.println("Could not find that inmate number so could not release that prisoner!");
		} else {

			prisoners.remove(index);
		}

		System.out.println("Prisoners after: ");
		for (Prisoner prisoner : prisoners) {
			System.out.println(prisoner);
		}

	}

	public static void changePrisonerSentence(ArrayList<Prisoner> prisoners) {

		String entry;
		double sentence;
		System.out.println("Enter Inmate Number --> ");
		entry = sc.next();

		int index = prisonerAlreadyExists(entry, prisoners);

		if (index == -1) {
			System.out.println(entry + " does not exist...\n");
		} else {
			System.out.println("Enter the new sentence --> ");
			sentence = sc.nextDouble();
			prisoners.get(index).setSentence(sentence);

			System.out.println("The updated prisoners: ");
			for (Prisoner prisoner : prisoners) {
				System.out.println(prisoner);
			}

		}

	}

	public static void showPrisoners(ArrayList<Prisoner> prisoners) {
		for (Prisoner prisoner : prisoners) {
			System.out.println(prisoner);
		}
	}

}
