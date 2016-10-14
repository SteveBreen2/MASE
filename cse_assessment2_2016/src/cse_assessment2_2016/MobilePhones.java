package cse_assessment2_2016;

import java.util.Scanner;

public class MobilePhones {
	//Scanner
	static Scanner sc = new Scanner(System.in);

	//Prompt user to select either iPhone or Samsung
	public static String getPhoneChoice() {
		String phoneChoice;
		System.out.println("Please select a phone: (i)Phone or (S)amsung");
		phoneChoice = sc.next().toLowerCase();
		//Return choice as string
		return phoneChoice;
	}

	//Taking the users choice of phone prompt them for the model 
	public static String getModel(String phoneChoice) {
		String modelChoice = null;

		if (phoneChoice.equals("i")) {
			System.out.println("Please enter the model: 4/5  :");
			modelChoice = sc.next();
		} else if (phoneChoice.equals("s")) {
			System.out.println("Please enter the model: One or Desire  :");
			modelChoice = sc.next();
		}
		//Return model as String
		return modelChoice;
	}

	//Prompt user for memory size
	public static int getGigabytes() {
		int gigabyteChoice;
		System.out.println("How many gigabytes: 16/32/64");
		gigabyteChoice = sc.nextInt();
		//Return as integer
		return gigabyteChoice;
	}

	public static void main(String args[]) {
		//Storage for phone parameters
		String phoneChoice, modelChoice;
		int gigabyteChoice;
		//Main Loop condition
		boolean run = true;
		
		//Used to ensure user enters y/n
		String choice;
		boolean inValidInput = true;

		//Main loop
		while (run) {
			inValidInput = true;
			phoneChoice = getPhoneChoice();

			//iPhone selected
			if (phoneChoice.equals("i")) {

				//Get model given iPhone
				modelChoice = getModel(phoneChoice);
				//Get size
				gigabyteChoice = getGigabytes();
				//Create iPhone
				Iphone i = new Iphone(modelChoice, gigabyteChoice);
				//Call overloaded to string and purchasecost methods
				System.out.println("The iPhone details are as follows:\n" + i + "\nPurchase cost is: "
						+ i.calculatePurchasePrice());
			}
			//Samsung Selected
			else if (phoneChoice.equals("s")) 
			{
				//Get model given samsung
				modelChoice = getModel(phoneChoice);
				//Get Size
				gigabyteChoice = getGigabytes();
				//Create Samsung
				Samsung s = new Samsung(modelChoice, gigabyteChoice);
				//Call overloaded String and purchasecost methods
				System.out.println("The Samsung details are as follows:\n" + s + "\nPurchase cost is: "
						+ s.calculatePurchasePrice());

			} else {
				//invalid phone type
				System.out.println("Unknown Phone: " + phoneChoice);
			}

			//Ensure user enters y/n
			while (inValidInput) {
				System.out.println("Create another phone (y/n)?");
				choice = sc.next();
				if (choice.equals("n")) {
					run = false;
					inValidInput = false;
				} else if (choice.equals("y")) {
					run = true;
					inValidInput = false;
				} else {
					System.out.println("Invalid Input " + choice);
				}
			}
		}
		//Call get count and print out
		System.out.println(Samsung.getCount() + " Samsungs created ...");
		System.out.println(Iphone.getCount() + " iPhones created ...");

	}

}

class Samsung {
	private String model;
	private int gigabytes;
	private static int count;

	public Samsung(String model, int gigabytes) {
		this.model = model;
		this.gigabytes = gigabytes;
		Samsung.count++;
	}

	@Override
	public String toString() {
		return "Model:" + this.getModel() + "\nGigabytes: " + this.getGigabytes();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGigabytes() {
		return gigabytes;
	}

	public void setGigabytes(int gigabytes) {
		this.gigabytes = gigabytes;
	}

	public static int getCount() {
		return Samsung.count;
	}

	public int calculatePurchasePrice() {
		int price = -1;
		if (model.equalsIgnoreCase("One")) {
			switch (gigabytes) {
				case 16:
					price = 149;
					break;

				case 32:
					price = 199;
					break;

				case 64:
					price = 249;
					break;
			}
		}
		if (model.equalsIgnoreCase("Desire")) {
			switch (gigabytes) {
				case 16:
					price = 249;
					break;
				case 32:
					price = 299;
					break;
				case 64:
					price = 349;
					break;
			}
		}
		return price;
	}
}

class Iphone {
	private String model;
	private int gigabytes;
	private static int count;

	public Iphone(String model, int gigabytes) {
		this.model = model;
		this.gigabytes = gigabytes;
		Iphone.count++;
	}

	@Override
	public String toString() {
		return "Model:" + this.getModel() + "\nGigabytes: " + this.getGigabytes();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGigabytes() {
		return gigabytes;
	}

	public void setGigabytes(int gigabytes) {
		this.gigabytes = gigabytes;
	}

	public static int getCount() {
		return Iphone.count;
	}

	public int calculatePurchasePrice() {
		int price = -1;
		if (model.equals("4")) {
			switch (gigabytes) {
				case 16:
					price = 149;
					break;
				case 32:
					price = 199;
					break;
				case 64:
					price = 249;
					break;
			}
		}
		if (model.equals("5")) {
			switch (gigabytes) {
				case 16:
					price = 249;
					break;
				case 32:
					price = 299;
					break;

				case 64:
					price = 349;
					break;
			}
		}
		return price;

	}

}
