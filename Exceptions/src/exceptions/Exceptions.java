package exceptions;

import java.util.Scanner;

public class Exceptions {

    public static int quetient(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter a number: ");
        int num2 = input.nextInt();
        try {
            int result = quetient(num1, num2);
            System.out.println(num1 / num2);
        } catch (ArithmeticException ex) {
            System.out.println("Divisor cannot be zero");
        }
    }

}
