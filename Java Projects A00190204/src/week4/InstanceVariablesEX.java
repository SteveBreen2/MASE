package week4;

class Phone{
	private String theNumber;

	//Default Constructor
	public Phone(){
		theNumber="No Number";
	}
	//Overloaded Constructor
	public Phone(String numberParam){
		this.setTheNumber(numberParam);
	}
	//Accessor
	public String getTheNumber() {
		return theNumber;
	}
	//Mutator
	public void setTheNumber(String aNumber) {
		theNumber = aNumber;
	}
	@Override
	public String toString(){
		return "The phone number is: "+theNumber;
		
	}
}
public class InstanceVariablesEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initalise
		Phone p1=new Phone(); 
		Phone p2=new Phone("999-12345");
		 
		//Print
		System.out.println("P1: "+p1.getTheNumber());
		System.out.println("P2: "+p2.getTheNumber());
		
		//Break
		System.out.println("\nChange numbers.\n ");
		
		//Re-assign
		p1.setTheNumber("090-64-77777");
		p2.setTheNumber("090-64-66666");
		
		//Print
		System.out.println("P1: "+p1.getTheNumber());
		System.out.println("P2: "+p2.getTheNumber());
		
		System.out.println(p2.toString());
	}

}
