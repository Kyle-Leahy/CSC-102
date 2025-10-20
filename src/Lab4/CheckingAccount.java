package Lab4;

/**
 * This class is the Checking Account for the bank, allowing for specific methods
 * @author Bjork / Kyle Leahy
 * @version 1.0
 */
public class CheckingAccount implements Banking{
    private static double rate = 20.0, overdraftFee = 40.0; //$20 monthly fee included in Kyles Premium Banking
    public double balance;

    /**
     * The method allowing access into the balance of the account
     * @return The accounts current balance.
     */
    public double checkBalance() {return balance;}

    /**
     * This method handles the monthly fee of the Checking Account
     * @return The accounts balance after the fee processed.
     */
    public double monthlyProcessing() {
        balance = balance - rate;
        return balance;}

    /**
     * This is a self-explanatory withdrawal method to the account
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
    //Specific methods

    /**
     * The method responsible for handling the overdraft fee charge
     * @return The new balance after the pesky fee.
     */
    public double overdraftCharge(){
        balance = balance - overdraftFee;
        return balance;}
}
