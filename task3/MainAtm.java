package task3;
public class MainAtm {
	public static void main(String[] args) {
		System.out.println("Welcome to the ATM <3");
        BankAccount userAccount = new BankAccount(1000); //InitialBalance(constructor)
        ATM atm = new ATM(userAccount);
        atm.menuprocess();
    }
}