
package practice2;

import java.util.Scanner;

public class Gradding {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double  mark= sc.nextDouble();
        System.out.println("Your grade is "+getGrade(mark));
    }
    public static String getGrade(double mark) {
        String obtainGrade = "F";
        if(mark > 100 || mark < 0) {
            obtainGrade = "Invalid mark";
        } else {
            if(mark >= 80) {
                 obtainGrade = "A+";
            } else if (mark >= 70) {
                 obtainGrade = "A";
            } else if(mark >= 60) {
                 obtainGrade = "A-";
            } else if (mark >= 50) {
                 obtainGrade = "B";
            } else if(mark >= 40) {
                 obtainGrade = "C";
            } else if (mark >= 33) {
                 obtainGrade = "D";
            } else  {
                 obtainGrade = "F";
            } 
        }
        return obtainGrade;
    }
    
}
