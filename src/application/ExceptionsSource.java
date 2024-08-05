package application;

import java.time.LocalDate;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class ExceptionsSource {
	public void execute() {
//		Scanner sc = new Scanner(System.in);
		
//		try {
//			String[] vect = sc.nextLine().split(" ");
//			Integer position = sc.nextInt();
//			System.out.println(vect[position]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid Position");
////			e.getStackTrace();
//		} catch (InputMismatchException e) {
//			System.out.println("Input Error");
//		}
//		
	
//		File file = new File("C:\\temp\\in.txt");
//		Scanner sc = null;
//		try {
//			sc = new Scanner(file);
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("Error opening File: " + e.getMessage());
//		} finally {
//			if (sc != null) {
//				sc.close();
//			}
//		}
		Scanner sc = new Scanner(System.in);
		
		try {
			Reservation reservation = new Reservation(1, LocalDate.now(), LocalDate.now().plusDays(1));
			
			System.out.println(reservation.toString());
			
			reservation.updateDates(LocalDate.now().plusDays(-1), LocalDate.now().plusDays(-1));
			
			System.out.println(reservation.toString());
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado.");
		}
		
		sc.close();
	}
}
