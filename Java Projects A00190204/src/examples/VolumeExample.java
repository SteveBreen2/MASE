package examples;
class Volume{
	private int length,width,height;
	public int getLength() {
		return length;
	}
	Volume(){
		length=0;
		width=0;
		height=0;
	}
	Volume(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int calcVolume(){
		return getWidth()*getHeight()*getWidth();
		 
	}
	@Override
	public String toString(){
		return "Overriden toString() method called.";	
	}
	
}

public class VolumeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v1=new Volume();
		Volume v2=new Volume(2,2,2);

		System.out.println("Calculate Volume of v1: "+v1.calcVolume());
		System.out.println("Calculate Volume of v1: "+v2.calcVolume());
		System.out.println(v2.toString());
		System.out.println(v2.getClass());

	}

}
