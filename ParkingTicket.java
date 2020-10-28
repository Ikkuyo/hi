
public class ParkingTicket {

private ParkedCar car;	
private String copName, copBadgeNum;
private double fine;
private ParkingMeter parkingMeter;

public ParkingTicket() {
	
}

public ParkingTicket(ParkedCar car, ParkingMeter parkingMeter, String copName, String copBadgeNum) {

this.car = car;
this.copName = copName;
this.copBadgeNum = copBadgeNum;
this.parkingMeter = parkingMeter;
	
}

public ParkedCar getCar() {
	return car;
}

public void setCar(ParkedCar car) {
	this.car = car;
}



}

