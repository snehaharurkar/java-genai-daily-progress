package day11;


    class Main {

        public static void main(String[] args) {

            methodoveridding.BankAccount acc1 = new methodoveridding.BankAccount("John", 1000);
            acc1.display();
            acc1.calculateInterest();

            System.out.println("------------");

            SavingsAccount acc2 = new SavingsAccount("David", 2000, 5);
            acc2.display();
            acc2.calculateInterest();
        }
    }


