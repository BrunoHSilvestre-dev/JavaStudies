package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private double pricePerHour;
	private double pricePerDay;
	
	private BrazilTaxService taxService;

	public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStartDate(), carRental.getFinishDate()).toMinutes();
		double hours = minutes / 60;
		
		double basePayment;
		if (hours <= 12) {
			basePayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basePayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		carRental.setInvoice(new Invoice(basePayment, taxService.tax(basePayment)));
	}
}
