import java.util.Scanner;
public class ParkingTicketSimulation {

public static void main (String[] args) {
	
String make;
String model;
String license;
String copName;
String copBadgeNum;
int minutes;

Scanner keyboard = new Scanner(System.in);	

System.out.println("What is the car's make?");
make = keyboard.nextLine();

System.out.println("What is the car's model?");
model = keyboard.nextLine();

System.out.println("What is the car's license number?");
license = keyboard.nextLine();

System.out.println("What is the cop's name?");
copName = keyboard.nextLine();

System.out.println("What is the cop's badge number?");
copBadgeNum = keyboard.nextLine();
	
}
}
