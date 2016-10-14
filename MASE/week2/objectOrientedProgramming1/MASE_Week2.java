package objectOrientedProgramming1;

import java.math.BigDecimal;
import java.util.Scanner;

public class MASE_Week2 {

	static Scanner sc = new Scanner(System.in);

	enum Direction {
		NORTH, SOUTH, EAST, WEST
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// simpleCacls();
		// simpleCalcsShorthand();
		// compareTwoValues();
		// preAndPostDifference();
		// booleanOperators();
		// switchVowelOrConsonant();
		// switchEnumType();
		doubleNotWorking();

	}

	public static void simpleCacls() {
		System.out.println("Enter X: ");
		int x = sc.nextInt();

		System.out.println("Enter Y: ");
		int y = sc.nextInt();

		int sum = x + y;
		int diff = x - y;
		int product = x * y;
		int quotient = x / y;

		System.out.println("The sum of " + x + " and " + y + " is " + sum);
		System.out.println("The diff of " + x + " and " + y + " is  " + diff);
		System.out.println("The product of " + x + " and " + y + " is " + product);
		System.out.println("The quotient of " + x + " and " + y + " is " + quotient);

	}

	public static void simpleCalcsShorthand() {
		System.out.println("Enter X: ");
		int x = sc.nextInt();

		System.out.println("Enter Y: ");
		int y = sc.nextInt();

		int sum = x, diff = x, product = x, quotient = x;

		sum += y;
		diff -= y;
		product *= y;
		quotient /= y;

		System.out.println("The sum of " + x + " and " + y + " is " + sum);
		System.out.println("The diff of " + x + " and " + y + " is  " + diff);
		System.out.println("The product of " + x + " and " + y + " is " + product);
		System.out.println("The quotient of " + x + " and " + y + " is " + quotient);

	}

	public static void compareTwoValues() {
		System.out.println("Enter X: ");
		int x = sc.nextInt();

		System.out.println("Enter Y: ");
		int y = sc.nextInt();

		if (x != y) {
			System.out.println("The larger number is " + Math.max(x, y));
		} else {
			System.out.println("They are equal");
		}

	}

	public static void preAndPostDifference() {

		int x = 5;
		int y = 10;

		System.out.println("X is " + x);
		System.out.println("++X is " + ++x);
		System.out.println("X++ is " + x++);
		System.out.println("X is " + x);
		System.out.println("\n");
		System.out.println("Y is " + y);
		System.out.println("++Y is " + --y);
		System.out.println("Y++ is " + y--);
		System.out.println("Y is " + y);

	}

	public static void booleanOperators() {

		int w = 20, x = 10, y = -5, z = 0;
		System.out.println("W=20, X=10, Y=-5, Z=0");
		System.out.println("Boolean Expression (w==x&&y!=z) :" + (w == x && y != z));
		System.out.println("Boolean Expression (w==x||y!=z) :" + (w == x || y != z));
		System.out.println("Boolean Expression !(w==(x+z))  :" + !(w == (x + z)));

	}

	public static void switchVowelOrConsonant() {
		System.out.println("Enter a character");
		char entry = sc.next().charAt(0);

		switch (entry) {
			default:
				System.out.println(entry + " is a consonant");
				break;
			case 'a':
			case 65:
			case 'e':
			case 69:
			case 'i':
			case 73:
			case 'o':
			case 79:
			case 'u':
			case 85:
				System.out.println(entry + " is a vowel");

		}

	}

	public static void switchEnumType() {

		Direction theWay = null;

		System.out.println("Enter The Direction (North|South|East|West) : ");
		String nsew = sc.next().toUpperCase();

		switch (nsew) {
			case "NORTH":
				theWay = Direction.NORTH;
				break;
			case "SOUTH":
				theWay = Direction.SOUTH;
				break;
			case "EAST":
				theWay = Direction.EAST;
				break;
			case "WEST":
				theWay = Direction.WEST;
				break;
			default:
				System.out.println(nsew + " is not recognised");
				break;
		}

		switch (theWay) {
			case NORTH:
				System.out.println("Santy....");
				break;
			case SOUTH:
				System.out.println("Penguins....");
				break;
			case EAST:
				System.out.println("The land of the rising sun....");
				break;
			case WEST:
				System.out.println("Brangelina....");
				break;
		}

	}

	public static void doubleNotWorking(){
		double total=0,x=5.6,y=5.8;
		//total=x+y;
//		BigDecimal bdx=new BigDecimal(x);
//		BigDecimal bdy=new BigDecimal(y);
//		
//		BigDecimal bdTotal=bdy.add(bdx);
//		
////		System.out.println("Total equals: "+total);
//		System.out.println("Big Decimal Y equals: "+bdTotal);
		
//		BigDecimal x=new BigDecimal("5.6");
//		BigDecimal y=new BigDecimal("5.8");
//		System.out.println("Total equals: "+total);
		Double wx=new Double (x);
		BigDecimal bdx= new BigDecimal(wx.toString());
//		BigDecimal bdx=new BigDecimal(new Double(x).toString() );
		BigDecimal bdy=new BigDecimal(new Double(y).toString() );
		
		BigDecimal bdTotal=bdx.add(bdy);
		System.out.println("Big Decimal Total: "+bdTotal);
		
		
		
		
	}
}
