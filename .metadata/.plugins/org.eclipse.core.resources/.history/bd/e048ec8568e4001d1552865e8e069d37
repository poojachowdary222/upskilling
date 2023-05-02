package oopcoding;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private double minimumBalance;

    public BankAccount(String accountNumber, String accountHolderName, double balance, double minimumBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Withdrawal failed. Account balance would fall below minimum balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance is " + balance);
        }
    }

    public boolean isBalanceBelowMinimum() {
        return balance < minimumBalance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe", 1000, 100);
        account.withdraw(500); // should be successful
        account.withdraw(600); // should fail due to minimum balance
        account.deposit(200); // should be successful
        System.out.println("Is account balance below minimum? " + account.isBalanceBelowMinimum()); // should be true
    }
}

