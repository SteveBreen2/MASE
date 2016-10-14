package productionCode;

public class Person {
	private String name;
	private String address;
	private boolean drinkDrivingOffence, caughtWithoutASeatbelt, dangerousOvertaking, usingMobileWhileDriving,
			drivingDefectiveVehicle, crossingContinousWhiteLines;

	private Car car;
	private int totalPenaltyPoints;

	public Person(String name, String address, Car car) {
		this.name = name;
		this.address = address;
		this.car = car;
		this.totalPenaltyPoints = 0;
	}

	public Person(String name, String address, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7,
			boolean arg8, Car car) {
		this.name = name;
		this.address = address;
		drinkDrivingOffence = arg3;
		caughtWithoutASeatbelt = arg4;
		dangerousOvertaking = arg5;
		usingMobileWhileDriving = arg6;
		drivingDefectiveVehicle = arg7;
		crossingContinousWhiteLines = arg8;
		this.car = car;
	}

	public void setDrinkDrivingOffence(boolean drinkDrivingOffence) {
		this.drinkDrivingOffence = drinkDrivingOffence;
	}

	public void setCaughtWithoutASeatbelt(boolean caughtWithoutASeatbelt) {
		this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
	}

	public void setDangerousOvertaking(boolean dangerousOvertaking) {
		this.dangerousOvertaking = dangerousOvertaking;
	}

	public void setUsingMobileWhileDriving(boolean usingMobileWhileDriving) {
		this.usingMobileWhileDriving = usingMobileWhileDriving;
	}

	public void setDrivingDefectiveVehicle(boolean drivingDefectiveVehicle) {
		this.drivingDefectiveVehicle = drivingDefectiveVehicle;
	}

	public void setCrossingContinousWhiteLines(boolean crossingContinousWhiteLines) {
		this.crossingContinousWhiteLines = crossingContinousWhiteLines;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTotalPenaltyPoints() {
		return totalPenaltyPoints;
	}

	@Override
	public String toString() {
		return ("Name: " + name + "\nAddress: " + address + "\nPenalty Points: " + totalPenaltyPoints);

	}

	public void CalculatePenaltyPoints() {
		if (drinkDrivingOffence) {
			totalPenaltyPoints++;
		}
		if (caughtWithoutASeatbelt) {
			totalPenaltyPoints++;
		}
		if (dangerousOvertaking) {
			totalPenaltyPoints++;
		}
		if (usingMobileWhileDriving) {
			totalPenaltyPoints++;
		}
		if (drivingDefectiveVehicle) {
			totalPenaltyPoints++;
		}
		if (crossingContinousWhiteLines) {
			totalPenaltyPoints++;
		}
	}

	public boolean isDisqualified() {
		if (totalPenaltyPoints > 4) {
			return true;
		}
		return false;
	}

}
