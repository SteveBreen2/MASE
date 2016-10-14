package week2;

import java.util.Scanner;

public class MathsOps {
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int num1,num2;


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		num2=sc.nextInt();

		System.out.println(RandomMath.randomMath3(num1, num2));
		sc.close();

	}
}
