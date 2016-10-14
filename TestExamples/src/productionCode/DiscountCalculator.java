package productionCode;

public class DiscountCalculator {

	public double Calculate(char customerType, int subtotal) {
		double total = 0;
		final double DISCOUNT_20 = .8;
		final double DISCOUNT_10 = .9;
		final double DISCOUNT_5 = .95;
		final double DISCOUNT_0 = 1;

		if (customerType == ('G')) {
			if (subtotal >= 250) {
				total = subtotal * DISCOUNT_20;
				System.out.println(total);
			} else if (subtotal >= 100) {
				total = subtotal * DISCOUNT_10;
			} else {
				total = subtotal * DISCOUNT_5;
			}
		} else if (customerType == ('S')) {
			if (subtotal >= 200) {
				total = subtotal * DISCOUNT_10;
			} else if (subtotal >= 100) {
				total = subtotal * DISCOUNT_5;
			} else {
				total = subtotal * DISCOUNT_0;
			}
		} else if (customerType == ('B')) {
			if (subtotal >= 300) {
				total = subtotal * DISCOUNT_5;
			} else {
				total = subtotal * DISCOUNT_0;
			}
		}

		return total;

	}
}
