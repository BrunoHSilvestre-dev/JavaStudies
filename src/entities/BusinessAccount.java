package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	};
	
	public BusinessAccount(Integer number, String holder, Double loanLimit) {
		super(number, holder);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double value) {
		if (value <= this.loanLimit) {
			this.balance += value;
		}
	}
	
	@Override
	public void withdraw(Double value) {
		super.withdraw(value);
		balance -= 2;
	}
}
