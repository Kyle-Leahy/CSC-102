package Lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Same thing don't feel as though javadoc is necessary as all the methods are the same just different input means.
public class GradeEvaluationFromFile {
    public static File numbers = new File("numbers.txt");
    public static Scanner in;
    static {
        try {in = new Scanner(numbers);}
        catch (FileNotFoundException Error) {throw new RuntimeException(Error.getMessage());}
    }
    public static double grade, avg, j = 1, total = 0, highestSoFar = 0, lowestSoFar = 100;
    public static int answer;
    public static String inquiry, formatAvg;
    public static void setAnswer(){
        System.out.println("How many grades are you trying to enter?");
        answer = in.nextInt();
    }
    public static void setGrade() {
        for (int i = 0; i < answer; i++) {
            System.out.println("Enter your top " + answer + " grades to see them averaged and evaluated.");
            grade = in.nextDouble();
            if (grade > highestSoFar) {highestSoFar = grade;}
            else if (grade < lowestSoFar) {lowestSoFar = grade;}
            GradeEvaluation.checker.add(grade);
            total = total + grade;
            j++;
        }
    }
    public static double getHighestSoFar(){
        return highestSoFar;
    }
    public static double getLowestSoFar(){
        return lowestSoFar;
    }
    public static String getAverage(){
        avg = (total/j);
        formatAvg = String.format("%.2f",avg);
        return formatAvg;
    }
    public static ArrayList<Double> checker = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("~~Kyle Leahy~~\n~~CSC-102H~~\n~~9/18/2025~~");
        setAnswer();
        setGrade();
        System.out.println("The highest grade so far is: " + GradeEvaluationFromFile.getHighestSoFar());
        System.out.println("The lowest grade so far is: " + GradeEvaluationFromFile.getLowestSoFar());
        System.out.println("The average of the grades are: " + GradeEvaluationFromFile.getAverage());

    }
}
