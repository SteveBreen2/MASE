package productionCode;

import java.util.ArrayList;

public class CatPound {
	private ArrayList<Cat> cats;

	public CatPound() {
		cats = new ArrayList<Cat>();
	}

	public void addCat(Cat aCat) {
		cats.add(aCat);
	}

	public int getNumberOfCats() {
		return cats.size();
	}

	public void removeCat(Cat aCat) {
		for (int i = 0; i < cats.size(); i++) {
			if (cats.get(i).getName().equals(aCat.getName())) {
				cats.remove(i);
			}
		}
	}

	public boolean searchForCat(String name) {

		for (Cat cat : cats) {
			if (cat.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	public boolean findCat(Cat aCat) {

		if (cats.contains(aCat)) {
			return true;
		}

		return false;
	}

	public int getNumberOlderThan(int age) {
		int count = 0;
		for (Cat cat:cats) {
			if (cat.getAge() > age)  
				count++;
			}
	return count;
		}
}



