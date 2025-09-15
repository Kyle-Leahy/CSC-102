package Lab2;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random answer = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!\n" +
                "Input any number from 1 to 100 and you'll be told if you're higher or lower.\n" +
                "-1 to quit at any time!");
        int guess = answer.nextInt(100);
        int tries = 0;
        do {
            if (in.nextInt() == -1) {System.out.println("Ending program...");break;}
            if (in.nextInt() > guess) {System.out.println("Too high, guess again.");}
            else if (in.nextInt() < guess) {System.out.println("Too low! Try again!");}
            else {System.out.println("You're right! Good job it took you " + tries + " tries.");break;}
            tries++;
        }while (in.hasNextInt());
    }
}
