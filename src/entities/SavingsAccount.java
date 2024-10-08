package entities;

public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double interestRate) {
		super(number, holder);
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		this.balance = this.balance * interestRate;
	};
	
	@Override
	public void withdraw(Double value) {
		this.balance -= value;
	}
	
}
