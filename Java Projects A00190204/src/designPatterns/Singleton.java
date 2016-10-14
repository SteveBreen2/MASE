package designPatterns;

public class Singleton {
	
	private static Singleton singleton=new Singleton();
	
	private Singleton(){}

	
	public static Singleton getInstance() {
		return singleton;
	}
	
	protected static void secureMethod(){
		System.out.println("Secure Method Called");
	}
	
	

}
