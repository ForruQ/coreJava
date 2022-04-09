package lastpractice;

import java.util.Scanner;

public class GraddingSystem {

    public static void main(String[] args) {
        getGradding();
    }

    public static void getGradding() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter mark ");
        double num = s.nextDouble();
        String grade = "F";

        if (num > 100 || num < 0) {
            grade = "Invalid Number ";

        } else {
            if (num >= 80) {
                grade = "A+";
            } else if (num >= 70) {
                grade = "A";
            } else if (num >= 60) {
                grade = "A-";
            } else if (num >= 50) {
                grade = "B";
            } else if (num >= 40) {
                grade = "C";
            } else if (num >= 33) {
                grade = "D";
            } else {
                grade = "F";
            }

        }

        System.out.println("Grade is " + grade);
    }
}
