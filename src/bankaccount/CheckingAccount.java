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
		
		// Process withdrawal.
		if (amount > 0) {
			
			// Store new balance by calling getBalance from BankAccount and 
			// subtracting the withdrawal amount.
			double newBalance = getBalance() - amount;
			
			// Assess fee if balance less than zero after withdrawal.
			if (newBalance < 0) {
				newBalance = newBalance - 30.00;
				System.out.println("Account overdrawn, $30 overdraft fee assessed.");
			}
			
			// Update the balance in BankAccount.
			setBalance(newBalance);
			
			// Print new current balance.
			System.out.printf("Current Balance: $%.2f%n", newBalance);
			
		} else {
			System.out.println("Please enter an amount greater than zero.");
		}
	}
	
	// Method to display account information from superclass including interest rate.
	public void displayAccount() {
		
	}
}
