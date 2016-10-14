package Exam;

import java.util.Scanner;

public class Question11 {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter quiz score");
		int a=sc.nextInt();
		System.out.print("Enter mid-term score");
		int b=sc.nextInt();
		System.out.print("Enter finals score");
		int c=sc.nextInt();
		scores(a,b,c);

	}
	public static void scores(int quiz,int midTerm,int finalScore){
		int average=0;

		average=(quiz+midTerm+finalScore)/3;

		if (average>=90&&average<=100){
			System.out.println("Quiz score: "+quiz);
			System.out.println("Mid-term: "+midTerm);
			System.out.println("Final score: "+finalScore);
			System.out.println("Your Grade is A1");
			
		}
		else if (average>=80&&average<90){
			System.out.println("Quiz score: "+quiz);
			System.out.println("Mid-term: "+midTerm);
			System.out.println("Final score: "+finalScore);
			System.out.println("Your Grade is A2");
		}
		else if (average>=70&&average<80){
			System.out.println("Quiz score: "+quiz);
			System.out.println("Mid-term: "+midTerm);
			System.out.println("Final score: "+finalScore);
			System.out.println("Your Grade is B");
		}
		else if (average>=50&&average<70){
			System.out.println("Quiz score: "+quiz);
			System.out.println("Mid-term: "+midTerm);
			System.out.println("Final score: "+finalScore);
			System.out.println("Your Grade is C");
		}
		else if (average>=40&&average<50){
			System.out.println("Quiz score: "+quiz);
			System.out.println("Mid-term: "+midTerm);
			System.out.println("Final score: "+finalScore);
			System.out.println("Your Grade is D");
		}
		else if (average<=40){
			System.out.println("Quiz score: "+quiz);
			System.out.println("Mid-term: "+midTerm);
			System.out.println("Final score: "+finalScore);
			System.out.println("Your Grade is F");
		}
	}

}
