package Lab3;
import javax.swing.*;
import java.util.ArrayList;

/**
 * This class of GradeEvaluation is to be called on for evaluating any amount of grades.
 * @author Kyle Leahy / Bjork
 * @version 2.0
 */
public class GradeEvaluation {
    /**
     * Initializing variables to be used logically, mainly set for comparisons.
     */
    public static double grade, avg, j = 1, total = 0, highestSoFar = 0, lowestSoFar = 100;
    /**
     * Amount answer needs to be an Int for proper formatting in the window.
     */
    public static int answer;
    /**
     * Inquiry is assigned to input to be cast as an Int.
     */
    public static String inquiry, formatAvg;
    /**
     * Sets the amount of grades wanting to be evaluated.
     */
    public static void setAnswer(){
        String gradeAmount = JOptionPane.showInputDialog(null,"How many grades are you trying to enter?");
        answer = Integer.parseInt(gradeAmount);
    }
    /**
     * Contains a system of conditionals to properly sort, evaluate and output the inputted grades.
     * Also keeps an incrementer going to be able to divide by input amount.
     */
    public static void setGrade() {
        for (int i = 0; i < answer; i++) {
            String inquiry = JOptionPane.showInputDialog("Enter your top " + answer +
                    " grades to see them averaged and evaluated.");
            grade = Integer.parseInt(inquiry);
            if (grade > highestSoFar) {highestSoFar = grade;}
            else if (grade < lowestSoFar) {lowestSoFar = grade;}
            GradeEvaluation.checker.add(grade);
            total = total + grade;
            j++;}
    }
    /**
     * Retrieves the highest number evaluated so far
     * @return The highest number input into the array so far.
     */
    public static double getHighestSoFar(){
        return highestSoFar;
    }
    /**
     * Retrieves the lowest number evaluated so far
     * @return The lowest number input into the array so far.
     */
    public static double getLowestSoFar(){
        return lowestSoFar;
    }
    /**
     * Averages all grades given, by the number of grades the array contains.
     * @return The average of all grades, but formatted correctly to be shown in gui.
     */
    public static String getAverage(){
        avg = (total/j);
        formatAvg = String.format("%.2f",avg);
        return formatAvg;
    }
    /**
     * Declaring the arraylist "checker" to hold and check the grades
     */
    public static ArrayList<Double> checker = new ArrayList<>();
    /**
     * Main function that is calling upon all methods to effectively evaluate the array of grades.
     * @param args The input arguments in the command line/stream
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"~~Kyle Leahy~~\n~~CSC-102H~~\n~~9/18/2025~~");
        setAnswer();
        setGrade();
        JOptionPane.showMessageDialog(null,"The highest grade so far is: " + GradeEvaluation.getHighestSoFar());
        JOptionPane.showMessageDialog(null,"The lowest grade so far is: " + GradeEvaluation.getLowestSoFar());
        JOptionPane.showMessageDialog(null,"The average of the grades are: " + GradeEvaluation.getAverage());
    }
}