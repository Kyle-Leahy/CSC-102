package Lab2;
import java.util.Scanner;

public class OneWayTempConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temperature you want converted from Fahrenheit to Celsius:");
        double fTemp = in.nextDouble(); // take input after prompting
        double cTemp = (fTemp-32)*((double)5/9); // proper conversion for Fahrenheit to Celsius
        System.out.printf("Your temperature in Celsius is: %.2f",cTemp); // simple formatting to keep 2 decimals
    }
}
