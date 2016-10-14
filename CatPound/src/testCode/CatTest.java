package testCode;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import productionCode.Cat;

public class CatTest {

	
	private Cat cat;
	@Before
	public void setup(){
		cat = new Cat("Tom", 3, "Black");
	}
	
	@Test
	public void testCatConstructed() {		
		assertEquals("Tom", cat.getName());
		assertEquals("Black", cat.getColor());
		assertEquals(3, cat.getAge());
	}
	@Test
	public void testCatColorChange() {
		
		cat.setColor("Brown");
		assertEquals("Brown", cat.getColor());
	}
	@Test
	public void testCatNameChange() {
		
		cat.setName("James");
		assertEquals("James", cat.getName());
	}
	@Test
	public void testCatAgeChange() {
		Cat cat = new Cat("Tom", 3, "Black");
		cat.setAge(4);
		assertEquals(4, cat.getAge());
	}

}
