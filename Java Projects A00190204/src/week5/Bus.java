package week5;

public class Bus {
	private static int count;
	private int numberOfSeats;
	private String driversName;
	private String make;

	public Bus() {
		Bus.count++;
		this.driversName ="";
		this.numberOfSeats = 0;
		this.make = "";
		
	}

	public Bus(String driversName, int numberOfSeats, String make) {
		Bus.count++;
		this.driversName = driversName;
		this.numberOfSeats = numberOfSeats;
		this.make = make;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getDriversName() {
		return driversName;
	}

	public void setDriversName(String driversName) {
		this.driversName = driversName;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public static int getCount() {
		return Bus.count;
	}

	@Override
	public String toString() {
		return (driversName + " drives a " + numberOfSeats + " seat " + make);
	}

}
