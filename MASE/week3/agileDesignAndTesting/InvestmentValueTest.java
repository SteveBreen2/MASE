package agileDesignAndTesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class InvestmentValueTest {

	
	@Parameters
	private static Object[] getThreeYearValidParameters(){
		return $(
				//Low Boundary
				$(1000,3,1061),
				$(1001,3,1062),
				$(2998,3,3371),
				$(2999,3,3373),
				//Mid Boundary
				$(3000,3,3473),
				$(3001,3,3474),
				$(4998,3,6008),
				$(4999,3,6010),
				//High Boundary
				$(5000,3,6125),
				$(5001,3,6126),
				$(9999,3,12249),
				$(10000,3,12250)
				);
		
	}
	@Parameters
	private static Object[] getFiveYearValidParameters(){
		return $(
				//Low Boundary
				$(1000,5,1104),
				$(1001,5,1105),
				$(2998,5,3717),
				$(2999,5,3718),
				//Mid Boundary
				$(3000,5,3829),
				$(3001,5,3830),
				$(4998,5,6879),
				$(4999,5,6880),
				//High Boundary
				$(5000,5,7013),
				$(5001,5,7014),
				$(9999,5,14024),
				$(10000,5,14026)
				);
		
	}
	@Parameters
	private static Object[] getSevenYearValidParameters(){
		return $(
				//Low Boundary
				$(1000,7,1149),
				$(1001,7,1150),
				$(2998,7,4098),
				$(2999,7,4099),
				//Mid Boundary
				$(3000,7,4221),
				$(3001,7,4223),
				$(4998,7,7876),
				$(4999,7,7877),
				//High Boundary
				$(5000,7,8029),
				$(5001,7,8031),
				$(9999,7,16056),
				$(10000,7,16058)
				);
		
	}
	
	@Parameters
	private static Object[] getInvalidYears(){
		return $(
				$(1000,2,1061),
				$(1001,11,1062)
				);
		
	}
	
	@Parameters
	private static Object[] getInvalidAmount(){
		return $(
				$(999,3,1061),
				$(10001,3,1062)
				);
		
	}
	
	
	
	
	@Test
	@Parameters(method="getThreeYearValidParameters")
	public void testThreeYearValidInvestment(int investmentParam,int durationParam, int answerParam) {
		assertEquals(answerParam,InvestmentValue.calculateInterest(investmentParam, durationParam),.000);
	}
	
	@Test
	@Parameters(method="getFiveYearValidParameters")
	public void testFiveYearValidInvestment(int investmentParam,int durationParam, int answerParam) {
		assertEquals(answerParam,InvestmentValue.calculateInterest(investmentParam, durationParam),.000);
	}
	
	@Test
	@Parameters(method="getSevenYearValidParameters")
	public void testSevenYearValidInvestment(int investmentParam,int durationParam, int answerParam) {
		assertEquals(answerParam,InvestmentValue.calculateInterest(investmentParam, durationParam),.000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getInvalidYears")
	public void calculateMethodThrowsAnIAEForInvalidYears(int investmentParam,int durationParam, int answerParam){
		
		InvestmentValue.calculateInterest(investmentParam, durationParam);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getInvalidAmount")
	public void calculateMethodThrowsAnIAEForInvalidAmount(int investmentParam,int durationParam, int answerParam){
		InvestmentValue.calculateInterest(investmentParam, durationParam);
		
		}

}
