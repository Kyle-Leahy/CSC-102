package Lab5;
import javax.swing.JOptionPane;


public class NumericalUtility {
    public static void getFactorial(){
        try {
            double f = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Please enter the number you want to get the factorial for." +
                            "\n(All the numbers leading and including, multiplied to one another)"));
            long factorial = 1;
            if (f == 0 || f < 0) {
                JOptionPane.showMessageDialog(null, "The factorial is 0 or negative.");
            } else if (f == 1) {
                JOptionPane.showMessageDialog(null, "The factorial is 1.");
            }
            for (int i = 1; i <= f; i++) {
                factorial *= i;
            }
            JOptionPane.showMessageDialog(null, "The factorial is: " + factorial);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Bro that's not even a number...");
        }
    }
    public static void getNPowerM() {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "A number raised to another of your choosing.\nEnter your base number below."));
            int m = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter the number you'd like " + n + " to be raised to: "));
            JOptionPane.showMessageDialog(null, "You have created the number: " + Math.pow(n, m));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Why are you breaking this.");
        }
    }
    public static void getSummation(){
        try {
            int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter the number you want summated\n(All numbers before and included, added together)"));
            int sum = 0;
            for (int i = 0; i <= answer; i++) {
                sum += i;
            }
            JOptionPane.showMessageDialog(null, "The sum is: " + sum);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "That's not something to be summated");
        }
    }
    private static int GCD(int first, int second){
        if (second == 0){
            return first; //Knew the base case but did some research on GCD, I was doing LCD at first.
        } else  {
            return GCD(second, first % second); // Euclidean Algorithm
        }
    }
    public static void greatestCommonDivisor() {
        try {
            int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "This program is to find the greatest common divisor " +
                    "for 2 different numbers of your choosing.\nEnter your first number below."));
            int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your second number below."));
            int answer = GCD(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, "Your greatest common divisor is: " + answer);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "There's no way to find the GCD of that.");
        }
    }
    private static long FIB(int n){
        if (n <= 2) {return 1;}
        else {
            return FIB(n - 1) + FIB(n - 2);
        }
    }
    public static void getFibonacci(){
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "The famous Fibonacci sequence. " +
                    "Enter a number, BUT this is recursive. \nBeware of high numbers as this is O(2^n) time complexity!"));
            for (int i = 1; i <= n; i++) {
                long FIB = FIB(i); //Followed the example given and analyzed it. Tried to make it one method but 2 are mandatory.
                System.out.println("fib(" + i + ") = " + FIB); //Spamming windows of Java Swing would be annoying for user to click through
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Fibonacci is confused by that input...");
        }
    }
}