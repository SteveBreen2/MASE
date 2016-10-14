package week4;

import java.util.Scanner;

public class Networks_Boolean {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter temp: ");
		int input=sc.nextInt();

		if (input>60&&input<70){
			System.out.println("Very Hot");
		}
		else if(input>50&&input<59){
			System.out.println("Hot");
		}
		else if((input>40&&input<45)||(input>46&&input<=49)){
			System.out.println("Mild");
		}
		else if(input<40){
			System.out.println("Not Hot");
		}	
	}

}
