package leapyear;

import java.util.Scanner;

public class LeepYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = input.nextInt();
        LeapYear(y);

    }

    static void LeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear);
    }
}
