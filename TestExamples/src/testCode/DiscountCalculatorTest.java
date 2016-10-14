package testCode;

import static org.junit.Assert.*;

import org.junit.Test;

import productionCode.DiscountCalculator;

public class DiscountCalculatorTest {


	@Test
	public void testGoldHighValue() {
		DiscountCalculator d=new DiscountCalculator();
		assertEquals((250.0*.8),d.Calculate('G', 250),0);
		
	}
	@Test
	public void testGoldMidalue() {
		DiscountCalculator d=new DiscountCalculator();
		assertEquals((100*.8),d.Calculate('G', 100),0);
		
	}
	@Test
	public void testGoldLowValue() {
		DiscountCalculator d=new DiscountCalculator();
		assertEquals((250.0*.8),d.Calculate('G', 250),0);
		
	}
	@Test
	public void testSilverHighValue() {
		DiscountCalculator d=new DiscountCalculator();
		assertEquals((250.0*.8),d.Calculate('G', 250),0);
		
	}
	@Test
	public void testSilverLowValue() {
		DiscountCalculator d=new DiscountCalculator();
		assertEquals((250.0*.8),d.Calculate('G', 250),0);
		
	}
	@Test
	public void testBronzeHighValue() {
		DiscountCalculator d=new DiscountCalculator();
		assertEquals((250.0*.8),d.Calculate('G', 250),0);
		
	}
	@Test
	public void testBronzeLowValue() {
		DiscountCalculator d=new DiscountCalculator();
		assertEquals((250.0*.8),d.Calculate('G', 250),0);
		
	}

}
