package practice2;

import java.util.Scanner;

public class EmailValid {

    public static void main(String[] args) {
        checkEmail();
    }

    public static void checkEmail() {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        if (atpos > 0 && dotpos < email.length() - 1 && atpos < dotpos - 1) {
            System.out.println("Email is valid ");
        } else {
            System.out.println("Not a valid Email");
        }
    }

}
