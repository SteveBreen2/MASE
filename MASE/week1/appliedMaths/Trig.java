package appliedMaths;

import java.text.DecimalFormat;

public class Trig {
//tan theta is opp/adjacent
	
	public static String format(double value){
		String pattern = "##.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		return decimalFormat.format(value);
		
	}
	
	public static void main(String args[]){
		System.out.println("Opposite="+format(tanFormula(30,50)));
	}
	
	public static double tanFormula(double angle,double adjacent){
	
		return adjacent*Math.tan(Math.toRadians(angle));
		
	}
	
}
