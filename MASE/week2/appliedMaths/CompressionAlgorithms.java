package appliedMaths;

import java.text.DecimalFormat;

public class CompressionAlgorithms {

	static DecimalFormat df = new DecimalFormat("####0.000");

	public static void main(String args[]) {

//		double[][] example = { { 24, 8, 10, 6, 5, 19, 24, 10 }, { 6, 14, 6, 19, 23, 5, 23, 5 },
//				{ 21, 17, 20, 23, 25, 13, 5, 16 }, { 7, 17, 23, 10, 19, 13, 23, 21 }, { 19, 14, 23, 16, 9, 22, 20, 11 },
//				{ 12, 25, 7, 18, 21, 25, 18, 11 }, { 16, 7, 12, 7, 19, 13, 9, 5 }, { 25, 7, 24, 6, 9, 9, 24, 11 } };

		double[][] example2 = { { 154, 123, 123, 123, 123, 123, 123, 136 }, { 192, 180, 136, 154, 184, 154, 136, 110 },
				{ 254, 198, 154, 154, 180, 154, 123, 123 }, { 239, 180, 136, 180, 180, 166, 123, 123 },
				{ 180, 154, 136, 167, 166, 149, 136, 136 }, { 128, 136, 123, 136, 154, 180, 198, 154 },
				{ 123, 105, 110, 149, 136, 136, 180, 166 }, { 110, 136, 123, 123, 123, 136, 154, 136 } };

		decompress(compress(example2));

	}

	public static double[][] compress(double[][] example) {

		System.out.println("Original:\n");
		DCT.print(example);
		System.out.println("\n");
		double[][] t = DCT.calcultateT();
		double[][] tm = DCT.multiplyMatrices(t, example);
		double[][] tmt = DCT.multiplyMatrices(tm, DCT.transposeMatrix(DCT.calcultateT()));
		double[][] quantizeMatrix = (DCT.getQuantizationMatrix());
		double[][] answer = DCT.simpleDivide(tmt, quantizeMatrix);
		System.out.println("Answer");
		System.out.println("\n");
		DCT.print(answer);
		System.out.println("\n");
		return answer;

	}

	public static void decompress(double[][] example) {

		System.out.println("Original:\n");
		DCT.print(example);
		System.out.println("\n");
		double[][] t = DCT.calcultateT();

		double[][] quantizeMatrix = (DCT.getQuantizationMatrix());

		double[][] r = DCT.simpleMultiply(example, quantizeMatrix);

		double[][] rtT = DCT.multiplyMatrices(DCT.transposeMatrix(DCT.calcultateT()), r);

		double[][] trtT = DCT.multiplyMatrices(rtT,t );
		double[][] answer = DCT.round((trtT));
		System.out.println("Answer");
		System.out.println("\n");
		DCT.print(answer);

	}

}
