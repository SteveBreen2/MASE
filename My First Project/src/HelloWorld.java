import java.util.Scanner;

public class HelloWorld{
	
	public static void main(String[] args){	
		
	
		//TODO Auto-generated method stub
		/*
		System.out.println("Hello World");
		System.out.println("Steve");
		System.out.println("25");
		*/
		String name="Steve";
		String address= "Athlone";
		int age=25;
		
		//String nameWithIntro="My name is "+name+".";
		String addressWithIntro="I live in "+address+".";
		//String ageWithIntro="I am "+age+" years old.";
		
		System.out.println("My name is "+name+".");
		System.out.println(addressWithIntro);
		System.out.println("I am "+age+" years old.");
		
		Scanner sc=new Scanner(System.in);
	}
}
