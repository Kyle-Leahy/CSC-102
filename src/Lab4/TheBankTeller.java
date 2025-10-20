package Lab4;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the fabled DIFFICULT Bank Teller class
 * @author Bjork / Kyle Leahy
 * @version 1.2
 */
public class TheBankTeller {
    private static SavingsAccount johnSavingsAccount = new SavingsAccount();
    private static CheckingAccount johnCheckingAccount = new CheckingAccount();

    /**
     * This is the meat and potatoes of this Lab and executes *all* methods responsible for banking needs.
     * @param args Command line stream of arguments in a String array.
     */
    public static void main(String[] args) {
        //johnSavingsAccount.deposit(100);
        //johnSavingsAccount.checkBalance(); //Checking if these methods work because main() isn't working how I want
        //johnCheckingAccount.withdraw(20.5);
        //johnCheckingAccount.monthlyProcessing();

        try (Scanner fileReader = new Scanner(new File("BankingHistory.txt"));
            PrintWriter fileWriter = new PrintWriter("CurrentAccounts.txt"))
        { ArrayList<String> bankingInfo = new ArrayList<>();

            //Prompting user for their username and password for comparison to access the account
            String username = JOptionPane.showInputDialog(null, "Enter your Username for KYLE'S PREMIUM BANKING.");
            String password = JOptionPane.showInputDialog(null, "Enter your Password for your KYLE'S PREMIUM BANKING account.");
            //Looping through the file of Banking History to see if it matches input
            //Currently its only trying to verify that the first 2 are being read successfully (they're not)
            while(fileReader.hasNext()){
                String token = fileReader.next();
                if(token.equals(username)) {
                    bankingInfo.add(fileReader.nextLine());}
                //Both "JohnAdams" and 'username' don't work...? Need help !
                else if(token.equals(password)) {
                    bankingInfo.add(fileReader.nextLine());}
            }
            //using an advanced for loop to just print everything into the new file but it's not working somehow?
            for (String info : bankingInfo) {
                fileWriter.write(info);
            }
        }
        catch (FileNotFoundException exception) {JOptionPane.showMessageDialog(null, "File not found");}
    }
}
