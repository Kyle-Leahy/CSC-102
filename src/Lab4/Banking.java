package Lab4;

public interface Banking {
    /**
     * Allows a bank class to access the amount that is being deposited/withdrawn.
     * @param amount The amount to be withdrawn/deposited.
     * @return The actual dollar amount deposited or withdrawn to/from bank account.
     */
    double withdraw(double amount);
    double deposit(double amount);
    double checkBalance();
    double monthlyProcessing();
}
