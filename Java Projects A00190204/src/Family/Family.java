package Family;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(22,"John","Dublin");
		//p.setAddress("Cork").setName("Jack").setAge(23);
		Person p1=new Person(22,"Jacob","Dublin");
		Person p2=new Person(22,"Jingle","Dublin");
		Person p3=new Person(22,"Heimer","Dublin");
		Person p4=new Person(22,"Schmidt","Dublin");
		
		Person[] people={p,p1,p2,p3,p4}; 
		
		System.out.println(Person.getCount());
		
		for(int i=0;i<people.length;i++){
		System.out.println(people[i]);}
	}

}
