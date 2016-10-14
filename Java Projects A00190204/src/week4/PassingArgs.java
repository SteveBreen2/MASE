package week4;

class Watch{
	private int theNumberOfHands;


	//Default Constructor
	public Watch(){
		this.theNumberOfHands=2;
	}
	//Overloaded Constructor
	public Watch(int theNumberOfHands){
		this.theNumberOfHands=theNumberOfHands;
	}

	//Accessor
	public int getTheNumberOfHands() {
		return theNumberOfHands;
	}
	//Mutator
	public void setTheNumberOfHands(int aNumberOfHands) {
		theNumberOfHands = aNumberOfHands;
	}	
}


public class PassingArgs {
	public static void main(String[] args) {
//				//Passing in a variable of a primitive
//				int a=10,b=10;
//				System.out.println("A before V1: "+a);
//				primitiveExampleV1(a);
//				System.out.println("A after  V1: "+a);
//				System.out.println("B before V2: "+b);
//				b=primitiveExampleV2(b);
//				System.out.println("B after  V2: "+b);
//				//Passing in an object reference of a primitive
//
//		Watch w= new Watch();
//		int hands=w.getTheNumberOfHands();
//		System.out.println("Hands before: "+hands);
//		objectReferenceExample(w);		
//		hands=w.getTheNumberOfHands();
//		System.out.println("Hands after : "+hands);
		System.out.print(add(5,20));
	}




	public static void primitiveExampleV1(int n) {//Passing in a copy of a
		n=50;
	}
	public static int primitiveExampleV2(int n) {//Passing in a copy of b
		n=50;
		return n;
	}
	public static void objectReferenceExample(Watch w){
		w.setTheNumberOfHands(1);
		System.out.println("In Object Reference Example");
	}
	public static int add(int x,int y){
		int total = 0;
		final int increment=x;
		for (int i=x;i<=y;i+=increment){
			total+=i;
		}
		return total;
		
	}
}






