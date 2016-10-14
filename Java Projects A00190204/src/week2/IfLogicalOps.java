package week2;

import java.util.Scanner;

public class IfLogicalOps {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int firstNumber,secondNumber;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		firstNumber=sc.nextInt();
		System.out.println("Enter Second Number: ");
		secondNumber=sc.nextInt();
		
		System.out.print(RandomMath.randomMath2(firstNumber, secondNumber));
		
		sc.close();
	}

}
