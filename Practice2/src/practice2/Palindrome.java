package practice2;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        checkPalindrome();
    }

    public static void checkPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check palindrome");
        String str = input.nextLine();
        String rvs = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rvs += str.charAt(i);
        }
        if (str.equals(rvs)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
