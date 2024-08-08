package model.entities;

public class Invoice {
	private double basePayment;
	private double tax;
	private double totalPayment;
	
	public Invoice(double basePayment, double tax) {
		this.basePayment = basePayment;
		this.tax = tax;
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
