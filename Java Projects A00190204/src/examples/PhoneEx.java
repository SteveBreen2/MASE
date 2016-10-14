package examples;

class Phone extends Object{
	private String theNumber;
	private String theOwnersName;
	private double thePrice;

	public Phone(){
		setTheNumber("No Number");
		setTheOwnersName("No Name");
		setThePrice(0.0);
	}
	public Phone(String aNumber,String aOwnersName,double aPrice){
		setTheNumber(aNumber);
		setTheOwnersName(aOwnersName);
		setThePrice(aPrice);
	}
	public String getTheNumber() {
		return theNumber;
	}
	public void setTheNumber(String theNumber) {
		this.theNumber = theNumber;
	}
	public String getTheOwnersName() {
		return theOwnersName;
	}
	public void setTheOwnersName(String theOwnersName) {
		this.theOwnersName = theOwnersName;
	}
	public double getThePrice() {
		return thePrice;
	}
	public void setThePrice(double thePrice) {
		this.thePrice = thePrice;
	}
	
	@Override
	public String toString(){
		return "The phone number is: "+theNumber;
	}
}

public class PhoneEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p=new Phone();
		System.out.println("First phone default Constructor:");
		System.out.println("Phone Owners Name: "+p.getTheOwnersName());
		System.out.println("Phone Owners Number: "+p.getTheNumber());
		System.out.println("Phone Price: $"+p.getThePrice());
		
		p.setThePrice(40.0);
		p.setTheOwnersName("Kevin");
		p.setTheNumber("Bacon");
		
		System.out.println("\nReassinged values to first phone:");
		
		System.out.println("Phone Owners Name: "+p.getTheOwnersName());
		System.out.println("Phone Owners Number: "+p.getTheNumber());
		System.out.println("Phone Price: $"+p.getThePrice());
		
		System.out.println("\nSecond phone:");
		
		Phone p2=new Phone("0857662623","Steve",100);
		System.out.println("Phone Owners Name: "+p2.getTheOwnersName());
		System.out.println("Phone Owners Number: "+p2.getTheNumber());
		System.out.println("Phone Price: $"+p2.getThePrice());
		System.out.print("\nTo String Override:\n"+p2);
	}
}
