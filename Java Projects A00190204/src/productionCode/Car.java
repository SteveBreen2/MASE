package productionCode;

public class Car {
	private String carModel;
	private String carType;
	private int ageOfCar;

	public Car(String arg1, String arg2, int arg3) {

		this.carModel = arg1;
		this.carType = arg2;
		this.ageOfCar = arg3;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getAgeOfCar() {
		return ageOfCar;
	}

	public void setAgeOfCar(int ageOfCar) {
		this.ageOfCar = ageOfCar;
	}
	@Override
	public String toString(){
		return("Model: "+carModel+"\nType: "+carType+"\nAge: "+ageOfCar);
	}

}
