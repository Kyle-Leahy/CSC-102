package Lab4;

public interface Banking {
    //Wasn't sure if it made more sense to javadoc the interface but have no @return because it's abstract
    //or do each classes implemented methods as they're defined and some are different and using local class variables.
    double withdraw(double amount);
    double deposit(double amount);
    double checkBalance();
    double monthlyProcessing();
}
