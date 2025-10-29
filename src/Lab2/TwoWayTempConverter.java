package Lab2;
import java.util.Scanner;

public class TwoWayTempConverter { // Kyle Leahy 102H
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Welcome to the two-way temperature converter. To quit simply type -1\n" +
                    "Please enter your option:\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
            double menuChoice = in.nextDouble();
            do { // Do while loop to keep a concurrent menu up with sentinel value
                if (menuChoice == -1) {break;} // simple break statement using sentinel value
                System.out.println("Please enter an actual menu option!"); // Recurring statement asking for proper input
                System.out.println("\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
                menuChoice = in.nextDouble();
                if (menuChoice == 1) {
                    System.out.println("\nPlease enter the temperature you want converted from Fahrenheit to Celsius:");
                    double fTemp = in.nextDouble();
                    double cTemp = (fTemp - 32) * ((double) 5 / 9);
                    System.out.print("Your temperature in Celsius is: "); // same code as OneWayTempConverter
                    System.out.printf("%.2f", cTemp);
                    System.out.println("\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
                    menuChoice = in.nextDouble();
                }
                if (menuChoice == 2) {
                    System.out.println("\nPlease enter the temperature you want converted from Celsius to Fahrenheit:");
                    double cTemp = in.nextDouble();
                    double fTemp = (cTemp * ((double) 9 / 5) + 32); // tricky but proper conversion from Celsius to Fahrenheit
                    System.out.print("Your temperature in Fahrenheit is: ");
                    System.out.printf("%.2f", fTemp);
                    System.out.println("\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
                    menuChoice = in.nextDouble();
                }
            } while (menuChoice < 1 || menuChoice > 2);
        }
    }
}