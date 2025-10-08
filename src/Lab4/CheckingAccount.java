package Lab4;

public class CheckingAccount implements Banking{
    final double rate = 20.85; //$20 monthly fee charge adding up to ~$250/yr
    public double checkBalance() {return balance;}
    public double monthlyProcessing() {return rate;}
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;
    }
    public double deposit(double amount){
        balance = balance + amount;
        return amount;
    }

}
