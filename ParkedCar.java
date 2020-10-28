
public class ParkedCar {

private String make, model, license;
private int minutes;

public ParkedCar() {
	
}

public ParkedCar(String carMake, String carModel, String carLicense, int carMinutes) {

make = carMake;
model = carModel;
license = carLicense;
minutes = carMinutes;
		
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getLicenseNum() {
	return license;
}

public void setLicenseNum(String license) {
	this.license = license;
}

public int getMinutesParked() {
	return minutes;
}

public void setMinutesParked(int minutes) {
	this.minutes = minutes;
}

}
