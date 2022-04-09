
package practice3;

import java.util.Scanner;

public class Emailvalidation {
    public static void main(String[] args) {
       checkEmail();
    }
    public static void checkEmail() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an email");
        String email = sc.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        if(atpos>0 && dotpos <email.length()-1 && atpos <dotpos -1) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
