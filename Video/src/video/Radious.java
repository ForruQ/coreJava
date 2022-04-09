
package video;

import java.util.Scanner;


public class Radious {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius, area;
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        
        area= 3.1416 * radius * radius;
        
        System.out.println("The area is  " + area);
    }
}
