package week4;

import java.util.Scanner;

public class WhileProgram{
	static Scanner sc=new Scanner(System.in);

	public static void main(String args[]){

	//	boolean run=true;

		//		ThirdOrderPolynomial();
		//		WhileGrades();
		//		WhileHistogram();
		//		WhileLargestSmallest();
		//WhileSales();
		//System.out.println("Total= "+WhileSquares(1,5));
		System.out.println("Enter number of iterations: ");
		int count=sc.nextInt();
		
		System.out.println("Average: "+WhileAverageSentinel(count));	

//		while (run){
//			System.out.print("Enter Sale Value: ");
//			run=WhileSales(sc.nextDouble());
//		}
	}
	public static void ThirdOrderPolynomial(){
		double a,b,c,d,x,fx;
		String entry;
		boolean run=true;

		System.out.print("Enter value for a: ");
		a=sc.nextDouble();
		System.out.print("Enter value for b: ");
		b=sc.nextDouble();
		System.out.print("Enter value for c: ");
		c=sc.nextDouble();
		System.out.print("Enter value for d: ");
		d=sc.nextDouble();

		while (run){

			System.out.print("Enter value for x: ");
			x=sc.nextDouble();

			fx=(Math.pow(a*x,3)+Math.pow(b*x,2)+c*x+d);
			System.out.println("FX: "+fx);
			System.out.println("Continue? (y/n)");
			entry=sc.next().toLowerCase();
			if(entry.equals("n")){run=false;}
			else if(entry.equals("y")){run=true;}
			else{System.out.println("Incorrect input exiting");break;}
		}
	}

	public static void WhileAverage(){
		int numberOfEntries;
		double currentEntry = 0,total = 0;

		System.out.println("Enter number of entries: ");
		numberOfEntries=sc.nextInt();

		for(int i=0;i<numberOfEntries;i++){
			System.out.println("Enter number("+i+")");
			total+=currentEntry;
		}
		System.out.println("Average: "+(total/numberOfEntries));
	} 

	public static void WhileGrades(){
		boolean run=true;
		int a = 0,b=0,c=0,d=0,e=0,f=0;
		String holder="";
		while (run){
			System.out.println("Enter your grade (A,B,C,D,E,F) (X:Exit)");
			holder=sc.next().toLowerCase();

			switch (holder){
				case "a":
					a++;
					break;
				case "b":
					b++;
					break;
				case "c":
					c++;
					break;
				case "d":
					d++;
					break;
				case "e":
					e++;
					break;
				case "f":
					f++;
					break;
				case "x":
					run=false;
			}

		}
		System.out.println("A: "+a+"\nB: "+b+"\nC: "+c+"\nD: "+d+"\nE: "+e+"\nF :"+f);
	}
	public static void WhileHistogram(){
		int columns=0,rows=0,columnCounter=0,rowCounter=0;
		final String STAR="*";


		System.out.println("Enter column count: ");
		columns=sc.nextInt();
		System.out.println("Enter row count: ");
		rows=sc.nextInt();

		while (rowCounter<rows){
			columnCounter=0;
			System.out.print("\n");
			rowCounter++;
			while(columnCounter<columns){
				System.out.print(STAR);
				columnCounter++;
			}
		}
	}
	public static void WhileLargestSmallest(){
		int numberCount=0,numberMax=0,smallest=0,largest=0,current=0;

		System.out.println("Enter Number count: ");
		numberMax=sc.nextInt();

		while(numberCount<numberMax){
			System.out.println("Enter Number("+(numberCount+1)+"): ");
			current=sc.nextInt();
			if(current<0)
			{
				System.out.println("Number entered was negative ("+current+")");
				break;
			}
			if(current<smallest||smallest==0)
			{
				smallest=current;
			}
			else if(current>largest||largest==0)
			{
				largest=current;
			}

			numberCount++;
		}
		System.out.println("Smallest="+smallest);
		System.out.println("Largest="+largest);

	}
	public static boolean WhileSales(double salesParam){

		final double SALARY=3000;
		final double COMMISSION=.09;
	
		
			while(salesParam!=-1){

				System.out.println("Salary: "+(SALARY+(salesParam*COMMISSION)));
				return true;
			}
		System.out.println("Exiting");	
		return false;
	}
	public static double WhileSquares(int min,int max){
		double total=0;

		while(min<=max){
			total+=Math.pow(min,2);
			System.out.println("Current "+Math.pow(min,2)+"\n+");
			min++;
		}
		return total;
	}
	public static double WhileAverageSentinel(int counterParam){
		
		double current=0,average=0,total=0;

		int count=0;
		outerloop:
			while(count<counterParam){
				System.out.println("Enter Number(-1:Exit): ");
				current=sc.nextDouble();
				if(current==-1){
					
					break outerloop;
				}
				count++;
				total+=current;
			}
		if (count>=1){
			average=(total/count);
			return average;
		}
		else
			return 0;
	}
}