package agileDesignAndTesting;

public class MarkChecker {

	public int checkMarks(int[] markerOne, int[] markerTwo) {
		boolean firstFlag = false;
		boolean secondFlag = false;
		double sumOne = 0, sumTwo = 0;
		
		
		if(markerOne.length!=5||markerTwo.length!=5){
			throw new IllegalArgumentException("Incorrect Length of Array");
		}
		
		
		for (int i = 0; i < markerOne.length; i++) {
			sumOne += markerOne[i];
			sumTwo += markerTwo[i];
			if (Math.abs(markerOne[i] - markerTwo[i]) > 3) {
				firstFlag = true;

			}
			if (Math.abs(sumOne - sumTwo) > 10) {
				secondFlag = true;

			}
		}
		for (int i = 0; i < markerOne.length; i++) {
			if(markerOne[i]<0){
				throw new IllegalArgumentException("Grade Less than 0 ");
			}
			if(markerOne[i]>20){
				throw new IllegalArgumentException("Grade Greater than 20 ");
			}
		}

		if (firstFlag)
			return 1;
		else if (secondFlag)
			return 2;
		else
			return 0;

	}
}