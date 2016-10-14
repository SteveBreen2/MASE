package week4;

//class Rock{
//
//}
class Rock1{
	private int rockNumber;
	public Rock1(){
		this.setRockNumber(0);
	}
	public Rock1(int rockNumber){
		this.setRockNumber(rockNumber);
	}
	public int getRockNumber() {
		return rockNumber;
	}
	public void setRockNumber(int rockNumberParam) {
		rockNumber = rockNumberParam;
	}
//	public void Rock1(){
//		System.out.println("Rock1 method not constructor.");
//	}
}

public class SimpleConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rock1 r=new Rock1();
		System.out.println("Before");
		for(int i=1;i<=5;i++){
			r=new Rock1(i);
			System.out.println(r.getRockNumber());
		}
		System.out.println("After");
	}

}
