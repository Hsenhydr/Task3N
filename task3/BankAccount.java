package task3;

public class BankAccount {
	    private double balance;

	    //constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    //getter
    public double getBalance() {
        return balance;
    }
    //deposit balance function
    public void deposit(double amount) {
        if (amount > 0) {
            balance =balance+ amount;
            System.out.println("Deposit successful✔️. New balance: " + balance);}
        else {
        System.out.println("Invalid amount for deposit❌.");
        		}
    	}
    //withdraw balance function
    public void withdraw(double amount) {
	    if (amount > 0 && amount <= balance) {
	        balance =balance- amount;
	        System.out.println("Withdrawal successful✔️. New balance: " + balance);
	        }
	    else {
	        System.out.println("Insufficient funds or invalid amount for withdrawal❌.");
	        }
	    }
}