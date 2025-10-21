package Lab4;

/**
 * This class is the Checking Account for the bank, allowing for specific methods
 * @author Bjork / Kyle Leahy
 * @version 1.0
 */
public class CheckingAccount implements Banking{
    private static double rate = 20.0, overdraftFee = 40.0; //$20 monthly fee included in Kyles Premium Banking
    public double checkingBalance;

    /**
     * The method allowing access into the savingsBalance of the account
     * @return The accounts current savingsBalance.
     */
    public double checkBalance() {return checkingBalance;}

    /**
     * This method handles the monthly fee of the Checking Account
     * @return The accounts savingsBalance after the fee processed.
     */
    public double monthlyProcessing() {
        checkingBalance = checkingBalance - rate;
        return checkingBalance;}

    /**
     * This is a self-explanatory withdrawal method to the account
     * @return The new savingsBalance after the amount has been subtracted.
     */
    public double withdraw(double amount){
        checkingBalance = checkingBalance - amount;
        return checkingBalance;}

    /**
     * This is a self-explanatory deposit method to the account
     * @return The new savingsBalance after the amount has been added.
     */
    public double deposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;}
    //Specific methods

    /**
     * The method responsible for handling the overdraft fee charge
     * @return The new savingsBalance after the pesky fee.
     */
    public double overdraftCharge(){
        checkingBalance = checkingBalance - overdraftFee;
        return checkingBalance;}
}
