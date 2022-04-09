
package video;

import java.util.Scanner;


public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = input.nextInt();
        
       if (n%2 == 0) {
           System.out.println("Even number");  
       } else {
           System.out.println("Odd Number");
       }
    }
    
}
