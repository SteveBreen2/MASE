package javaCode;

public class essayExample implements Runnable {

	private String threadName;
	
	
	public essayExample(String threadName){
		this.setThreadName(threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		essayExample obj=new essayExample("Thread One");  
	     Thread tobj =new Thread(obj);  
	     tobj.start();  
		
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

}
