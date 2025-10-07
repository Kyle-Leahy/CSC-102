package Lab4;

public interface Banking {
    /**
     * Allows a bank class to access the amount that is being deposited/withdrawn.
     * @param amount The amount to be withdrawn/deposited.
     * @return The actual dollar amount deposited or withdrawn to/from bank account.
     *//**
     * Returns the current balance of a given bank class.
     * @param balance The current balance in a given bank account.
     * @return The current amount of money in the requested account.
     *//**
     * Returns the rate of that bank accounts speciality. (interest, annual fees)
     * @param rate The given rate of interest/ monthly fee depending on the account.
     * @return The monthly rate of the account type.
     */
    double balance = 0, rate = 0;
    double withdraw(double amount);
    double deposit(double amount);
    double checkBalance();
    double monthlyProcessing();
}
