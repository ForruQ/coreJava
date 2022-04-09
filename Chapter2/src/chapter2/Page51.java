
package chapter2;

import java.util.Scanner;


public class Page51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrnhit: ");
        Double fahrenhit = input.nextDouble();
        Double celcius = (5.0/9.0)* (fahrenhit -32);
        System.out.println("Fahrenhit " + fahrenhit + " is " + celcius + " in celcius");
    }
    
}
