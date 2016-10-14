

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Booking {

	private Date today = new Date();
	private static int bookingRefCount = 1;
	private Date startDate;
	private Date endDate;
	private int bookingRef;
	private boolean servicing, meetAndGreet, valeting;
	private Date startTime;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy");

	// Set the parking spot along with when it is being reserved from and till.
	public Booking(Date startDate, Date endDate, boolean servicing, boolean meetAndGreet, boolean valeting,
			int bookingRef) throws ParseException {

		this.startDate = startDate;
		this.endDate = endDate;
		this.servicing = servicing;
		this.valeting = valeting;
		this.meetAndGreet = meetAndGreet;

	}

	public Booking() throws ParseException {
		this.startDate = today;
		this.endDate = new Date(today.getTime() + (1000 * 60 * 60 * 24));
		this.servicing = false;
		this.valeting = false;
		this.meetAndGreet = false;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(int bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isServicing() {
		return servicing;
	}

	public void setServicing(boolean servicing) {
		this.servicing = servicing;
	}

	public boolean isMeetAndGreet() {
		return meetAndGreet;
	}

	public void setMeetAndGreet(boolean meetAndGreet) {
		this.meetAndGreet = meetAndGreet;
	}

	public boolean isValeting() {
		return valeting;
	}

	public void setValeting(boolean valeting) {
		this.valeting = valeting;
	}

	/*
	public String getFormattedStartDate() {
		return new SimpleDateFormat("dd-MM-yyyy").format(getStartDate());
	}

	public String getFormattedEndDate() {
		return new SimpleDateFormat("dd-MM-yyyy").format(getEndDate());
	}
	*/
	
	public String getFormattedStartDate() {
		return sdf.format(getStartDate());
	}

	public String getFormattedEndDate() {
		return sdf.format(getEndDate());
	}
	
	public Date getToday() {
		return today;
	}

	@Override
	public String toString() {
		return "Booking Ref: " + bookingRef;

	}

	public static int getBookingRefCount() {
		return bookingRefCount++;
	}
}
