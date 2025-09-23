package Lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Same thing don't feel as though javadoc is necessary as all the methods are the same just different input means.
public class GradeEvaluationFromFile {
    public static double grade, avg, j = 1, total = 0, highestSoFar = 0, lowestSoFar = 100;
    public static int answer;
    public static String formatAvg;
    public static ArrayList<Double> checker = new ArrayList<>();
    public static void main(String[] args) {
        File answers = new File("src/Lab3/numbers.txt"); //local path of file.
        try (Scanner reader = new Scanner(answers)) { // Reading in file to "reader".
            while(reader.hasNextLine()) {
                grade = Integer.parseInt(reader.nextLine());
                if (grade > highestSoFar){highestSoFar = grade;} // Calculations of highest
                else if (grade < lowestSoFar) {lowestSoFar = grade;} // and lowest
                GradeEvaluation.checker.add(grade); // Expandable ArrayList
                total = total + grade;
                j++;
            }
            avg = (total/j);
            formatAvg = String.format("%.2f",avg);
            System.out.println("~~Kyle Leahy~~\n~~CSC-102H~~\n~~9/18/2025~~");
            System.out.println("The highest grade so far is: " + highestSoFar);
            System.out.println("The lowest grade so far is: " + lowestSoFar);
            System.out.println("The average of the grades are: " + formatAvg);
        } catch (FileNotFoundException e) {
            System.out.println("File not found"); // Exception handling if file not found
        }                                         // but it's in directory so it will always be there
    }
}
