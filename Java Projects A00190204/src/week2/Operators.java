package week2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w=0,x=0,y=0,z=0;
		
		x=4;
		
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x+"\n");
		
		w=20;
		x=10;
		y=-5;
		z=0;

		System.out.println(w==x&&y!=z);
		System.out.println(w==x||y!=z);
		System.out.println(!(w==(x+z)));
	}

}
