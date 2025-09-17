package Lab3;
import javax.swing.*;
import java.util.ArrayList;

public class HighestGradeChecker {
    public static void main(String[] args) {
        int answer;
        double grade, gradeAverage, j = 1, highestSoFar = 0, lowestSoFar = 100;
        String inquiry;
        ArrayList<Double> checker = new ArrayList<>();
        String gradeAmount = JOptionPane.showInputDialog(null,"How many grades are you trying to enter?");
        answer = Double.parseDouble(gradeAmount); // need to fix to doubles or use scanner
        for (int i = 1; i < answer; i++) {
            inquiry = JOptionPane.showInputDialog("Enter your top " + answer + " grades to see them averaged and evaluated.");
            grade = Integer.parseInt(inquiry);
            checker.add(grade);
            if(grade > highestSoFar) {
                highestSoFar = grade;
                //JOptionPane.showMessageDialog(null,highestSoFar);
            }else if(grade < lowestSoFar) {
                lowestSoFar = grade;
            }
            j++;
        }
        gradeAverage = j/answer;
        JOptionPane.showMessageDialog(null,"The highest grade so far is: " + highestSoFar);
        JOptionPane.showMessageDialog(null,"The lowest grade so far is: " + lowestSoFar);
        JOptionPane.showMessageDialog(null,"The average of the grades are: " + gradeAverage);

    }
}
