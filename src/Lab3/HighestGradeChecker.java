package Lab3;
import javax.swing.*;
import java.util.ArrayList;

public class HighestGradeChecker {
    public static void main(String[] args) {
        double total = 0, grade, gradeAverage, j = 1, highestSoFar = 0, lowestSoFar = 100;
        String inquiry;
        ArrayList<Double> checker = new ArrayList<>();
        String gradeAmount = JOptionPane.showInputDialog(null,"How many grades are you trying to enter?");
        int answer = Integer.parseInt(gradeAmount);
        for (int i = 0; i < answer; i++) {
            inquiry = JOptionPane.showInputDialog("Enter your top " + answer + " grades to see them averaged and evaluated.");
            grade = Integer.parseInt(inquiry);
            checker.add(grade);
            total = total + grade;
            j++;
            if(grade > highestSoFar) {
                highestSoFar = grade;
            }else if(grade < lowestSoFar) {
                lowestSoFar = grade;
            }
        }
        gradeAverage = (total/j);
        JOptionPane.showMessageDialog(null,"The highest grade so far is: " + highestSoFar);
        JOptionPane.showMessageDialog(null,"The lowest grade so far is: " + lowestSoFar);
        JOptionPane.showMessageDialog(null,"The average of the grades are: " + gradeAverage);
    }
}