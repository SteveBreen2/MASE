package week4;
class tree{
	private String type;
	//Default Constructor
	public tree(){
	this.setType("Beech");
	}
	//Overloaded Constructor
	public tree(String typeParam){
		type=typeParam;
	}
	//Accessor
	public String getType() {
		return type;
	}
	//Mutator
	public void setType(String type) {
		this.type = type;
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree beech=new tree();
		tree oak=new tree("Oak");
		tree sycamore=new tree("Sycamore");
		System.out.println(beech.getType());
		System.out.println(oak.getType());
		System.out.println(sycamore.getType());
		
		tree[] forest = null;
		forest=new tree[10];
		forest[0]=beech;
		
		
		
	}

}
