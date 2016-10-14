package week2;

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char choice;
		
		System.out.print("Enter a value: ");
		choice=sc.next().charAt(0);
		while(choice!='x'){
				
			System.out.println("Ascii value is: "+(int)choice);
			System.out.println("Enter a value: ");
			choice=sc.next().charAt(0);
		}
		sc.close();
		
	}

}
