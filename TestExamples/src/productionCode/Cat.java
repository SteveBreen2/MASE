package productionCode;

public class Cat {
	private String name, color;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat(String name, int age, String color) {
		this.name=name;
		this.age=age;
		this.color=color;
	
	}
}
