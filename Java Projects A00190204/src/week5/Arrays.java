package week5;

import java.util.Scanner;

public class Arrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exerciseA();
		// exerciseB();
		// histogram();
		// dynamicHistogram();
		// multiDimensionArray();
		studentGrades();
	}

	public static void exerciseA() {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("");
		for (int element : a) {
			System.out.println(element);
		}
	}

	public static void exerciseB() {
		int[] b = new int[5];
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter Value " + i + ": ");
			b[i] = sc.nextInt();
		}
		for (int elements : b) {
			System.out.println(elements);
		}
		System.out.println("");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void histogram(int[] arrayParam) {
		int n[] = arrayParam;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i]; j++) {

				System.out.print("*");

			}
			System.out.println("");
		}
	}

	public static void dynamicHistogram() {
		System.out.println("Number of elements in the Array?");
		int[] a = new int[sc.nextInt()];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value at (" + i + ")");
			a[i] = sc.nextInt();
		}
		histogram(a);
	}

	public static void multiDimensionArray() {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 7, 8, 9 } };
		System.out.println("The Array values are: ");
		printTheArray(a);
	}

	public static void printTheArray(int[][] aParam) {
		int[][] a = aParam;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("[" + a[i][j] + "]");
			}
			System.out.println("");
		}
	}

	public static void studentGrades() {
		int[][] studentGrades = { { 77, 68, 86, 73 }, { 12, 43, 65, 88 }, { 77, 68, 57, 45 } };
		System.out.println("The Array values are: ");
		printArray(studentGrades);
		System.out.println("Minimum: " + minimum(studentGrades)+"%\n");
		System.out.println("Maximum: " + maximum(studentGrades)+"%\n");
		
		for(int i=0; i<studentGrades.length;i++){
			System.out.println("Average for student ("+(i+1)+") is: "+average(studentGrades[i]));
			
		}
	}

	public static void printArray(int[][] grades) {

		for (int[] student : grades) {
			for (int grade : student) {
				System.out.print(grade + "%\t");
			}
			System.out.println("");

		}
		System.out.println("\n");
	}

	public static int minimum(int[][] grades) {

		int lowestGrade = 0;
		for (int[] student : grades) {
			for (int grade : student) {
				if (lowestGrade == 0 || grade < lowestGrade) {
					lowestGrade = grade;
				}
			}
		}
		return lowestGrade;

	}
	
	public static int maximum(int[][] grades) {

		int highestGrade = 0;
		for (int[] student : grades) {
			for (int grade : student) {
				if ( grade > highestGrade) {
					highestGrade = grade;
				}
			}
		}
		return highestGrade;
	}
	
	public static double average(int[] grades){
		int sum=0;
		for(int grade:grades){
			sum+=grade;
		}
		double average=sum/grades.length;
		return average;
	}

}
