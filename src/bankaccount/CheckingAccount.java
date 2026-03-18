package bankaccount;

public class CheckingAccount extends BankAccount {

	// Interest rate
	private double interestRate;
	
	// Constructor initializing interest rate to 0.
	public CheckingAccount() {
		interestRate = 0.0;
	}
	
	// Withdrawal method allowing overdraft and assessing $30 charge.
	public void processWithdrawal(double amount) {
		
		// Using superclass BankAccount, process withdrawal.
		if (amount > 0) {
			super.withdrawal(amount);
			
			// Check new balance and add overdraft fee if account negative.
			if (getBalance() < 0) {
				super.withdrawal(30.00);
				System.out.println("Account overdrawn, $30 overdraft fee assessed.");
			}
			
			// Print new current balance.
			System.out.printf("Current Balance: $%.2f%n", getBalance());
			System.out.println();
			
		} else {
			System.out.println("Please enter an amount greater than zero.");
		}
	}
	
	// Getters and Setters
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	// Method to display account information from superclass including interest rate.
	public void displayAccount() {
		accountSummary();
		System.out.printf("Interest Rate: %.2f%%%n", interestRate);
		System.out.println();
	}
}


