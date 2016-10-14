package appliedMaths;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DCT {

	private static DecimalFormat df = new DecimalFormat("####0");
	final private int n = 8;
	final private double nD = 8.0;
	static Scanner sc = new Scanner(System.in);

	private static double[][] q50 = { { 16, 11, 10, 16, 24, 40, 51, 61 }, { 12, 12, 14, 19, 26, 58, 60, 55 },
			{ 14, 13, 16, 24, 40, 57, 69, 56 }, { 14, 17, 22, 29, 51, 87, 80, 62 },
			{ 18, 22, 37, 56, 68, 109, 103, 77 }, { 24, 35, 55, 64, 81, 104, 113, 92 },
			{ 49, 64, 78, 87, 103, 121, 120, 101 }, { 72, 92, 95, 98, 112, 100, 103, 99 } };

	public static double[][] calcultateT() {

		double[][] answerArray = new double[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				if (i == 0) {
					answerArray[i][j] = (1 / Math.sqrt(8.0));
				} else {
					answerArray[i][j] = Math.sqrt((2 / 8.0)) * Math.cos((i * Math.PI * (2 * j + 1)) / (2 * 8.0));
				}
			}
		}
		return answerArray;

	}

	public static double[][] generateMatrix(int x, int y) {

		double[][] matrix = new double[x][y];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				System.out.println("Enter value for element [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {

		double[][] answer = new double[matrix1.length][matrix1.length];

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				double sum = 0;
				for (int k = 0; k < answer[0].length; k++) {

					sum += matrix1[i][k] * matrix2[k][j];
					answer[i][j] = sum;
				}
			}
		}
		return answer;

	}

	public static double[][] generateRandomMatrix() {

		double[][] matrix = new double[8][8];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = (int) (255 * Math.random());
			}
		}
		return matrix;
	}

	public static double[][] getQuantizationMatrix() {

		double[][] qLevel = new double[8][8];
		int value = 0;
		System.out.println("Enter Quantization Level 1-100: ");
		double quantizationChoice = sc.nextDouble();

		if (quantizationChoice == 50) {
			qLevel = q50;
		}
		else if (quantizationChoice < 50 && quantizationChoice > 0) {

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {

					int entry = (int) (q50[i][j] * (50 / quantizationChoice));
					qLevel[i][j] = entry;
				}
			}

		} else if (quantizationChoice > 50 && quantizationChoice < 100) {

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {

					int entry = (int) (q50[i][j] * ((100 - quantizationChoice) / 50));
					qLevel[i][j] = entry;
				}
			}

		}

		return qLevel;
	}

	public static double[][] simpleMultiply(double[][] first, double[][] second) {

		double[][] answer = new double[first.length][first.length];
		for (int i = 0; i < first.length; i++) {

			for (int j = 0; j < first.length; j++) {
				answer[i][j] = first[i][j] * second[i][j];
			}
		}
		return answer;
	}

	public static double[][] round(double entry[][]) {
		double[][] answerArray = new double[8][8];
		for (int i = 0; i < entry.length; i++) {
			for (int j = 0; j < entry[0].length; j++) {

				answerArray[i][j] = Math.round(entry[i][j]);
			}
		}
		return answerArray;

	}

	public static double[][] simpleDivide(double[][] first, double[][] quantizeMatrix) {

		double[][] answer = new double[first.length][first.length];
		for (int i = 0; i < first.length; i++) {

			for (int j = 0; j < first.length; j++) {
				answer[i][j] = Math.round(first[i][j] / quantizeMatrix[i][j]);
			}
		}
		return answer;
	}

	public static double[][] transposeMatrix(double[][] matrix) {

		double[][] answer = new double[matrix[0].length][matrix.length];

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

	public static void print(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(df.format(array[i][j]) + "\t");
			}
			System.out.println("");
		}

	}

	public static void print(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(df.format(array[i][j]) + "\t");
			}
			System.out.println("");
		}

	}

}