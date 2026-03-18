package bankaccount;

public class BankAccount {
	
	// Required fields.
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	// Constructor that initializes balance to 0.
	public BankAccount() {
		balance = 0.0;
	}
	
	// Deposit method accepting single double value.
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	// Withdrawal method accepting single double value.
	public void withdrawal(double amount) {
		balance = balance - amount;
	}
	
	// Setters and Getters
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
	
	// Getter to return balance
	public double getBalance() {
		return balance;
	}
	
	// Method to print all account information.
	public void accountSummary() {
		System.out.println("Account Summary:");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.printf("Account ID: %d, Balance: $%.2f%n", accountID, balance);
	}
}
