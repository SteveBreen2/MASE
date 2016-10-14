import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Space {
	
	private ArrayList<Booking> listOfBookingsForSpot = new ArrayList<>();
	static final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
	
	/*long t= date.getTimeInMillis();
Date afterAddingTenMins=new Date(t + (10 * ONE_MINUTE_IN_MILLIS));
	 * 
	 */
	
	public ArrayList<Booking> getListOfBookingsForSpot() {
		return listOfBookingsForSpot;
	}
	
	/*test
	 * 
	 */
	public void addBooking(Booking b) {
		listOfBookingsForSpot.add(b);
	}

	private Object[][] datesBooked = new Object[10][10];

	public Space() {
	}

	public void bookSpace(Date startDate, Date endDate) {

	}

	public boolean checkIfFree(Date startDate, Date endDate) {

		boolean available = false;
		for (Booking b : listOfBookingsForSpot) {

			// Both Before
			if (startDate.before(new Date(b.getStartDate().getTime()-ONE_MINUTE_IN_MILLIS)) &&
					endDate.before(new Date(b.getStartDate().getTime()+ONE_MINUTE_IN_MILLIS))) {
				available=true;
			}
			// Both After
			else if (startDate.after(b.getEndDate())) {
				available=true;	
			}
			else{
				return false;
			}

		}
		// If it gets this far the space is available these dates
		return available;
	}

}
