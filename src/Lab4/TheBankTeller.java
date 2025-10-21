package Lab4;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the Bank Teller class
 * @author Bjork / Kyle Leahy
 * @version 1.2
 */
public class TheBankTeller {
    private final static SavingsAccount johnSavingsAccount = new SavingsAccount();
    private final static CheckingAccount johnCheckingAccount = new CheckingAccount();
    // For the lab and directions given we will create accounts for John Adams to be accessed, but we could go a step further
    // and prompt users for name to create accounts with usernames and passwords and set account info,
    // but we're comparing against a current account on file to be accessed and edited.
    /**
     * This is the meat and potatoes of this Lab and executes *all* methods responsible for banking needs.
     * @param args Command line stream of arguments in a String array.
     */
    public static void main(String[] args) {
        try (Scanner fileReader = new Scanner(new File("BankingHistory.txt"));
            PrintWriter fileWriter = new PrintWriter("CurrentAccounts.txt"))
        { ArrayList<String> bankingInfo = new ArrayList<>();
            //Looping through the file of BankingHistory to access, and update to CurrentAccounts
            while(fileReader.hasNext()) {
                //flags for detecting if the username and password are correct
                boolean userTrue = false,passTrue = false;
                //user and pass are in BankingHistory
                String username = JOptionPane.showInputDialog(null, "Enter your Username for KYLE'S PREMIUM BANKING.");
                String password = JOptionPane.showInputDialog(null, "Enter your Password for your KYLE'S PREMIUM BANKING account.");
                do {
                    String signInToken = fileReader.next();
                    if (signInToken.equals(username)) {
                        bankingInfo.add(signInToken);
                        userTrue = true;}
                    else if (signInToken.equals(password)) {
                        bankingInfo.add(signInToken);
                        passTrue = true;}
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
                        username = JOptionPane.showInputDialog(null, "Enter your Username for KYLE'S PREMIUM BANKING.");
                        password = JOptionPane.showInputDialog(null, "Enter your Password for your KYLE'S PREMIUM BANKING account.");
                    }
                } while (!userTrue || !passTrue);
                JOptionPane.showMessageDialog(null, "You have successfully logged in!");
                //third and fourth entries in the file are checking and savings balances respectively
                johnCheckingAccount.checkingBalance = Double.valueOf(fileReader.next());
                johnSavingsAccount.savingsBalance = Double.valueOf(fileReader.next());
                //prompting for which account
                String menuOption = JOptionPane.showInputDialog(null,"Which account would you like to view?\nChecking\nSavings");
                boolean exitFlag = false;
                if(menuOption.equalsIgnoreCase("Checking")) {
                    do {
                        String checkingMenuOption = JOptionPane.showInputDialog(null,"Choose a Menu Option:\nWithdraw\nDeposit\nCheck Balance\nMonthly Fees\nQuit");
                        if (checkingMenuOption.equalsIgnoreCase("Deposit")) {
                            double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to deposit today?"));
                            JOptionPane.showMessageDialog(null, "Your balance is now " + johnCheckingAccount.deposit(amount));}
                        else if (checkingMenuOption.equalsIgnoreCase("Withdraw")) {
                            double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to withdraw today?"));
                            JOptionPane.showMessageDialog(null, "Your balance is now " + johnCheckingAccount.withdraw(amount));}
                        else if (checkingMenuOption.equalsIgnoreCase("Check Balance")) {
                            JOptionPane.showMessageDialog(null, johnCheckingAccount.checkBalance());}
                        else if (checkingMenuOption.equalsIgnoreCase("Monthly Fees")) {
                            JOptionPane.showMessageDialog(null, "Your account has received our monthly charge of $20, your balance is now " + johnCheckingAccount.monthlyProcessing());}
                        else if (checkingMenuOption.equals("quit")) {exitFlag = true;}
                        else {JOptionPane.showMessageDialog(null, "Invalid Menu Option!");}
                    }while (!exitFlag);
                }
                if(menuOption.equalsIgnoreCase("Savings")) {
                    do {
                        String savingsMenuOption = JOptionPane.showInputDialog(null, "Choose a Menu Option:\nWithdraw\nDeposit\nCheck Balance\nMonthly Interest\nQuit");
                        if (savingsMenuOption.equalsIgnoreCase("Deposit")) {
                            double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to deposit today?"));
                            JOptionPane.showMessageDialog(null, "Your balance is now " + johnSavingsAccount.deposit(amount));}
                        else if (savingsMenuOption.equalsIgnoreCase("Withdraw")) {
                            double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to withdraw today?"));
                            JOptionPane.showMessageDialog(null, "Your balance is now " + johnSavingsAccount.withdraw(amount));}
                        else if (savingsMenuOption.equalsIgnoreCase("Check Balance")) {
                            JOptionPane.showMessageDialog(null, johnSavingsAccount.checkBalance());}
                        else if (savingsMenuOption.equalsIgnoreCase("Monthly Interest")) {
                            JOptionPane.showMessageDialog(null, "Your account has received our monthly 8% interest return, your balance is now " + johnSavingsAccount.monthlyProcessing());}
                        else if (savingsMenuOption.equals("quit")) {exitFlag = true;}
                        else {JOptionPane.showMessageDialog(null, "Invalid Menu Option!");}
                    }while(!exitFlag);
                }
                bankingInfo.add(String.valueOf(johnCheckingAccount.checkBalance()));
                bankingInfo.add(String.valueOf(johnSavingsAccount.checkBalance()));
            }
            //using an advanced for loop to just print everything into the new file.
            for (String info : bankingInfo) {
                fileWriter.println(info);
            }
        }
        catch (FileNotFoundException exception) {JOptionPane.showMessageDialog(null, "File not found");}
    }
}