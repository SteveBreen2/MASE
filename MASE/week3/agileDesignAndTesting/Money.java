package agileDesignAndTesting;

public class Money{
	private final int amount;
	private final String currency;
	
	public Money(int amount, String currency){
		
		if(currency==null||currency.isEmpty()){
			throw new IllegalArgumentException(
					"Illegal currency: ["+currency+"]");
		}
		if(amount<0){
			throw new IllegalArgumentException(
					"Illegal amount: ["+amount+"]");
		}
		
		this.amount=amount;
		this.currency=currency;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public String getCurrency(){
		return currency;
	}
	
	
}
