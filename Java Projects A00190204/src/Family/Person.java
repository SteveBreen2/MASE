package Family;

class Person {
	private int age;
	private String name, address;
	static int count;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static public int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Person setAddress(String address) {
		this.address = address;
		return this;
	}

	public Person(int ageParam, String nameParam, String addressParam) {
		age = ageParam;
		name = nameParam;
		address = addressParam;
		count++;
	}
	
	public Person()
	{
		age=0;
		name="Nobody";
		address="Nowhere";
		count++;
	}
	
	@Override
	public String toString() {
		return "Name:" + name + "\nAge: " + age + "\nAddress: " + address+"\n";
	}
}
