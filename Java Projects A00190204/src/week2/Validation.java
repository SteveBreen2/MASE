package week2;

import java.util.Scanner;

public class Validation {
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value ");
		int x=getValidInt(sc);
		System.out.println("Valid Input "+x);


	}
	public static int getValidInt(Scanner sc)
	{
		while (sc.hasNext()){


			if(!sc.hasNextInt()){
				sc.nextLine();
				System.out.println("Enter Value ");
				
			}
			else{
				return sc.nextInt();
			}


		}
		return 0;
	}
}