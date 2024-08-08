package entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarRental {
	private LocalDateTime startDate;
	private LocalDateTime finishDate;
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental(LocalDateTime startDate, LocalDateTime finishDate, Vehicle vehicle) {
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.vehicle = vehicle;
		
		Duration rentDuration = Duration.between(startDate, finishDate);
		long roundedHours = (long) Math.ceil(((double) rentDuration.getSeconds() / 3600));
        long roundedDays = (long) Math.ceil(((double) rentDuration.getSeconds() / 86400));
        
        double basePayment;
        if (roundedHours <= 12) {
			basePayment = 10 * roundedHours;
		} 
		else {
			basePayment = 130 * roundedDays;
		}
		
		this.invoice = new Invoice(basePayment);
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getFinishDate() {
		return finishDate;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}
}
