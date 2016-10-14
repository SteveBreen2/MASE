package week3;

import java.util.Scanner;

public class SwitchExercies {
	static boolean run=true;
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionSelection();
		sc.close();
	}
	public static void functionSelection(){
		final int NUMBER_OF_ENTRIES=7;
		while (run){
			System.out.println("\nPlease Enter a Question number\n"
					+ "0:Exit\n1:SwitchOnAString\n"
					+ "2:SwitchMonth\n"
					+ "3:SwitchChar\n"
					+ "4:SwitchSquareOrCube\n"
					+ "5:SwitchVowerlOrConsonant\n"
					+ "6:SwitchDaysInMonth\n"
					+ "7:SwitchDaysInMonthOverloaded\n");
			try{
				if (sc.hasNextInt()){
					int selection=sc.nextInt();
					if (selection>=0&&selection<=NUMBER_OF_ENTRIES){
					
						switch (selection){
							case 1:{switchOnAString();break;
							}
							case 2:{switchMonth();break;
							}
							case 3:{switchChar();break;
							}
							case 4:{switchSquareOrCube();break;
							}
							case 5:{switchVowelOrConstant();break;
							}
							case 6:{switchDaysInMonth();break ;
							}
							case 7:{System.out.println("Enter year: ");
							try{
								int yearParam=sc.nextInt();
								System.out.println("Enter month: ");
								int monthParam=sc.nextInt();
								switchDaysInMonth(yearParam,monthParam);
							}catch(Exception e){
								System.out.println("Error1");
								e.printStackTrace();
								run=false;

							}break;
							
							}
							case 0:{System.out.println("Exiting...");
							run=false;
							}
						}
					}else{
						System.out.println("Number out of Range. "+selection);
					}
				}else{
					System.out.println("Invalid entry");
					run=false;
				}
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Error2");
				run=false;
			}
		}
	}
	public static void switchOnAString(){
		String name;
		try{
			System.out.println("Enter a name: ");
			name=sc.next();

			switch(name){
				case "John":case "JOHN":case "john":{
					System.out.println("Male");
					break;
				}

				case "Mary":case "MARY":case "mary":{
					System.out.println("Female");
					break;
				}
				default:{
					System.out.println("??");
				}
			}
		}catch(Exception e){
			System.out.println("Error7");
			e.printStackTrace();
		}
	}
	public static void switchMonth(){
		final int JANUARY=1,FEBRUARY=2,MARCH=3,APRIL=4,MAY=5,JUNE=6,JULY=7,AUGUST=8,SEPTEMBER=9,OCTOBER=10,NOVEMBER=11,DECEMBER=12;
		// TODO Auto-generated method stub
		int entry=0;
		System.out.println("Enter month (1-12): ");

		try{
			entry=sc.nextInt();
			switch(entry){
				case JANUARY:{
					System.out.println("It is January");
					break;
				}
				case FEBRUARY:{
					System.out.println("It is February");
					break;
				}
				case MARCH:{
					System.out.println("It is March");
					break;
				}
				case APRIL:{
					System.out.println("It is April");
					break;
				}
				case MAY:{
					System.out.println("It is May");
					break;
				}
				case JUNE:{
					System.out.println("It is June");
					break;
				}
				case JULY:{
					System.out.println("It is July");
					break;
				}
				case AUGUST:{
					System.out.println("It is August");
					break;
				}
				case SEPTEMBER:{
					System.out.println("It is September");
					break;
				}
				case OCTOBER:{
					System.out.println("It is October");
					break;
				}
				case NOVEMBER:{
					System.out.println("It is November");
					break;
				}
				case DECEMBER:{
					System.out.println("It is December");
					break;
				}
			}
		}catch(Exception e){
			System.out.println("Error3. ");
			e.printStackTrace();
			run=false;
		}
	}
	public static void switchChar(){
		boolean mathOpOk=true;
		try{
			System.out.println("Enter first integer: ");
			int firstInt=sc.nextInt();
			System.out.println("Enter second integer: ");
			int secondInt=sc.nextInt();
			System.out.println("Enter operation char ");
			char operator=sc.next().charAt(0);
			int answer=0;
			switch (operator){
				case'+':{
					answer=firstInt+secondInt;
					break;
				}
				case'-':{
					answer=firstInt-secondInt;
					break;
				}
				case'*':{
					answer=firstInt*secondInt;
					break;
				}
				case'/':{
					answer=firstInt/secondInt;
					break;
				}
				case'%':{
					answer=firstInt%secondInt;
					break;
				}
				default:{
					System.out.println("Error unidentified Char");
					mathOpOk=false;
				}
			}
			if(mathOpOk){
				System.out.println("Answer= "+answer);
			}
		}catch(Exception e){
			System.out.println("Error4");
			e.printStackTrace();
		}
	}
	public static void switchSquareOrCube(){
		try{
			System.out.println("Enter integer: ");
			int entry=sc.nextInt();
			if (entry<=10&&entry>=1){
				switch (entry%2){
					case 0:{
						System.out.println(Math.pow(entry, 2));
						break;
					}
					case 1:{
						System.out.println(Math.pow(entry, 3));
						break;
					}
				}
			}else{
				System.out.println("Number out of range. ");
			}
		}catch(Exception e)
		{
			run=false;
			System.out.println("Error5");
			e.printStackTrace();
		}
	}
	public static void switchVowelOrConstant(){
		System.out.println("Enter letter: ");
		try{
			char letter=sc.next().toLowerCase().charAt(0);
			if(Character.isLetter(letter)){
				switch(letter){
					case 'a':case'e':case'i':case'o':case'u':{
						System.out.println("It is a vowel.");
						break;
					}
					default:{
						System.out.println("It is a consonant.");
					}
				}
			}else{
				System.out.println("Not a letter at char(0)");
			}
		}catch(Exception e){
			System.out.println("Error 8");
			e.printStackTrace();
			run=false;
		}
	}
	public static void switchDaysInMonth(){
		final int FEBRUARY=2,APRIL=4,JUNE=6,SEPTEMBER=9,NOVEMBER=11;
		try{
			System.out.println("Enter year: ");
			int year=sc.nextInt();
			System.out.println("Enter month: ");
			int month=sc.nextInt();

			boolean leap=(year%4==0);
			if(year%100==0&&year%400!=0){leap=false;}

			if (month<=12&&month>=1){
				switch(month){
					case SEPTEMBER:case APRIL:case JUNE:case NOVEMBER:{
						System.out.println("30 days in this month");
						break;
					}
					case FEBRUARY:{
						if(leap){
							System.out.println("29 days in this month.");
							break;
						}else{
							System.out.println("28 days in this month.");
							break;
						}

					}
					default:{
						System.out.println("31 days in this month.");
						break;
					}
				}
			}else{
				System.out.println("Month value invalid.");
			}
		}catch(Exception e)
		{
			run=false;
			System.out.println("Error6");
			e.printStackTrace();


		}
	}
	public static void switchDaysInMonth(int year,int month){
		final int FEBRUARY=2,APRIL=4,JUNE=6,SEPTEMBER=9,NOVEMBER=11;
		boolean leap=(year%4==0);
		if(year%100==0&&year%400!=0){leap=false;}

		if (month<=12&&month>=1){
			switch(month){
				case SEPTEMBER:case APRIL:case JUNE:case NOVEMBER:{
					System.out.println("30 days in this month");
					break;
				}
				case FEBRUARY:{
					if(leap){
						System.out.println("29 days in this month.");
					}else{
						System.out.println("28 days in this month.");
					}
					break;
				}
				default:{
					System.out.println("31 days in this month.");
				}
			}
		}else{
			System.out.println("Month value invalid.");
		}
	}
	
}

