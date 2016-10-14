package agileDesignAndTesting;

import static org.junit.Assert.*;

import junitparams.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {
	private final static int VALID_AMOUNT=5;
	private final static String VALID_CURRENCY="USD";
	public static Money m = new Money(10, "USD");

	@Parameters
	private static final Object[] getMoney() {

		return $(

				$(10, "USD"), $(20, "EUR"), $(15, "GBP"),

				$(20, "USD"), $(15, "EUR"), $(10, "GBP"),

				$(10, "EUR"), $(20, "GBP"), $(15, "USD"));

	}

	@Parameters
	private static final Object[] getCurrencyEqualAndAmountNotEqualParams() {

		return $(

				$(1,2, "USD"),
				$(2,1, "USD"),
				$(3,1, "USD"),
				$(4,1, "USD"),
				$(5,1, "USD"),
				$(6,1, "USD"),
				$(7,1, "USD"),
				$(8,1, "USD"),
				$(9,1, "USD")
				);

	}

	@Parameters
	private static final Object[] getAmountEqualAndCurrencyNotEqualParams() {

		return $(

				$(10, "EUR","USD"), $(10, "GBP","USD"), $(10, "PKR","USD"), $(10, "JDR","USD"), $(10, "ADL","USD"));

	}
	@Parameters
	private static final Object[] getInvalidAmount() {

		return new Integer[][]{{-1234234},{-5},{-1}};

	}
	@Parameters
	private static final Object[] getInvalidCurrency() {
		
		return new String[][]{{null,""}};
		
	}
	
	
	
	
	
	

	@Test
	@Parameters(method = "getMoney")
	public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
		Money money = new Money(amount, currency);

		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());

	}


	@Test
	@Parameters(method = "getCurrencyEqualAndAmountNotEqualParams")
	public void currencyEqualAndAmountsNotEqual(int amount,int amount2, String currency) {
		Money m = new Money(amount, currency);
		Money m2 = new Money(amount2, currency);
		assertNotEquals(m.getAmount(),(m2.getAmount()));
	}

	@Test
	@Parameters(method = "getAmountEqualAndCurrencyNotEqualParams")
	public void amountsEqualAndCurrencyNotEqual(int amount, String currency,String currency2) {
		Money m = new Money(amount, currency);
		Money m2 = new Money(amount, currency2);
		assertNotEquals(m.getCurrency(),(m2.getCurrency()));
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getInvalidAmount")
	public void constructorThrowsAnIAEForInvalidAmunt(int invalidAmount){
		
		new Money(invalidAmount,VALID_CURRENCY);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getInvalidCurrency")
	public void constructorThrowsAnIAEForInvalidCurrency(String invalidCurrency){
		
		Money m=new Money(VALID_AMOUNT,invalidCurrency);
		
	}

}
