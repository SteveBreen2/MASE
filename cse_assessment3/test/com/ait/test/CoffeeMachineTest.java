package com.ait.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ait.drinks.CoffeeMachine;

public class CoffeeMachineTest {

	CoffeeMachine coffeeMachine;
	@Before
	public void startup(){
		//assertEquals();
		coffeeMachine=new CoffeeMachine();
	}
	@Test
	public void testInitialInventoryZero() {
		assertEquals(0,coffeeMachine.getChocolate());
		assertEquals(0,coffeeMachine.getCoffee());
	}
	@Test
	public void testUpdateInventory() {
		coffeeMachine.updateInventory(30, 20);
		assertEquals(20,coffeeMachine.getChocolate());
		assertEquals(30,coffeeMachine.getCoffee());
	}
	@Test
	public void testAddRecipeOK(){
		assertEquals("OK",coffeeMachine.addRecipe("Latee", 1, 2, 2.50));
	}
	@Test
	public void testRecipeAlreadyExists(){
		coffeeMachine.addRecipe("Latte", 1, 2, 2.50);
		assertEquals("ALREADY EXISTS",coffeeMachine.addRecipe("Latte", 1, 2, 2.50));
	}
	@Test
	public void testRemoveRecipeOK(){
		coffeeMachine.addRecipe("Latte", 1, 2, 2.50);
		assertEquals("OK",coffeeMachine.removeRecipe("Latte"));
	}
	@Test
	public void testRemoveRecipeNotFound(){
		assertEquals("NOT FOUND",coffeeMachine.removeRecipe("Latte"));
	}
	@Test
	public void testDrinkDispensedOK(){
		coffeeMachine.updateInventory(50, 50);
		coffeeMachine.addRecipe("Latte", 1, 2, 2.50);
		coffeeMachine.setMoneyInserted(2.51);
		coffeeMachine.setWaterTempOK(true);
		assertEquals("OK",coffeeMachine.dispenseDrink("Latte"));
	}
	@Test
	public void testNotDispensedDrinkUnknown(){
		coffeeMachine.updateInventory(50, 50);
		coffeeMachine.addRecipe("BLACK COFFEE", 4, 0, 2.50);
		coffeeMachine.setMoneyInserted(2.51);
		coffeeMachine.setWaterTempOK(true);
		assertEquals("UNKNOWN DRINK",coffeeMachine.dispenseDrink("MOCHA"));
	}
	@Test
	public void testNotDispensedLowInventory(){
		coffeeMachine.updateInventory(2, 2);
		coffeeMachine.addRecipe("BLACK COFFEE", 4, 0, 2.50);
		coffeeMachine.setMoneyInserted(2.51);
		coffeeMachine.setWaterTempOK(true);
		assertEquals("OUT OF STOCK",coffeeMachine.dispenseDrink("BLACK COFFEE"));
	}
	@Test
	public void testNotDispensedTempLow(){
		coffeeMachine.updateInventory(50, 50);
		coffeeMachine.addRecipe("Latte", 1, 2, 2.50);
		coffeeMachine.setMoneyInserted(2.51);
		coffeeMachine.setWaterTempOK(false);
		assertEquals("NOT READY",coffeeMachine.dispenseDrink("Latte"));
	}
	@Test
	public void testNotDispensedInsertMoney(){
		coffeeMachine.updateInventory(50, 50);
		coffeeMachine.addRecipe("Latte", 1, 2, 2.50);
		coffeeMachine.setMoneyInserted(0);
		coffeeMachine.setWaterTempOK(false);
		assertEquals("INSERT MONEY",coffeeMachine.dispenseDrink("Latte"));
	}

}
