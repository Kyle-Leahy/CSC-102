package Lab4;

public class CheckingAccount implements Banking{
    public double checkBalance(){
        return balance;
    }
    public double withdraw(double amount){
        amount = balance - amount;
        return amount;
    }


}
