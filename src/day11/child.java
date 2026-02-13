package day11;


    // Child Class
    class SavingsAccount extends methodoveridding.BankAccount {

        private double interestRate;

        public SavingsAccount(String name, double balance, double interestRate) {
            super(name, balance);
            this.interestRate = interestRate;
        }

        @Override
        public void calculateInterest() {
            double interest = balance * interestRate / 100;
            System.out.println("Interest: " + interest);
        }
    }


