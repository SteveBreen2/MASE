package com.ait.employeeTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ait.employees.Employee;

public class EmployeeTest {

	private Employee e;

	@Before
	public void setup() {
		e = new Employee();
	}

	@Test
	public void testSet() {
		e.setName("Steve");
		assertEquals("Steve",e.getName());
	}
	@Test
	public void testAgeName() {
		e.setAge(21);
		assertEquals(21,e.getAge());
	}
	@Test
	public void testPpsNumber() {
		e.setPpsNumber("8002432w");
		assertEquals("8002432w",e.getPpsNumber());
	}
}
