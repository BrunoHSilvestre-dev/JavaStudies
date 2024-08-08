package entities;

public class Invoice {
	private double basePayment;
	private double tax;
	private double totalPayment;
	
	public Invoice(double basePayment) {
		this.basePayment = basePayment;
		
		double taxPercentage = (this.basePayment <= 100) ? 20 : 15;
		this.tax = (this.basePayment * taxPercentage / 100);
		
		this.totalPayment = this.basePayment + this.tax;
	}

	@Override
	public String toString() {
		return "INVOICE:\nBase Payment: " + basePayment + "\nTax: " + tax + "\nTotal payment:" + totalPayment;
	}

	public double getBasePayment() {
		return basePayment;
	}

	public double getTax() {
		return tax;
	}

	public double getTotalPayment() {
		return totalPayment;
	}
}
