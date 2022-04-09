
package practice2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        getPrime();
    }
    
    public static void getPrime() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number to get check");
        int num = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                
            }
            
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
    
}
