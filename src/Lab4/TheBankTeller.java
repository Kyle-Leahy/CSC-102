package Lab4;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TheBankTeller {
    private SavingsAccount johnSavingsAccount = new SavingsAccount();
    private CheckingAccount johnCheckingAccount = new CheckingAccount();
    public static void main(String[] args) {
        TheBankTeller Banker = new TheBankTeller();
        try {
            File historyFile = new File("BankingHistory.txt");
            PrintWriter fileWriter = new PrintWriter("CurrentAccounts.txt");
            Scanner fileReader = new Scanner(historyFile);
            ArrayList<Object> bankReader = new ArrayList<>();
            while(fileReader.hasNextLine()){
                bankReader.add(fileReader.nextLine());}
            String username = JOptionPane.showInputDialog(null, "Enter your Username for KYLE'S PREMIUM BANKING.");
            String password = JOptionPane.showInputDialog(null, "Enter your password for your KYLE'S PREMIUM BANKING account.");
        }
        catch (FileNotFoundException exception) {JOptionPane.showMessageDialog(null, "File not found");}
    }
}
