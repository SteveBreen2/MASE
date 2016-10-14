package com.ait.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ait.drinks.Recipe;

public class RecipeTest {

	Recipe recipe;

	
	
	@Before
	public void startup(){
		recipe=new Recipe("My Drink",3,1,1.5);
	}
	@Test
	public void testRecipeConstructor() {
		assertEquals("My Drink",recipe.getName());
		assertEquals(3,recipe.getCoffee());
		assertEquals(1,recipe.getChocolate());
		assertEquals(1.5,recipe.getPrice(),0.0001);
	}
	
	@Test
	public void testChangeCoffee() {
		recipe.setCoffee(20);
		assertEquals(20,recipe.getCoffee());
	}
	@Test
	public void testChangeChocolate() {
		recipe.setChocolate(20);
		assertEquals(20,recipe.getChocolate());
	}
	@Test
	public void testChangePrice() {
		recipe.setPrice(20);
		assertEquals(20,recipe.getPrice(),0.0001);
	}
	

}
