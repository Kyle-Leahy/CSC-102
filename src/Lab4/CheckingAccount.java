package Lab4;

public class CheckingAccount implements Banking{
    private static double rate = 20.0, overdraftFee = 40.0; //$20 monthly fee included in Kyles Premium Banking
    public double balance;
    // implemented methods
    public double checkBalance() {return balance;}
    public double monthlyProcessing() {
        balance = balance - rate;
        return balance;}
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;}
    public double deposit(double amount){
        balance = balance + amount;
        return amount;}
    //Specific methods
    public double overdraftCharge(){
        balance = balance - overdraftFee;
        return balance;}
}
