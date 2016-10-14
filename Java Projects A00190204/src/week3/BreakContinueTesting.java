package week3;

public class BreakContinueTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//breakTest2();
		continueB();
	}
	public static void loops(){
		for (int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				System.out.println("I="+i+" j="+j);
			}
		}
	}
	public static void breakTest1(){
		for (int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				System.out.println("I="+i+" j="+j);
				if(j==2){break;};
			}
		}
		System.out.print("Finish Loops");
	}
	public static void breakTest2(){
		OuterLoop:
			for (int i=0;i<=3;i++){
				for(int j=0;j<=3;j++){
					System.out.println("I="+i+" j="+j);
					if(j==2){break OuterLoop;};
				}
			}
	System.out.print("Finish Loops");
	}
	public static void breakA(){

		for(int i=1;i<4;i++){
			System.out.println("Outer: "+i);
			while(true){

				int n=(int)(Math.random()*10);
				if (n>7){
					System.out.println("break: "+n);
					break;
				}
			}
			System.out.println("After while loop");
		}
	}
	@SuppressWarnings("unused")
	public static void breakB(){

		outerloop:
			for(int i=1;i<4;i++){
				System.out.println("Outer: "+i);
				while(true){

					int n=(int)(Math.random()*10);
					if (n>7){
						System.out.println("break: "+n);
						break outerloop;
					}
				}

			}System.out.println("After for loop");
	}
	public static void continueA(){

		for(int i=1;i<10;i++){

			int n=(int)(Math.random()*10);
			System.out.println("n: "+n);
			if(n<=7){
				continue;
			}
			System.out.println("This number  is greater than 7");

		}System.out.println("After for loop");
	}
	public static void continueB(){
		outerloop:
		for(int i=2;i<20;i++){
			for(int j=2;j<i-1;j++){
				int remainder=i%j;
				if(remainder==0)
				{
					System.out.println("i=="+i+"; j=="+j+"; continue");
					continue outerloop;
				}
			}
			System.out.println(i);
		}
	}




}
