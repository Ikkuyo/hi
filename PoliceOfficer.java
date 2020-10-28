
public class policeOfficer {

private String copName, copBadgeNum;

public policeOfficer() {
	
}
	
public policeOfficer(String officerName, String officerBadgeNum) {
	copName = officerName;
	copBadgeNum = officerBadgeNum;
}
	
public String getCopName() {
	return copName;
}
	
public void setCopName(String copName) {
	this.copName = copName;
}

public String getCopBadgeNum() {
	return copBadgeNum;
}

public void setCopBadgeNum(String copBadgeNum) {
	this.copBadgeNum = copBadgeNum;
}

public boolean checkIllegallyParked(ParkedCar car, ParkingMeter minutes) {
	if (car.getMinutesParked() > minutes.getMinutesBought()) {
		return true;
	}	else {
		return false;
	}
}

}
