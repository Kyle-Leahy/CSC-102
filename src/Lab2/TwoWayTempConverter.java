package Lab2;
import java.util.Scanner;

public class TwoWayTempConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the two-way temperature converter. To quit simply type -1\n" +
                "Please enter your option:\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
        double menuChoice = in.nextDouble();
        do {
            if (menuChoice == -1) {break;}
            System.out.println("Please enter an actual menu option!");
            System.out.println("\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
            menuChoice = in.nextDouble();
            if (menuChoice == 1) {
                System.out.println("\nPlease enter the temperature you want converted from Fahrenheit to Celsius:");
                double fTemp = in.nextDouble();
                double cTemp = (fTemp - 32) * ((double) 5 / 9);
                System.out.print("Your temperature in Celsius is: ");
                System.out.printf("%.2f", cTemp);
                System.out.println("\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
                menuChoice = in.nextDouble();
            }
            if (menuChoice == 2) {
                System.out.println("\nPlease enter the temperature you want converted from Celsius to Fahrenheit:");
                double cTemp = in.nextDouble();
                double fTemp = (cTemp * ((double) 9 / 5) + 32);
                System.out.print("Your temperature in Fahrenheit is: ");
                System.out.printf("%.2f", fTemp);
                System.out.println("\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
                menuChoice = in.nextDouble();
            }
        } while (menuChoice < 1 || menuChoice > 2);
    }
}