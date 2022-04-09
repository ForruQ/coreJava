
package practice3;

import java.math.BigInteger;
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        getFactorial();
    }
    public static void getFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            
        }
        System.out.println("Factorial is " + factorial);
    }
}
