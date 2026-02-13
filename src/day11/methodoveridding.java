package day11;

public class methodoveridding {
    // Parent Class
    static class BankAccount {

        protected String accountHolder;
        protected double balance;

        public BankAccount(String name, double balance) {
            this.accountHolder = name;
            this.balance = balance;
        }

        public void display() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }

        public void calculateInterest() {
            System.out.println("No interest for normal account.");
        }
    }
}






