
package chapter2;

import java.util.Scanner;


public class Page35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius, area;
        System.out.println("Enter a raedius: ");
        radius= input.nextDouble();
        
        area= radius * radius * 3.14159;
        System.out.println("Area is  " + area);
    }
    
}
