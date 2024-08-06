package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class InheritanceSource {
	
	public static void execute() {
		
//		Account acc = new Account(1001, "Alex");
//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 500.0);
//		
//		//Upcasting
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "Bob", 200.0);
//		Account acc3 = new SavingsAccount(1004, "Ana", 100.0);
//		
//		//Downcasting
//		BusinessAccount acc4 = (BusinessAccount)acc2;
//		acc4.loan(100.0);
//		
//		if (acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount)acc3;
//		}
//		
//		if (acc3 instanceof SavingsAccount){
//			SavingsAccount acc5 = (SavingsAccount)acc3;
//		}
		
//		Account acc1 = new Account(1001, "Alex");
//		acc1.withdraw(200.0);
//		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Bob", 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Ana", 1000.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}
}
