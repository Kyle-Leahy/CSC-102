package Lab1;

/**
 * A new class called BankAccount to facilitate these banking methods
 * @author Kyle Leahy
 * @version 1.0
 */
public class BankAccount {

    private double balance; //Private primitive type to be
                            //used for arithmetic

    /**
     * Method calculates a deposit transaction based off 'balance'
     * @param amount
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Method calculates a withdrawal transaction also using 'balance'
     * @param amount
     */
    public void withdrawal(double amount) {
        balance = balance - amount;
    }

    /**
     * Method retrieves the balance of the bank account in a 'getBalance' method
     * @return Returns the balance of the bank account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method calculates the interest of the given bank account
     * at a fixed value of 5% APY
     */
    private void calculateInterest() {
        balance = balance * 1.05; // <- 5% APY set value
    }

    /**
     * Main function creating 2 new BankAccount objects for Bob and Jane
     * As well depositing and withdrawing cash to ensure
     * after printing the balance, the methods work properly
     * @param args
     */
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

