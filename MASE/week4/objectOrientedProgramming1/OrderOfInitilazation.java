package objectOrientedProgramming1;

class Tag {

	Tag(int marker) {
		System.out.println("Tag: (" + marker + ")");
	}
	void g() {
		System.out.println("g()");
	}
}

class Card {

	Tag t1=new Tag(1);
	Card() {
		System.out.println("Card()");

	}

	void f() {
		System.out.println("f()");
		t1.g();
	}
}

public class OrderOfInitilazation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card();
		c.f();
		
		
		
	//	Tag t = new Tag(2);
		
		
	}

}
