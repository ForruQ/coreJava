package lastpractice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        checkPrimeNum();
    }

    public static void checkPrimeNum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = s.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number ");
        } else {
            System.out.println("Not Prime Number ");
        }

    }
}
