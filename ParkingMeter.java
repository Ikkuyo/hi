
public class ParkingMeter {
	
private int purchasedMinutes;

public ParkingMeter() {
	
}

public ParkingMeter(int purchasedMins) {
	purchasedMinutes = purchasedMins;
}

public int getMinutesBought() {
	return purchasedMinutes;
}

public void setMinutesBought(int purchasedMinutes) {
	this.purchasedMinutes = purchasedMinutes;
}

public String toString() {
	String toString = "Minutes that were purchased:" + purchasedMinutes;
	return toString;
}

}
