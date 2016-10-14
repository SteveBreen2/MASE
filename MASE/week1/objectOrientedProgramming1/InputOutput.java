package objectOrientedProgramming1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutput {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] name=new String[2];
		// String personsFullName = getName();
		// System.out.println("Main::" + personsFullName);

		// getName(name);
		// for(int i=0;i<name.length;i++){
		// System.out.println("Array Element ["+i+"]: "+name[i]);
		// }
		//
		// System.out.println("You are "+getAge("Enter age:")+" years old.");
//		System.out.println("You are " + getAge("Enter age:", "Steve") + " years old.");
		String name="Steve Breen";
		
		int age= getAge("Enter age:", name);
		if(checkPension(age) ){
			System.out.println(name+" can get the pension.");
		}
		else{
			System.out.println(name+" cannot get the pension.");
		}
	}

	public static String getName() {
		String name = "";
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println(name);
		return name;
	}

	public static void getName(String[] name) {

		System.out.println("Enter Name: ");
		name[0] = sc.next();
		name[1] = sc.next();

	}

	public static int getAge() {
		int age = 0;
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		return age;

	}

	public static int getAge(String promptParam) {
		int age = 0;
		System.out.println(promptParam);
		try {
			age = sc.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		return age;

	}

	public static int getAge(String promptParam, String fullNameParam) {

		int age = 0;
		System.out.println("Hi " + fullNameParam + " " + promptParam);
		if (sc.hasNextInt()) {
			age = sc.nextInt();
		}
		else{
			System.out.println("Error in input");
			age=-999;
		}
		return age;

	}
	
	public static boolean checkPension(int age){
		final int PENSION_AGE=65;
		if (age>=PENSION_AGE){
			return true;
		}
		else{
			return false;
		}
	}
//	public static boolean checkPension(int age){
//		return age>=65;
//	}
//	 

}
