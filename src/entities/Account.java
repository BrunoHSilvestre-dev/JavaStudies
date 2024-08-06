package entities;

public abstract class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {}
	
	public Account(Integer number, String holder) {
		this.balance = 0.0;
		this.number = number;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double value) {
		this.balance += value;
	}
	
	public void withdraw(Double value) {
		this.balance -= value + 5.0;
	}
	
	
}
