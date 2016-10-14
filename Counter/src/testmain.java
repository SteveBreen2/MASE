import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testmain {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy");

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date sd1=new Date();
		Date  ed1 = new Date(sd1.getTime() - (1000 * 60 * 60 * 24));
		
		Date  sd2 = new Date(sd1.getTime() - (2000 * 60 * 60 * 24));
		Date  ed2 = new Date(sd1.getTime() + (3000 * 60 * 60 * 24));
		
		Date  sd3 = new Date(sd1.getTime() + (4000 * 60 * 60 * 24));
		Date  ed3 = new Date(sd1.getTime() + (5000 * 60 * 60 * 24));
		
		System.out.println("SD1:"+sd1+"\nED1"+ed1);
		System.out.println("-------------");
		System.out.println("SD2:"+sd2+"\nED2"+ed2);
		System.out.println("-------------");
		System.out.println("Entry Date: "+sd3+"\nExit Date: "+ed3);
		
		Booking b= new Booking(sd1,ed1,false,false,false,1);
		Booking b2= new Booking(sd2,ed2,false,false,false,2);
		
		Space s=new Space();
		s.addBooking(b);
		s.addBooking(b2);

		if(s.checkIfFree(sd1, ed1 )){
			System.out.println("Available");
		}
		else{
			System.out.println("Un-Available");
		}
		
		//public Booking(Date startDate, Date endDate, boolean servicing, boolean meetAndGreet, boolean valeting,
//		int bookingRef) throws ParseException {

	}

}
