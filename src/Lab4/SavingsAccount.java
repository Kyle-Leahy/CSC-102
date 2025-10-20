package Lab4;

/**
 * This class is the Savings Account for the bank, allowing for specific methods
 * @author Bjork / Kyle Leahy
 * @version 1.0
 */
public class SavingsAccount implements Banking{
    private double rate = 0.08; //High savings interest with KPB Inc.
    public double balance;

    /**
     * The method allowing access into the balance of the account
     * @return The accounts current balance.
     */
    public double checkBalance() {return balance;}

    /**
     * This method handles the monthly interest payout of the Savings Account
     * @return The accounts balance after the fee processed.
     */
    public double monthlyProcessing(){
        balance = balance * rate;
        return balance;
    }

    /**
     * This is a withdrawal method to the account
     * @return The new balance after the amount has been subtracted.
     */
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;}

    /**
     * This is a self-explanatory deposit method to the account
     * @return The new balance after the amount has been added.
     */
    public double deposit(double amount){
        balance = balance + amount;
        return amount;}
}
