package com.ait.employeeTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ait.employees.Employee;
import com.ait.employees.EmployeeSys;

public class EmployeeSysTest {

	private EmployeeSys testEmployeeSystem;
	private Employee testEmployee;

	@Before
	public void setup() {
		testEmployeeSystem = new EmployeeSys();
	}

	@Test
	public void testSetUserLoggedIn() {
		testEmployeeSystem.setUserLoggedIn(true);
		assertEquals(true, testEmployeeSystem.isUserLoggedIn());
	}

	@Test
	public void testPasswordChange() {
		testEmployeeSystem.login("admin", "root");
		testEmployeeSystem.changePassword("root", "password");
		testEmployeeSystem.logOut();
		testEmployeeSystem.login("admin", "password");
		assertEquals(true, testEmployeeSystem.addEmployee(testEmployee));
	}
	@Test
	public void testPasswordChangeUnloggedin() {
		testEmployeeSystem.login("admin", "wrong");
		testEmployeeSystem.changePassword("root", "password");
		testEmployeeSystem.logOut();
		testEmployeeSystem.login("admin", "password");
		assertEquals(false, testEmployeeSystem.addEmployee(testEmployee));
	}
	@Test
	public void testPasswordChangeBadOld() {
		testEmployeeSystem.login("admin", "root");
		testEmployeeSystem.changePassword("wrong", "password");
		testEmployeeSystem.logOut();
		testEmployeeSystem.login("admin", "password");
		assertEquals(false, testEmployeeSystem.addEmployee(testEmployee));
	}

	@Test
	public void testPassword() {
		testEmployeeSystem.setPassword("root1");
		assertEquals("root1", testEmployeeSystem.getPassword());
	}

	@Test
	public void testUserName() {
		testEmployeeSystem.setUsername("Dave");
		assertEquals("Dave", testEmployeeSystem.getUsername());
	}

	@Test
	public void testCorrectLogin() {

		assertEquals(true, testEmployeeSystem.login("admin", "root"));
	}

	@Test
	public void testIncorrectPassword() {

		assertEquals(false, testEmployeeSystem.login("admin", "not root"));
	}

	@Test
	public void testIncorrectUserName() {

		assertEquals(false, testEmployeeSystem.login("not admin", "root"));
	}

	@Test
	public void testUnloggedinCreate() {

		assertEquals(false, testEmployeeSystem.addEmployee(testEmployee));
	}

	@Test
	public void testLoggedinCreate() {
		testEmployeeSystem.login("admin", "root");
		assertEquals(true, testEmployeeSystem.addEmployee(testEmployee));
	}

	@Test
	public void testEmployeeCount() {
		testEmployeeSystem.login("admin", "root");
		testEmployeeSystem.addEmployee(testEmployee);
		testEmployeeSystem.addEmployee(testEmployee);
		assertEquals(2, testEmployeeSystem.getNumberOfEmployees());
	}

	@Test
	public void testEmployeeCountDefault() {
		assertEquals(0, testEmployeeSystem.getNumberOfEmployees());
	}

	@Test
	public void testLogout() {

		testEmployeeSystem.login("root", "admin");
		testEmployeeSystem.logOut();
		assertEquals(false, testEmployeeSystem.addEmployee(testEmployee));
	}

}
