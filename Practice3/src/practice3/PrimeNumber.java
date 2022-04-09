
package practice3;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        checkPrime();
    }
    public static void checkPrime() {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        boolean isPrime = true ;
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
