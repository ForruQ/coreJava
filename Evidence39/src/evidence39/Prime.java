
package evidence39;

import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean isPrime = false;
        for (int i = 2; i<= number/2; i++){
            if (number % i == 0){
                isPrime = true;
                break;
            }
        }
        if (isPrime) {
             System.out.println("not prime number");
        } else {
           
            System.out.println("prime number");
        }
    }
    
}
