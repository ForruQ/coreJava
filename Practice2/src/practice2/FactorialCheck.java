package practice2;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCheck {

    public static void main(String[] args) {
        System.out.println("Factorial is " + getFactorial());
    }

    public static BigInteger getFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
