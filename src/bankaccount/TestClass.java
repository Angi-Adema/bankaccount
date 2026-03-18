package bankaccount;

public class TestClass {
	
	public static void main(String[] args) {
		
		// Create BankAccount object.
		BankAccount account = new BankAccount();
		
		// Set account data in BankAccount object.
		account.setFirstName("Jackie");
		account.setLastName("Wade");
		account.setAccountID(12345);
		
		// Conduct a deposit and withdrawal.
		account.deposit(500.00);
		account.withdrawal(150.00);
		
		// Print account information from BankAccount class.
		account.accountSummary();
		
	}
}
