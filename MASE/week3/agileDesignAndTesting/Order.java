package agileDesignAndTesting;

public class Order {

	public double calculateOrderTotal(int numCartridge) {
		double orderTotal = 0;

		if (numCartridge < 5) {
			throw new IllegalArgumentException("Insufficient Ordered");
		} else if (numCartridge > 500) {
			throw new IllegalArgumentException("Too Many Ordered");
		} else if (numCartridge < 100) {
			orderTotal = numCartridge * 10;
		} else if (numCartridge >= 100) {
			orderTotal = numCartridge * 9;
		}
		return orderTotal;

	}
}
