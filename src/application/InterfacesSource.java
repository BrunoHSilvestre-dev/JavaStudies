package application;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class InterfacesSource {
	public static void exercise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rental data.");
		
		System.out.println("Car Model: ");
		String carModel = sc.nextLine();
		
		System.out.println("Pickup date: ");
		LocalDateTime pickupDate = LocalDateTime.parse("2024-08-07T10:30:00");
		
		System.out.println("Return date: ");
		LocalDateTime returnDate = LocalDateTime.parse("2024-08-09T11:40:00");
		
		Duration rentDuration = Duration.between(pickupDate, returnDate);
		System.out.println("Duration: " + rentDuration);
		
		long roundedHours = (long) Math.ceil(((double) rentDuration.getSeconds() / 3600));
        System.out.println("Rounded duration: " + roundedHours);
        long roundedDays = (long) Math.ceil(((double) rentDuration.getSeconds() / 86400));
        System.out.println("Rounded duration days: " + roundedDays);
        
        double basePayment;
        if (roundedHours <= 12) {
        	System.out.println("Enter price per hour: ");
    		Double pricePerHour = sc.nextDouble();
        	
			basePayment = pricePerHour * roundedHours;
		} 
		else {
			System.out.println("Enter price per day: ");
			Double pricePerDay = sc.nextDouble();
			
			basePayment = pricePerDay * roundedDays;
		}
		
		double taxValue;
		if (basePayment <= 100) {
			taxValue = basePayment * 20 / 100;
		}
		else {
			taxValue = basePayment * 15 / 100;
		}
		
		double totalPayment = basePayment + taxValue;
		
		System.out.println("INVOICE:");
		System.out.println("Base payment: " + basePayment);
		System.out.println("Tax: " + taxValue);
		System.out.println("Total payment: " + totalPayment);
		
		sc.close();
	}
}
