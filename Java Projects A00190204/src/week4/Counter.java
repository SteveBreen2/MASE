package week4;

public class Counter {
	private static int count;
	public Counter(){
		count++;
	}
	public static int getCount() {
		return Counter.count;
	}
	public void setCount(int count) {
		Counter.count = count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Counter c1=new Counter();
		@SuppressWarnings("unused")
		Counter c2=new Counter();		
		@SuppressWarnings("unused")
		Counter c3=new Counter();		
		System.out.println(Counter.getCount());
		
	}
}