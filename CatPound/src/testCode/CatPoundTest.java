package testCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import productionCode.Cat;
import productionCode.CatPound;

public class CatPoundTest {

	private CatPound testCatPound;
	private Cat testCat,testCat2;
	@Before
	public void setup() {
		testCatPound=new CatPound();
		testCat=new Cat("Cat",6,"Brown");
		testCat2=new Cat("Other Cat",7,"Brown");
	}
	@Test
	public void testNoCatsInPound(){
		assertEquals(0,testCatPound.getNumberOfCats());
	}
	@Test
	public void testAddCat(){
		testCatPound.addCat(testCat);
		assertEquals(1,testCatPound.getNumberOfCats());
		testCatPound.addCat(testCat2);
		assertEquals(2,testCatPound.getNumberOfCats());
	}
	@Test
	public void testRemoveCat(){
		
		testCatPound.addCat(testCat);
		testCatPound.removeCat(testCat2);
		assertEquals(1,testCatPound.getNumberOfCats());
		testCatPound.removeCat(testCat);
		assertEquals(0,testCatPound.getNumberOfCats());
	}
	@Test
	public void testSearchForCat(){
		testCatPound.addCat(testCat);
		assertTrue(testCatPound.searchForCat("Cat"));
		assertFalse(testCatPound.searchForCat("James"));
	}
	@Test
	public void testFindCat(){
		testCatPound.addCat(testCat);
		assertTrue(testCatPound.findCat(testCat));
		assertFalse(testCatPound.findCat(testCat2));
	}
	@Test
	public void testCullCats(){
		testCatPound.addCat(testCat);
		testCatPound.addCat(testCat2);
		assertEquals(1,testCatPound.getNumberOlderThan(6));
		
	}

}
