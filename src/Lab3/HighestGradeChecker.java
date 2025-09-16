package Lab3;
import javax.swing.*;

public class HighestGradeChecker {
    public static void main(String[] args) {
        boolean Status = true;
        int grade;
        int highestSoFar = 0;
        String inquiry;
        do{
            inquiry = JOptionPane.showInputDialog("Enter your top 10 grades to see them averaged and evaluated.");
            grade = Integer.parseInt(inquiry);
            if(grade > highestSoFar) {
                grade = highestSoFar;
                System.out.println(grade);
                //Status = true;
            }
        }while(Status);
    }
}
