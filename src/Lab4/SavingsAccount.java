package Lab4;

public class SavingsAccount implements Banking{
    public double balance = 0.07; //High savings interest with KPB Inc.
    // Implemented methods
    public double checkBalance() {return balance;}
    public double monthlyProcessing() {return rate;}
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;}
    public double deposit(double amount){
        balance = balance + amount;
        return amount;}
    // Savings specific methods
    public double interestRate(double interest){return balance = balance * interest;}
}
