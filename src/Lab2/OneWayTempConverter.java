package Lab2;
import java.util.Scanner;

public class OneWayTempConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temperature you want converted from Fahrenheit to Celsius:");
        double fTemp = in.nextDouble();
        double cTemp = (fTemp-32)*((double)5/9);
        System.out.println("Your temperature in Celsius is: ");
        System.out.printf("%.2f",cTemp);
    }
}
