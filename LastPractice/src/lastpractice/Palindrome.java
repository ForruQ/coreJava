package lastpractice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
checkPalindrome();
    }

    public static void checkPalindrome() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choosing word ");
        String str = s.nextLine();
        String rvs = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            rvs = rvs + str.charAt(i);

        }
        if(str.equals(rvs)) {
            System.out.println("Palindrome ");
        }
        else {
            System.out.println("Not Palindrome ");
        }
    }
}
