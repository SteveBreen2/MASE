package week2;

import java.util.Scanner;

public class AssignmentTests {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int x=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value: ");
		x=sc.nextInt();
		
		
		try
		{
		System.out.print(RandomMath.randomMath1(x));
		}
		
		catch(MyException e){
			e.printStackTrace();
		}
		
		sc.close();

	}

}
