package agileDesignAndTesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class OrderTest {

	@Parameters
	public static Object[] orderParams() {
		return $($(5, 50), $(6, 60), $(99, 990), $(100, 900), $(101, 909), $(499, 4491), $(500, 4500));

	}
	
	@Parameters
	public static Object[] orderParamsFailures() {
		return $($(4), $(501) );
		
	}
	


	@Test
	@Parameters(method = "orderParams")
	public static void test(int num,double total) {
		Order o=new Order();
		assertEquals(total,o.calculateOrderTotal(num),0.00001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method = "orderParamsFailures")
	public static void test2(int num,double total) {
		Order o=new Order();
		o.calculateOrderTotal(num);
	}
}

/*
 * 4,5,6 99,100,101 299,500,501
 */