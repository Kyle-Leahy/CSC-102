package Lab5;
import javax.swing.*;

/**
 * This class executes all NumericalUtility methods with menus and error handling at every step
 * @author Bjork / Kyle Leahy
 * @version 2.0
 */
public class RecursionTester {
    /**
     * Executes the main lab5 program calls.
     * @param args The array of String arguments being fed into the stream
     */
    public static void main(String[] args) {
        boolean flag = false;
        do {
            try {
                do {
                    int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Kyle Leahy\nCSC 102H\n10/27/2025\n" +
                            "\nWelcome to the recursion tester!\n\nEnter the number of a menu choice:\n1.) Get a factorial" +
                            "\n2.) Create an exponent\n3.) Calculate a summation\n4.) Find the GCD of 2 numbers\n5.) Create a Fibonacci sequence" +
                            "\n-1 TO QUIT!"));
                    if (menu == -1) {flag = true;}
                    else if (menu == 1) {
                        try {
                            int f = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number to find the factorial:"));
                            JOptionPane.showMessageDialog(null, NumericalUtility.getFactorial(f));
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Please enter a number.");
                        }
                    }else if (menu == 2) {
                        try {
                            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number for the base of the exponent:"));
                            int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number for the exponent:"));
                            JOptionPane.showMessageDialog(null, NumericalUtility.getNPowerM(n,m));
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Please enter a number.");
                        }
                    }else if (menu == 3) {
                        try {
                            int sum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number to find the summation:"));
                            JOptionPane.showMessageDialog(null, NumericalUtility.getSummation(sum));
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Please enter a number.");
                        }
                    }else if (menu == 4) {
                        try {
                            int first = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number to find a GCD."));
                            int second = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number to find a GCD with "+first+"."));
                            JOptionPane.showMessageDialog(null, NumericalUtility.getGCD(first,second));
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Please enter a number.");
                        }
                    }else if (menu == 5) {
                        try {
                            int fib = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number to find the fibonacci sequence:"));
                            for (int i = 1; i <= fib; i++) {
                                long f = NumericalUtility.getFIB(i);
                                System.out.println("fib(" + i + ") = " + f);// Spamming JOptionPane windows would be annoying for the user lol.
                            }
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Please enter a number.");
                        }
                    }else
                        JOptionPane.showMessageDialog(null, "Please enter the number of a menu choice!");
                } while (!flag);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "That's not a menu option!");
            }
        }while(!flag);
    }
}
