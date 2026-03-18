package bankaccount;

public class BankAccount {
	
	// Required fields.
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	// No arguments constructor.
	public BankAccount() {
		balance = 0.0;
	}
	
	// Deposit method accepting single double value.
	public void deposit(double amount) {
		
		// Ensure deposit funds are greater than 0.
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Please enter an amount greater than zero.");
		}
	}
	
	// Withdrawal method accepting single double value.
	public void withdrawal(double amount) {
		
		// Ensure withdrawal amount is greater than zero.
		if (amount > 0) {
			balance = balance - amount;
		} else {
			System.out.println("Please enter an amount greater than zero.");
		}
	}
	
	// Getters and Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	// Getter method for balance.
	public double getBalance() {
		return balance;
	}
	
	// Method to print all account information.
	public void accountSummary() {
		System.out.println("Account Summary");
		System.out.println("-------------------------------------");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.printf("Account ID: %d, Balance: $%.2f%n", accountID, balance);
	}
}
