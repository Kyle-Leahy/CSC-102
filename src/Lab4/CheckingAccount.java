package Lab4;

public class CheckingAccount implements Banking{
    boolean overdraft = false;
    double fee = 50.0; //$50 overdraft fee apart of Kyles Premium Banking
    double balance;
    // implemented methods
    public double checkBalance() {return balance;}
    public double monthlyProcessing() {return rate;}
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;}
    public double deposit(double amount){
        balance = balance + amount;
        return amount;}
    // Checking Account specific methods
    public void overdraftCharge(boolean overdraft){
        if(overdraft = true){
            balance = balance + fee;
        }
    }

}
