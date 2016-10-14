package week2;

public class RandomMath 
{

	static String randomMath1(int aParam) throws MyException
	{

		String phrase="";
		if (aParam<=5&&aParam>=1){
			phrase=("Square of "+aParam+" equals: "+Math.pow(aParam,2));
		}
		else if (aParam>=6&&aParam<=10){
			phrase=("Cube of "+aParam+" equals: "+Math.pow(aParam,3));

		}
		else{
			throw new MyException("Invalid Range of Input");
		}
		return phrase;

	}

	static String randomMath2(int aParam,int bParam) throws MyException
	{
		String answer="";
		if (aParam<0&&bParam<0){
			answer=("Both Negative");
		}
		else if (aParam>0&&bParam>0){
			answer=("Both Positive");
		}
		else if ((aParam==0&&bParam!=0)||(aParam!=0&&bParam==0)){
			answer=("One number is Zero");
		}
		else if ((aParam>=0&&bParam<0)||(aParam<0&&bParam>=0)){
			answer=("One number is Negative");
		}

		return answer;

	}
	
	static String randomMath3(int aParam,int bParam) throws MyException
	{
		int sum,product,difference,quotient;
		
		sum=aParam+bParam;
		product=aParam*bParam;
		difference=aParam-bParam;
		
		
		if(bParam==0)
		{
			throw new MyException("Dividing by 0");
		}
		
		quotient=aParam/bParam;
		
		return   ("The sum of "+aParam+" and "+bParam+" is: "+sum+"\n"
				+ "The product of "+aParam+" and "+bParam+" is: "+product +"\n"
				+"The difference of "+aParam+" and "+bParam+" is: "+difference +"\n"
				+"The quotient of "+aParam+" and "+bParam+" is: "+quotient +"\n");
	}
	
	static String randomMath4(int aParam,int bParam) throws MyException
	{
		int modulus;
		if(bParam==0)
		{
			throw new MyException("Dividing by 0");
		}
		modulus=aParam%bParam;
		
		if(modulus==0){
			return(aParam+" is a multiple of "+bParam);
		}
		
		else{
			return(aParam+" is not a multiple of "+bParam);
		}
	}


}
