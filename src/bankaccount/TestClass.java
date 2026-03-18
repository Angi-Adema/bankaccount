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
		System.out.println("General bank account test");
		System.out.println();
		account.accountSummary();
		
		// Program divider.
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		
		// Create and test a CheckingAccount object with NO overdraft.
		CheckingAccount checking = new CheckingAccount();
		
		checking.setFirstName("Jane");
		checking.setLastName("Brown");
		checking.setAccountID(54321);
		checking.setInterestRate(6.3);
		
		// Conduct a deposit.
		checking.deposit(400.00);
		
		System.out.println("Checking account test with NO overdraft.");
		System.out.println();
		
		// Process a withdrawal from the checking account.
		checking.processWithdrawal(100.00);
		
		// Print result.
		checking.displayAccount();
		
		// Program divider.
		System.out.println("=====================================");
		System.out.println();
		
		// Create and test a CheckingAccount object WITH overdraft.
		CheckingAccount checking1 = new CheckingAccount();
		
		checking1.setFirstName("Chris");
		checking1.setLastName("Whitfield");
		checking1.setAccountID(56789);
		checking1.setInterestRate(2.8);
		
		// Conduct a deposit.
		checking1.deposit(500.00);
		
		System.out.println("Checking account test WITH overdraft. ");
		System.out.println();
		
		// Process withdrawal from the checking account.
		checking1.processWithdrawal(525.00);
		
		// Print the result.
		checking1.displayAccount();	
	}
}
