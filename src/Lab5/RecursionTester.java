package Lab5;


import javax.swing.*;

public class RecursionTester {
    public static void main(String[] args) {
        boolean flag = false;
        do {
            try {
                do {
                    int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Kyle Leahy\nCSC 102H\n10/27/2025\n" +
                            "\nWelcome to the recursion tester!\n\nEnter the number of a menu choice:\n1.) Get a factorial" +
                            "\n2.) Create an exponent\n3.) Calculate a summation\n4.) Find the GCD of 2 numbers\n5.) Create a Fibonacci sequence" +
                            "\n-1 TO QUIT!"));
                    if (menu == -1) {
                        flag = true;
                    }else if (menu == 1) {
                        NumericalUtility.getFactorial();
                    }else if (menu == 2) {
                        NumericalUtility.getNPowerM();
                    }else if (menu == 3) {
                        NumericalUtility.getSummation();
                    }else if (menu == 4) {
                        NumericalUtility.greatestCommonDivisor();
                    }else if (menu == 5) {
                        NumericalUtility.getFibonacci();
                    }else
                        JOptionPane.showMessageDialog(null, "Please enter the number of a menu choice!");
                } while (!flag);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "That's not a menu option!");
            }
        }while(!flag);
    }
}
