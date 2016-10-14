package com.ait.drinks;

import java.util.ArrayList;

public class CoffeeMachine {

	private double moneyInserted;
	private int coffee, chocolate;
	private boolean waterTempOK;
	private ArrayList<Recipe> recipies;

	public boolean isWaterTempOK() {
		return waterTempOK;
	}

	public void setWaterTempOK(boolean waterTempOK) {
		this.waterTempOK = waterTempOK;
	}

	public int getCoffee() {
		return coffee;
	}

	public int getChocolate() {
		return chocolate;
	}

	public void setMoneyInserted(double moneyInserted) {
		this.moneyInserted = moneyInserted;
	}

	public CoffeeMachine() {
		recipies = new ArrayList<>();
		this.chocolate = 0;
		this.coffee = 0;
		this.moneyInserted = 0;
		this.waterTempOK = false;

	}

	public void updateInventory(int coffee, int chocolate) {
		this.coffee = coffee;
		this.chocolate = chocolate;
	}

	public String addRecipe(String name, int coffee, int chocolate, double price) {
		boolean exists = false;
		for (Recipe r : recipies) {

			if (r.getName().equalsIgnoreCase(name)) {
				exists = true;
			}
		}
		if (exists) {
			return "ALREADY EXISTS";
		}

		recipies.add(new Recipe(name, coffee, chocolate, price));
		return "OK";

	}

	public String removeRecipe(String name) {

		for (Recipe r : recipies) {
			if (r.getName().equalsIgnoreCase(name)) {
				recipies.remove(r);
				return "OK";
			}
		}
		return "NOT FOUND";

	}

	public String dispenseDrink(String name) {

		Recipe selection;
		for (Recipe r : recipies) {
			if (r.getName().equalsIgnoreCase(name)) {
				selection = r;

				if (getChocolate() >= selection.getChocolate() && getCoffee() >= selection.getCoffee()) {
					updateInventory(-selection.getCoffee(), -selection.getChocolate());
				} else {
					return "OUT OF STOCK";
				}

				if (moneyInserted >= selection.getPrice()) {
					moneyInserted -= selection.getPrice();
				} else {
					return "INSERT MONEY";
				}
				if (!this.isWaterTempOK()) {
					return "NOT READY";
				}

			} else {
				return "UNKNOWN DRINK";
			}
		}

		return "OK";

	}

}
