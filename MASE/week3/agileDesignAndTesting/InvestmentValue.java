package agileDesignAndTesting;

public class InvestmentValue{
final static double LOW_RATE=1.02;
final static double MID_RATE=1.05;
final static double HIGH_RATE=1.07;
	public static double calculateInterest(int investment,int years){
		
		if(investment<1000||investment>10000){
			throw new IllegalArgumentException(
					"Illegal Investment Amount: ["+investment+"]");
		}
		
		if(years<3||years>10){
			throw new IllegalArgumentException(
					"Illegal Investment Period: ["+years+"]");
		}
		
		
		
		double total=investment;
		for (int i=0;i<years;i++){
			
			if(total>=1000&&total<=2999){
				total*=LOW_RATE;
			}
			else if(total>=3000&&total<=4999){
				total*=MID_RATE;
			}
			else if(total>=5000){
				total*=HIGH_RATE;
			}
			
			
		}
		
		return Math.round(total);
	}

}
