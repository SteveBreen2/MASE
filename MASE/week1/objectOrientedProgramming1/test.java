package objectOrientedProgramming1;

public class test {

	public static void main (String args[]){
		long l1=2_147_000_000;
		//long l2=2_148_000_000;//Out of INT range
		//Max INT 2,147,483,647
		
		long l3=2_148_000_000L;
		
		//float f1=2.3; //Treated as a double
		float f2=(float)2.3;
		float f3=2.3f;
		double d1=2.3;
		double d2=2.3f;
		
		int x=14;
		int y=8;
		
		int res=x--;
		System.out.println("res= "+res); //14
		System.out.println("x= "+x);//13
		
		System.out.println("\n");
		
		res=--x;
		System.out.println("res= "+res);//12
		System.out.println("x= "+x);//12
		System.out.println("\n");
		char c=67;
		char c2='C';
		c2++;
		//Char is two bytes; Range is 0-65525; All positive;
		System.out.println("c=="+c);//C
		System.out.println("c2=="+c2);//D
		System.out.println("Cast "+c2+" to an int=="+(int)c2);
		
		c=(char)70_525;
		System.out.println(c);//Leaves it at unknown:?
		
		//Short is two bytes; Range is -32768-32767;
		
//		char c3=5;
//		short s1=c3;
		
//		short s=-5;
//		char c3=(char)s;
//		System.out.println("Print: "+c3);
		//Cast is needed to go from short to char and vice versa as their ranges are incompatible.
		
	}
}
