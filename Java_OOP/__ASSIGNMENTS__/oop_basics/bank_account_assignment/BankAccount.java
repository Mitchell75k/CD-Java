package Java_OOP.__assignments__.oop_basics.bank_account_assignment;

public class BankAccount {
         // MEMBER VARIABLES
        private String accountNumber; //using private so its not accessible in other classes, unless we use a public getter or setter method from this class
        private double checkingBalance;
        private double savingsBalance;
        private static int accounts;
        private static double totalMoney; // refers to the sum of all bank account checking and savings balances
        
        //Method for generating a random 10 digit account number
        private String generateAccountNumber() { //private because we don't want the user to be able to change the account number, only generate it
            String accNum = "";
            for (int i = 0; i < 10; i++) {
                accNum += (int) (Math.random() * 10); //casting the random number to an int so that it can be concatenated to the string
            }
            return accNum;
        }
        // CONSTRUCTOR
        // Be sure to increment the number of accounts
        public BankAccount () {
            this.accountNumber = this.generateAccountNumber(); //calling the method to generate a random account number
            this.checkingBalance = 0;
            this.savingsBalance = 0;
            accounts++; //incrementing the number of accounts every time we create a new instance of the class
        }
        
        // GETTERS
        // for checking, savings, accounts, and totalMoney
        public double getCheckingBalance() {
            return this.checkingBalance;
        }
        public double getSavingsBalance() {
            return this.savingsBalance;
        }
        public static int getNumOfAccounts() {
            return accounts; //no need for 'this' keyword because accounts is a static attribute (referencing the whole class)
        }
        public static double getTotalMoney() {
            return totalMoney; //no need for 'this' keyword because totalMoney is a static attribute
        }
        public String getAccountNumber() { //getter for the account number
            return this.accountNumber;
        }
        // -----------------------------METHODS-------------------------------- 

        // deposit--------------------------------------
        // - users should be able to deposit money into their checking or savings account
        public void deposit(String accountType, double amount) {
            if (accountType.equals("checking")){ //equals() is used to compare strings from the input
                this.checkingBalance += amount;
                totalMoney += amount;
            }
            else if (accountType.equals("savings")) {
                this.savingsBalance += amount;
                totalMoney += amount;
            }
            else {
                System.out.println("Please enter a valid account type.");
            }
        }

        // withdraw--------------------------------------
        // - users should be able to withdraw money from their checking or savings account
        // - do not allow them to withdraw money if there are insufficient funds
        // - all deposits and withdrawals should affect totalMoney

        public void withdraw (String accountType, double amount ) {
            if (accountType.equals("checking")){ //if acc type is checking
                if (this.checkingBalance < amount){
                    System.out.println("Insufficient funds.");
                    return; //return to exit the method
                }
                else {
                    this.checkingBalance -= amount;
                    totalMoney -= amount;
                }
            }
            else if (accountType.equals("savings")){ //if acc type is savings
                if (this.savingsBalance < amount){ 
                    System.out.println("Insufficient funds.");
                    return;
                }
                else {
                    this.savingsBalance -= amount; 
                    totalMoney -= amount;
                }
            }
            else {                                       //if acc type is neither checking nor savings
                System.out.println("Please enter a valid account type.");
            }
        }

        // getBalance
        // - display total balance for checking and savings of a particular bank account
        public void getBalance() {
            System.out.println("Checking Balance: " + this.checkingBalance);
            System.out.println("Savings Balance: " + this.savingsBalance);
        }
    } 

