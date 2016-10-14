import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodExercises {

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat dc = new DecimalFormat("###.##");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterativeFunctions();
		loopFunctions();

	}

	public static void iterativeFunctions() {
		// maths();
		// cylinder();
		// carPark();
		// coordinateGeometry();
		// hypotenuse();
		// exponents();
		// sumOfRequestedNumbers();
		// squareOverloaded();
	}

	public static void loopFunctions() {
		// whileLoop1();
		// whileLoop2();
		// whileLoop3();
		// doWhileLoop1();
		// doWhileLoop2();
		// doWhileLoop3();
		// forLoop1();
//		forLoop2();
//		forLoop3();
		//forLoop4();
		histogram();
	}

	public static void maths() {
		System.out.println("Enter First Number: ");
		double x = sc.nextDouble();

		System.out.println("Enter Second Number: ");
		double y = sc.nextDouble();

		System.out.println("Sum: " + calculateSum(x, y));
		System.out.println("Difference: " + calculateDifference(x, y));
		System.out.println("Product: " + calculateProduct(x, y));
		System.out.println("Quotient: " + calculateQuotient(x, y));

	}

	public static void cylinder() {
		System.out.println("Enter length: ");
		double x = sc.nextDouble();

		System.out.println("Enter width: ");
		double y = sc.nextDouble();

		System.out.println("Enter height: ");
		double z = sc.nextDouble();

		System.out.println("Volume: " + calculateVolume(x, y, z));

	}

	public static void carPark() {
		System.out.println("Enter number of cars: ");
		int numberOfCars = sc.nextInt();
		double sum = 0.0;
		for (int i = 0; i < numberOfCars; i++) {
			System.out.println("How long was car [" + i + "] parked for: ");
			double parkingDuration = sc.nextDouble();
			double cost = calculateCharges(parkingDuration);
			System.out.println("Cost for car [" + i + "]: $" + cost + "\n");
			sum += cost;
		}
		System.out.println("Total Cost: $" + sum);

	}

	public static void hypotenuse() {

		double adjacent;
		System.out.println("Enter Adjacent");
		adjacent = sc.nextDouble();
		double opposite;
		System.out.println("Enter Opposite");
		opposite = sc.nextDouble();
		System.out.println("Hypotenuse: " + calculateHypotenuse(adjacent, opposite));

	}

	public static void exponents() {
		System.out.println("Enter base: ");
		double base = sc.nextDouble();
		System.out.println("Enter exponent: ");
		double exponent = sc.nextDouble();

		System.out.println("Using Math.pow: " + calculateExponential(base, exponent, true));
		System.out.println("Without using Math.pow: " + calculateExponential(base, exponent, false));

	}

	public static void coordinateGeometry() {
		double[] x = { 0, 0 };
		double[] y = { 0, 0 };

		System.out.println("Enter X1: ");
		x[0] = sc.nextDouble();
		System.out.println("Enter X2: ");
		x[1] = sc.nextDouble();
		System.out.println("Enter Y1: ");
		y[0] = sc.nextDouble();
		System.out.println("Enter Y2: ");
		y[1] = sc.nextDouble();

		System.out.println("Linear Distance= " + dc.format(calculateLinearDistance(x, y)));
		System.out.println(
				"Mid Point= X: " + calculateLinearMidPoint(x, y)[0] + " Y: " + calculateLinearMidPoint(x, y)[1]);
		System.out.println("Linear Slope= " + calculateLinearSlope(x, y));

	}

	public static void sumOfRequestedNumbers() {

		MethodExercises m = new MethodExercises();
		System.out.println("Enter amount of numbers in list: ");
		int n = sc.nextInt();
		System.out.println("The sum of the " + n + " values entered is " + m.sumTheValues(n));

	}

	public static void squareOverloaded() {
		MethodExercises m = new MethodExercises();
		System.out.println("Enter double to be squared: ");
		double subjectDouble = sc.nextDouble();
		System.out.println(subjectDouble + " squared= " + m.square(subjectDouble));
		System.out.println("Enter int to be squared: ");
		double subjectInt = sc.nextDouble();
		System.out.println(subjectInt + " squared= " + m.square(subjectInt));
	}

	public static void forLoop4() {
		int sum = 0;
		for (;;) {
			System.out.println("Input a number:");
			try {
				int entry = sc.nextInt();

				if (entry < 0) {
					break;
				}
				sum += entry;
			}

			catch (InputMismatchException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Total is "+sum);

	}

	public static double calculateSum(double x, double y) {
		return x + y;
	}

	public static double calculateProduct(double x, double y) {
		return x * y;
	}

	public static double calculateDifference(double x, double y) {
		return x - y;
	}

	public static double calculateQuotient(double x, double y) {
		return x / y;
	}

	public static double calculateVolume(double x, double y, double z) {
		return x * y * z;
	}

	public static double calculateCharges(double duration) {
		final int FREE_HOUR = 1, FULL_DAY = 8, MAX_CHARGE = 21, HOURLY_FEE = 3;

		duration = Math.ceil(duration);

		// MORE THAN 8 21
		// 2-8 3
		if (duration >= FULL_DAY) {
			return MAX_CHARGE;
		} else {
			duration -= FREE_HOUR;
			if (HOURLY_FEE * duration > 0) {
				return 0;
			}
			return HOURLY_FEE * duration;

		}

	}

	public static double calculateLinearDistance(double[] x, double[] y) {
		return Math.sqrt(Math.pow((x[0] - y[0]), 2) + Math.pow((x[1] - y[1]), 2));
	}

	public static double[] calculateLinearMidPoint(double[] x, double[] y) {
		double[] midpoint = { 0, 0 };
		midpoint[0] = x[0] + y[0] / 2;
		midpoint[1] = x[1] + y[1] / 2;
		return midpoint;
	}

	public static double calculateLinearSlope(double[] x, double[] y) {

		if (x[0] != y[0]) {
			return (x[1] - y[1]) / (x[0] - y[0]);
		} else {
			System.out.println("Avoiding Dividing by 0");
		}
		return 0;
	}

	public static double calculateHypotenuse(double adjacent, double opposite) {
		return Math.hypot(adjacent, opposite);

	}

	public static double calculateExponential(double base, double exponent, boolean useMathLib) {

		double answer = base;
		if (useMathLib) {
			return Math.pow(base, exponent);
		} else {
			for (int i = 1; i < exponent; i++) {
				answer *= base;
			}
		}
		return answer;
	}

	public double sumTheValues(int n) {
		double sum = 0;
		for (int i = 0; i < n; i++) {

			System.out.println("Enter value of number " + (i + 1) + ": ");
			sum += sc.nextDouble();
		}
		return sum;
	}

	public double square(double subject) {

		return Math.pow(subject, 2);
	}

	public int square(int subject) {

		return (int) Math.pow(subject, 2);
	}

	public static void whileLoop1() {
		int i = 1;
		int sum = 1;
		int total = 0;
		while (i <= 5) {
			System.out.println("Loop1: " + i + " == " + i);
			total += i;
			i++;
		}
		System.out.println("Total: " + total + "\n");

		total = 0;
		i = 1;
		System.out.println("Enter Amount  to iterate by: ");
		try {
			int n = sc.nextInt();
			while (i <= 5) {
				total += sum;
				System.out.println("Loop2: " + i + " == " + sum);
				sum += n;
				i++;
			}
			System.out.println("Total: " + total + "\n");
		} catch (Exception e) {
			System.out.println("Caught Exception");
		}
	}

	public static void whileLoop2() {
		int i = 5;
		int sum = 1;
		int total = 0;
		while (i >= 1) {
			System.out.println("Loop1: " + i + " == " + i);
			total += i;
			i--;
		}
		System.out.println("Total: " + total + "\n");

		i = 5;
		System.out.println("Enter Amount  to decrement by: ");
		try {
			int n = sc.nextInt();
			total = i * n;
			while (i >= 1) {
				System.out.println("Loop2: " + i + " == " + total);
				total -= n;

				i--;
			}
			System.out.println("Total: " + total + "\n");
		} catch (Exception e) {
			System.out.println("Caught Exception");
		}
	}

	public static void whileLoop3() {

		int total = 0;
		System.out.println("Enter a number: ");
		try {
			int entry = sc.nextInt();

			while (entry >= 0) {
				total += entry;
				System.out.println("Enter another number");
				entry = sc.nextInt();
			}
			System.out.println("Total: " + total);
		} catch (InputMismatchException e) {
			e.printStackTrace();

		}
	}

	public static void doWhileLoop1() {
		int i = 1;
		int sum = 1;
		int total = 0;
		do {
			System.out.println("Loop1: " + i + " == " + i);
			total += i;
			i++;
		} while (i <= 5);

		System.out.println("Total: " + total + "\n");

		total = 0;
		i = 1;
		System.out.println("Enter Amount  to iterate by: ");
		try {
			int n = sc.nextInt();
			do {
				total += sum;
				System.out.println("Loop2: " + i + " == " + sum);
				sum += n;
				i++;
			} while (i <= 5);
			System.out.println("Total: " + total + "\n");
		} catch (Exception e) {
			System.out.println("Caught Exception");
		}
	}

	public static void doWhileLoop2() {
		int i = 5;
		int sum = 1;
		int total = 0;
		do {
			System.out.println("Loop1: " + i + " == " + i);
			total += i;
			i--;
		} while (i >= 1);
		System.out.println("Total: " + total + "\n");

		i = 5;
		System.out.println("Enter Amount  to decrement by: ");
		try {
			int n = sc.nextInt();
			total = i * n;
			System.out.println("Total: " + total + "\n");
			do {
				System.out.println("Loop2: " + i + " == " + total);
				total -= n;

				i--;
			} while (i >= 1);
		} catch (Exception e) {
			System.out.println("Caught Exception");
		}
	}

	public static void doWhileLoop3() {

		int total = 0;
		System.out.println("Enter a number: ");
		try {
			int entry = sc.nextInt();

			do {
				if (entry < 0) {
					break;
				}
				total += entry;
				System.out.println("Enter another number");
				entry = sc.nextInt();
			} while (entry >= 0);
			System.out.println("Total: " + total);
		} catch (InputMismatchException e) {
			e.printStackTrace();

		}
	}

	public static void forLoop1() {
		// TODO Auto-generated method stub

		int total = 0;
		for (int i = 1; i <= 20; i++) {
			total += i;
		}
		System.out.println("Total: " + total);
		total = 0;
		for (int i = 5; i <= 20; i += 5) {
			total += i;
		}
		System.out.println("Total: " + total);
	}

	public static void forLoop2() {
		// TODO Auto-generated method stub

		int total = 0;
		for (int i = 40; i >= 30; i--) {
			total += i;
		}
		System.out.println("Total: " + total);
		total = 0;
		for (int i = 40; i >= 30; i -= 5) {
			total += i;
		}
		System.out.println("Total: " + total);
	}

	public static void forLoop3() {
		// TODO Auto-generated method stub

		int total = 0;
		for (int i = 40; i >= 30; i--) {
			total += i;
		}
		System.out.println("Total: " + total);
		total = 0;
		for (int i = 40; i >= 30; i -= 5) {
			total += i;
		}
		System.out.println("Total: " + total);
	}

	public static void histogram(){
		try{
		System.out.println("Enter rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter columns: ");
		int columns=sc.nextInt();
		
		System.out.println("\n--------For Loop--------\n");
		for (int i=0;i<rows;i++){
			for (int j=0;j<columns;j++){
			System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n--------While Loop--------\n");
		int columnCount=columns;
		while (rows>0){
			
			while(columnCount>0){
				System.out.print("*");
				columnCount--;
			}
			rows--;
			System.out.println("");
			columnCount=columns;
		}
		
		}
		catch(InputMismatchException e){
			e.printStackTrace();
		}
		
		
		
	}
}
