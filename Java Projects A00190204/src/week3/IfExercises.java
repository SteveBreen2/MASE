package week3;

import java.util.Scanner;

public class IfExercises {

	static Scanner sc=new Scanner(System.in);


	public static void main(String[] args) 
	{
		functionSelection();

	}

	public static void ifMonth() {
		final int JANUARY=1,FEBRUARY=2,MARCH=3,APRIL=4,MAY=5,JUNE=6,JULY=7,AUGUST=8,SEPTEMBER=9,OCTOBER=10,NOVEMBER=11,DECEMBER=12;
		// TODO Auto-generated method stub
		int entry=0;
		System.out.println("Enter month (1-12): ");
		try{
			entry=sc.nextInt();
			if (entry==JANUARY){
				System.out.println(entry+" is January.");	
			}
			else if (entry==FEBRUARY){
				System.out.println(entry+" is February.");	
			}
			else if (entry==MARCH){
				System.out.println(entry+" is March.");	
			}
			else if (entry==APRIL){
				System.out.println(entry+" is April.");	
			}
			else if (entry==MAY){
				System.out.println(entry+" is May.");	
			}
			else if (entry==JUNE){
				System.out.println(entry+" is June.");	
			}
			else if (entry==JULY){
				System.out.println(entry+" is July.");	
			}
			else if (entry==AUGUST){
				System.out.println(entry+" is August.");	
			}
			else if (entry==SEPTEMBER){
				System.out.println(entry+" is September.");	
			}
			else if (entry==OCTOBER){
				System.out.println(entry+" is October.");	
			}
			else if (entry==NOVEMBER){
				System.out.println(entry+" is November.");	
			}
			else if (entry==DECEMBER){
				System.out.println(entry+" is December.");	
			}
			else{
				System.out.println("Value out of range: "+entry);
			}
		}
		catch(Exception e){
			System.out.println("Exception.");
			e.printStackTrace();
		}

	}
	public static void largerOfTwoNumbers(){
		try{
			System.out.println("Enter first integer: ");
			int firstInt=sc.nextInt();
			System.out.println("Enter second integer: ");
			int secondInt=sc.nextInt();

			if(firstInt<0||secondInt<0){
				System.out.print("Error a negative number entered");	
			}
			else if(firstInt>0&&secondInt>0){
				System.out.print("Larger number"+Math.max(firstInt, secondInt));
			}

		}
		catch(Exception e)
		{
			System.out.print("Error incorrect input");
			e.printStackTrace();
		}
	}
	public static void ifGrade(){
		System.out.print("Enter grade: ");
		try{
			int grade=sc.nextInt();
			if (grade>=0&&grade<=100)
			{
				if (grade>70 && grade<=100)
				{
					System.out.print("A");
				}
				else if (grade>60 && grade<=69)
				{
					System.out.print("B");
				}
				else if (grade>50 && grade<=59)
				{
					System.out.print("C");
				}
				else if (grade>40 && grade<=49)
				{
					System.out.print("D");
				}
				else if (grade<40)
				{
					System.out.print("Fail");
				}
			}
			else
			{System.out.println("Number too high or too low.");}

		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();

		}

	}
	public static void temperature(){
		final String VERY_COLD="Very Cold";
		final String COLD="Cold";
		final String MILD="Mild";
		final String WARM="Warm";
		final String VERY_WARM="Very Warm";
		final String HOT="Hot";

		final int VERY_COLD_MIN=-10,
				VERY_COLD_MAX=2;
		final int COLD_MIN=2,
				COLD_MAX=9;
		final int MILD_MIN=9,
				MILD_MAX=14;
		final int WARM_MIN=14,
				WARM_MAX=20;
		final int VERY_WARM_MIN=20,
				VERY_WARM_MAX=27;
		final int HOT_MIN=27,
				HOT_MAX=31;

		try{
			System.out.print("Enter temperature");
			int temperature=sc.nextInt();
			if(temperature>VERY_COLD_MIN&&temperature<=VERY_COLD_MAX){
				System.out.print("It is "+temperature+" degrees i.e "+VERY_COLD);
			}else if(temperature>COLD_MIN&&temperature<=COLD_MAX){
				System.out.print("It is "+temperature+" degrees i.e "+COLD);
			}else if(temperature>MILD_MIN&&temperature<=MILD_MAX){
				System.out.print("It is "+temperature+" degrees i.e "+MILD);
			}else if(temperature>WARM_MIN&&temperature<=WARM_MAX){
				System.out.print("It is "+temperature+" degrees i.e "+WARM);
			}else if(temperature>VERY_WARM_MIN&&temperature<=VERY_WARM_MAX){
				System.out.print("It is "+temperature+" degrees i.e "+VERY_WARM);
			}else if(temperature>HOT_MIN&&temperature<=HOT_MAX){
				System.out.print("It is "+temperature+" degrees i.e "+HOT);
			}else{
				System.out.print("Extreme Temperature");
			}

		}
		catch(Exception e){
			System.out.print("Error: ");
			e.printStackTrace();
		}
	}
	public static void ifLargest(){
		int largest = 0,firstNumber,secondNumber,thirdNumber;
		try{
			System.out.println("Enter first number: ");
			firstNumber=sc.nextInt();
			System.out.println("Enter second number: ");
			secondNumber=sc.nextInt();
			System.out.println("Enter third number: ");
			thirdNumber=sc.nextInt();

			if(firstNumber>secondNumber){
				largest=firstNumber;
				if(thirdNumber>largest){
					largest=thirdNumber;
				}
			}else{
				largest=secondNumber;
				if(thirdNumber>largest){
					largest=thirdNumber;
				}
			}
			System.out.println("Largest Number="+largest);
		}
		catch(Exception e){
			System.out.println("Error");
			e.printStackTrace();

		}
	}
	public static void ifSmallest(){
		int smallest = 0,firstNumber,secondNumber,thirdNumber;
		try{
			System.out.println("Enter first number: ");
			firstNumber=sc.nextInt();
			System.out.println("Enter second number: ");
			secondNumber=sc.nextInt();
			System.out.println("Enter third number: ");
			thirdNumber=sc.nextInt();

			if(firstNumber<secondNumber){
				smallest=firstNumber;
				if(thirdNumber<smallest){
					smallest=thirdNumber;
				}
			}
			else{
				smallest=secondNumber;
				if(thirdNumber<smallest){
					smallest=thirdNumber;
				}
			}
			System.out.println("Smallest Number="+smallest);
		}
		catch(Exception e){
			System.out.println("Error");
			e.printStackTrace();

		}
	}
	public static void ifLargest2(){
		int largest = 0,firstNumber,secondNumber,thirdNumber;
		try{
			System.out.println("Enter first number: ");
			firstNumber=sc.nextInt();
			System.out.println("Enter second number: ");
			secondNumber=sc.nextInt();
			System.out.println("Enter third number: ");
			thirdNumber=sc.nextInt();

			largest=(firstNumber>secondNumber)?firstNumber:secondNumber;
			largest=(thirdNumber>largest)?thirdNumber:largest;
			System.out.println("Largest Number="+largest);
		}
		catch(Exception e){
			System.out.println("Error");
			e.printStackTrace();

		}
	}
	public static void ifSmallest2(){
		int smallest = 0,firstNumber,secondNumber,thirdNumber;
		try{
			System.out.println("Enter first number: ");
			firstNumber=sc.nextInt();
			System.out.println("Enter second number: ");
			secondNumber=sc.nextInt();
			System.out.println("Enter third number: ");
			thirdNumber=sc.nextInt();

			smallest=(firstNumber<secondNumber)?firstNumber:secondNumber;
			smallest=(thirdNumber<smallest)?thirdNumber:smallest;
			System.out.println("Smallest Number="+smallest);
		}catch(Exception e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	public static void ternaryOperator(){
		boolean isHappy=true;
		
		try{
			System.out.println("Enter boolean: ");
			isHappy=sc.nextBoolean();
			String mood=(isHappy)?"I am happy.":"I am sad.";
			System.out.println(mood);
		}
		catch(Exception e){
			System.out.println("Error caught. ");
			e.printStackTrace();
		}
	}
	public static void functionSelection(){
		System.out.print("Please Enter a Question number (1-9): ");
		try{
			if (sc.hasNextInt()){
				int selection=sc.nextInt();
				if (selection>=1&&selection<10){
					switch (selection){
						case 1:{ifMonth();break;}
						case 2:{largerOfTwoNumbers();break;}
						case 3:{ifGrade();break;}
						case 4:{temperature();break;}
						case 5:{ifLargest();break;}
						case 6:{ifSmallest();break;}
						case 7:{ifLargest2();break;}
						case 8:{ifSmallest2();break;}
						case 9:{ternaryOperator();break;}
					}
				}else{
					System.out.print("Number out of Range. "+selection);
				}
			}else{
				System.out.print("Invalid entry");
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.print("Error");
		}
	}

}



