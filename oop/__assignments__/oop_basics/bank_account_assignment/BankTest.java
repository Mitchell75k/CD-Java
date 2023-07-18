package oop.__assignments__.oop_basics.bank_account_assignment;

public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.deposit("checking", 100);
        account1.deposit("savings", 100);
        //get account number
        System.out.println("\nAccount1 Number: " + account1.getAccountNumber());
        System.out.println("Account1  C-Balance: " + account1.getCheckingBalance());
        System.out.println("Account1  S-Balance: " + account1.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());

        account2.deposit("checking", 200);
        account2.deposit("savings", 200);
        System.out.println("\nAccount2 Number: " + account2.getAccountNumber());
        System.out.println("Account2  C-Balance: " + account2.getCheckingBalance());
        System.out.println("Account2  S-Balance: " + account2.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());

        account3.deposit("checking", 300);
        account3.deposit("savings", 300);
        System.out.println("\nAccount3 Number: " + account3.getAccountNumber());
        System.out.println("Account3  C-Balance: " + account3.getCheckingBalance());
        System.out.println("Account3  S-Balance: " + account3.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account1.withdraw("checking", 50);
        account1.withdraw("savings", 50);
        System.out.println("\nAccount1 Number: " + account1.getAccountNumber());
        System.out.println("Account1  C-Balance: " + account1.getCheckingBalance());
        System.out.println("Account1  S-Balance: " + account1.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());

        account2.withdraw("checking", 100);
        account2.withdraw("savings", 100);
        System.out.println("\nAccount2 Number: " + account2.getAccountNumber());
        System.out.println("Account2  C-Balance: " + account2.getCheckingBalance());
        System.out.println("Account2  S-Balance: " + account2.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());

        account3.withdraw("checking", 150);
        account3.withdraw("savings", 150);
        System.out.println("\nAccount3 Number: " + account3.getAccountNumber());
        System.out.println("Account3  C-Balance: " + account3.getCheckingBalance());
        System.out.println("Account3  S-Balance: " + account3.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("\nNumber of Accounts: " + BankAccount.getNumOfAccounts());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());
    }
}

