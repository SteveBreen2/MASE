package appliedMaths;

import java.util.Scanner;

public class Matrices {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Enter Matrix Size: ");
		int size = sc.nextInt();

		int[][] matrix1 = generateRandomMatrix(size);
		int[][] matrix2 = generateRandomMatrix(size);

		
//		System.out.println("Enter number of columns:");
//		int columns=sc.nextInt();
//		System.out.println("Enter number of rows:");
//		int rows=sc.nextInt();
//		int[][] customMatrix=generateMatrix(rows,columns);
		
//		printMatrix(customMatrix);
		
		System.out.println("----Matrix 1----");
		printMatrix(matrix1);
		// System.out.println("----Matrix 2----");
		// printMatrix(matrix2);
		// System.out.println("----Addition of Matrix 1 and Matrix 2----");
		// printMatrix(addMatrices(matrix1, matrix2));
		// System.out.println("----Product of Matrix 1 and Matrix 2----");
		// printMatrix(multiplyMatrices(matrix1, matrix2));
		// System.out.println("----Quotient of Matrix 1 and Matrix 2----");
		// printMatrix(divideMatrices(matrix1, matrix2));
		// System.out.println("----Min Value of Matrix 1----");
		// System.out.println((minValue(matrix1)));
		// System.out.println("----Max Value of Matrix 1----");
		// System.out.println((maxValue(matrix1)));
		// System.out.println("----Average Value of Matrix 1----");
		// System.out.println((avgValue(matrix1)));
		// System.out.println("----Transpose of Matrix 1----");
		// printMatrix(transposeMatrix(matrix1));
		System.out.println("----Inverse of Matrix 1----");
		printMatrix(inverseMatrix(matrix1));

	}

	public static int[][] generateRandomMatrix(int sizeParam) {

		int[][] matrix = new int[sizeParam][sizeParam];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = (int) (10 * Math.random());
			}
		}
		return matrix;
	}
	
	public static int[][] generateMatrix(int x,int y) {
		
		int[][] matrix = new int[x][y];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				
				System.out.println("Enter value for element ["+i+"]["+j+"]");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {

		int[][] answer = new int[matrix1.length][matrix1[0].length];
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				answer[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return answer;
	}

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {

		int[][] answer = new int[matrix1.length][matrix1[0].length];

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < answer[0].length; k++) {

					sum += matrix1[i][k] * matrix2[k][j];
					answer[i][j] = sum;
				}
			}
		}
		return answer;

	}

	
	public static int[][] transposeMatrix(int[][] matrix) {

		int[][] answer = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {

				if (i == j) {
					answer[i][j] = matrix[i][j];
				} else {
					answer[i][j] = matrix[j][i];
				}

			}
		}
		return answer;

	}

	// Only works with 2x2 for now
	public static int[][] inverseMatrix(int[][] matrix) {

		int[][] answer = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {

				if ((i % 2 == 0 && j % 2 == 1)||i % 2 == 1 && j % 2 == 0) {
					System.out.println("1");
					answer[i][j] = -matrix[j][i];
				} else if (i % 2 == 0 && j % 2 == 0) {
					System.out.println("2");
					answer[i][j] = matrix[j+1][i+1];
					answer[j+1][i+1] = matrix[i][j];

				}
				else{System.out.println("missed");}

			}
		}
		return answer;

	}
	
	

	public static int minValue(int[][] matrix) {

		int min = 999;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				System.out.println("[" + i + "]" + "[" + j + "]" + matrix[i][j]);
				if (matrix[i][j] < min || min == 999) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	public static int maxValue(int[][] matrix) {

		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				System.out.println("[" + i + "]" + "[" + j + "]" + matrix[i][j]);
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	public static double avgValue(int[][] matrix) {

		double sum = 0;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				System.out.println("[" + i + "]" + "[" + j + "]" + matrix[i][j]);
				count++;
				sum += matrix[i][j];

			}
		}
		double average = sum / count;
		return average;
	}

}
