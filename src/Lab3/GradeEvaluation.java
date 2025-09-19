package Lab3;
import javax.swing.*;
import java.util.ArrayList;

public class GradeEvaluation {
    public static double grade, avg, j = 1, total = 0, highestSoFar = 0, lowestSoFar = 100;
    public static int answer;
    public static String inquiry, formatAvg;
    public static void setAnswer(){
        String gradeAmount = JOptionPane.showInputDialog(null,"How many grades are you trying to enter?");
        answer = Integer.parseInt(gradeAmount);
    }
    public static void setGrade() {
        for (int i = 0; i < answer; i++) {
            String inquiry = JOptionPane.showInputDialog("Enter your top " + answer + " grades to see them averaged and evaluated.");
            grade = Integer.parseInt(inquiry);
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
        JOptionPane.showMessageDialog(null,"~~Kyle Leahy~~\n~~CSC-102H~~\n~~9/18/2025~~");
        setAnswer();
        setGrade();
        JOptionPane.showMessageDialog(null,"The highest grade so far is: " + GradeEvaluation.getHighestSoFar());
        JOptionPane.showMessageDialog(null,"The lowest grade so far is: " + GradeEvaluation.getLowestSoFar());
        JOptionPane.showMessageDialog(null,"The average of the grades are: " + GradeEvaluation.getAverage());
    }
}