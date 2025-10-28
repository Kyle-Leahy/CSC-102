package Lab4;

/**
 * This class is the Savings Account for the bank, allowing for specific methods
 * @author Bjork / Kyle Leahy
 * @version 1.0
 */
public class SavingsAccount implements Banking{
    private double rate = 1.08; //High savings interest with KPB Inc.
    public double savingsBalance;

    /**
     * The method allowing access into the savingsBalance of the account
     * @return The accounts current savingsBalance.
     */
    public double checkBalance() {return savingsBalance;}

    /**
     * This method handles the monthly interest payout of the Savings Account
     * @return The accounts savingsBalance after the fee processed.
     */
    public double monthlyProcessing(){
        savingsBalance = savingsBalance * rate;
        return savingsBalance;
    }

    /**
     * This is a withdrawal method to the account
     * @return The new savingsBalance after the amount has been subtracted.
     */
    public double withdraw(double amount){
        savingsBalance = savingsBalance - amount;
        return savingsBalance;}

    /**
     * This is a self-explanatory deposit method to the account
     * @return The new savingsBalance after the amount has been added.
     */
    public double deposit(double amount){
        savingsBalance = savingsBalance + amount;
        return savingsBalance;}
}
