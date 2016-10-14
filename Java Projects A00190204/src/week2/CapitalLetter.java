package week2;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char choice;

		System.out.println("Enter a value: ");
		choice=sc.next().charAt(0);
		while(choice!=';'){

			if(Character.isUpperCase(choice)){
				System.out.println("Capital Letter entered.");
			}

			if(Character.isLowerCase(choice)){
				System.out.println("Error not a Capital Letter: "+choice);
			}

			System.out.println("Enter a value: ");
			choice=sc.next().charAt(0);
		}
		sc.close();
	}
}
