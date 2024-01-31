package task3;

import java.util.Scanner;

class ATM {
    private BankAccount account;
    private Scanner choiceEnter;
    
    //constructor
    public ATM(BankAccount account) {
        this.account = account;
        this.choiceEnter = new Scanner(System.in);
    	}
    //menuOptionsMethod
    public void Menuprint() {
        System.out.println("------------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("------------------------");
    	}
    //fullProcess
    public void menuprocess() {
        int choice;
        do {
            Menuprint();
            System.out.print("Enter your choice: ");
            choice = choiceEnter.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM :)");
                    break;
                default:
                    System.out.println("Invalid choice❌. Select a valid option.");
            		}
        	} 
        while (choice != 4);
    }
   
    //menuProcessMethodsUsed
    
    //check balance method
    private void checkBalance() {
        System.out.println("Your balance is: " + account.getBalance());
    }
    //deposit method
    private void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = choiceEnter.nextDouble();
        account.deposit(amount);
    }
    //Withdraw method
    private void withdraw() {
        System.out.print("Enter withdraw amount: ");
        double amount = choiceEnter.nextDouble();
        account.withdraw(amount);
    }
}