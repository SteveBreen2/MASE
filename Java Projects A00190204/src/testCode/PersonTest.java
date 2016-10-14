package testCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import productionCode.Car;
import productionCode.Person;

public class PersonTest {

	private  Person testPerson,testPerson2;
	private  Car testCar;
	
	@Before
	public  void setup(){
	testCar=new Car("Make","Type",10);	
	testPerson=new Person("testGuy","testAddress",false,false,false,false,false,false,testCar);
	testPerson2=new Person("testGuy","testAddress",testCar);
	}
	
	
	@Test
	public void getNameTest() {
		assertEquals("testGuy",testPerson.getName());
	}
	@Test
	public void setNameTest() {
		testPerson.setName("Dave");
		assertEquals("Dave",testPerson.getName());
	}
	@Test
	public void getAddressTest() {
		assertEquals("testAddress",testPerson.getAddress());
	}
	@Test
	public void setAddressTest() {
		testPerson.setAddress("Athlone");
		assertEquals("Athlone",testPerson.getAddress());
	}
	@Test
	public void getPenaltyPointsTest() {
		assertEquals(0,testPerson.getTotalPenaltyPoints());
	}
	@Test
	public void updatePenaltyPoints() {
		testPerson2.setCaughtWithoutASeatbelt(true);
		testPerson2.setCrossingContinousWhiteLines(true);
		testPerson2.setDangerousOvertaking(true);
		testPerson2.setDrinkDrivingOffence(true);
		testPerson2.setDrivingDefectiveVehicle(true);
		testPerson2.setUsingMobileWhileDriving(true);
		testPerson2.CalculatePenaltyPoints();
		assertEquals(6,testPerson2.getTotalPenaltyPoints());
	}
	@Test
	public void updatePenaltyPointsNegative() {
		testPerson2.setCaughtWithoutASeatbelt(false);
		testPerson2.setCrossingContinousWhiteLines(false);
		testPerson2.setDangerousOvertaking(false);
		testPerson2.setDrinkDrivingOffence(false);
		testPerson2.setDrivingDefectiveVehicle(false);
		testPerson2.setUsingMobileWhileDriving(false);
		testPerson2.CalculatePenaltyPoints();
		assertEquals(0,testPerson2.getTotalPenaltyPoints());
	}
	

}
