package day3;

public class BankAccountMain {
	public static void main(String[] args) {
	    BankAccount account = new BankAccount("1234567890", "John Smith", 1000.00);

	    System.out.println("Account number: " + account.getAccountNumber());
	    System.out.println("Account name: " + account.getAccountName());
	    System.out.println("Balance: " + account.getBalance());

	    account.deposit(500.00);
	    System.out.println("New balance after deposit: " + account.getBalance());

	    account.withdraw(200.00);
	    System.out.println("New balance after withdrawal: " + account.getBalance());

	    account.withdraw(2000.00);
	    System.out.println("New balance after withdrawal: " + account.getBalance());
	}

}
