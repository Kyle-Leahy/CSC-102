package Lab1;

public class BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdrawal(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    private void calculateInterest() {
        balance = balance * 1.05;
    }

    public static void main(String args[]) {
        BankAccount bobsAccount = new BankAccount();
        BankAccount janesAccount = new BankAccount();

        bobsAccount.deposit(450.50);
        janesAccount.deposit(1230.75);

        bobsAccount.withdrawal(230.00);
        janesAccount.withdrawal(452.43);

        bobsAccount.deposit(412.23);
        janesAccount.withdrawal(142.56);

        System.out.println("Bob's Account is currently: " + bobsAccount.getBalance());
        System.out.println("Jane's Account is currently: " + janesAccount.getBalance());
    }
}

