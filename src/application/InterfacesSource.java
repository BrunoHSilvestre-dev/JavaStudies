package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class InterfacesSource {
	public static void exercise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rental data.");
		
		System.out.println("Car Model: ");
		String carModel = sc.nextLine();
		
		LocalDateTime pickupDate = LocalDateTime.parse("2024-08-07T10:30:00");
		LocalDateTime returnDate = LocalDateTime.parse("2024-08-09T11:40:00");
		
		CarRental carRental = new CarRental(pickupDate, returnDate, new Vehicle(carModel));
		
		RentalService rentalService = new RentalService(10, 130, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println(carRental.getInvoice());
		
		sc.close();
	}
	
	public static void intefaceComparable() {
		List<Employee> list = new ArrayList<>();
		String path = "D:\\ProgramFiles\\Java\\EclipseWorkspace\\Files\\names.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
