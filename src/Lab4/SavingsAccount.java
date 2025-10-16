package Lab4;

public class SavingsAccount implements Banking{
    private double rate = 0.08; //High savings interest with KPB Inc.
    public double balance;
    // Implemented methods
    public double checkBalance() {return balance;}
    public double monthlyProcessing(){
        balance = balance * rate;
        return balance;
    }
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;}
    public double deposit(double amount){
        balance = balance + amount;
        return amount;}
}
