package productionCode;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Model B","Hatchback",5);
		Person p=new Person("Kevin","Athlone",true,true,true,true,true,true,c);
		
		p.CalculatePenaltyPoints();
		if(p.isDisqualified()){
			System.out.println("Unable to drive.");
		};
		System.out.println(p);
		System.out.println(c);
	}

}
