package Lab5;
import javax.swing.JOptionPane;


public class NumericalUtility {
    public static void getFactorial(){
        double f = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Please enter the number you want to get the factorial for." +
                        "\n(All the numbers leading and including, multiplied to one another)"));
        long factorial = 1;
        if (f == 0 || f < 0) {JOptionPane.showMessageDialog(null, "The factorial is 0 or negative.");}
        else if (f == 1) {JOptionPane.showMessageDialog(null, "The factorial is 1.");}
        for (int i = 1; i<= f; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "The factorial is: " + factorial);
    }
    public static void getNPowerM(){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "A number raised to another of your choosing... Enter your base number: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the number you'd like the base to be raised to: "));
        JOptionPane.showMessageDialog(null, "You have created the number: " + Math.pow(n,m));
    }
    public static void getSummation(){
        int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the number you want summated\n(All numbers before and included, added together)"));
        int sum = 0;
        for (int i = 0; i<= answer; i++){
            sum += i;
        }
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
    }
    public static void greatestCommonDivisor(){
    }
    public static double fibonacci(){
        return 0;
    }
}