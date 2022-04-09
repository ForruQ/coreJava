
package chapter2;

import java.util.Scanner;


public class Page47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer for Second: ");
        int second = input.nextInt();
        int minute= second/ 60;
        int remsiningSecond = second % 60;
        System.out.println(second + " second is " + minute + " miniutes and " + remsiningSecond + " seconds" );
    }
}
