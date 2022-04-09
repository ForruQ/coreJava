package lastpractice;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        getFactorial();

    }

    public static void getFactorial() {
        
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 10; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }
        System.out.println("Factorial is " + factorial);

    }
}
