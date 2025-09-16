package Lab2;

import java.util.Scanner;

public class InputSummation {
    public static boolean Status = true; // I have found a boolean check is the easiest to
                                         // verify a do while without asking for repeated input to trigger it
    public static int Answer;
    public int getSum(){
        int sum = 0;
        for(int i = 1; i <= Answer; i++) {sum = sum + i;} // Starting at 1 check if 'i' is less than
    return (sum);}                                        // answer and increment, adding +1 to the sum every time

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputSummation calculator = new InputSummation();
        do {
            System.out.println("\nPlease enter a number that you want all numbers leading to it summed up. " +
                    "\nIf you want to quit, type -1!");
            Answer = in.nextInt();
            if(Answer == -1){break;}
            System.out.println(calculator.getSum());
        }while(Status);
    }
}