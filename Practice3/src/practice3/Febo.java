
package practice3;

import java.util.Scanner;


public class Febo {
    public static void main(String[] args) {
        getFeb();
    }
    
    public static void getFeb() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int a = 0, b= 1, c= 0; c<= num; a= b, b= c, c= a+b) {
            System.out.print(c+ " ");
        }
    }
    
}
