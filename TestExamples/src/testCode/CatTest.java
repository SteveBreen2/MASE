package testCode;
import static org.junit.Assert.*;

import org.junit.Test;

import productionCode.Cat;

public class CatTest {

	@Test
	public void testCatConstructed() {
		Cat cat = new Cat("Tom", 3, "Black");
		assertEquals("Tom", cat.getName());
		assertEquals("Black", cat.getColor());
		assertEquals(3, cat.getAge());
	}
	@Test
	public void testCatColorChange() {
		Cat cat = new Cat("Tom", 3, "Black");
		cat.setColor("Brown");
		assertEquals("Brown", cat.getColor());
	}
	@Test
	public void testCatNameChange() {
		Cat cat = new Cat("Tom", 3, "Black");
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
