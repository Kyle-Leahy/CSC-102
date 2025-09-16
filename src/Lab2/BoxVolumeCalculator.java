package Lab2;
import java.util.Scanner;

public class BoxVolumeCalculator {
    public static double length;
    public static double width; // straight forward assignments
    public static double height;
    public static boolean Status = true; // this is going to be our goalkeeper deciding if someone wants to stay
    public double getVolume(){return length * width * height;}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BoxVolumeCalculator calculator = new BoxVolumeCalculator();
        System.out.println("Welcome to the Box Volume Calculator. -1 to quit at anytime!" +
                "\nPretty simple just input measurements based off the prompt!\n");
        do{ // Do while again to keep a concurrent menu that can be used over and over
            System.out.println("Please enter the length of your cubic shape:");
            length = in.nextDouble();
            if (length == -1){break;} // best way I could think to accept a sentinel at each measurement input
            System.out.println("Please enter the width of your cubic shape:");
            width = in.nextDouble();
            if (width == -1){break;}
            System.out.println("Please enter the height of your cubic shape:");
            height = in.nextDouble();
            if (height == -1){break;}
            System.out.printf("\nYour volume is %.2f", calculator.getVolume()); // outputting formatted volume
            System.out.println("\nIf you want to exit, again you may input -1. " +
                    "OR to continue please input any other number");
            if (in.nextDouble() == -1){break;}
            else {Status = true;}
        }while(Status);
    }
}