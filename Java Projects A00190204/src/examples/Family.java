package examples;

class Person{
	private int age;
	private String name;
	private String address;
	private static int count;
	
	Person(int ageParam,String nameParam,String addressParam){
		age=ageParam;
		name=nameParam;
		address=addressParam;
	}
	public int getAge() {
		return age;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
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
	public static int getCount() {
		return count;
	}
	
}
public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person john=new Person(22, "John", "Dublin");
		System.out.println("Person 1\nName: "+john.getName()+"\nAddress:"+john.getAddress()+"\nAge: "+john.getAge()+"\n");
		Person ann=new Person(25, "Ann", "Galway");
		System.out.println("Person 2\nName: "+ann.getName()+"\nAddress:"+ann.getAddress()+"\nAge: "+ann.getAge()+"\n");
		john.setName("Jack").setAddress("Cork").setAge(23);
		System.out.println("Person 1\nName: "+john.getName()+"\nAddress:"+john.getAddress()+"\nAge: "+john.getAge()+"\n");
		
		
	}

}
