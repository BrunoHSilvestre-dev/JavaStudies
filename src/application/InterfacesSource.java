package application;

import java.time.LocalDateTime;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;

public class InterfacesSource {
	public static void exercise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rental data.");
		
		System.out.println("Car Model: ");
		String carModel = sc.nextLine();
		
		LocalDateTime pickupDate = LocalDateTime.parse("2024-08-07T10:30:00");
		LocalDateTime returnDate = LocalDateTime.parse("2024-08-09T11:40:00");
		
		CarRental carRental = new CarRental(pickupDate, returnDate, new Vehicle(carModel));
		
		System.out.println(carRental.getInvoice());
		
		sc.close();
	}
}
