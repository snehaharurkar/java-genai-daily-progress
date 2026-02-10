package day08;


class BankAccount {

    private String accountHolderName;
    private double balance;

    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // MAIN METHOD ADDED
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Sneha", 5000);

        acc.deposit(2000);
        acc.withdraw(3000);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}




