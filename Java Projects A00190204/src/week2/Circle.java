package week2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diameter,area,circumference;
		
		Scanner sc=new Scanner(System.in);
		double radius;
		
		System.out.println("Enter Radius: ");
		radius=sc.nextInt();
		
		area=(Math.PI*Math.pow(radius,2));
		diameter=radius*2;
		circumference=(2*Math.PI*radius);
		
		System.out.print("Area: "+area+"\nDiameter: "+diameter+"\nCircumference: "+circumference);
		
		sc.close();
		
	}

}
