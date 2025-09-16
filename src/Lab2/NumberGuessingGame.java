package Lab2;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame { // Kyle Leahy 102H
    public static void main(String[] args) {
        Random numGen = new Random(); // Random number generator 'numGen'
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!\n" +
                "Input any number from 1 to 100 and you'll be told if you're higher or lower.\n" +
                "-1 to quit at any time!");
        int mystery = numGen.nextInt(100); // random number up to 100
        int tries = 0;
        do { // do while to keep a concurrent menu
            int guess = in.nextInt();
            if (guess == -1) {System.out.println("Ending program...");break;} // sentinel value to end prematurely
            if (guess > mystery) {System.out.println("Too high, guess again.");} // logical operator comparisons
            else if (guess < mystery) {System.out.println("Too low! Try again!");}
            else {System.out.println("You're right! Good job it took you " + tries + " guesses.");break;}
            tries++; // increments after the loop because if successful, that's not a guess it's an answer
        }while (in.hasNextInt());
    }
}
