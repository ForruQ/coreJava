package lastpractice;

import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        checkEmail();
    }

    public static void checkEmail() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Email address ");
        String email = s.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");

        if (atpos > 0 && dotpos < email.length() - 1 && atpos < dotpos - 1) {
            System.out.println("Email is valid ");
        } else {
            System.out.println("Invalid Email ");
        }

    }
}
